import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class TransactionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            con.setAutoCommit(false); // Disable auto-commit mode
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO student (id, name) VALUES (301, 'Amit')");
            st.executeUpdate("INSERT INTO student (id, name) VALUES (302, 'Suresh')");
            con.commit(); // Commit the transaction
            System.out.println("Transaction committed successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
