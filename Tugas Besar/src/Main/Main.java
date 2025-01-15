package Main;

import Controller.TransaksiController;
import Model.Transaksi;
import View.TransaksiView;

public class Main {
    public static void main(String[] args) {
        Transaksi model = new Transaksi();
        TransaksiView view = new TransaksiView();
        TransaksiController controller = new TransaksiController(model, view);

        // Optionally set the No Transaksi field if you want to display a specific transaction
        view.getFieldNoTransaksi().setText("1"); // Replace with the desired transaction ID
    }
}
