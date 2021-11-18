/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        //this.set
        
        initComponents();
   
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        manageCustomer();
    }
    
//    public void populateTree(){
//        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
//       // Add the code for draw your system structure shown by JTree
//       
//        model.reload();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        manageCustomerPanel = new javax.swing.JPanel();
        manageCustomers = new javax.swing.JLabel();
        manageRestaurants = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        manageDeliveryMan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(31, 50, 97));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(240, 178, 62));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageCustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        manageCustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageCustomerPanelMousePressed(evt);
            }
        });

        manageCustomers.setForeground(new java.awt.Color(255, 102, 0));
        manageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCustomers.setText("Manage Customers");
        manageCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageCustomersMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageCustomerPanelLayout = new javax.swing.GroupLayout(manageCustomerPanel);
        manageCustomerPanel.setLayout(manageCustomerPanelLayout);
        manageCustomerPanelLayout.setHorizontalGroup(
            manageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        manageCustomerPanelLayout.setVerticalGroup(
            manageCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(manageCustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        manageRestaurants.setBackground(new java.awt.Color(255, 255, 255));
        manageRestaurants.setPreferredSize(new java.awt.Dimension(264, 48));
        manageRestaurants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRestaurantsMousePressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Restaurants");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageRestaurantsLayout = new javax.swing.GroupLayout(manageRestaurants);
        manageRestaurants.setLayout(manageRestaurantsLayout);
        manageRestaurantsLayout.setHorizontalGroup(
            manageRestaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRestaurantsLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageRestaurantsLayout.setVerticalGroup(
            manageRestaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRestaurantsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(manageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        manageDeliveryMan.setBackground(new java.awt.Color(255, 255, 255));
        manageDeliveryMan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageDeliveryManMousePressed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Delivery Man");

        javax.swing.GroupLayout manageDeliveryManLayout = new javax.swing.GroupLayout(manageDeliveryMan);
        manageDeliveryMan.setLayout(manageDeliveryManLayout);
        manageDeliveryManLayout.setHorizontalGroup(
            manageDeliveryManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDeliveryManLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageDeliveryManLayout.setVerticalGroup(
            manageDeliveryManLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(manageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 280, 50));

        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(940, 808));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCustomersMousePressed
        manageCustomer();
    }//GEN-LAST:event_manageCustomersMousePressed

    private void manageCustomer() {
        // TODO add your handling code here:
//        manageCustomerPanel.setBackground(new Color(56,90,174));
//        manageRestaurants.setBackground(new Color(31,50,97));
//        manageDeliveryMan.setBackground(new Color(31,50,97));
        userinterface.SystemAdminWorkArea.ManageCustomerJPanel manageCustomer = new userinterface.SystemAdminWorkArea.ManageCustomerJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageCustomerJPanel",manageCustomer);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageCustomerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCustomerPanelMousePressed
        // TODO add your handling code here:
        manageCustomer();
    }//GEN-LAST:event_manageCustomerPanelMousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        manageRestaurant();
    }//GEN-LAST:event_jLabel5MousePressed

    private void manageRestaurant() {
        // TODO add your handling code here:
//        manageRestaurants.setBackground(new Color(56,90,174));
//        manageCustomerPanel.setBackground(new Color(31,50,97));
//        manageDeliveryMan.setBackground(new Color(31,50,97));
        userinterface.SystemAdminWorkArea.ManageRestaurantJPanel manageRestaurant = new userinterface.SystemAdminWorkArea.ManageRestaurantJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageRestaurantJPanel",manageRestaurant);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageRestaurantsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRestaurantsMousePressed
        // TODO add your handling code here:
        manageRestaurant();
    }//GEN-LAST:event_manageRestaurantsMousePressed

    private void manageDeliveryManMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDeliveryManMousePressed
        manageDeliveryMan();
    }//GEN-LAST:event_manageDeliveryManMousePressed

    private void manageDeliveryMan() {
        // TODO add your handling code here:
//        manageDeliveryMan.setBackground(new Color(56,90,174));
//        manageCustomerPanel.setBackground(new Color(31,50,97));
//        manageRestaurants.setBackground(new Color(31,50,97));
        userinterface.SystemAdminWorkArea.ManageDeliveryManJPanel manageDeliveryMan = new userinterface.SystemAdminWorkArea.ManageDeliveryManJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageDeliveryManJPanel",manageDeliveryMan);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel manageCustomerPanel;
    private javax.swing.JLabel manageCustomers;
    private javax.swing.JPanel manageDeliveryMan;
    private javax.swing.JPanel manageRestaurants;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
