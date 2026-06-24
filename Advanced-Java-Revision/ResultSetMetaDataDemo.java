import java.sql.*;
public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Dhiraj@123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Number of columns: " + rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.println("Columns Name " + rsmd.getColumnName(i));
                System.out.println(" Data Type " + rsmd.getColumnTypeName(i));
                System.out.println("--------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
