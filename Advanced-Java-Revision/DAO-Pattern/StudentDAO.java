import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class StudentDAO {
    public void updateStudent(Student student) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            String query = "UPDATE student SET name = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getId());
            ps.executeUpdate();
            System.out.println("Student updated successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
              
