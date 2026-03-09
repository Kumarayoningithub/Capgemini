package com.app;

import java.sql.*;

public class EmployeeDAO {

    public void insertEmployee(Employee emp) {

        try {

            Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(Query.INSERT);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();

            System.out.println("Employee Inserted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateEmployee(Employee emp) {

        try {

            Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(Query.UPDATE);

            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            ps.setInt(3, emp.getId());

            ps.executeUpdate();

            System.out.println("Employee Updated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteEmployee(int id) {

        try {

            Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(Query.DELETE);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Employee Deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getEmployees() {

        try {

            Connection conn = Database.getConnection();
            PreparedStatement ps = conn.prepareStatement(Query.SELECT);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}