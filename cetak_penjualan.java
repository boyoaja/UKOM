/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author NABILA
 */
public class cetak_penjualan extends javax.swing.JFrame {

    
    /**
     * Creates new form formcetakfaktur
     */
    public cetak_penjualan(String n) {
        initComponents();
        Image icon=Toolkit.getDefaultToolkit().getImage("src/Image/caduceus.png");
        setIconImage(icon);
        setLocationRelativeTo(this);
        noTF.setText(n);
        noTFKeyReleased(null);
    }

    
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        noTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtcetak = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Cetak Karcis Parkir");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(38, 86, 186));
        jPanel2.setPreferredSize(new java.awt.Dimension(355, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No Transaksi");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        noTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noTFKeyReleased(evt);
            }
        });
        jPanel2.add(noTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 6, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 377, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 9)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 190, 170));

        txtcetak.setBackground(new java.awt.Color(255, 255, 255));
        txtcetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcetak.setText("Cetak");
        txtcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcetakActionPerformed(evt);
            }
        });
        jPanel1.add(txtcetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 93, -1));

        Keluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 88, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("empty-statement")
    private void load(){
    try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection
("jdbc:mysql://localhost/apotek_1", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="select * from penjualan where "+ "notrans='" +noTF.getText()
+"'";
 ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
              jTextArea1.setText("   TRANSAKSI PEMBELIAN"+"\n"
                               + "========================="+"\n"
                               + "TOTAL   : "+ rs.getString(16)+"\n"
                               + "BAYAR   : "+rs.getString(14)+"\n"
                               + "KEMBALI : "+rs.getString(15)+"\n"
                               + "========================="
                               + "\n Dimohon untuk mengecek "
                               + "\n    ulang faktur ini.");
              }else{
            jTextArea1.setText("");
            statement.close();
            koneksi.close();
        }
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException ex){
                JOptionPane.showMessageDialog(null,"Data tidak ditemukan"+ex);
        }
}
    private void txtcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcetakActionPerformed
        // TODO add your handling code here:
       int pesan=JOptionPane.showConfirmDialog(null, "Cetak Kwitansi Nota","Cetak",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               
            if(pesan==JOptionPane.YES_OPTION){
            try {
                JasperDesign design = JRXmlLoader.load("src/laporan/laporantransaksi.jrxml");
            design.setPageHeight(58);
            design.setPageWidth(40);
                String NamaFile = "src/laporan/laporantransaksi.jasper"; //Lokasi File jasper
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/apotek_1","root","");
            @SuppressWarnings("rawtypes")
            HashMap hash = new HashMap(1);
            //Mengambil parameter dari ireport
            hash.put("ptrans",noTF.getText());
            File report = new File(NamaFile);
            JasperReport jreprt;
            jreprt = (JasperReport) JRLoader.loadObject(report);
            // Untuk Print Report Tanpa Parameter
             JasperPrint jprintt = JasperFillManager.fillReport(jreprt, hash, koneksi);
            JasperViewer.viewReport(jprintt,true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Cetak Laporan",JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_txtcetakActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void noTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noTFKeyReleased
        // TODO add your handling code here:
        load();
    }//GEN-LAST:event_noTFKeyReleased

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField noTF;
    private javax.swing.JButton txtcetak;
    // End of variables declaration//GEN-END:variables
void cetak_nota(){
        try {
            String NamaFile = "src/laporan/laporantransaksi.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/apotek_1","root","");
            HashMap param = new HashMap();
            param.put("ptrans",noTF.getText());
            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, koneksi);
            JasperViewer.viewReport(JPrint, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!","Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
    }
}
