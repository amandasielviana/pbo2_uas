/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import sys.crudtable;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

/**
 *
 * @author gustiamanda
 */
public class framenilai extends javax.swing.JFrame {
String judulkolom[] = {"npm", "nama", "ips1", "ips2", "ips3", "ips4", "ips5", "ips6", "ips7", "ipk"};
int lebarkolom[] = {150, 300, 200, 100, 100, 100};
String SQL = "SELECT *FROM khs";
    /**
     * Creates new form framenilai
     */
    private crudtable myObject;
    public framenilai() {
        initComponents();
        this.setLocationRelativeTo(null);
        myObject = new crudtable();
        myObject.settingJudulTabel(tableNilai, judulkolom);
        myObject.settingLebarKolom(tableNilai, lebarkolom);
        myObject.tampilTabel(tableNilai, SQL, judulkolom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnpm = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtips1 = new javax.swing.JTextField();
        txtips2 = new javax.swing.JTextField();
        txtips3 = new javax.swing.JTextField();
        txtips4 = new javax.swing.JTextField();
        txtips5 = new javax.swing.JTextField();
        txtips6 = new javax.swing.JTextField();
        txtips7 = new javax.swing.JTextField();
        txtipk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNilai = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btncetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NPM");

        jLabel2.setText("nama");

        jLabel3.setText("ips1");

        jLabel4.setText("ips2");

        jLabel5.setText("ips3");

        jLabel6.setText("ips4");

        jLabel7.setText("ips5");

        jLabel8.setText("ips6");

        jLabel9.setText("ips7");

        jLabel10.setText("ipk");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txtips6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtips6ActionPerformed(evt);
            }
        });

        tableNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNilai);

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btncetak.setText("CETAK");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtipk, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtips7)
                            .addComponent(txtips6)
                            .addComponent(txtips5)
                            .addComponent(txtips4)
                            .addComponent(txtips3)
                            .addComponent(txtips2)
                            .addComponent(txtips1)
                            .addComponent(txtnama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsimpan)
                        .addGap(50, 50, 50)
                        .addComponent(btnubah)
                        .addGap(47, 47, 47)
                        .addComponent(btnhapus)
                        .addGap(50, 50, 50)
                        .addComponent(btncetak)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsimpan)
                        .addComponent(btnubah)
                        .addComponent(btnhapus)
                        .addComponent(btncetak)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtips1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtips2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtips3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtips4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtips5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtips6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtips7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtips6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtips6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtips6ActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
// TODO add your handling code here:
        try {
        // Ambil data dari form
        String npm = txtnpm.getText().trim();
        String nama = txtnama.getText().trim();
        double ips1 = Double.parseDouble(txtips1.getText().trim());
        double ips2 = Double.parseDouble(txtips2.getText().trim());
        double ips3 = Double.parseDouble(txtips3.getText().trim());
        double ips4 = Double.parseDouble(txtips4.getText().trim());
        double ips5 = Double.parseDouble(txtips5.getText().trim());
        double ips6 = Double.parseDouble(txtips6.getText().trim());
        double ips7 = Double.parseDouble(txtips7.getText().trim());

        // Hitung IPK (rata-rata dari IPS1 hingga IPS7)
        double ipk = (ips1 + ips2 + ips3 + ips4 + ips5 + ips6 + ips7) / 7;

        // Format IPK menjadi 2 angka di belakang koma (opsional)
        ipk = Math.round(ipk * 100.0) / 100.0;

        // Simpan data ke database menggunakan fungsi CRUD dinamis
        String[] fields = {"npm", "nama", "ips1", "ips2", "ips3", "ips4", "ips5", "ips6", "ips7", "ipk"};
        String[] values = {
            npm,
            nama,
            String.valueOf(ips1),
            String.valueOf(ips2),
            String.valueOf(ips3),
            String.valueOf(ips4),
            String.valueOf(ips5),
            String.valueOf(ips6),
            String.valueOf(ips7),
            String.valueOf(ipk)
        };
        myObject.SimpanDinamis("khs", fields, values);

        // Tampilkan IPK ke text field atau area lain di GUI
        txtipk.setText(String.valueOf(ipk));

        // Berikan notifikasi kepada pengguna
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan! IPK: " + ipk);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harap masukkan nilai IPS dengan format angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        myObject.tampilTabel(tableNilai, SQL, judulkolom);        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
// TODO add your handling code here:
        try {
        // Ambil data dari form
        String npm = txtnpm.getText().trim();
        String nama = txtnama.getText().trim();
        double ips1 = Double.parseDouble(txtips1.getText().trim());
        double ips2 = Double.parseDouble(txtips2.getText().trim());
        double ips3 = Double.parseDouble(txtips3.getText().trim());
        double ips4 = Double.parseDouble(txtips4.getText().trim());
        double ips5 = Double.parseDouble(txtips5.getText().trim());
        double ips6 = Double.parseDouble(txtips6.getText().trim());
        double ips7 = Double.parseDouble(txtips7.getText().trim());

        // Hitung ulang IPK (rata-rata dari IPS1 hingga IPS7)
        double ipk = (ips1 + ips2 + ips3 + ips4 + ips5 + ips6 + ips7) / 7;

        // Format IPK menjadi 2 angka di belakang koma (opsional)
        ipk = Math.round(ipk * 100.0) / 100.0;

        // Data yang akan diupdate
        String[] fields = {"nama", "ips1", "ips2", "ips3", "ips4", "ips5", "ips6", "ips7", "ipk"};
        String[] values = {
            nama,
            String.valueOf(ips1),
            String.valueOf(ips2),
            String.valueOf(ips3),
            String.valueOf(ips4),
            String.valueOf(ips5),
            String.valueOf(ips6),
            String.valueOf(ips7),
            String.valueOf(ipk)
        };

        // Update data menggunakan fungsi CRUD dinamis
        String[] isiPrimary = {"npm"}; 
            myObject.UbahDinamis("khs", "npm", txtnpm.getText(), fields, values);

        // Tampilkan kembali data ke tabel
        myObject.tampilTabel(tableNilai, SQL, judulkolom);
        txtipk.setText(String.valueOf(ipk));

        // Berikan notifikasi kepada pengguna
        JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harap masukkan nilai IPS dengan format angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
// TODO add your handling code here:
        myObject.HapusDinamis("khs", "npm", txtnpm.getText());
        myObject.tampilTabel(tableNilai, SQL, judulkolom);
       // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void tableNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNilaiMouseClicked
// TODO add your handling code here:
        int selectedRow = tableNilai.getSelectedRow();
        if (selectedRow != -1) {
            txtnpm.setText(tableNilai.getValueAt(selectedRow, 0).toString());
            txtnama.setText(tableNilai.getValueAt(selectedRow, 1).toString());
            txtips1.setText(tableNilai.getValueAt(selectedRow, 2).toString());
            txtips2.setText(tableNilai.getValueAt(selectedRow, 3).toString());
            txtips3.setText(tableNilai.getValueAt(selectedRow, 4).toString());
            txtips4.setText(tableNilai.getValueAt(selectedRow, 5).toString());
            txtips5.setText(tableNilai.getValueAt(selectedRow, 6).toString());
            txtips6.setText(tableNilai.getValueAt(selectedRow, 7).toString());
            txtips7.setText(tableNilai.getValueAt(selectedRow, 8).toString());
            txtipk.setText(tableNilai.getValueAt(selectedRow, 9).toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tableNilaiMouseClicked

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
try {
            String laporanfile = "src/cetak/laporan.jrxml";
            String SQL = "SELECT * From khs";
            
            myObject.tampilLaporan(laporanfile, SQL);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btncetakActionPerformed

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
            java.util.logging.Logger.getLogger(framenilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framenilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framenilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framenilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framenilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNilai;
    private javax.swing.JTextField txtipk;
    private javax.swing.JTextField txtips1;
    private javax.swing.JTextField txtips2;
    private javax.swing.JTextField txtips3;
    private javax.swing.JTextField txtips4;
    private javax.swing.JTextField txtips5;
    private javax.swing.JTextField txtips6;
    private javax.swing.JTextField txtips7;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnpm;
    // End of variables declaration//GEN-END:variables
}
