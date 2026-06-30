import java.sql.Connection;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
public class HikariCPDemo {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
        config.setUsername("root");
        config.setPassword("Dhiraj@123");
        HikariDataSource dataSource = new HikariDataSource(config);
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("Connection pool Working successfully!");
            System.out.println(connection);
            connection.close();  // Returns the connection to the pool
            dataSource.close();  // Closes the pool
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
