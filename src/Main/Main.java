package Main;

import Controller.TransaksiController;
import Model.Transaksi;
import View.TransaksiView;

public class Main {
    public static void main(String[] args) {
        Transaksi model = new Transaksi();
        TransaksiView view = new TransaksiView();
        new TransaksiController(model, view);
    }
}