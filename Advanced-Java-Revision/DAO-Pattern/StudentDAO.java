import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            String query = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("name")
                );
                studentList.add(s);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
           
