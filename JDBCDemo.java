import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCDemo {
public static void main(String[] args) {
    try {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "Dhiraj@123";    
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established successfully.");
        con.close();
    } catch (Exception e) {
       System.out.println(e);
    }
}
}
        

