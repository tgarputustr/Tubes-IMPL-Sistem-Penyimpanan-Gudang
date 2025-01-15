/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Rachmawati Ade
 */
public class ItemFood {
    private int idBarang; // kolom 'id_barang'
    private String jenisMakanan; // kolom 'jenis_makanan'
    private Date kadaluarsa; //  kolom 'kadaluarsa'

    // Constructor
    public ItemFood(int idBarang, String jenisMakanan, Date kadaluarsa) {
        this.idBarang = idBarang;
        this.jenisMakanan = jenisMakanan;
        this.kadaluarsa = kadaluarsa;
    }

    // Getter dan Setter untuk idBarang
    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    // Getter dan Setter untuk jenisMakanan
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    // Getter dan Setter untuk kadaluarsa
    public Date getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(Date kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
}
