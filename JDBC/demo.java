import java.sql.*;

public class demo {
    public static void main(String[] args) throws SQLException {

        String sql = "SELECT name FROM products WHERE id=2";

        String url = "jdbc:mysql://localhost:3306/product1"; // Changed port to 3306
        String username = "root";
        String password = "urnoob";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        if (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
        } else {
            System.out.println("No data found for id=1");
        }

        rs.close();
        st.close();
        con.close();
        
    }
}
