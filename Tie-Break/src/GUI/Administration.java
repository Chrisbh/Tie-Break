/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.UIManager;

/**
 *
 * @author Chris
 */
public class Administration extends javax.swing.JFrame
{
    private static Administration instance = null;

    /**
     * Creates new form Administration
     */
    private Administration()
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administration");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static Administration getInstance()
    {
        if (instance == null)
        {
            instance = new Administration();
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
        btnUpdateMember = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnDeleteMember = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnRegisterMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnRegisterMember.setText("Registrere medlem");
        btnRegisterMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegisterMemberActionPerformed(evt);
            }
        });

        btnUpdateMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnUpdateMember.setText("Opdatere medlem");
        btnUpdateMember.setPreferredSize(new java.awt.Dimension(233, 33));
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateMemberActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/tiebreak.png"))); // NOI18N

        btnDeleteMember.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnDeleteMember.setText("Slette medlem");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        btnMainMenu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMainMenu.setText("Returner til hovedmenu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btnRegisterMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterMemberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegisterMemberActionPerformed
    {//GEN-HEADEREND:event_btnRegisterMemberActionPerformed
        Registration.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterMemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateMemberActionPerformed
    {//GEN-HEADEREND:event_btnUpdateMemberActionPerformed
        UpdateMember.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteMemberActionPerformed
    {//GEN-HEADEREND:event_btnDeleteMemberActionPerformed
        DeleteMember.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMainMenuActionPerformed
    {//GEN-HEADEREND:event_btnMainMenuActionPerformed
        dispose();
        MainMenu.getInstance().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

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
            @Override
            public void run()
            {
                new Administration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnRegisterMember;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
