/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessClub.Manager;

import userinterface.FitnessClub.Analyst.AnalysisJPanel;
import Business.EcoSystem;
import Business.Enterprise.FitnessClubEnterprise;
import Business.Enterprise.OnlineSalesEnterprise;
import Business.Network.Network;
import Business.Organization.FitnessClubManagerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author luliu
 */
public class FCManagerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private UserAccount account;
    private FitnessClubManagerOrganization fitManorganization;
    private FitnessClubEnterprise fitenterprise;
    private OnlineSalesEnterprise salesenterprise;
    private Network network;
    private EcoSystem ecoSystem;
    /**
     * Creates new form FCManagerWorkAreaJPanel
     */
    public FCManagerWorkAreaJPanel(JPanel container, UserAccount account, FitnessClubManagerOrganization fitManorganization, 
            FitnessClubEnterprise fitenterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitManorganization = fitManorganization;
        this.fitenterprise = (FitnessClubEnterprise) fitenterprise;
        this.salesenterprise = (OnlineSalesEnterprise) salesenterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        employeeViewBtn = new javax.swing.JButton();
        analysisButton = new javax.swing.JButton();
        checkRequestButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Please Manage the Fitness Club System");

        employeeViewBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        employeeViewBtn.setForeground(new java.awt.Color(153, 153, 255));
        employeeViewBtn.setText("Employee View");
        employeeViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeViewBtnActionPerformed(evt);
            }
        });

        analysisButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        analysisButton.setForeground(new java.awt.Color(255, 51, 51));
        analysisButton.setText("Analysis Helper");
        analysisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisButtonActionPerformed(evt);
            }
        });

        checkRequestButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        checkRequestButton.setForeground(new java.awt.Color(153, 153, 255));
        checkRequestButton.setText("Check Request");
        checkRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(analysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(employeeViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(278, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(employeeViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(checkRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(analysisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void employeeViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeViewBtnActionPerformed
        // TODO add your handling code here:
        EmployeeViewJPanel employeeViewJPanel = new EmployeeViewJPanel(container, account, fitenterprise);
        container.add("employeeViewJPanel", employeeViewJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_employeeViewBtnActionPerformed

    private void analysisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisButtonActionPerformed
        // TODO add your handling code here:
        AnalysisJPanel analysisJPanel = new AnalysisJPanel(container, fitenterprise, salesenterprise);
        container.add("analysisJPanel", analysisJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_analysisButtonActionPerformed

    private void checkRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRequestButtonActionPerformed
        // TODO add your handling code here:
        PublicCourseRequestJPanel publicCourseRequestJPanel = new PublicCourseRequestJPanel(container, account, fitenterprise);
        container.add("publicCourseRequestJPanel", publicCourseRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_checkRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analysisButton;
    private javax.swing.JButton checkRequestButton;
    private javax.swing.JButton employeeViewBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}