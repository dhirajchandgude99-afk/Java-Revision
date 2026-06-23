import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DeleteDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            Statement st = con.createStatement();
            String query = "DELETE FROM student WHERE id=102";
            int rows = st.executeUpdate(query);
            System.out.println(rows + " row(s) deleted successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
