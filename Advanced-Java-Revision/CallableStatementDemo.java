import java.sql.*;
public class CallableStatementDemo {
 public static void main(String[] args) {
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
   CallableStatement cs = con.prepareCall("{call addStudent(?, ?)}");
   cs.setInt(1, 405);
   cs.setString(2, "omkar");   
   cs.execute();
   System.out.println("Student added successfully!");
  } catch (Exception e) {
    System.out.println(e.getMessage());
   e.printStackTrace();
  }
 }
}

