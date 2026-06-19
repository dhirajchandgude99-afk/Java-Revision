import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            Statement st = con.createStatement();
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("-------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

