//import java.sql.*;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Connection conn = DatabaseConfig.getConnection();
//        PreparedStatement pstmt = conn.prepareStatement(
//                "INSERT INTO task (title, description) VALUES (?, ?)");
//        pstmt.setString(1, "JDBC Testing");
//        pstmt.setString(2, "This is the JDBC Testing description");
//        pstmt.executeUpdate();
//        System.out.println("Task added");
//        pstmt.close();
//        conn.close();
//    }
//}

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//
//        Connection conn = DatabaseConfig.getConnection();
//
//        PreparedStatement pstmt = conn.prepareStatement(
//                "INSERT INTO tasks (title, description) VALUES (?, ?)"
//        );
//
//        pstmt.setString(1, "JDBC Testing");
//        pstmt.setString(2, "This is the JDBC Testing description");
//
//        pstmt.executeUpdate();
//
//        System.out.println("Task added");
//
//        pstmt.close();
//        conn.close();
//    }
//}
import java.sql.*;
import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        try (Connection conn = DatabaseConfig.getConnection()) { 

            while (true) { 
                System.out.println("\n=== ADD NEW TASK ===");
                System.out.print("Enter title (or 'quit' to exit): ");
                String title = scanner.nextLine();  

              
                if (title.equalsIgnoreCase("quit")) { 
                    System.out.println("Exiting...");
                    break;  
                }

                System.out.print("Enter description: ");
                String description = scanner.nextLine();  

            
                String sql = "INSERT INTO tasks (title, description) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {  
                    pstmt.setString(1, title);       
                    pstmt.setString(2, description);   

                    int rowsAffected = pstmt.executeUpdate();  
                    System.out.println("✅ Task added! (" + rowsAffected + " row(s) affected)");
                } 
            } 

        } catch (SQLException | ClassNotFoundException e) {  
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();  
    }
}
