/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.dao.Dao_Categories;
import com.dao.Dao_Login;
import com.dao.Dao_Products;
import com.dao.Dao_Suppliers;
import com.model.Category;
import com.model.Product;
import com.model.Supplier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nhhao
 */
public class Products extends javax.swing.JPanel {

    ArrayList<Product> list = new ArrayList<>();
    DefaultTableModel tableModel = new DefaultTableModel();
    String id;

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        initComboBox2();
        initComboBox1();
        dich();
        initable();
        loadCategories();
    }
    
    static String nn;

    public Products(String a) {
        nn = a;
    }

    public void dich() {
        String vn = "VN";
        String uk = "UK";
        System.out.println(nn);

        if (nn.equals(vn)) {
            Locale local = null;
            ResourceBundle resource = null;
            try {
                local = new Locale("vn_VN");
                resource = ResourceBundle.getBundle("com.language.Tran", local);
                jLabel4.setText(resource.getString("logout"));
                jButton29.setText(resource.getString("search"));
                jButton30.setText(resource.getString("reset"));
                jLabel6.setText(resource.getString("supplier"));
                jLabel7.setText(resource.getString("proname"));
                jLabel8.setText(resource.getString("unitprice"));
                jLabel9.setText(resource.getString("category"));
                jLabel10.setText(resource.getString("sellprice"));
                jLabel11.setText(resource.getString("status"));
                jLabel12.setText(resource.getString("unitinstock"));
                txtstatus.setText(resource.getString("enable"));
                jRadioButton3.setText(resource.getString("disable"));
                jButton2.setText(resource.getString("add"));
                jButton3.setText(resource.getString("update"));
                jButton4.setText(resource.getString("delete"));
                jButton5.setText(resource.getString("reset"));
                jLabel14.setText(resource.getString("productmanage"));
                id = resource.getString("proid");
                name.setText(resource.getString("name"));
                name1.setText(resource.getString("name"));
            } catch (Exception e) {
            }
        }
        if (nn.equals(uk)) {
            Locale local = null;
            ResourceBundle resource = null;
            try {
                local = new Locale("en_UK");
                resource = ResourceBundle.getBundle("com.language.Tran", local);
                jLabel4.setText(resource.getString("logout"));
                jButton29.setText(resource.getString("search"));
                jButton30.setText(resource.getString("reset"));
                jLabel6.setText(resource.getString("supplier"));
                jLabel7.setText(resource.getString("proname"));
                jLabel8.setText(resource.getString("unitprice"));
                jLabel9.setText(resource.getString("category"));
                jLabel10.setText(resource.getString("sellprice"));
                jLabel11.setText(resource.getString("status"));
                jLabel12.setText(resource.getString("unitinstock"));
                txtstatus.setText(resource.getString("enable"));
                jRadioButton3.setText(resource.getString("disable"));
                jButton2.setText(resource.getString("add"));
                jButton3.setText(resource.getString("update"));
                jButton4.setText(resource.getString("delete"));
                jButton5.setText(resource.getString("reset"));
                jLabel14.setText(resource.getString("productmanage"));
                id = resource.getString("proid");
                name.setText(resource.getString("name"));
                name1.setText(resource.getString("name"));
            } catch (Exception e) {
            }
        }

    }

    private void initable() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{id, jLabel7.getText(), jLabel6.getText(), jLabel9.getText(), jLabel8.getText(), 
            jLabel10.getText(), jLabel12.getText(), jLabel11.getText()});
        table.setModel(tableModel);
    }

    private void loadCategories() {
        try {
            Dao_Products dao = new Dao_Products();
            ArrayList<Product> list = dao.searchAll();
            tableModel.setRowCount(0);
            for (Product it : list) {
                tableModel.addRow(new Object[]{
                    it.getProductID(), it.getProductName(), it.getSupplierID(), it.getCategoryID(), it.getUnitPrice(), it.getSellPrice(), it.getQuantity(), it.getStatus()
                });
            }
            tableModel.fireTableDataChanged();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    private void initComboBox2() {
        try {
            Connection con = Dao_Login.conn;
            String sql = "select SupplierID from Suppliers";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            cbx1.removeAllItems();
            while (rs.next()) {
                cbx1.addItem(rs.getString("SupplierID"));
            }
        } catch (Exception e) {
        }
    }

    private void initComboBox1() {
        try {
            Connection con = Dao_Login.conn;
            String sql = "select CategoryID from Categories";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            cbx2.removeAllItems();
            while (rs.next()) {
                cbx2.addItem(rs.getString("CategoryID"));
            }
        } catch (Exception e) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtsell = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        cbx1 = new javax.swing.JComboBox<>();
        cbx2 = new javax.swing.JComboBox<>();
        txtstatus = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        name = new javax.swing.JLabel();
        cbxnameSup = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        cbxnameCate = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(195, 213, 213));

        jPanel2.setBackground(new java.awt.Color(73, 105, 105));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Bed.png"))); // NOI18N
        jLabel1.setText("Fair deal");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Product Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Out18.png"))); // NOI18N
        jLabel4.setText("Log Out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(133, 173, 173));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel6.setText("Supplier");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel7.setText("Product Name");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel8.setText("Unit Price");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel9.setText("Category");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel10.setText("Sell Price");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel11.setText("Status ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/write.png"))); // NOI18N
        jLabel12.setText("Quantity In Stock");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(133, 173, 173));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        cbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        cbx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(txtstatus);
        txtstatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtstatus.setText("Enable");
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton3.setText("Disable");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name:");

        cbxnameSup.setEditable(false);
        cbxnameSup.setDoubleBuffered(true);
        cbxnameSup.setDragEnabled(true);
        cbxnameSup.setFocusCycleRoot(true);
        cbxnameSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxnameSupActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Name:");

        cbxnameCate.setEditable(false);
        cbxnameCate.setDoubleBuffered(true);
        cbxnameCate.setDragEnabled(true);
        cbxnameCate.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtstock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addComponent(txtsell, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtprice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxnameCate))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxnameSup, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtstatus)
                        .addGap(45, 45, 45)
                        .addComponent(jRadioButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxnameSup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxnameCate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsell, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(133, 173, 173));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Add18.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Update.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/New.png"))); // NOI18N
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(665, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jButton2))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton5)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name ", "Supplier ID  ", "Category ID   ", "Unit    ", "UnitPrice", "Units In Stock ", "Units On Order", "Status      "
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table);

        jPanel23.setBackground(new java.awt.Color(133, 173, 173));

        jPanel24.setBackground(new java.awt.Color(133, 173, 173));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Search.png"))); // NOI18N
        jButton29.setText("Search");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        jButton30.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/New.png"))); // NOI18N
        jButton30.setText("Reset");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton29)
                .addGap(18, 18, 18)
                .addComponent(jButton30))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        StringBuilder sb = new StringBuilder();

        if (txtid.getText().equals("")) {
            sb.append("please enter ID");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        //  Class_Suppliers Suppliers = dao.search(txtid.getText());
        try {
            Dao_Products dao = new Dao_Products();
            Product products = dao.search(txtid.getText());
            if (products != null) {
                txtname.setText(products.getProductName());
                cbx1.setSelectedItem(products.getSupplierID());
                cbx2.setSelectedItem(products.getCategoryID());
                txtprice.setText("" + products.getUnitPrice());
                txtsell.setText("" + products.getSellPrice());
                txtstock.setText("" + products.getQuantity());
                txtstatus.setText(products.getStatus());
//                txtstatus.setSelected(Products.getStatus() == "Enable" ? true : false);
                Dao_Suppliers daoSuppliers = new Dao_Suppliers();
                Supplier suppliers = daoSuppliers.search(cbx1.getSelectedItem().toString());
                if (suppliers != null) {
                    cbxnameSup.setText(suppliers.getCompanyName());
                }
                Dao_Categories categories = new Dao_Categories();
                Category category = categories.searchid(cbx2.getSelectedItem().toString());
                if (category != null) {
                    cbxnameCate.setText(category.getCategoryName());
                }
            } else {
                JOptionPane.showConfirmDialog(this, "Not found");
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error" + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        txtid.setText("");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double UnitPrice;
        double sell;
        int UnitInStock;
        String SupplierID;

        StringBuilder sb = new StringBuilder();
        Product products = new Product();
        if (txtname.getText().equals("")) {
            sb.append("Please enter Name\n");
        }
        if (txtprice.getText().equals("")) {
            sb.append("Please enter Unit Price\n");
        }
        if (txtsell.getText().equals("")) {
            sb.append("Please enter Sell Price\n");
        }
        if (txtstock.getText().equals("")) {
            sb.append("Please enter Quantity In Stock\n");
        }
        if (txtstatus.getText().equals("")) {
            sb.append("Please enter Status\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            UnitPrice = Double.parseDouble(txtprice.getText());
            sell = Double.parseDouble(txtsell.getText());
            UnitInStock = Integer.parseInt(txtstock.getText());
            products.setProductName(txtname.getText());
            products.setSupplierID(cbx1.getSelectedItem().toString());
            products.setCategoryID(cbx2.getSelectedItem().toString());
            products.setUnitPrice(UnitPrice);
            if (UnitPrice <= 200) {
                products.setSellPrice(sell * 1.10);

            } else if (UnitPrice > 200 && UnitPrice < 400) {
                products.setSellPrice(sell * 1.15);

            } else {
                products.setSellPrice(sell * 1.20);
            }
            products.setQuantity(UnitInStock);
            products.setStatus(txtstatus.isSelected() ? "Enable" : "Disable");

            if (UnitPrice > sell) {
                JOptionPane.showMessageDialog(this, "(UnitPrice > sell)The selling price must be greater than the import price.  ");
            } else if (UnitPrice <= 0) {

                JOptionPane.showMessageDialog(this, " UnitPrice phải lớn hơn 0 ");
            } else if (sell <= 0) {

                JOptionPane.showMessageDialog(this, " SellPrice phải lớn hơn 0 ");

            } else {
                Dao_Products dao = new Dao_Products();
                dao.insert(products);
                JOptionPane.showMessageDialog(this, "Added");
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error" + e.getMessage());
            e.printStackTrace();
        }
        loadCategories();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StringBuilder sb = new StringBuilder();

        double sosanh;
        double unitPrice;
        double sell;
        int unitInStock;
        Dao_Products dao = new Dao_Products();
        unitPrice = Double.parseDouble(txtprice.getText());
        sell = Double.parseDouble(txtsell.getText());
        unitInStock = Integer.parseInt(txtstock.getText());
        if (txtname.getText().equals("")) {
            sb.append("Please enter Name\n");
        }
        if (txtprice.getText().equals("")) {
            sb.append("Please enter Unit Price\n");
        }
        if (txtsell.getText().equals("")) {
            sb.append("Please enter Sell Price\n");
        }
        if (txtstock.getText().equals("")) {
            sb.append("Please enter Quantity In Stock\n");
        }
        if (txtstatus.getText().equals("")) {
            sb.append("Please enter Status\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            Product products = dao.search(txtid.getText());
            sosanh = products.getSellPrice();
            products.setProductID(txtid.getText());
            products.setCategoryID(cbx2.getSelectedItem().toString());
            products.setUnitPrice(unitPrice);
            //  Class_Category Category = categories.searchid(cbx2.getSelectedItem().toString());
            if (unitPrice <= 200) {
                sell = sell * 1.15;

            } else if (unitPrice > 200 && unitPrice < 400) {
                sell = sell * 1.10;
            } else {
                sell = sell * 1.20;
            }
            if (sell < sosanh) {
                products.setSellPrice(sosanh);
                JOptionPane.showMessageDialog(this, "giá bán vẫn được giữ nguyên");
            } else {
                products.setSellPrice(sell);
            }
            products.setProductName(txtname.getText());
            products.setSupplierID(cbx1.getSelectedItem().toString());
            products.setQuantity(unitInStock);
            products.setStatus(txtstatus.isSelected() ? "Enable" : "Disable");
            if (unitPrice > sell) {
                JOptionPane.showMessageDialog(this, "(UnitPrice > sell)The selling price must be greater than the import price. ");

            } else if (unitPrice <= 0) {

                JOptionPane.showMessageDialog(this, " UnitPrice phải lớn hơn 0 ");
            } else if (sell <= 0) {
                JOptionPane.showMessageDialog(this, " SellPrice phải lớn hơn 0 ");
            } else {
                dao.Update(products);
                JOptionPane.showMessageDialog(this, "update successful! ");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error" + e.getMessage());
            e.printStackTrace();
        }
        loadCategories();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StringBuilder sb = new StringBuilder();
        Product products = new Product();

        if (txtid.getText().equals("")) {
            sb.append("please enter ProductID ");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            products.setProductID(txtid.getText());
            products.setStatus(txtstatus.isSelected() ? "Disable" : "Disable");
            Dao_Products dao = new Dao_Products();

            dao.delete(products);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Error" + e.getMessage());
            e.printStackTrace();
        }
        loadCategories();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtid.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtsell.setText("");
        txtstock.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {

            int row = table.getSelectedRow();
            if (row >= 0) {
                String id = (String) table.getValueAt(row, 0);

                Dao_Products dao = new Dao_Products();
                Product products = dao.search(id);
                if (products != null) {
                    txtid.setText(products.getProductID());
                    txtname.setText(products.getProductName());
                    cbx1.setSelectedItem(products.getSupplierID());
                    cbx2.setSelectedItem(products.getCategoryID());
                    txtprice.setText("" + products.getUnitPrice());
                    txtsell.setText("" + products.getSellPrice());
                    txtstock.setText("" + products.getQuantity());

//                txtstatus.setText(Products.getStatus());
//                txtstatus.setSelected(Products.getStatus() == "Enable" ? true : false);
                }
              
                Dao_Suppliers daoSuppliers = new Dao_Suppliers();
                Supplier suppliers = daoSuppliers.search(cbx1.getSelectedItem().toString());
                if (suppliers != null) {
                    cbxnameSup.setText(suppliers.getCompanyName());
                }
                Dao_Categories categories = new Dao_Categories();
                Category category = categories.searchid(cbx2.getSelectedItem().toString());
                if (category != null) {
                    cbxnameCate.setText(category.getCategoryName());
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        try {
            Dao_Suppliers daoSuppliers = new Dao_Suppliers();
            Supplier Suppliers = daoSuppliers.search(cbx1.getSelectedItem().toString());
            if (Suppliers != null) {
                cbxnameSup.setText(Suppliers.getCompanyName());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        try {
            Dao_Categories categories = new Dao_Categories();
            Category Category = categories.searchid(cbx2.getSelectedItem().toString());
            if (Category != null) {
                cbxnameCate.setText(Category.getCategoryName());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Login jlogin = new Login();
        Login.mainAdmin.dispose();
        jlogin.setLocationRelativeTo(null);
        jlogin.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cbxnameSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxnameSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxnameSupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JTextField cbxnameCate;
    private javax.swing.JTextField cbxnameSup;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsell;
    private javax.swing.JRadioButton txtstatus;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
