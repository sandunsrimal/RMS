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
public class category extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    public category() {
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    public void RiceTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Rice");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                    v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));             
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
                
                
               
                
               
        
    }
    
    public void KottuTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Kottu");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                    v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));           
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
                
                
               
                
               
        
    }
    
    public void NoodlesTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Noodles");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                  v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));         
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
                
                
               
                
               
        
    }
    
    public void SoupTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Soup");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                  v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));            
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
                
                
               
                
               
        
    }
    
    public void DessertsTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Desserts");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                    v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));           
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
                
                
               
                
               
        
    }
    
    public void BeveragesTable(){
        
         try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost/RMS","root","");
                pst = con.prepareStatement("SELECT * FROM Beverages");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)cTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();     
                    v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Portion"));
                    v.add(rs.getFloat("Price"));           
                     d.addRow(v);
                    
  
                   
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(category.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ItemCode", "ItemName", "Portion", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cTable.setPreferredSize(new java.awt.Dimension(303, 82));
        cTable.setSize(new java.awt.Dimension(450, 82));
        jScrollPane1.setViewportView(cTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 216, 450, 450));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        jLabel1.setText("Categories");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/categories copy.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 40, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home copy.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 70, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings copy.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 40, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/noodles.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kottu.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/soup.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/desert.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/beverages.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rice.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Beverages");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setText("Rice");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel18.setText("Kottu");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel19.setText("Noodles");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel20.setText("Soup");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel21.setText("Desserts");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, -1, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel13.setText("View All Foods");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casdrt.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catte.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 714));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        RiceTable();
        
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        BeveragesTable();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        DessertsTable();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        SoupTable();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        NoodlesTable();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        KottuTable();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cTable;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
