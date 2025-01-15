package Controller;

import Model.Transaksi;
import Model.DatabaseConnection;
import View.TransaksiView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class TransaksiController {
    private Transaksi model;
    private TransaksiView view;

    public TransaksiController(Transaksi model, TransaksiView view) {
        this.model = model;
        this.view = view;
    
        // Fetch data automatically
        fetchData();
    
        // Listener untuk tombol "Bayar"
        this.view.getButtonBayar().addActionListener(e -> fetchData());
    }
    
    private void fetchData() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Koneksi ke database berhasil.");
    
            // Hardcode the idTransaksi for demonstration purposes
            int idTransaksi = 1; // Replace with the desired ID to fetch
    
            String query = "SELECT * FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, idTransaksi);
    
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
    
                // Set data ke JTextField di view
                view.getFieldNamaBarang().setText(model.getNamaBarang());
                view.getFieldKategori().setText(model.getKategori());
                view.getFieldJumlah().setText(String.valueOf(model.getJumlah()));
                view.getFieldPemilik().setText(model.getPemilik());
                view.getFieldTanggal().setText(model.getTanggal());
                view.getFieldTotal().setText(String.valueOf(model.getTotal()));
    
                System.out.println("Data berhasil ditampilkan di view.");
            } else {
                JOptionPane.showMessageDialog(view, "Transaksi tidak ditemukan!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(view, "Terjadi kesalahan saat mengambil data!");
        }
    }
    
}
