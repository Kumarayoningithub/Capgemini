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
import java.util.Scanner;  // Import Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner to read keyboard input

        try (Connection conn = DatabaseConfig.getConnection()) {  // Auto-closes connection

            while (true) {  // Infinite loop - keeps running until we break
                System.out.println("\n=== ADD NEW TASK ===");
                System.out.print("Enter title (or 'quit' to exit): ");
                String title = scanner.nextLine();  // Wait for user to type and press Enter

                // Check if user wants to quit
                if (title.equalsIgnoreCase("quit")) {  // equalsIgnoreCase = "quit", "QUIT", "Quit" all work
                    System.out.println("Exiting...");
                    break;  // Exit the while loop
                }

                System.out.print("Enter description: ");
                String description = scanner.nextLine();  // Get description from user

                // Insert into database
                String sql = "INSERT INTO tasks (title, description) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {  // Auto-closes statement
                    pstmt.setString(1, title);        // Set first ? with title
                    pstmt.setString(2, description);   // Set second ? with description

                    int rowsAffected = pstmt.executeUpdate();  // Run the insert
                    System.out.println("✅ Task added! (" + rowsAffected + " row(s) affected)");
                }  // pstmt automatically closed here
            }  // Loop back to start - ask for another task

        } catch (SQLException | ClassNotFoundException e) {  // Handle any database errors
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();  // Close the scanner when done
    }
}