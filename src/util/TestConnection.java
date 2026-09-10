package util;
import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        DB_Connection dbConnection = new DB_Connection();

        Connection connection = dbConnection.get_connection();

        if (connection != null) {
            System.out.println("Database is connected!");
        } else {
            System.out.println("Database connection failed!");
        }
    }
}