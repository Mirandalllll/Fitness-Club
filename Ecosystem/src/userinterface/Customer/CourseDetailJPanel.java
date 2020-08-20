/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Customer;
import Business.Course.Course;
import javax.swing.JPanel;
import java.awt.CardLayout;

/**
 *
 * @author luliu
 */
public class CourseDetailJPanel extends javax.swing.JPanel {
    private Course course;
    private JPanel container;
    /**
     * Creates new form CouseDetailJPanel
     */
    public CourseDetailJPanel(JPanel container, Course course) {
        initComponents();
        this.course = course;
        this.container = container;
        coursenameTxt.setText(course.getCourseName());
        IdTxt.setText(String.valueOf(course.getCourseId()));
        remainseatsTxt.setText(String.valueOf(course.getRemainSeats()));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        backTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        coursenameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IdTxt = new javax.swing.JTextField();
        Storage = new javax.swing.JLabel();
        remainseatsTxt = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Course Detail");

        backTxt.setText("Back");
        backTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Name:");

        coursenameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursenameTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Course Id:");

        IdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTxtActionPerformed(evt);
            }
        });

        Storage.setText("Available Seats:");

        remainseatsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainseatsTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(backTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(Storage, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(66, 66, 66)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(remainseatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coursenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(backTxt)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coursenameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(remainseatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Storage))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTxtActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backTxtActionPerformed

    private void coursenameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursenameTxtActionPerformed
        // TODO add your handling code here:
        coursenameTxt.setEnabled(false);
   
    }//GEN-LAST:event_coursenameTxtActionPerformed

    private void IdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTxtActionPerformed
        // TODO add your handling code here:
        IdTxt.setEnabled(false);
    }//GEN-LAST:event_IdTxtActionPerformed

    private void remainseatsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainseatsTxtActionPerformed
        // TODO add your handling code here:
        remainseatsTxt.setEnabled(false);
    }//GEN-LAST:event_remainseatsTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTxt;
    private javax.swing.JLabel Storage;
    private javax.swing.JButton backTxt;
    private javax.swing.JTextField coursenameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField remainseatsTxt;
    // End of variables declaration//GEN-END:variables
}