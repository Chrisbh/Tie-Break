package GUI;

import javax.swing.UIManager;

public class Administration extends javax.swing.JFrame
{
    private static Administration instance = null;

    /**
     * Constructor of administration
     */
    private Administration()
    {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Administration");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Conversion of administration using a singleton pattern
     * @return An instance of the Administration class
     */
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
        btnSummerFee = new javax.swing.JButton();
        btnWinterFee = new javax.swing.JButton();
        btnFees = new javax.swing.JButton();

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
        btnMainMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMainMenuActionPerformed(evt);
            }
        });

        btnSummerFee.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSummerFee.setText("Sommer kontingent");
        btnSummerFee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSummerFeeActionPerformed(evt);
            }
        });

        btnWinterFee.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnWinterFee.setText("Vinter kontingent");
        btnWinterFee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnWinterFeeActionPerformed(evt);
            }
        });

        btnFees.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnFees.setText("Kontingent");
        btnFees.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSummerFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegisterMember, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(btnWinterFee))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFees))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDeleteMember, btnFees, btnMainMenu, btnRegisterMember, btnSummerFee, btnUpdateMember, btnWinterFee});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterMember)
                    .addComponent(btnUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSummerFee)
                    .addComponent(btnDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnWinterFee)
                    .addComponent(btnFees))
                .addGap(18, 18, 18)
                .addComponent(btnMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeleteMember, btnFees, btnMainMenu, btnRegisterMember, btnSummerFee, btnUpdateMember, btnWinterFee});

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
        AllMembers.getInstance().allMembers();
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnSummerFeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSummerFeeActionPerformed
    {//GEN-HEADEREND:event_btnSummerFeeActionPerformed
        SummerFee.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSummerFeeActionPerformed

    private void btnWinterFeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnWinterFeeActionPerformed
    {//GEN-HEADEREND:event_btnWinterFeeActionPerformed
        WinterFee.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWinterFeeActionPerformed

    private void btnFeesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFeesActionPerformed
    {//GEN-HEADEREND:event_btnFeesActionPerformed
        Fee.getInstance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFeesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /*
         * Set system look and feel
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
    private javax.swing.JButton btnFees;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnRegisterMember;
    private javax.swing.JButton btnSummerFee;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnWinterFee;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
