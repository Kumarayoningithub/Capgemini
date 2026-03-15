package com.telusko.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       Alien a = new Alien();
       
       a.setAid(9);
       a.setAname("ronaldo");
       a.setTech("hardware");
            
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
       EntityManager em = emf.createEntityManager();
       
      // Alien a = em.find(Alien.class, 105);
       
       em.getTransaction().begin();
       em.persist(a);
       em.getTransaction().commit();
       
       System.out.println(a);
    }
}
