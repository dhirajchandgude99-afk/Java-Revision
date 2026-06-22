import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class UpdateDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            Statement st = con.createStatement();
            String query = "UPDATE student SET name='Rahul Sharma' WHERE id=200";
            int rows = st.executeUpdate(query);
            System.out.println(rows + " row(s) updated successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
}
