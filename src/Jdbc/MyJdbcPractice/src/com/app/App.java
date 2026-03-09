package com.app;

public class App {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        Employee emp = new Employee(1, "Rahul", 45000);

        // INSERT
        dao.insertEmployee(emp);

        // UPDATE
        emp.setName("Rahul Sharma");
        emp.setSalary(50000);
        dao.updateEmployee(emp);

        // READ
        dao.getEmployees();

        // DELETE
        dao.deleteEmployee(1);
    }
}