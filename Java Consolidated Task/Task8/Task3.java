import java.sql.*;
import java.util.Scanner;

public class DeleteEmployeeData {
    private static final String DELETE_QUERY = "DELETE FROM Employees WHERE id=?";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "root");
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter Employee ID to delete: ");
            int id = scanner.nextInt();

            try (PreparedStatement pstmt = conn.prepareStatement(DELETE_QUERY)) {
                pstmt.setInt(1, id);
                int rowsDeleted = pstmt.executeUpdate();
                System.out.println(rowsDeleted > 0 ? "Record deleted successfully!" : "No record found with given ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}