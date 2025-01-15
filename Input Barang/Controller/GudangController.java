package Controller;

import Model.ItemGudang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller untuk mengelola data gudang menggunakan database.
 * 
 * @author Rachmawati Ade
 */
public class GudangController {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang";
    private static final String DB_USER = "root"; // untuk default otorisasi ke database
    private static final String DB_PASSWORD = ""; // untuk default password akses database

    /**
     * Menambah data gudang baru ke dalam database.
     *
     * @param jenisGudang Jenis gudang.
     * @return True jika data berhasil ditambahkan, false jika tidak.
     */
    public boolean tambahGudang(String kategoriGudang, String jenisGudang) {
    if (kategoriGudang.isEmpty() || jenisGudang.isEmpty()) {
        System.out.println("Kategori atau jenis gudang tidak boleh kosong!");
        return false;
    }

    String query = "INSERT INTO gudang (kategori_gudang, jenis_gudang) VALUES (?, ?)";
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, kategoriGudang);
        pstmt.setString(2, jenisGudang);
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Data gudang berhasil ditambahkan ke database!");
            return true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}


    /**
     * Mengambil daftar seluruh data gudang dari database.
     *
     * @return List data gudang.
     */
    public List<ItemGudang> getGudangList() {
        List<ItemGudang> gudangList = new ArrayList<>();
        String query = "SELECT * FROM gudang";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int idGudang = rs.getInt("id_gudang");
                String jenisGudang = rs.getString("jenis_gudang");
                gudangList.add(new ItemGudang(idGudang, jenisGudang));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gudangList;
    }

    /**
     * Menghapus data gudang berdasarkan ID dari database.
     *
     * @param idGudang ID gudang yang akan dihapus.
     * @return True jika data berhasil dihapus, false jika tidak ditemukan.
     */
    public boolean hapusGudang(int idGudang) {
        String query = "DELETE FROM gudang WHERE id_gudang = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idGudang);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data gudang berhasil dihapus dari database!");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Data gudang dengan ID tersebut tidak ditemukan.");
        return false;
    }
}
