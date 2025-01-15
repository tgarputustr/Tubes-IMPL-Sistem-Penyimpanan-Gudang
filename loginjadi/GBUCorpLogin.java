import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;

public class GBUCorpLogin {
    private final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "";

    public static void main(String[] args) {
        // Frame utama
        JFrame frame = new JFrame("GBU Corp Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());

        // Panel kiri untuk deskripsi gudang
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(Color.WHITE);

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
        rightPanel.setBackground(new Color(200, 200, 200));

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

        JLabel passwordLabel = new JLabel("Password");
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

        // Tampilkan frame
        frame.setVisible(true);
        submitButton.addActionListener(e -> {
    try (Connection connection = DatabaseConnection.getConnection()) {
        if (connection != null) {
            // Lakukan query atau validasi login di sini
            System.out.println("Validasi login...");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    });

    }
}

