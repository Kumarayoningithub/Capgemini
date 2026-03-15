package com.telusko.DemoHib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
//    public static void main(String[] args)
//    {
//        Alien telusko = new Alien();
//
////        telusko.setAid(999);
////        telusko.setAname("subhra");
////        telusko.setColor("orange");
//        
//        AlienName an = new AlienName();
//        an.setFname("ayon");
//        an.setMname("kumar");
//        an.setLname("saha");
//        
//        telusko.setAid(111);
//        telusko.setColor("yellow");
//        telusko.setAname(an);
//
//        Configuration con = new Configuration()
//                .configure()
//                .addAnnotatedClass(Alien.class);
//
//        SessionFactory sf = con.buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction tx = session.beginTransaction();
//
//      //  session.persist(telusko);   // replacement for save()
//
//       // telusko = (Alien) session.get(Alien.class, 999);// for fetching data
//        
//        session.persist(telusko); 
//        
//        tx.commit();
//        
//        System.out.println(telusko);
//       
//       // session.close();
//        //sf.close();
//    }
	
	// First level Cashing
	
	public static void main(String[] args) {
		 Alien a = null;
		 
		 Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		 
		 ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		 SessionFactory sf = con.buildSessionFactory(registry);
		 Session session1 = sf.openSession();
	       
	       session1.beginTransaction();
	       
	       
	       a= (Alien) session1.get(Alien.class, 111);
	       
	       System.out.println(a);
	       // same query fire to check about session
	       // after checking we found here query is fired only once, but the object data given two times
	       
	       a= (Alien) session1.get(Alien.class, 111);
	       
	       System.out.println(a);
	    		   
	       
	       
	       session1.getTransaction().commit();
	       session1.close();
	       
	       // for checking the 2nd session 
	       
	       Session session2 = sf.openSession();
	       
	       session2.beginTransaction();
	       
	       
	       a= (Alien) session2.get(Alien.class, 111);
	       
	       System.out.println(a);
	       // same query fire to check about session
	       // after checking we found here query is fired only once, but the object data given two times
	       
	       a= (Alien) session2.get(Alien.class, 111);
	       
	       System.out.println(a);
	    		   
	       
	       
	       session2.getTransaction().commit();
	       session2.close();
	       
	       
	       
	       
	       
		 
		 
		 
		 
	
	
	}
}