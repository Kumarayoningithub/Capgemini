package org.example;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        System.out.println("Starting JPA...");

        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("taskPU");

        System.out.println("EntityManagerFactory created successfully!");

       
        emf.close();

        System.out.println("Closed successfully!");

      
        testTaskDAO();
    }

  
    private static void testTaskDAO() {
        System.out.println("\n--- Testing TaskDAO ---");

     
        TaskDAO taskDAO = new TaskDAO();

 
        Task newTask = new Task();
        newTask.setTask("Complete JPA assignment");
        newTask.setDescription("Finish the JPA tutorial and implement CRUD operations");

    
        TaskDTO savedTask = taskDAO.create(newTask);
        System.out.println("Saved Task: " + savedTask);

     
        TaskDTO foundTask = taskDAO.findById(1L);
        System.out.println("Found Task: " + foundTask);

     
        System.out.println("\nAll Tasks:");
        taskDAO.findAll().forEach(System.out::println);

   
        if (foundTask != null) {
            foundTask.setDescription("Updated description for the task");
            TaskDTO updatedTask = taskDAO.update(foundTask);
            System.out.println("Updated Task: " + updatedTask);
        }

       
        taskDAO.close();
    }
}
