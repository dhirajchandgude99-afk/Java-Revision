import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class StudentDAO {
    public void insertStudent(Student s) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            String query = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}  
