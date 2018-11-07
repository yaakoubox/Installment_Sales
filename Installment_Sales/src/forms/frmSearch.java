/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import forms.*;
import Entity.Clients;
import Entity.Phones;
import faciliti.Tolls;
import static forms.frmSearch.s;
import static forms.frmMain.Table1;
import static forms.frmMain.Table2;
import static forms.frmMain.s;
import static forms.frmPhoneUpdate.Table3;
import static forms.frmPhoneUpdate.TxtPhone3;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
//import sun.java2d.loops.DrawLine;

/**
 *
 * @author YOUCEF
 */
public class frmSearch extends javax.swing.JFrame {

    /**
     * Creates new form frmAdd
     */
    private static frmSearch obj = null;

    public frmSearch() {
        initComponents();
    }

    public static frmSearch getObj() {
        if (obj == null) {
            obj = new frmSearch();
        }
        return obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        CBSearch = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        TxtSearch2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("إضافة");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/beak.png"))); // NOI18N
        jButton1.setText("رجوع");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CBSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "رقم العملية", "الاسم الرباعي", "العنوان", "رقم البطاقة", "السلعة المباعة", "تاريخ البيع", "ثمن السعلة ", "المبلغ المدفوع", "المبلغ المتبقي", "عدد الاقصاط", "عدد الاقصاط المتبقية" }));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/search.png"))); // NOI18N
        jButton4.setText("بحث");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("بحث عن طريق :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("بحث حول :");

        jPanel1.setForeground(new java.awt.Color(0, 0, 100));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("بحث");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtSearch2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed
    public static Clients s = new Clients();

    String f;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        /*frmMain.GetObj().dispose();
        Tolls.OpenFormWithBigSize(frmMain.GetObj(), "الصفحة الرئيسية");*/


    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Tolls.MakeTrans(this);
        jPanel1.setBackground(new Color(0, 0, 100));
        Tolls.drawRect(this, Color.BLACK, 7);
        TxtSearch2.setHorizontalAlignment(JTextField.RIGHT);
        this.getContentPane().setBackground(new Color(215, 215, 215));
    }//GEN-LAST:event_formWindowOpened
    Phones p = new Phones();
    public static frmAddPhone ph = new frmAddPhone();
    frmPhoneUpdate PhU = new frmPhoneUpdate();
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String StrSearch = "select * from clients where ";
        if (CBSearch.getSelectedItem().equals("رقم العملية")) {
            StrSearch += "numberOperation = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("الاسم الرباعي")) {
            StrSearch += "Name like '%" + TxtSearch2.getText() + "%'";
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("العنوان")) {
            StrSearch += "Adress like '%" + TxtSearch2.getText() + "%'";
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("رقم البطاقة")) {
            StrSearch += "IdCard like '%" + TxtSearch2.getText() + "%'";
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("السلعة المباعة")) {
            StrSearch += "ProdSell like '%" + TxtSearch2.getText() + "%'";
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("تاريخ البيع")) {
            StrSearch += "Date = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("ثمن السعلة ")) {
            StrSearch += "PriceProdSell = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("المبلغ المدفوع")) {
            StrSearch += "PricePay = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("المبلغ المتبقي")) {
            StrSearch += "PriceStill = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("عدد الاقصاط")) {
            StrSearch += "NumberParts = " + TxtSearch2.getText();
            s.getCustemRows(StrSearch, Table1);
        } else if (CBSearch.getSelectedItem().equals("عدد الاقصاط المتبقية")) {
            StrSearch += "NumberPartsStill = " + TxtSearch2.getText();
        }
        TxtSearch2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CBSearch;
    private javax.swing.JTextField TxtSearch2;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
