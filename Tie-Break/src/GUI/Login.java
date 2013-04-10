/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.LoginCheckManager;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class Login extends javax.swing.JFrame
{

    private static Login instance = null;
    private LoginCheckManager lm;

    /**
     * Creates new form Login
     */
    public Login()
    {
        initComponents();
        lm = LoginCheckManager.getInstance();
        setLocationRelativeTo(null);
        setTitle("Log ind");


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblMemberNr = new javax.swing.JLabel();
        txtMemberNr = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMemberNr.setText("Medlemsnummer:");

        txtMemberNr.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtMemberNrActionPerformed(evt);
            }
        });

        lblPassword.setText("Adgangskode:");

        btnLogIn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogIn.setText("Log ind");
        btnLogIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogInActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/titelogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMemberNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtMemberNr, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(106, 106, 106))
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMemberNr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemberNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogIn)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogInActionPerformed
    {//GEN-HEADEREND:event_btnLogInActionPerformed
        LoginCheck();
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtMemberNrActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtMemberNrActionPerformed
    {//GEN-HEADEREND:event_txtMemberNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberNrActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception
    {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMemberNr;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtMemberNr;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    public void LoginCheck()
    {
        if (txtMemberNr.getText().length() != 0 && txtPassword.getText().length() != 0)
        {
            int MemberID = new Scanner(txtMemberNr.getText()).nextInt();
            String Password = new Scanner(txtPassword.getText()).nextLine();

            try
            {
                if (lm.checkUserNameAndPassword(MemberID, Password) == true)
                {
                    System.out.println("WINNER");
                }
            }
            catch (Exception ex)
            {
                System.out.println("LOOSER" + ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Alle felter skal udfyldes!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
