package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransaksiView extends JFrame {
    private JTextField fieldNoTransaksi, fieldNamaBarang, fieldKategori, fieldJumlah, fieldPemilik, fieldTanggal, fieldTotal;
    private JButton buttonBayar;

    public TransaksiView() {
        setTitle("Ringkasan Tagihan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLayout(new GridBagLayout());

        JLabel labelTitle = new JLabel("RINGKASAN TAGIHAN");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel labelNoTransaksi = new JLabel("No Transaksi");
        fieldNoTransaksi = new JTextField(25);

        JLabel labelNamaBarang = new JLabel("Nama Barang");
        fieldNamaBarang = new JTextField(25);

        JLabel labelKategori = new JLabel("Kategori");
        fieldKategori = new JTextField(25);

        JLabel labelJumlah = new JLabel("Jumlah");
        fieldJumlah = new JTextField(25);

        JLabel labelPemilik = new JLabel("Pemilik");
        fieldPemilik = new JTextField(25);

        JLabel labelTanggal = new JLabel("Tanggal");
        fieldTanggal = new JTextField(25);

        JLabel labelTotal = new JLabel("Total");
        fieldTotal = new JTextField(25);

        buttonBayar = new JButton("Bayar");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(labelTitle, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(labelNoTransaksi, gbc);
        gbc.gridx = 1;
        add(fieldNoTransaksi, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(labelNamaBarang, gbc);
        gbc.gridx = 1;
        add(fieldNamaBarang, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(labelKategori, gbc);
        gbc.gridx = 1;
        add(fieldKategori, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(labelJumlah, gbc);
        gbc.gridx = 1;
        add(fieldJumlah, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(labelPemilik, gbc);
        gbc.gridx = 1;
        add(fieldPemilik, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(labelTanggal, gbc);
        gbc.gridx = 1;
        add(fieldTanggal, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        add(labelTotal, gbc);
        gbc.gridx = 1;
        add(fieldTotal, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        add(buttonBayar, gbc);

        // Menambahkan ActionListener ke buttonBayar
        buttonBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BayarView(); // Pindah ke BayarView
            }
        });

        setLocationRelativeTo(null); // Tampilkan di tengah layar
        setVisible(true);
    }

    public JTextField getFieldNoTransaksi() {
        return fieldNoTransaksi;
    }

    public JTextField getFieldNamaBarang() {
        return fieldNamaBarang;
    }

    public JTextField getFieldKategori() {
        return fieldKategori;
    }

    public JTextField getFieldJumlah() {
        return fieldJumlah;
    }

    public JTextField getFieldPemilik() {
        return fieldPemilik;
    }

    public JTextField getFieldTanggal() {
        return fieldTanggal;
    }

    public JTextField getFieldTotal() {
        return fieldTotal;
    }

    public JButton getButtonBayar() {
        return buttonBayar;
    }
}