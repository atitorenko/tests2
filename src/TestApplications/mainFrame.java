/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestApplications;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artemsamsonov
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUserLastname = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelUserSurname = new javax.swing.JLabel();
        textUserLastname = new javax.swing.JTextField();
        textUserName = new javax.swing.JTextField();
        textUserSurname = new javax.swing.JTextField();
        labelUserType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textUserType = new javax.swing.JTextArea();
        buttonStart = new javax.swing.JButton();
        buttonTest2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelUserLastname.setText("Фамилия: ");
        labelUserLastname.setAutoscrolls(true);

        labelUserName.setText("Имя: ");
        labelUserName.setAutoscrolls(true);

        labelUserSurname.setText("Отчество: ");
        labelUserSurname.setAutoscrolls(true);

        textUserLastname.setColumns(10);
        textUserLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserLastnameActionPerformed(evt);
            }
        });

        textUserName.setColumns(10);

        textUserSurname.setColumns(10);

        labelUserType.setText("Должность: ");
        labelUserType.setAutoscrolls(true);

        jScrollPane1.setAutoscrolls(true);

        textUserType.setColumns(15);
        textUserType.setRows(4);
        jScrollPane1.setViewportView(textUserType);

        buttonStart.setText("Пройти тесты");
        buttonStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonStartMousePressed(evt);
            }
        });

        buttonTest2.setText("Тест2");
        buttonTest2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonTest2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(labelUserSurname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelUserName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelUserLastname)
                                    .addGap(18, 18, 18)
                                    .addComponent(textUserLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelUserType)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(buttonStart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(buttonTest2)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserLastname)
                    .addComponent(textUserLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserSurname)
                    .addComponent(textUserSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonStart)
                .addGap(18, 18, 18)
                .addComponent(buttonTest2)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUserLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserLastnameActionPerformed
       
    }//GEN-LAST:event_textUserLastnameActionPerformed

    private void buttonStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStartMousePressed
        if (!this.textUserName.getText().isEmpty() &&
                !this.textUserLastname.getText().isEmpty() &&
                !this.textUserSurname.getText().isEmpty() &&
                !this.textUserType.getText().isEmpty()) {
            PassedQuestionnare curUsr = new PassedQuestionnare(this.textUserName.getText(),
                    this.textUserLastname.getText(),
                    this.textUserSurname.getText(),
                    this.textUserType.getText());
            frameTest1 test;
            try {
                test = new frameTest1(curUsr);
                test.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonStartMousePressed

    private void buttonTest2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTest2MousePressed
        if (!this.textUserName.getText().isEmpty() &&
                !this.textUserLastname.getText().isEmpty() &&
                !this.textUserSurname.getText().isEmpty() &&
                !this.textUserType.getText().isEmpty()) {
            PassedQuestionnare curUsr = new PassedQuestionnare(this.textUserName.getText(),
                    this.textUserLastname.getText(),
                    this.textUserSurname.getText(),
                    this.textUserType.getText());
            frameTest2 test;
            try {
                test = new frameTest2(curUsr);
                test.setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonTest2MousePressed
    
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonTest2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUserLastname;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel labelUserSurname;
    private javax.swing.JLabel labelUserType;
    private javax.swing.JTextField textUserLastname;
    private javax.swing.JTextField textUserName;
    private javax.swing.JTextField textUserSurname;
    private javax.swing.JTextArea textUserType;
    // End of variables declaration//GEN-END:variables
}
