/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rachmawati Ade
 */
public class ItemFurniture {
    private int idBarang; // kolom 'id_barang'
    private String bahan; // kolom 'bahan'
    private String dimensi; // kolom 'dimensi'

    // Constructor
    public ItemFurniture(int idBarang, String bahan, String dimensi) {
        this.idBarang = idBarang;
        this.bahan = bahan;
        this.dimensi = dimensi;
    }

    // Getter dan Setter untuk idBarang
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    // Getter dan Setter untuk bahan
    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    // Getter dan Setter untuk dimensi
    public String getDimensi() {
        return dimensi;
    }

    public void setDimensi(String dimensi) {
        this.dimensi = dimensi;
    }
}
