import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class BatchProcessingDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            Statement st = con.createStatement();
            st.addBatch("INSERT INTO student (id, name) VALUES (201, 'Dhiraj')");
            st.addBatch("INSERT INTO student (id, name) VALUES (202, 'Rahul')");
            st.addBatch("INSERT INTO student (id, name) VALUES (203, 'Rohit')");
            st.executeBatch();
            System.out.println("Batch processed successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
