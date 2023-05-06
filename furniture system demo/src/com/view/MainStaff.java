/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.model.DanhMucBean;
import com.controller.ChuyenMangHinhController;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author nhhao
 */
public class MainStaff extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public MainStaff() {
        initComponents();

        ChuyenMangHinhController controller = new ChuyenMangHinhController(jpnView);
        controller.setViewStaff(jpnHomeStaff, jlbHomeStaff);
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("HomePageStaff", jpnHomeStaff, jlbHomeStaff));
        listItem.add(new DanhMucBean("Customer", jpnCustomer, jblCustomer));
        listItem.add(new DanhMucBean("Order", jpnOrder, jblOrder));
        listItem.add(new DanhMucBean("Personal", jpnPersonal, jblPersonal));
        listItem.add(new DanhMucBean("Password", jpnPassword, jblPassword));
        controller.setEvent(listItem);
    }
    
    static String nn;

    public MainStaff(String a) {
        nn = a;
    }

    public void dich() {
        String vn = "VN";
        String uk = "UK";

        if (nn.equals(uk)) {
            Locale local = null;
            ResourceBundle resource = null;
            try {
                local = new Locale("en_UK");
                resource = ResourceBundle.getBundle("com.language.Tran", local);
                jlbHomeStaff.setText(resource.getString("homepage"));
                jblPersonal.setText(resource.getString("personalinfomation"));
                jblCustomer.setText(resource.getString("customer"));
                jblOrder.setText(resource.getString("order"));
                jblPassword.setText(resource.getString("changepassword"));
                jLabel1.setText(resource.getString("loginStaff"));
            } catch (Exception e) {
            }
        }
        if (nn.equals(vn)) {
            Locale local = null;
            ResourceBundle resource = null;
            try {
                local = new Locale("vn_VN");
                resource = ResourceBundle.getBundle("com.language.Tran", local);
                jlbHomeStaff.setText(resource.getString("homepage"));
                jblPersonal.setText(resource.getString("personalinfomation"));
                jblCustomer.setText(resource.getString("customer"));
                jblOrder.setText(resource.getString("order"));
                jblPassword.setText(resource.getString("changepassword"));
                jLabel1.setText(resource.getString("loginStaff"));
            } catch (Exception e) {
            }
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

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnHomeStaff = new javax.swing.JPanel();
        jlbHomeStaff = new javax.swing.JLabel();
        jpnPersonal = new javax.swing.JPanel();
        jblPersonal = new javax.swing.JLabel();
        jpnPassword = new javax.swing.JPanel();
        jblPassword = new javax.swing.JLabel();
        jpnCustomer = new javax.swing.JPanel();
        jblCustomer = new javax.swing.JLabel();
        jpnOrder = new javax.swing.JPanel();
        jblOrder = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpnMenu.setBackground(new java.awt.Color(195, 213, 213));

        jPanel3.setBackground(new java.awt.Color(73, 105, 105));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 245, 245));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Quanly.png"))); // NOI18N
        jLabel1.setText("Staff");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnHomeStaff.setBackground(new java.awt.Color(133, 173, 173));

        jlbHomeStaff.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbHomeStaff.setForeground(new java.awt.Color(240, 245, 245));
        jlbHomeStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbHomeStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Home24.png"))); // NOI18N
        jlbHomeStaff.setText("Home Page");
        jlbHomeStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbHomeStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbHomeStaffMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnHomeStaffLayout = new javax.swing.GroupLayout(jpnHomeStaff);
        jpnHomeStaff.setLayout(jpnHomeStaffLayout);
        jpnHomeStaffLayout.setHorizontalGroup(
            jpnHomeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHomeStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHomeStaffLayout.setVerticalGroup(
            jpnHomeStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHomeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnPersonal.setBackground(new java.awt.Color(133, 173, 173));

        jblPersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblPersonal.setForeground(new java.awt.Color(240, 245, 245));
        jblPersonal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/User.png"))); // NOI18N
        jblPersonal.setText("Personal Infomation");
        jblPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblPersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnPersonalLayout = new javax.swing.GroupLayout(jpnPersonal);
        jpnPersonal.setLayout(jpnPersonalLayout);
        jpnPersonalLayout.setHorizontalGroup(
            jpnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPersonalLayout.setVerticalGroup(
            jpnPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jpnPassword.setBackground(new java.awt.Color(133, 173, 173));

        jblPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblPassword.setForeground(new java.awt.Color(240, 245, 245));
        jblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Pass.png"))); // NOI18N
        jblPassword.setText("Change Password");
        jblPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnPasswordLayout = new javax.swing.GroupLayout(jpnPassword);
        jpnPassword.setLayout(jpnPasswordLayout);
        jpnPasswordLayout.setHorizontalGroup(
            jpnPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPasswordLayout.setVerticalGroup(
            jpnPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jpnCustomer.setBackground(new java.awt.Color(133, 173, 173));

        jblCustomer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblCustomer.setForeground(new java.awt.Color(240, 245, 245));
        jblCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Customer.png"))); // NOI18N
        jblCustomer.setText("Customer");
        jblCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblCustomer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jblCustomerMouseDragged(evt);
            }
        });
        jblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblCustomerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnCustomerLayout = new javax.swing.GroupLayout(jpnCustomer);
        jpnCustomer.setLayout(jpnCustomerLayout);
        jpnCustomerLayout.setHorizontalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCustomerLayout.setVerticalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnOrder.setBackground(new java.awt.Color(133, 173, 173));

        jblOrder.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblOrder.setForeground(new java.awt.Color(240, 245, 245));
        jblOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jblOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Order.png"))); // NOI18N
        jblOrder.setText("Order");
        jblOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnOrderLayout = new javax.swing.GroupLayout(jpnOrder);
        jpnOrder.setLayout(jpnOrderLayout);
        jpnOrderLayout.setHorizontalGroup(
            jpnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnOrderLayout.setVerticalGroup(
            jpnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHomeStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpnPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHomeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1625, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbHomeStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHomeStaffMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbHomeStaffMouseClicked

    private void jblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblOrderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jblOrderMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jblCustomerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblCustomerMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jblCustomerMouseDragged

    private void jblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblCustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jblCustomerMouseClicked

    private void jblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jblPersonalMouseClicked

    private void jblPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jblPasswordMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        dich();
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jblCustomer;
    private javax.swing.JLabel jblOrder;
    private javax.swing.JLabel jblPassword;
    private javax.swing.JLabel jblPersonal;
    private javax.swing.JLabel jlbHomeStaff;
    private javax.swing.JPanel jpnCustomer;
    private javax.swing.JPanel jpnHomeStaff;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnOrder;
    private javax.swing.JPanel jpnPassword;
    private javax.swing.JPanel jpnPersonal;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}