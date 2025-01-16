package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang"; // Sesuaikan dengan database Anda
    private static final String DB_USERNAME = "root"; // Sesuaikan dengan username Anda
    private static final String DB_PASSWORD = ""; // Sesuaikan dengan password Anda

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver MySQL
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL tidak ditemukan.");
            e.printStackTrace();
        }
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
