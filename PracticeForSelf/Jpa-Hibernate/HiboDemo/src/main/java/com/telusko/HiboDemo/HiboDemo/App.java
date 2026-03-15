package com.telusko.HiboDemo.HiboDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop = new Laptop();
       laptop.setLid(999);
       laptop.setLname("Dell");
       
       Student s = new Student();
       s.setName("Navin");
       s.setRollno(1);
       s.setMarks(98);
     
      // s.setLaptop(laptop); for one to one
       
       s.getLaptop().add(laptop); // for many to to one
       
       // for many to many
       
       laptop.getStudent().add(s);
       
       Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
       ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
       
       SessionFactory sf = config.buildSessionFactory(registry);
       
       Session session = sf.openSession();
       
       session.beginTransaction();
       
       session.persist(laptop);
       session.persist(s);
       
       session.getTransaction().commit();
       

       
       
       
    }
}
