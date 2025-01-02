/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

public class TransactionView extends javax.swing.JFrame {

    /**
     * Creates new form TransactionView
     */
    public TransactionView() {
        initComponents();
        
        noTransaksiField.setEditable(false);
        namaBarangField.setEditable(false);
        kategoriField.setEditable(false);
        jumlahField.setEditable(false);
        pemilikField.setEditable(false);
        tanggalField.setEditable(false);
        totalField.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        noTransLabel = new javax.swing.JLabel();
        namaBarangLabel = new javax.swing.JLabel();
        kategoriLabel = new javax.swing.JLabel();
        jumlahLabel = new javax.swing.JLabel();
        pemilikLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        noTransaksiField = new javax.swing.JTextField();
        namaBarangField = new javax.swing.JTextField();
        kategoriField = new javax.swing.JTextField();
        jumlahField = new javax.swing.JTextField();
        pemilikField = new javax.swing.JTextField();
        tanggalField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        buttonBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel1.setText("Ringkasan Tagihan");

        noTransLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        noTransLabel.setText("No Transaksi");

        namaBarangLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        namaBarangLabel.setText("Nama Barang");

        kategoriLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        kategoriLabel.setText("Kategori");

        jumlahLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        jumlahLabel.setText("Jumlah");

        pemilikLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        pemilikLabel.setText("Pemilik");

        tanggalLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        tanggalLabel.setText("Tanggal");

        noTransaksiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTransaksiFieldActionPerformed(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 24)); // NOI18N
        totalLabel.setText("Total");

        buttonBayar.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 18)); // NOI18N
        buttonBayar.setText("Bayar");
        buttonBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBayarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(noTransLabel)
                            .addGap(124, 124, 124)
                            .addComponent(noTransaksiField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(namaBarangLabel)
                            .addGap(113, 113, 113)
                            .addComponent(namaBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(kategoriLabel)
                            .addGap(168, 168, 168)
                            .addComponent(kategoriField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jumlahLabel)
                            .addGap(192, 192, 192)
                            .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(pemilikLabel)
                            .addGap(187, 187, 187)
                            .addComponent(pemilikField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tanggalLabel)
                            .addGap(177, 177, 177)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(totalLabel)
                                    .addGap(41, 41, 41)
                                    .addComponent(totalField))))
                        .addComponent(buttonBayar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(342, 342, 342))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noTransLabel)
                    .addComponent(noTransaksiField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaBarangLabel)
                    .addComponent(namaBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kategoriLabel)
                    .addComponent(kategoriField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahLabel)
                    .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pemilikLabel)
                    .addComponent(pemilikField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalLabel)
                    .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalLabel)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(buttonBayar)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noTransaksiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTransaksiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTransaksiFieldActionPerformed

    private void buttonBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBayarMouseClicked
        BayarView bayar = new BayarView();
        bayar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBayarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JTextField kategoriField;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JTextField namaBarangField;
    private javax.swing.JLabel namaBarangLabel;
    private javax.swing.JLabel noTransLabel;
    private javax.swing.JTextField noTransaksiField;
    private javax.swing.JTextField pemilikField;
    private javax.swing.JLabel pemilikLabel;
    private javax.swing.JTextField tanggalField;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
