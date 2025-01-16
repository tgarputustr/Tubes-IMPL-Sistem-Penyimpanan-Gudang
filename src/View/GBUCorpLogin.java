package View;

import Model.DatabaseConnection;
import Model.Transaksi;
import Controller.LoginController;
import Controller.TransaksiController;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class GBUCorpLogin {
    // Konfigurasi database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Metode untuk mendapatkan koneksi ke database
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database: " + e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // Metode untuk memvalidasi login
    public static boolean validateLogin(String username, String password) {
        String query = "SELECT * FROM customer WHERE nama = ? AND password = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password); // Password plain, hashing sebaiknya diterapkan di sini

            try (ResultSet rs = statement.executeQuery()) {
                return rs.next(); // True jika username dan password cocok
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memvalidasi login: " + e.getMessage(),
                    "Login Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("GBU Corp Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());

        // Panel kiri untuk deskripsi gudang
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(new Color(255, 255, 255));

        JLabel titleLabel = new JLabel("GBU CORP");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descriptionLabel = new JLabel("<html><div style='text-align: justify;'>"
                + "Gudang ini digunakan untuk menyimpan barang yang terdiri dari Furniture dan beberapa jenis makanan.<br>"
                + "<ol>"
                + "<li>Menyimpan berbagai jenis barang inventory seperti perabotan, elektronik, dan barang-barang non-perishable lainnya.</li>"
                + "<li>Memiliki sistem manajemen stok untuk melacak barang yang masuk dan keluar, memastikan ketersediaan barang selalu terpantau.</li>"
                + "<li>Dilengkapi dengan sistem keamanan untuk melindungi barang dari pencurian dan kerusakan.</li>"
                + "</ol>"
                + "</div></html>");
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        descriptionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        leftPanel.add(titleLabel);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        leftPanel.add(descriptionLabel);

        // Panel kanan untuk login
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(230, 230, 250));

        JLabel loginTitle = new JLabel("LOGIN ACCOUNT");
        loginTitle.setFont(new Font("Arial", Font.BOLD, 18));
        loginTitle.setBounds(150, 20, 200, 30);
        rightPanel.add(loginTitle);

        JLabel usernameLabel = new JLabel("USERNAME");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameLabel.setBounds(50, 70, 100, 25);
        rightPanel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 70, 200, 25);
        rightPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordLabel.setBounds(50, 120, 100, 25);
        rightPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 25);
        rightPanel.add(passwordField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 170, 100, 30);
        rightPanel.add(submitButton);

        // Menambahkan panel ke frame
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

        // Menentukan ukuran panel kiri
        leftPanel.setPreferredSize(new Dimension(400, 0));

        // Aksi tombol submit
        submitButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Username dan Password tidak boleh kosong!",
                        "Input Error", JOptionPane.WARNING_MESSAGE);
            } else if (validateLogin(username, password)) {
                JOptionPane.showMessageDialog(frame, "Login berhasil! Selamat datang " + username,
                        "Login Success", JOptionPane.INFORMATION_MESSAGE);

                        frame.dispose();

                        // Pindah ke InputFrame setelah login berhasil
                        InputFrame IF = new InputFrame();
                        IF.setVisible(true);
                        frame.dispose();// Instantiate InputFrame
        
            } else {
                JOptionPane.showMessageDialog(frame, "Login gagal! Periksa username dan password Anda.",
                        "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}

