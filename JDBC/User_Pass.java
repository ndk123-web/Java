import java.util.Scanner;
import java.sql.*;

public class User_Pass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String query = "SELECT * FROM users WHERE un = ? AND ps = ?";

        String url = "jdbc:mysql://localhost:3306/product1";
        String username = "root";
        String password = "urnoob";

        String inputUser = "";
        String inputPass = "";

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Establishing the connection
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(query);

            System.out.println("Database Connected");

            // Getting user input
            System.out.println("Enter Username:");
            inputUser = sc.nextLine();

            System.out.println("Enter Password:");
            inputPass = sc.nextLine();

            // Setting parameters for the query
            ps.setString(1, inputUser);
            ps.setString(2, inputPass);

            // Executing the query
            rs = ps.executeQuery();

            // Checking if user is found
            if (rs.next()) {
                System.out.println("Login Verified");
            } else {
                System.out.println("Login Failed");
            }

        } catch (SQLException e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        } finally {
            // Closing resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
                sc.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
