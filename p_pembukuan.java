/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import com.mysql.jdbc.Connection;
import controller.c_tdatapembelian;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author NABILA
 */
public class p_pembukuan extends javax.swing.JPanel {
    c_tdatapembelian pembelian;
    private DefaultTableModel Daftar1;
    private DefaultTableModel Daftar;
    private DefaultTableModel Daftar3;
    private DefaultTableModel Daftar4;
java.sql.Connection con;
String pinjam;
String kembali;

    /**
     * Creates new form p_pembukuan
     */
    public p_pembukuan() {
        initComponents();
        loaddata1();
        load();
        loaddata2();
        loaddata3();
        loaddata4();
        load1();
    }
    
    private void loaddata1() {
Object kolom []={"ID", "TANGGAL","KODE SUPPLIER", "KODE BARANG","JUMLAH BARANG", "HARGA SATUAN","TOTAL"};
Daftar1=new DefaultTableModel(null,kolom);
jTable1.setModel(Daftar1);
jScrollPane1.getViewport().add(jTable1,null);
try {
con = null;
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_1", "root", "");
String sql = "" + "select * from pembelian";
Statement stat=conn.createStatement();
ResultSet res=stat.executeQuery(sql);
while (res.next()) {
String id=res.getString("id");
String tgl=res.getString("tanggal");
String ks=res.getString("kode_suplier");
String kb=res.getString("kode_barang");
String jb=res.getString("jumlah_barang");
String hrg=res.getString("harga_barang");
String ttl=res.getString("harga_total");
Object [] data={id,tgl,ks,kb,jb,hrg,ttl};
Daftar1.addRow(data);}
jTable1.getColumnModel().getColumn(0).setPreferredWidth(3);
jTable1.getColumnModel().getColumn(1).setPreferredWidth(15);
jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
jTable1.getColumnModel().getColumn(6).setPreferredWidth(20);

} catch (Exception ex) {
JOptionPane.showMessageDialog(this, "Error: "+ex);
}
}
    
    private void load(){
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(harga_total) AS total FROM pembelian");
            if (rs.next()) {
                jLabel8.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
        }
        
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(*) AS id FROM barang");
            if (rs.next()) {
                jLabel9.setText(rs.getString("id"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
        }
    }
    
    private void loaddata2() {
Object kolom []={"ID", "NO.TRANSAKSI","TANGGAL", "NAMA PELANGGAN","NAMA BARANG", "JUMLAH BARANG","HARGA SATUAN","TOTAL"};
Daftar=new DefaultTableModel(null,kolom);
jTable2.setModel(Daftar);
jScrollPane2.getViewport().add(jTable2,null);
try {
con = null;
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_1", "root", "");
String sql = "" + "select * from penjualan";
Statement stat=conn.createStatement();
ResultSet res=stat.executeQuery(sql);
while (res.next()) {
String id=res.getString("id");
String tgl=res.getString("notrans");
String ks=res.getString("tanggal");
String kb=res.getString("nama_pelanggan");
String jb=res.getString("nama_barang");
String hrg=res.getString("jumlah_barang");
String ttl=res.getString("hargasatuan");
String hjs=res.getString("hargajmlsatuan");
Object [] data={id,tgl,ks,kb,jb,hrg,ttl,hjs};
Daftar.addRow(data);}
jTable2.getColumnModel().getColumn(0).setPreferredWidth(5);
jTable2.getColumnModel().getColumn(1).setPreferredWidth(20);

} catch (Exception ex) {
JOptionPane.showMessageDialog(this, "Error: "+ex);
}
}
    private void loaddata3() {
Object kolom []={"Nama Barang", "Banyak Transaksi","Jumlah Barang"};
Daftar3=new DefaultTableModel(null,kolom);
jTable3.setModel(Daftar3);
jScrollPane3.getViewport().add(jTable3,null);
try {
con = null;
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_1", "root", "");
String sql = "select b.nama, kode_barang, COUNT(kode_barang) as bt, sum(jumlah_barang) as jml from pembelian p INNER JOIN barang b ON p.kode_barang=b.kode group by kode_barang order by kode_barang, count(*) desc";
Statement stat=conn.createStatement();
ResultSet res=stat.executeQuery(sql);
while (res.next()) {
    String nm = res.getString("b.nama");
    String bt = res.getString("bt");
    String jml = res.getString("jml");
Object [] data={nm,bt,jml};
Daftar3.addRow(data);}
jTable3.getColumnModel().getColumn(0).setPreferredWidth(25);
jTable3.getColumnModel().getColumn(1).setPreferredWidth(8);
jTable3.getColumnModel().getColumn(2).setPreferredWidth(15);

} catch (Exception ex) {
JOptionPane.showMessageDialog(this, "Error: "+ex);
}
}
    private void loaddata4() {
Object kolom []={"Nama Barang", "Banyak Transaksi","Jumlah Barang","Pendapatan"};
Daftar4=new DefaultTableModel(null,kolom);
jTable4.setModel(Daftar4);
jScrollPane4.getViewport().add(jTable4,null);
try {
con = null;
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_1", "root", "");
String sql = "select b.nama, kode_barang, COUNT(kode_barang) as bt,sum(hargajmlsatuan) as jmls, sum(jumlah_barang) as jml from penjualan p INNER JOIN barang b ON p.kode_barang=b.kode group by kode_barang order by kode_barang, count(*) desc";
Statement stat=conn.createStatement();
ResultSet res=stat.executeQuery(sql);
while (res.next()) {
    String nm = res.getString("b.nama");
    String bt = res.getString("bt");
    String jml = res.getString("jml");
    String jlms = res.getString("jmls");
Object [] data={nm,bt,jml,jlms};
Daftar4.addRow(data);}
jTable4.getColumnModel().getColumn(0).setPreferredWidth(25);
jTable4.getColumnModel().getColumn(1).setPreferredWidth(8);
jTable4.getColumnModel().getColumn(2).setPreferredWidth(15);
jTable4.getColumnModel().getColumn(3).setPreferredWidth(10);

} catch (Exception ex) {
JOptionPane.showMessageDialog(this, "Error: "+ex);
}
}
     
     private void load1(){
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(hargajmlsatuan) AS total FROM penjualan");
            if (rs.next()) {
                jLabel18.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_pembukuan = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cari = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Cari1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        p_pembukuan.setPreferredSize(new java.awt.Dimension(663, 486));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("Pembukuan Barang");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Detail Pembelian Barang");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 7, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rincian Transaksi Pembelian Barang"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 781, 140));

        Cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CariKeyReleased(evt);
            }
        });
        jPanel3.add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 153, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rp.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Subtotal");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 240, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Jenis Barang");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 190, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(740, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Detail Penjualan Barang");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(740, 309));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Rincian Transaksi Penjualan Barang"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 800, 105));

        Cari1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari1KeyReleased(evt);
            }
        });
        jPanel2.add(Cari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 153, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Barang"));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Barang Terjual"));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(740, 101));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Subtotal");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Rp.");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_pembukuanLayout = new javax.swing.GroupLayout(p_pembukuan);
        p_pembukuan.setLayout(p_pembukuanLayout);
        p_pembukuanLayout.setHorizontalGroup(
            p_pembukuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pembukuanLayout.createSequentialGroup()
                .addGroup(p_pembukuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pembukuanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_pembukuanLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_pembukuanLayout.createSequentialGroup()
                        .addGroup(p_pembukuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_pembukuanLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(jLabel14))
                            .addGroup(p_pembukuanLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_pembukuanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        p_pembukuanLayout.setVerticalGroup(
            p_pembukuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_pembukuanLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_pembukuanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_pembukuan, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_pembukuan, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CariKeyReleased
        // TODO add your handling code here:
        String cari = Cari.getText();
        TableRowSorter tr = new TableRowSorter(Daftar1);
        jTable1.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(cari));
    }//GEN-LAST:event_CariKeyReleased

    private void Cari1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari1KeyReleased
        // TODO add your handling code here:
        String cari1 = Cari1.getText();
        TableRowSorter tr = new TableRowSorter(Daftar);
        jTable2.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(cari1));
    }//GEN-LAST:event_Cari1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cari;
    private javax.swing.JTextField Cari1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel p_pembukuan;
    // End of variables declaration//GEN-END:variables

}
