/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Chris
 */
public class MainMenu extends javax.swing.JFrame
{
    private static MainMenu instance = null;

    /**
     * Creates new form MainMenu
     */
    private MainMenu()
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Main Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static MainMenu getInstance()
    {
        if (instance == null)
        {
            instance = new MainMenu();
        }
        return instance;
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

        btnRegisterMember = new javax.swing.JButton();
        btnBookCourt = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnRegisterMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnRegisterMember.setText("Registrer som medlem");
        btnRegisterMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegisterMemberActionPerformed(evt);
            }
        });

        btnBookCourt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnBookCourt.setText("Book en bane");
        btnBookCourt.setPreferredSize(new java.awt.Dimension(233, 33));
        btnBookCourt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBookCourtActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/tiebreak.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnRegisterMember)
                .addGap(114, 114, 114)
                .addComponent(btnBookCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterMemberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegisterMemberActionPerformed
    {//GEN-HEADEREND:event_btnRegisterMemberActionPerformed
        Registration.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterMemberActionPerformed

    private void btnBookCourtActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBookCourtActionPerformed
    {//GEN-HEADEREND:event_btnBookCourtActionPerformed
        CourtBooking.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBookCourtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        /*
         * Get system look and feel
         */
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            //Do nothing
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookCourt;
    private javax.swing.JButton btnRegisterMember;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
