package Controller;

import Model.BayarModel;
import View.BayarView;

import javax.swing.*;

public class BayarController {
    private BayarModel model;
    private BayarView view;

    public BayarController(BayarModel model, BayarView view) {
        this.model = model;
        this.view = view;

        // Tambahkan action listener pada tombol lanjut
        view.getButtonLanjut().addActionListener(e -> prosesPembayaran());
    }

    private void prosesPembayaran() {
        // Ambil metode pembayaran yang dipilih dari View
        String metode = (String) view.getMetodePembayaranComboBox().getSelectedItem();

        // Simpan metode pembayaran ke Model
        model.setMetodePembayaran(metode);

        // Tampilkan logika berdasarkan metode pembayaran
        switch (metode) {
            case "Transfer Bank":
                JOptionPane.showMessageDialog(view,
                        "Anda memilih Transfer Bank.\n" +
                                "Silakan lakukan transfer ke rekening berikut:\n" +
                                "Bank: BCA\nNo Rekening: 123-456-7890\nAtas Nama: PT Contoh Indonesia");
                break;

            case "Kartu Kredit":
                JOptionPane.showMessageDialog(view,
                        "Anda memilih Kartu Kredit.\n" +
                                "Silakan masukkan informasi kartu kredit pada form pembayaran online.");
                break;

            case "E-Wallet":
                JOptionPane.showMessageDialog(view,
                        "Anda memilih E-Wallet.\n" +
                                "Silakan scan QR code berikut menggunakan aplikasi E-Wallet Anda.");
                break;

            case "Tunai":
                JOptionPane.showMessageDialog(view,
                        "Anda memilih pembayaran Tunai.\n" +
                                "Silakan selesaikan pembayaran di kasir.");
                break;

            default:
                JOptionPane.showMessageDialog(view,
                        "Metode pembayaran tidak dikenal. Silakan coba lagi.");
                break;
        }
    }
}
