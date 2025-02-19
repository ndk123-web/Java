import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Safe_Domain {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        List<String> domains = new ArrayList<>();
        boolean issafe = false;

        String query = "select dm from domains";

        String url = "jdbc:mysql://localhost:3306/product1";
        String user = "root";
        String pass = "urnoob";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            con = DriverManager.getConnection(url, user, pass);
            // Connects Java application and DB through JDBC(.getconnectin(url,user,pass))

            st = con.createStatement();
            // Statament object use to send sql queries to DB (st.execureQuery(query))

            rs = st.executeQuery(query);
            // execute query and return result in table format

            while (rs.next()) {
                String name = rs.getString("dm");
                domains.add(name.toLowerCase());
            }

            System.out.println("Connection Successfully Connected");

        } catch (Exception e) {
            System.out.println("Connection Fails");
        }

        while (true) {
            System.out.println("Enter Domain Name");
            String inp = sc.nextLine();

            if (inp.toLowerCase().equals("quit")) {
                break;
            }

            for (String i : domains) {
                if (i.equals(inp.toLowerCase())) {
                    issafe = true;
                    break;
                } else {
                    issafe = false;
                }
            }

            if (issafe) {
                System.out.println("This is Secure Domain");
            } else {
                System.out.println("This is not Secure Domain");
            }
        }

        System.out.println("Connection Disconnected");
        con.close();
        st.close();
        rs.close();
        sc.close();

    }
}