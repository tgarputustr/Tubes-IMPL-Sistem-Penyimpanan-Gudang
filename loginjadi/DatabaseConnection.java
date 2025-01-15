import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Method untuk mendapatkan koneksi ke database
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Memuat driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi ke database
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Koneksi ke database berhasil.");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Gagal terhubung ke database: " + e.getMessage());
        }
        return connection;
    }

    // Method untuk memvalidasi nama dan password
    public boolean isValid(String nama, String password) {
        String query = "SELECT * FROM admin WHERE nama = ? AND password = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
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
        Connection connection = getConnection();
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi ke database ditutup.");
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}
