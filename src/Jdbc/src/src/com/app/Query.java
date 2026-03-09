package com.app;

public class Query {

    public static final String INSERT =
            "INSERT INTO employee(id,name,salary) VALUES(?,?,?)";

    public static final String UPDATE =
            "UPDATE employee SET name=?, salary=? WHERE id=?";

    public static final String DELETE =
            "DELETE FROM employee WHERE id=?";

    public static final String SELECT =
            "SELECT * FROM employee";
}