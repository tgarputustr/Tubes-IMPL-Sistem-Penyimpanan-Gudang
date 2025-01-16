package View;

import javax.swing.*;
import java.awt.*;

public class BayarView extends JFrame {
    private JComboBox<String> metodePembayaranComboBox;
    private JButton buttonLanjut;

    public BayarView() {
        // Set frame properties
        setTitle("Metode Pembayaran");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel titleLabel = new JLabel("METODE PEMBAYARAN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(titleLabel, BorderLayout.NORTH);

        // Form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Label dan ComboBox untuk metode pembayaran
        JLabel metodeLabel = new JLabel("Pilih Metode Pembayaran:");
        metodeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(metodeLabel, gbc);

        metodePembayaranComboBox = new JComboBox<>(new String[]{"Transfer Bank", "Kartu Kredit", "E-Wallet", "Tunai"});
        metodePembayaranComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        formPanel.add(metodePembayaranComboBox, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonLanjut = new JButton("Lanjut");
        buttonLanjut.setFont(new Font("Arial", Font.BOLD, 14));
        buttonLanjut.setPreferredSize(new Dimension(120, 40));
        buttonPanel.add(buttonLanjut);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Getter untuk ComboBox dan Button
    public JComboBox<String> getMetodePembayaranComboBox() {
        return metodePembayaranComboBox;
    }

    public JButton getButtonLanjut() {
        return buttonLanjut;
    }
}
