/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;
import userinterface.Customer.CusRegistrationJPanel;
import Business.Role.CustomerRole;
import static java.awt.PageAttributes.MediaType.A;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javafx.scene.input.KeyCode.Z;
import javax.swing.JFrame;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author luliu
 */
public class CusRegistrationJPanel extends javax.swing.JPanel {

    private JPanel crpJPanel;
    private String username;
    private String password;
    private EcoSystem system;
    private Network network;
    private MainJFrame frame;

    /**
     * Creates new form CusRegistrationJPanel
     */
    public CusRegistrationJPanel(EcoSystem system, JPanel crpJPanel, MainJFrame frame) {
        initComponents();
        this.system = system;
        this.crpJPanel = crpJPanel;
        this.frame = frame;
        NetworkCMB.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetworkCMB.addItem(network);
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

        submitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        CPassField = new javax.swing.JPasswordField();
        NetworkCMB = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("*First Name: ");

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("*Last Name: ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("* is required field");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Address: ");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("*Phone:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("*Email:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setText("Please provide information to complete your registration:");

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("*User Name: ");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("*Confirm Passwird: ");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("*Password: ");

        CPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPassFieldActionPerformed(evt);
            }
        });

        NetworkCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCMBActionPerformed(evt);
            }
        });

        jLabel11.setText("*Network:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel11)))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lastNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(153, 153, 153))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(NetworkCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NetworkCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (userNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "User name can't be empty!");
            return;
        }
        if (PassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
        if (CPassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password can't be empty!");
            return;
        }

        if (firstNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "First name can't be empty!");
            return;
        }
        if (lastNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Last name can't be empty!");
            return;
        }
        if (phoneTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number can't be empty!");
            return;
        }
        if (emailTxt.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Email can't be empty!");
            return;
        }
        if(!checkEmailPattern()){
            JOptionPane.showMessageDialog(null, "Email must follow the format");
            return;
        }
        if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        if(!PassField.getText().equals(CPassField.getText())){
            JOptionPane.showMessageDialog(null, "The password does not match");
            return;
        }
        if(!phonePattern()){
            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
            return;
        }
       

        username = userNameTxt.getText();
        password = CPassField.getText();

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                userAccount = network.getUserAccountDirectory().authenticateUser(username, password);
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                        if (userAccount == null) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                                if (userAccount != null) {
                                    JOptionPane.showMessageDialog(null, "Account already exist!");
                                    userNameTxt.setText("");
                                    PassField.setText("");
                                    CPassField.setText("");
//                                firstNameTxt.setText("");
//                                lastNameTxt.setText("");
                                    return;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Account already exist!");
                            userNameTxt.setText("");
                            PassField.setText("");
                            CPassField.setText("");
                            return;

                        }
                        //UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account already exist!");
                    userNameTxt.setText("");
                    PassField.setText("");
                    CPassField.setText("");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account already exist!");
            userNameTxt.setText("");
            PassField.setText("");
            CPassField.setText("");
            return;

        }

        Customer customer = new Customer(firstNameTxt.getText(), lastNameTxt.getText(),
                emailTxt.getText(), phoneTxt.getText());
        this.network = (Network) NetworkCMB.getSelectedItem();
        UserAccount ua = network.getUserAccountDirectory().createUserAccount(userNameTxt.getText(), CPassField.getText(), customer, new CustomerRole());
        
        
        //DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Create Account Successfully");
        userNameTxt.setEnabled(false);
        PassField.setEnabled(false);
        CPassField.setEnabled(false);
        firstNameTxt.setEnabled(false);
        lastNameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        phoneTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        frame.setActivate();
        
//        if (system.checkIfUserIsUnique(username)) {
//            if (pass1.equals(pass2)) {
//                //this.frame.setSize(500, 430);
//                CusRegistrationJPanel cp = new CusRegistrationJPanel(this.system, this.crpJPanel);
//                this.crpJPanel.add("CusRegistrationJPanel", cp);
//                CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
//                crpJPanel.remove(this);
//                layout.next(this.crpJPanel);
//            } else {
//                JOptionPane.showMessageDialog(null, "Passwords don't match!");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Username already exists!");
//        }
//        
//        this.frame.dispose();
//        MainJFrame mf = new MainJFrame();
//        this.frame.dispose();
//        mf.setVisible(true);
//        mf.setLocationRelativeTo(null);

    }//GEN-LAST:event_submitButtonActionPerformed
private Boolean checkEmailPattern(){
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();
        
        return b;
    }

private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
//                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$]"
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();
        
        return b;
    }
private boolean phonePattern(){
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");
                //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(phoneTxt.getText());
        boolean b = m.matches();
        
        return b;
    }


    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        CancelJPanel cp = new CancelJPanel(this.system, this.crpJPanel);
        this.crpJPanel.add("CancelJPanel", cp);
        CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
        crpJPanel.remove(this.crpJPanel);
        layout.next(crpJPanel);
        frame.setActivate();
//        firstNameTxt.setEnabled(false);
//        lastNameTxt.setEnabled(false);
//        addressTxt.setEnabled(false);
//        phoneTxt.setEnabled(false);
//        emailTxt.setEnabled(false);

    }//GEN-LAST:event_cancelButtonActionPerformed

    
    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void CPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPassFieldActionPerformed

    private void NetworkCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCMBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NetworkCMBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CPassField;
    private javax.swing.JComboBox NetworkCMB;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
