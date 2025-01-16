package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Controller untuk mengelola data barang dan kategorinya.
 */
public class BarangController {
    private final String DB_URL = "jdbc:mysql://localhost:3306/dbsistempenyimpananbarang";
    private final String DB_USER = "root"; //untuk default otorisasi ke database
    private final String DB_PASSWORD = ""; //untuk default password database

    /**
     * Menambah data barang ke tabel barang.
     *
     * @param namaBarang Nama barang.
     * @param jenisBarang Jenis barang.
     * @param banyakBarang Banyaknya barang (untuk kolom berat).
     * @param idGudang ID gudang tempat barang disimpan (foreign key dari tabel gudang).
     * @return ID barang yang baru saja disimpan.
     */
    public int tambahBarang(String namaBarang, String jenisBarang, int banyakBarang, int idGudang) {
        String query = "INSERT INTO barang (nama_barang, jenis_barang, berat, id_gudang) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, namaBarang);
            stmt.setString(2, jenisBarang);
            stmt.setInt(3, banyakBarang);
            stmt.setInt(4, idGudang);

            stmt.executeUpdate();

            // Mengambil ID barang yang baru saja disimpan
            try (var rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Terjadi kesalahan saat menyimpan data barang.");
        }
        return -1; // Jika gagal, kembalikan -1
    }

    /**
     * Menambah data food ke tabel food.
     *
     * @param idBarang ID barang yang berelasi (foreign key dari tabel barang).
     * @param jenisMakanan Jenis makanan.
     * @param kadaluarsa Kadaluarsa makanan.
     */
    public void tambahFood(int idBarang, String jenisMakanan, String kadaluarsa) {
        String query = "INSERT INTO food (id_barang, jenis_makanan, kadaluarsa) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idBarang);
            stmt.setString(2, jenisMakanan);
            stmt.setString(3, kadaluarsa);

            stmt.executeUpdate();
            System.out.println("Data food berhasil disimpan.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Terjadi kesalahan saat menyimpan data food.");
        }
    }

    /**
     * Menambah data furniture ke tabel furniture.
     *
     * @param idBarang ID barang yang berelasi (foreign key dari tabel barang).
     * @param dimensi Dimensi furniture.
     * @param bahan Bahan furniture.
     */
    public void tambahFurniture(int idBarang, String dimensi, String bahan) {
        String query = "INSERT INTO furniture (id_barang, dimensi, bahan) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idBarang);
            stmt.setString(2, dimensi);
            stmt.setString(3, bahan);

            stmt.executeUpdate();
            System.out.println("Data furniture berhasil disimpan.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Terjadi kesalahan saat menyimpan data furniture.");
        }
    }
}
