import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class InsertDataDemo {
public static void main(String[] args) {
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
        System.out.println("Connection established successfully.");
        Statement st = con.createStatement();
        String query = "INSERT INTO studentdb.student VALUES(100, 'Rahul')";
        int rows = st.executeUpdate(query);
        System.out.println(rows + " row(s) inserted successfully.");
        con.close();
    } catch (Exception e) {
       System.out.println(e);
    }
}
}
