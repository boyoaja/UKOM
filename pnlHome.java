/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Menu.p_pelanggan;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author NABILA
 */
public final class pnlHome extends javax.swing.JPanel {
    
    private String hasil =("Rp");
    private int a,b;

    /**
     * Creates new form pnlHome
     */
    public pnlHome() {
        initComponents();
        load();
        line();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(128, 128, 131));
        jButton2.setText("Tanggal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(128, 128, 131));
        jButton1.setText("Semua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(128, 128, 131));
        jDateChooser1.setToolTipText("");
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 754, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 128, 131));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transaksi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pelanggan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 260, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(128, 128, 131));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(13, 13, 13))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, 80));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(128, 128, 131));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(128, 128, 131));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pendapatan Usaha");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(128, 128, 131));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(128, 128, 131));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Pengeluaran Usaha");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(128, 128, 131));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(128, 128, 131));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Pendapatan Bersih");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(128, 128, 131));
        jLabel20.setText("Rp.");
        jLabel20.setToolTipText("");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(128, 128, 131));
        jLabel21.setText("Rp.");
        jLabel21.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(128, 128, 131));
        jLabel22.setText("Rp.");
        jLabel22.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(jLabel12))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel14)))
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel21)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 740, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(128, 128, 131));
        jLabel5.setText("0");
        jLabel5.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(128, 128, 131));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pembelian");
        jLabel18.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 80));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(798, 530));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 740, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void load(){
    
    try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(tanggal) AS tanggal FROM penjualan");
            if (rs.next()) {
                jLabel1.setText(rs.getString("tanggal"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(nama) AS nama FROM pelanggan");
            if (rs.next()) {
                jLabel3.setText(rs.getString("nama"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(nama) AS nama FROM barang");
            if (rs.next()) {
                jLabel6.setText(rs.getString("nama"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(hargajmlsatuan) AS total FROM penjualan");
            if (rs.next()) {
                jLabel11.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT count(*) AS id FROM pembelian");
            if (rs.next()) {
                jLabel5.setText(rs.getString("id"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(harga_total) AS total FROM pembelian");
            if (rs.next()) {
                jLabel13.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        a = Integer.parseInt(jLabel11.getText());
        b = Integer.parseInt(jLabel13.getText());
        int jml = a - b;
        jLabel15.setText(hasil+jml);

}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tampilan = "yyyy-MM-dd";

        SimpleDateFormat format = new SimpleDateFormat(tampilan);

        String tanggal = String.valueOf(format.format(jDateChooser1.getDate()));
        jLabel17.setText(tanggal);

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select sum(hargajmlsatuan) as total from penjualan WHERE tanggal = '"+jLabel17.getText()+"'");
            if (rs.next()) {
                jLabel11.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select sum(harga_total) as total from pembelian WHERE tanggal = '"+jLabel17.getText()+"'");
            if (rs.next()) {
                jLabel13.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(tanggal) AS tanggal FROM penjualan WHERE tanggal = '"+jLabel17.getText()+"'");
            if (rs.next()) {
                jLabel1.setText(rs.getString("tanggal"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        a = Integer.parseInt(jLabel11.getText());
        b = Integer.parseInt(jLabel13.getText());
        int jml = a - b;
        jLabel15.setText(hasil+jml);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(tanggal) AS tanggal FROM penjualan");
            if (rs.next()) {
                jLabel1.setText(rs.getString("tanggal"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(nama) AS nama FROM pelanggan");
            if (rs.next()) {
                jLabel3.setText(rs.getString("nama"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(nama) AS nama FROM barang");
            if (rs.next()) {
                jLabel6.setText(rs.getString("nama"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(hargajmlsatuan) AS total FROM penjualan");
            if (rs.next()) {
                jLabel11.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotwk_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUM(harga_total) AS total FROM pembelian");
            if (rs.next()) {
                jLabel13.setText(rs.getString("total"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(p_pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }

        a = Integer.parseInt(jLabel11.getText());
        b = Integer.parseInt(jLabel13.getText());
        int jml = a - b;
        jLabel15.setText(hasil+jml);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
String toc = "";
    int summary = 0;
    public void line(){
    try {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_1", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT tanggal as tgl, SUM(hargajmlsatuan) as total FROM penjualan GROUP BY tanggal");
        while (rs.next()) {
            toc = rs.getString("tgl");
            summary = rs.getInt("total");
            dataset.setValue(summary, toc, toc);
        }
        JFreeChart chart = ChartFactory.createBarChart("Grafik Hasil Penjualan", "Tanggal", "Rp.", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();

         //p.setRangeGridlinePaint(Color.BLUE);

        ChartPanel panel = new ChartPanel(chart);
        panel.setVisible(true);
        panel.setSize(775, 360);
        jPanel6.add(panel);

    } catch (SQLException e) {

    }
    }
}
