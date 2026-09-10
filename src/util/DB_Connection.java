package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

    private static final String DATABASE_URL =
            "jdbc:mysql://localhost:3306/table21";

    private static final String DATABASE_USERNAME = "root";

    private static final String DATABASE_PASSWORD = "Lwbin0429#";

    public Connection get_connection() {

        Connection databaseConnection = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL
            databaseConnection = DriverManager.getConnection(
                    DATABASE_URL,
                    DATABASE_USERNAME,
                    DATABASE_PASSWORD
            );

            System.out.println("MySQL connection successful!");

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("MySQL connection failed!");
            e.printStackTrace();
        }

        return databaseConnection;
    }
}