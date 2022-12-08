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
public class Porridge extends javax.swing.JFrame {
    
    Connection con2;
    PreparedStatement pst2;
    
    /**
     * Creates new form Porridge
     */
    public Porridge() {
        initComponents();
        viewtable();
    }
    
    private void viewtable(){
        
        try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con2= DriverManager.getConnection("jdbc:mysql://localhost/Food","root","");
                pst2 = con2.prepareStatement("SELECT * FROM FoodItems WHERE Category = 'Porridge' " );
                ResultSet rs =pst2.executeQuery();
                
                ResultSetMetaData md= rs.getMetaData();
                c = md.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)porrtable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    
                    Vector v = new Vector();
                    
                    v.add(rs.getString("ItemCode"));
                    v.add(rs.getString("ItemName"));
                    v.add(rs.getString("Category"));
                    v.add(rs.getInt("Price"));
                    v.add(rs.getString("Quantity"));
                     d.addRow(v);
                    
                    
                //    Object[] obj= {"ItemCode,ItemName,Category,Price,Quantity"};
                    
                    
                   
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
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
        porrtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        porrtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Item Name", "Category", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(porrtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 108, 574, 345));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Porridge");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 23, 163, 73));

        back.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new category().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Porridge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Porridge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Porridge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Porridge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porridge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable porrtable;
    // End of variables declaration//GEN-END:variables
}
