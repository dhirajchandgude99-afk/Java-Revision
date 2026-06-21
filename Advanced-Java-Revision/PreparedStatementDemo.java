import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            String query = "INSERT INTO student (id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 104);
            ps.setString(2, "Rahul");
            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
