/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import controller.c_listpelanggan;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import tablemodel.tm_pelanggan;

/**
 *
 * @author NABILA
 */
public class JFLPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form JFLPelanggan
     */
    c_listpelanggan pelanggan;
    JFPenjualan jual;
    
    public JFLPelanggan(JFPenjualan jual) {
        initComponents();
        this.setTitle("List Pelanggan");
        this.setLocationRelativeTo(getRootPane());
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        data1();
        
        pelanggan = new c_listpelanggan(this);
        pelanggan.isiTabel();
        this.jual = jual;
    }

        public JTable getDataTable(){
        return jTable2;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbCariPenyakit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Barang");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(333, 25));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCariPenyakit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCariPenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-verified-badge-24.png"))); // NOI18N
        jbCariPenyakit.setText("Pilih");
        jbCariPenyakit.setIconTextGap(10);
        jbCariPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCariPenyakitActionPerformed(evt);
            }
        });
        jPanel2.add(jbCariPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 110, 30));

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Cari nama pelanggan..");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, 340, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 340, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Form List Pelanggan");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cancel-24 (3).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCariPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCariPenyakitActionPerformed
        // TODO add your handling code here
        if (jTable2.getSelectedRow()>=0){
            jual.getKodePelanggan().setText(jTable2.getValueAt(jTable2.getSelectedRow(),1).toString());
            jual.getNamaPelanggan().setText(jTable2.getValueAt(jTable2.getSelectedRow(),2).toString());
            jual.getJenisObat().setText("Antibiotik");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Data Pada Tabel","Pesan Kesalahan",JOptionPane.WARNING_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_jbCariPenyakitActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here
        String cari = jTextField1.getText();
        TableRowSorter tr = new TableRowSorter(Daftar);
        jTable2.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(cari));
    }//GEN-LAST:event_jTextField1KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCariPenyakit;
    // End of variables declaration//GEN-END:variables
private DefaultTableModel Daftar;

    private void data1(){
        Object kolom []={"ID","Kode Pelanggan","Nama Pelanggan","Alamat","Telpon"};
    Daftar=new DefaultTableModel(null, kolom);
    jTable2.setModel(Daftar);
    jScrollPane2.getViewport().add(jTable2,null);
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_1", "root", "");
String sql = "select * from pelanggan";
Statement stat=conn.createStatement();
ResultSet res=stat.executeQuery(sql);
while (res.next()) {
    String id = res.getString("id");
    String kd = res.getString("kode");
    String nm = res.getString("nama");
    String alm = res.getString("alamat");
    String hp = res.getString("hp");
Object [] data={id,kd,nm,alm,hp};
Daftar.addRow(data);}
jTable2.getColumnModel().getColumn(0).setPreferredWidth(25);
jTable2.getColumnModel().getColumn(1).setPreferredWidth(8);
jTable2.getColumnModel().getColumn(2).setPreferredWidth(15);
jTable2.getColumnModel().getColumn(3).setPreferredWidth(8);
jTable2.getColumnModel().getColumn(4).setPreferredWidth(15);
            
        } catch (Exception e) {
        }
}
}
