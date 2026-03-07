package com.sat7.assessment;

import java.time.LocalDate;
import java.util.List;

import com.sat7.assessment.dao.*;
import com.sat7.assessment.entity.*;

public class App {

    public static void main(String[] args) {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();

        Customer customer = new Customer(1,"Ayon","ayon@gmail.com","Male",9876543210L,LocalDate.now());
        Order order = new Order(1,"ORD101","Laptop",1,50000,LocalDate.now());

        customer.setOrder(order);
        order.setCustomer(customer);

        customerDAO.saveCustomer(customer);
        System.out.println("Customer inserted");

        Customer c = customerDAO.findById(1);
        System.out.println("Fetched: "+c.getCustomerName());

        List<Customer> list = customerDAO.findAll();
        System.out.println("Total Customers: "+list.size());

        Order o = orderDAO.findById(1);
        o.setQuantity(2);
        orderDAO.updateOrder(o);

        Customer emailCustomer = customerDAO.findByEmail("ayon@gmail.com");
        System.out.println("Found by email: "+emailCustomer.getCustomerName());

        customerDAO.deleteCustomer(1);
        System.out.println("Customer deleted");
    }
}