package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.DatabaseConnection;

public class LoginController {

    private final Connection connection; // Koneksi yang diberikan dari luar

    // Constructor untuk menerima koneksi dari luar
    public LoginController(Connection connection) {
        this.connection = connection;
    }

    // Method untuk memeriksa validitas login berdasarkan nama dan password
    public boolean isValid(String nama, String password) {
        String query = "SELECT * FROM users WHERE nama = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nama);
            statement.setString(2, password);

            try (ResultSet rs = statement.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method utama untuk pengujian koneksi
    public static void main(String[] args) {
        try {
            // Mendapatkan koneksi database
            Connection connection = DatabaseConnection.getConnection();
            
            // Membuat instance LoginController dengan koneksi yang diberikan
            LoginController loginController = new LoginController(connection);
            
            // Pengujian validasi login
            boolean isValidUser = loginController.isValid("admin", "1234");
            System.out.println("Apakah valid: " + isValidUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
