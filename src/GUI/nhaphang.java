/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.nsxDAO;
import DAO.sanphamDAO;
import DTO.nha_san_xuat;
import DTO.san_pham;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gjang
 */
public class nhaphang extends javax.swing.JFrame {

    /**
     * Creates new form nhaphang
     */
    ArrayList<san_pham> listsanpham = new ArrayList<san_pham>(); 
    String search = "";
    public nhaphang() {
        initComponents();
        hienthilentable();
        hienthinsx();
    }
     
     public void hienthilentable(){
        
         search = jsearch.getText();
         sanphamDAO spDao = new sanphamDAO();
        listsanpham =  spDao.allsanpham(search);
        DefaultTableModel tblsp = (DefaultTableModel)jtblsp.getModel(); 
        tblsp.setRowCount(0);
        for(san_pham sa : listsanpham){
         int id=sa.getId();
         String name=sa.getName();
         String desc=sa.getDesc();
         int price = sa.getPrice();
         int quantity = sa.getQuantity();
         String nsx=sa.getNameNsxString();
//         int id=1;
//         String name="111";
//         String desc="111";
//         int price = 111;
//         int quantity = 1;
//         String nsx="111";
         tblsp.addRow(new Object[]{id,name,desc,price,quantity,nsx});
         }
  
     }
     public void hienthinsx(){
         sanphamDAO spDao = new sanphamDAO();
         DefaultComboBoxModel cbonsx= new DefaultComboBoxModel();

         listsanpham = spDao.allsanpham(search);
//         for(int i =0 ; i <= listsanpham.size(); i++)
//         {
//             cbonsx.addElement(sp);
//         }
for(san_pham sp : listsanpham){
    cbonsx.addElement(sp.getNameNsxString());
}
     this.cbonsx.setModel(cbonsx);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbonsx = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jdesc = new javax.swing.JTextField();
        jprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jquantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblsp = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel2.setText("Description");

        jLabel3.setBackground(new java.awt.Color(255, 153, 51));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel3.setText("price");

        cbonsx.setForeground(new java.awt.Color(51, 51, 255));
        cbonsx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnsx(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 153, 51));
        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel4.setText("Made by");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 153, 51));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel5.setText("Quantity");

        jquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquantityActionPerformed(evt);
            }
        });

        jtblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jtblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblspMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblsp);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 204));
        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2023-12-13 004833.png"))); // NOI18N

        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jButton4.setText("search");
        jButton4.setMinimumSize(new java.awt.Dimension(56, 57));
        jButton4.setPreferredSize(new java.awt.Dimension(111, 57));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jprice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jdesc)
                                                        .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cbonsx, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(13, 13, 13)
                                                        .addComponent(jButton2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbonsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnsx(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnsx
        // TODO add your handling code here:
    }//GEN-LAST:event_jnsx

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        san_pham sp = new san_pham();
        sp.setName(jname.getText());
        sp.setDesc(jdesc.getText());
        sp.setPrice(Integer.parseInt(jprice.getText()));
        sp.setQuantity(Integer.parseInt(jquantity.getText()));
        nsxDAO nsxdao = new nsxDAO();
        sp.setId_nsx(nsxdao.returnID(cbonsx.getSelectedItem().toString()));
        
        sanphamDAO spsao = new sanphamDAO();
        if(spsao.luusp(sp)>0){
            JOptionPane.showMessageDialog(rootPane, "luu thanh cong");
//            cbonsx.setSelectedItem(sp.getId_nsx());
            hienthilentable();
        }
        else   JOptionPane.showMessageDialog(rootPane, "luu khong thanh cong");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     san_pham sp = new san_pham();
        sp.setName(jname.getText());
        sp.setDesc(jdesc.getText());
        sp.setPrice(Integer.parseInt(jprice.getText()));
        sp.setQuantity(Integer.parseInt(jquantity.getText()));
        nsxDAO nsxdao = new nsxDAO();
        sp.setId_nsx(nsxdao.returnID(cbonsx.getSelectedItem().toString()));
        sp.setId(Integer.parseInt(jtblsp.getValueAt(jtblsp.getSelectedRow(), 0).toString()) );
        sanphamDAO spsao = new sanphamDAO();
        if(spsao.update(sp)>0){
            JOptionPane.showMessageDialog(rootPane, "luu thanh cong");
//            cbonsx.setSelectedItem(sp.getId_nsx());
            hienthilentable();
        }
        else   JOptionPane.showMessageDialog(rootPane, "luu khong thanh cong");        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jquantityActionPerformed

    private void jtblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblspMouseClicked
        sanphamDAO spDAO = new sanphamDAO();
        listsanpham = spDAO.allsanphambyId(jtblsp.getValueAt(jtblsp.getSelectedRow(), 0).toString());
        for(san_pham sp : listsanpham){
            jname.setText(sp.getName());
            jdesc.setText(sp.getDesc());
            jprice.setText(Integer.toString(sp.getPrice()));
            jquantity.setText(Integer.toString(sp.getQuantity()));
            cbonsx.setSelectedItem(jtblsp.getValueAt(jtblsp.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtblspMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        san_pham sp = new san_pham();
        sp.setId(Integer.parseInt(jtblsp.getValueAt(jtblsp.getSelectedRow(), 0).toString()) );
        sanphamDAO spdao = new sanphamDAO();
        if(spdao.delete(sp)>0){
            JOptionPane.showMessageDialog(rootPane, "da xoa thanh cong");
            hienthilentable();
        }
        else JOptionPane.showMessageDialog(rootPane, "xoa khong thanh cong");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        hienthilentable();
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
            java.util.logging.Logger.getLogger(nhaphang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhaphang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhaphang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhaphang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new nhaphang().setVisible(true);
             
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbonsx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jdesc;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jprice;
    private javax.swing.JTextField jquantity;
    private javax.swing.JTextField jsearch;
    private javax.swing.JTable jtblsp;
    // End of variables declaration//GEN-END:variables
}
