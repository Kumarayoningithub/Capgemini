package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;


public class TaskDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

  
    public TaskDAO() {
       
        this.emf = Persistence.createEntityManagerFactory("taskPU");
        this.em = emf.createEntityManager();
    }


    public TaskDTO create(Task task) {
        try {
           
            em.getTransaction().begin();

        
            em.persist(task);

           
            em.getTransaction().commit();

            System.out.println("Task created successfully with ID: " + task.getId());

            
            return convertToDTO(task);

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error creating task: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

   
    public TaskDTO findById(Long id) {
        try {
            Task task = em.find(Task.class, id);
            return task != null ? convertToDTO(task) : null;
        } catch (Exception e) {
            System.err.println("Error finding task by ID: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

  
    public List<TaskDTO> findAll() {
        try {
            
            TypedQuery<Task> query = em.createQuery("SELECT t FROM Task t", Task.class);
            List<Task> tasks = query.getResultList();

          
            return tasks.stream()
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());

        } catch (Exception e) {
            System.err.println("Error finding all tasks: " + e.getMessage());
            e.printStackTrace();
            return List.of();
        }
    }

  
    public TaskDTO update(TaskDTO taskDTO) {
        try {
            em.getTransaction().begin();

          
            Task existingTask = em.find(Task.class, taskDTO.getId());

            if (existingTask != null) {
               
                existingTask.setTask(taskDTO.getTask());
                existingTask.setDescription(taskDTO.getDescription());

           
                Task updatedTask = em.merge(existingTask);

                em.getTransaction().commit();

                System.out.println("Task updated successfully with ID: " + updatedTask.getId());
                return convertToDTO(updatedTask);
            } else {
                em.getTransaction().rollback();
                System.out.println("Task not found with ID: " + taskDTO.getId());
                return null;
            }

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error updating task: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

  
    public boolean delete(Long id) {
        try {
            em.getTransaction().begin();

            Task task = em.find(Task.class, id);

            if (task != null) {
                em.remove(task);
                em.getTransaction().commit();
                System.out.println("Task deleted successfully with ID: " + id);
                return true;
            } else {
                em.getTransaction().rollback();
                System.out.println("Task not found with ID: " + id);
                return false;
            }

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error deleting task: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

   
    private TaskDTO convertToDTO(Task task) {
        return new TaskDTO(
                task.getId(),
                task.getTask(),
                task.getDescription()
        );
    }

  
    private Task convertToEntity(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(taskDTO.getId());
        task.setTask(taskDTO.getTask());
        task.setDescription(taskDTO.getDescription());
        return task;
    }

    
    public void close() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
        System.out.println("DAO resources closed");
    }
}
