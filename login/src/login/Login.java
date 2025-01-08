package login;

public class Login {
    public static void main(String[] args) {
        // Membuat instance dari HomeLogin dan menampilkannya
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }
}
