import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class StudentDAO {
    public void deleteStudent(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            String query = "DELETE FROM student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
              
