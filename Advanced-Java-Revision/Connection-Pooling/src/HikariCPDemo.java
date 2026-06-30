import java.sql.Connection;
public class HikariCPDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DBConnection.getConnection();
            System.out.println("Connection pool Working successfully!");
            System.out.println(connection);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

        