/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Rachmawati Ade
 */
public class ItemGudang {
    private int idGudang;// kolom id gudang
    private String jenisGudang;// kolom jenis gudang

    public ItemGudang(int idGudang, String jenisGudang) {
        this.idGudang = idGudang;
        this.jenisGudang = jenisGudang;
    }

    // Getter dan setter untuk atribut
    public int getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(int idGudang) {
        this.idGudang = idGudang;
    }

    public String getJenisGudang() {
        return jenisGudang;
    }

    public void setJenisGudang(String jenisGudang) {
        this.jenisGudang = jenisGudang;
    }
}
