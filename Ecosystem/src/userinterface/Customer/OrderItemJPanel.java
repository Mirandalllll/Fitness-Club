/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OnlineSalesEnterprise;
import Business.Network.Network;
import Business.Sales.OnlineSales;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OnlineSalesRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luliu
 */
public class OrderItemJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    //private Network network;
    private OnlineSalesRequest onlinesalesRequest;
    private HashMap<OnlineSales, Integer> cart;
    private OnlineSalesEnterprise salesEnterprise;
    /**
     * Creates new form OrderItemJPanel
     */
    public OrderItemJPanel(JPanel container, UserAccount account, HashMap<OnlineSales, Integer> cart, 
            OnlineSalesEnterprise onlineSalesEnterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        //this.network = network;
        this.cart = cart;
        this.salesEnterprise = onlineSalesEnterprise;
        //this.salesEnterprise = salesEnterprise;

        quantityComboBox.removeAll();
        
        for(int i = 1; i < 11; i++){
            quantityComboBox.addItem(i);
        }
        
        populateItem();
        populateCart();
    }
    
    public void populateItem() {
        DefaultTableModel model = (DefaultTableModel) itemMenuJTable.getModel();
        model.setRowCount(0);
        for(OnlineSales item : salesEnterprise.getOnlineSalesDirectory().getOnlineSalesList()){
            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getPrice();
            model.addRow(row);
        }
        
    }
    
    public void populateCart() {
        DefaultTableModel model = (DefaultTableModel) cartJTable.getModel();
        model.setRowCount(0);
        double amount = 0;
        for(OnlineSales item : cart.keySet()){
            Object[] row = new Object[4];
            row[0] = item;
            row[1] = item.getPrice();
            row[2] = cart.get(item);
            row[3] = item.getPrice() * cart.get(item);
            amount += item.getPrice() * cart.get(item);
            model.addRow(row);
            
        }
        priceLabel.setText("Total:" + amount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartJTable = new javax.swing.JTable();
        quantityComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        checkoutBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemMenuJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addBtn.setText("Add to my cart");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total Price"
            }
        ));
        jScrollPane2.setViewportView(cartJTable);

        quantityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        checkoutBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        checkoutBtn.setText("Checkout");
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Please checkout your cart");

        itemMenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemMenuJTable);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        priceLabel.setText("Total: ");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Please select the item(s)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(priceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkoutBtn))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBtn))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(270, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn)
                        .addComponent(quantityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(52, 52, 52)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn)
                        .addComponent(checkoutBtn)
                        .addComponent(priceLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(backBtn)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = itemMenuJTable.getSelectedRow();
        if(selectedRow >= 0){
            OnlineSales item = (OnlineSales)itemMenuJTable.getValueAt(selectedRow, 0);
            int pre = 0;
            if(cart.containsKey(item))
            pre = cart.get(item);
            int quantity = pre + (int) quantityComboBox.getSelectedItem();
            cart.put(item, quantity);
            populateCart();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartJTable.getSelectedRow();
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                OnlineSales item = (OnlineSales)cartJTable.getValueAt(selectedRow, 0);
                cart.remove(item);
                populateCart();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) cartJTable.getModel();
        if(model.getRowCount() == 0)
        JOptionPane.showMessageDialog(null, "No item choiced yet!");
        else{
            onlinesalesRequest = new OnlineSalesRequest();
            onlinesalesRequest.setSender(account);
            onlinesalesRequest.setStatus("Paid");
            onlinesalesRequest.setItemOrder(cart);
            
            HashMap<OnlineSales, Integer> purchase = new HashMap();

            for(Map.Entry<OnlineSales,Integer> e : cart.entrySet())
            purchase.put(e.getKey(),e.getValue());

            onlinesalesRequest.setItemOrder(purchase);
            cart.clear();

            salesEnterprise.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            account.getOnlineSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);

            JOptionPane.showMessageDialog(null, "Your order has been submitted!!");
            populateCart();
        }

    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void quantityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable cartJTable;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable itemMenuJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox quantityComboBox;
    // End of variables declaration//GEN-END:variables

    

    
}