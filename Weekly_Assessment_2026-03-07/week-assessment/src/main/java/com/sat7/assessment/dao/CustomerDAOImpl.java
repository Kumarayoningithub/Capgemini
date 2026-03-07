package com.sat7.assessment.dao;

import jakarta.persistence.*;
import java.util.List;
import com.sat7.assessment.entity.Customer;

public class CustomerDAOImpl {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("GenericDBAdapter");
    private EntityManager em;

    private void openConnection() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    private void closeConnection() {
        em.getTransaction().commit();
        em.close();
    }

    public void saveCustomer(Customer customer) {
        openConnection();
        em.persist(customer);
        closeConnection();
    }

    public Customer findById(int id) {
        openConnection();
        Customer c = em.find(Customer.class, id);
        closeConnection();
        return c;
    }

    public List<Customer> findAll() {
        openConnection();
        TypedQuery<Customer> q = em.createQuery("SELECT c FROM Customer c", Customer.class);
        List<Customer> list = q.getResultList();
        closeConnection();
        return list;
    }

    public void updateCustomer(Customer customer) {
        openConnection();
        em.merge(customer);
        closeConnection();
    }

    public void deleteCustomer(int id) {
        openConnection();
        Customer c = em.find(Customer.class, id);
        if(c != null) {
            em.remove(c);
        }
        closeConnection();
    }

    public Customer findByEmail(String email) {
        openConnection();
        TypedQuery<Customer> q = em.createQuery(
                "SELECT c FROM Customer c WHERE c.email = :email", Customer.class);
        q.setParameter("email", email);
        Customer c = q.getSingleResult();
        closeConnection();
        return c;
    }
}