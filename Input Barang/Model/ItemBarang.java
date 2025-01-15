/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Rachmawati Ade
 */
public class ItemBarang {
    private int idBarang; // kolom 'id_barang'
    private String namaBarang; // kolom 'nama_barang'
    private String jenisBarang; //  kolom 'jenis_barang'
    private int berat; // kolom 'berat'
    private String kapasitas; //  kolom 'kapasitas'
    private String status; // kolom 'status'

    // Constructor
    public ItemBarang(int idBarang, String namaBarang, String jenisBarang, int berat, String kapasitas, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.berat = berat;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    // Getters dan Setters
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
