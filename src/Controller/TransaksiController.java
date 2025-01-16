package Controller;

import Model.Transaksi;
import Model.DatabaseConnection;
import View.TransaksiView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TransaksiController {
    private Transaksi model;
    private TransaksiView view;

    public TransaksiController(Transaksi model, TransaksiView view) {
        this.model = model;
        this.view = view;

        // Listener untuk tombol "Bayar"
        this.view.getButtonBayar().addActionListener(e -> fetchData());
    }

    private void fetchData() {
        // Ambil ID Transaksi dari input pengguna
        String inputId = view.getFieldNoTransaksi().getText();

        if (inputId.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Masukkan No Transaksi!");
            return;
        }

        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Koneksi ke database berhasil.");

            // Query untuk mendapatkan data berdasarkan ID Transaksi
            String query = "SELECT * FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, Integer.parseInt(inputId)); // Convert input ke integer

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Isi model dengan data dari database
                model.setIdTransaksi(rs.getInt("id_pembayaran"));
                model.setNamaBarang(rs.getString("nama_barang"));
                model.setKategori(rs.getString("kategori"));
                model.setJumlah(rs.getInt("jumlah"));
                model.setPemilik(rs.getString("pemilik"));
                model.setTanggal(rs.getString("tanggal"));
                model.setTotal(rs.getDouble("total"));

                // Perbarui tampilan dengan data yang diambil
                SwingUtilities.invokeLater(() -> {
                    view.getFieldNamaBarang().setText(model.getNamaBarang());
                    view.getFieldKategori().setText(model.getKategori());
                    view.getFieldJumlah().setText(String.valueOf(model.getJumlah()));
                    view.getFieldPemilik().setText(model.getPemilik());
                    view.getFieldTanggal().setText(model.getTanggal());
                    view.getFieldTotal().setText(String.valueOf(model.getTotal()));
                });
            } else {
                JOptionPane.showMessageDialog(view, "Transaksi tidak ditemukan!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "ID Transaksi harus berupa angka!");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(view, "Terjadi kesalahan saat mengambil data!");
        }
    }
}