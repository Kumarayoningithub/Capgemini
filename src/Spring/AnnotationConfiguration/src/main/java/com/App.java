package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
              
    	//DataBaseProperties   properties = new DataBaseProperties();
    	
    	// Now Create a EmployeeDatabaseOperation Class and configure the bean creation by the IOC Container
    	
    	//ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseProperties.class,EmployeeDatabaseOperation.class);
    	ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseProperties.class);
    	
    	
    	
    	String [] beanDefinationNames = context.getBeanDefinitionNames();
    	
    	for(String names : beanDefinationNames) {
    		System.out.println(names);
    	}
    	
    	
    	
    	
//        ApplicationContext contextt = new AnnotationConfigApplicationContext( EmployeeDatabaseOperation.class);
//    	
//    	
//    	String [] beanDefinationNamess = contextt.getBeanDefinitionNames();
//    	
//    	for(String names : beanDefinationNamess) {
//    		System.out.println(names);
//    	}
    	
    	EmployeeDatabaseOperation operation = context.getBean(EmployeeDatabaseOperation.class);
    	operation.insertEmployeeDetails();
    	
    	
    	
    	
    	
    	
    }
}
