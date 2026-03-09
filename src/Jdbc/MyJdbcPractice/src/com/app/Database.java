package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection getConnection() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/UEM";
            String username = "root";
            String password = "A@b12345";

            conn = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}