/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prasannanimbalkar
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory userAccountList;

    public ManageRestaurantJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        initListners();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateTable();
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
        tblRestaurantAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createRestaurantName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        createPassword = new javax.swing.JTextField();
        createUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        restaurantAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        restaurantPhone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tblRestaurantAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant name", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurantAdmin.setSelectionBackground(new java.awt.Color(225, 51, 13));
        jScrollPane1.setViewportView(tblRestaurantAdmin);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Dashboard");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Password");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Restaurant Name");

        btnCreate.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 102, 0));
        btnCreate.setText("Create");
        btnCreate.setToolTipText("");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnModify.setBackground(new java.awt.Color(255, 255, 255));
        btnModify.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 102, 0));
        btnModify.setText("Modify");
        btnModify.setToolTipText("");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 102, 0));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        createUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Restaurant Address");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Contact");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(restaurantAddress)
                            .addComponent(createUserName)
                            .addComponent(createPassword)
                            .addComponent(createRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(restaurantPhone))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(createUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(createPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(createRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(restaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(restaurantPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (createUserName.getText().isEmpty() || createPassword.getText().isEmpty() || createRestaurantName.getText().isEmpty() || restaurantAddress.getText().isEmpty()
              || restaurantPhone.getText().isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(createUserName.getText())) {
            Restaurant restaurant = new Restaurant(createUserName.getText(),
                    createPassword.getText(), createRestaurantName.getText(),
                    restaurantAddress.getText(),restaurantPhone.getText());
            ecosystem.getUserAccountDirectory().addUserAccount(restaurant);
            ecosystem.getRestaurantDirectory().addRestaurant(restaurant);
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Username " + createUserName.getText() + " already exists !!!, Please try a new one");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
//        System.out.println("Shivi Update");

        int selectedRow = tblRestaurantAdmin.getSelectedRow();
        if (selectedRow >= 0) {
//            System.out.println("xyz" + selectedRow);
//            System.out.println("Shivi 2");
            Restaurant restaurant = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
            System.out.println("item : " + restaurant);
            restaurant.setUsername(createUserName.getText());
            restaurant.setPassword(createPassword.getText());
            restaurant.setName(createRestaurantName.getText());
            restaurant.setAddress(restaurantAddress.getText());
            restaurant.setPhone(restaurantPhone.getText());
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
           int selectedRow = tblRestaurantAdmin.getSelectedRow();

        if (selectedRow >= 0) {
            Restaurant restaurant = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
            RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
            restaurantDirectory.removeRestaurant(restaurant);
            JOptionPane.showMessageDialog(null, "Restaurant admin "  + createUserName.getText() + " deleted");
            populateTable();
            createUserName.setText("");
            createPassword.setText("");
            createRestaurantName.setText("");
            restaurantAddress.setText("");
            restaurantPhone.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
           
      
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void populateTable() {
        RestaurantDirectory restaurantDirectory = ecosystem.getRestaurantDirectory();
        DefaultTableModel model = (DefaultTableModel) tblRestaurantAdmin.getModel();
        model.setRowCount(0);
        for (Restaurant restaurant : restaurantDirectory.getRestaurantList()) {
            Object[] row = new Object[3];
            row[0] = restaurant;
            row[1] = restaurant.getUsername();
            row[2] = restaurant.getPassword();
            model.addRow(row);
        }
    }

   
    private void initListners() {
       tblRestaurantAdmin.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           int selectedRow = tblRestaurantAdmin.getSelectedRow();
             if (selectedRow >= 0) {
                  Restaurant  restaurant  = (Restaurant) tblRestaurantAdmin.getValueAt(selectedRow, 0);
                 if(restaurant!=null){
                     display(restaurant);
                 }
             }
        }
    });
    }

    private void display(Restaurant restaurant) {
//        System.out.println("Shivi display");
        createUserName.setText(restaurant.getUsername());
        createPassword.setText(restaurant.getPassword());
        createRestaurantName.setText(restaurant.getName());
        restaurantAddress.setText(restaurant.getAddress());
        restaurantPhone.setText(restaurant.getPhone());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createRestaurantName;
    private javax.swing.JTextField createUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField restaurantAddress;
    private javax.swing.JTextField restaurantPhone;
    private javax.swing.JTable tblRestaurantAdmin;
    // End of variables declaration//GEN-END:variables
}
