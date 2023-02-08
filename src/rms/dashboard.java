/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandunsrimal
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        CustomerTable();
    }
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
public void CustomerTable(){
    
    
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Customer");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)CustomerTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                    v.add(rs.getInt("CID"));
                    v.add(rs.getString("CNumber"));
                    v.add(rs.getInt("Items"));
                    v.add(rs.getFloat("Total"));           
                     d.addRow(v);
                    
  
                   
                }
                
                  pst1 = con.prepareStatement("SELECT SUM(Items) FROM Customer");
                  ResultSet rs1 = pst1.executeQuery();
                  if(rs1.next()){
                  String  sum=rs1.getString("SUM(Items)");
                  sales.setText(sum);
                 
              }
                pst2 = con.prepareStatement("SELECT SUM(Total) FROM Customer");
                  ResultSet rs2 = pst2.executeQuery();
                  if(rs2.next()){
                  String T=rs2.getString("SUM(Total)");
                  txttotal.setText(T);
                  }
                  
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Rice");
                  ResultSet rs3 = pst1.executeQuery();
                  if(rs3.next()){
                  String  sum=rs3.getString("COUNT(*)");
                  ricecount1.setText(sum);
                 
              }
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Kottu");
                  ResultSet rs4 = pst1.executeQuery();
                  if(rs4.next()){
                  String  sum=rs4.getString("COUNT(*)");
                  kottucount1.setText(sum);
                 
              }
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Noodles");
                  ResultSet rs5 = pst1.executeQuery();
                  if(rs5.next()){
                  String  sum=rs5.getString("COUNT(*)");
                  noodlescount.setText(sum);
                 
              }
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Soup");
                  ResultSet rs6 = pst1.executeQuery();
                  if(rs6.next()){
                  String  sum=rs6.getString("COUNT(*)");
                  soupcount.setText(sum);
                 
              }
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Desserts");
                  ResultSet rs7 = pst1.executeQuery();
                  if(rs7.next()){
                  String  sum=rs7.getString("COUNT(*)");
                  dessertscount.setText(sum);
                 
              }
                   pst1 = con.prepareStatement("SELECT COUNT(*) FROM Beverages");
                  ResultSet rs8 = pst1.executeQuery();
                  if(rs8.next()){
                  String  sum=rs8.getString("COUNT(*)");
                  beveragescount.setText(sum);
                 
              }
                  
                  
                  
                
            } catch (SQLException ex) {
                Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
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

        jFrame1 = new javax.swing.JFrame();
        txttotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        beveragescount = new javax.swing.JLabel();
        ricecount1 = new javax.swing.JLabel();
        kottucount1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        noodlescount = new javax.swing.JLabel();
        soupcount = new javax.swing.JLabel();
        dessertscount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(660, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttotal.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 255));
        txttotal.setText("Total earnings");
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 250, 60));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Dashboard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 200, 80));

        jButton5.setBackground(new java.awt.Color(204, 0, 51));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Noodles");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        sales.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        sales.setText("Total sales");
        getContentPane().add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 190, 60));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Avaliable Foods");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Beverages");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Kottu");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 50, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Rice");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 40, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Soup");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 50, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Desserts");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        beveragescount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        beveragescount.setForeground(new java.awt.Color(255, 0, 51));
        beveragescount.setText("23");
        getContentPane().add(beveragescount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, 60));

        ricecount1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        ricecount1.setForeground(new java.awt.Color(255, 0, 51));
        ricecount1.setText("23");
        getContentPane().add(ricecount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 60));

        kottucount1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        kottucount1.setForeground(new java.awt.Color(255, 0, 51));
        kottucount1.setText("23");
        getContentPane().add(kottucount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add copy.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 40, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 40, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/del.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 40, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings copy.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 40, -1));

        noodlescount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        noodlescount.setForeground(new java.awt.Color(255, 0, 51));
        noodlescount.setText("23");
        getContentPane().add(noodlescount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, 60));

        soupcount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        soupcount.setForeground(new java.awt.Color(255, 0, 51));
        soupcount.setText("23");
        getContentPane().add(soupcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, 60));

        dessertscount.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        dessertscount.setForeground(new java.awt.Color(255, 0, 51));
        dessertscount.setText("23");
        getContentPane().add(dessertscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/categories copy.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 40, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home copy.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total earnings");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, 30));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel13.setText("Total sales");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 70, 70));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tel", "No of Items", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 530, 300));

        jLabel18.setFont(new java.awt.Font("Game Of Squids", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("LABS");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, 50));

        jLabel19.setFont(new java.awt.Font("Game Of Squids", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("FOOD");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 160, 60));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel20.setText("Customers");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new clogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new category().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new insert().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new update().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        new delete().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        new settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel beveragescount;
    private javax.swing.JLabel dessertscount;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kottucount1;
    private javax.swing.JLabel noodlescount;
    private javax.swing.JLabel ricecount1;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel soupcount;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
