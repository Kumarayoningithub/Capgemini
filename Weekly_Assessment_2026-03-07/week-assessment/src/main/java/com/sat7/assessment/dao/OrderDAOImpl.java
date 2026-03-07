package com.sat7.assessment.dao;

import jakarta.persistence.*;
import com.sat7.assessment.entity.Order;

public class OrderDAOImpl {

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

    public void updateOrder(Order order) {
        openConnection();
        em.merge(order);
        closeConnection();
    }

    public Order findById(int id) {
        openConnection();
        Order o = em.find(Order.class, id);
        closeConnection();
        return o;
    }
}