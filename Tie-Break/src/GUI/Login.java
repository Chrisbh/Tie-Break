package GUI;

import BLL.MemberManager;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame
{
    private static Login instance = null;
    private MemberManager mManager;
    private boolean MemberNrCancelled = false;

    /**
     * Constructor for the login class  
     */
    public Login()
    {
        initComponents();
        mManager = MemberManager.getInstance();
        setLocationRelativeTo(null);
        setTitle("Log ind");
        getRootPane().setDefaultButton(btnLogIn);
    }

    /**
     * Conversion of the login class to a singleton
     * @return An instance of the login class
     */
    public static Login getInstance()
    {
        if (instance == null)
        {
            instance = new Login();
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

        lblMemberNr = new javax.swing.JLabel();
        txtMemberNr = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMemberNr.setText("Medlemsnummer:");

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
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMemberNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMemberNr, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(106, 106, 106))
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
                .addGap(13, 13, 13)
                .addComponent(btnLogIn)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogInActionPerformed
    {//GEN-HEADEREND:event_btnLogInActionPerformed
        LoginCheck();
        txtMemberNr.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLogInActionPerformed

    /**
     * Checks whether the entered username and password matches with a user in the database
     */
    public void LoginCheck()
    {
        if (txtMemberNr.getText().length() != 0 && txtPassword.getText().length() != 0)
        {
            Scanner MemberNrSC = new Scanner(txtMemberNr.getText());
            checkInt(MemberNrSC);
            int MemberID = new Scanner(txtMemberNr.getText()).nextInt();
            String Password = new Scanner(txtPassword.getText()).nextLine();

            if (!MemberNrCancelled)
            {
                MemberNrSC = new Scanner(txtMemberNr.getText());
                int lengthMember = String.valueOf(MemberNrSC.nextInt()).length();
                while (lengthMember < 1)
                {
                    String correctedMemberNr = JOptionPane.showInputDialog(null, "Medlemsnummer skal være tal og minimum ét tal");
                    if (correctedMemberNr == null)
                    {
                        MemberNrCancelled = true;
                        break;
                    }
                    txtMemberNr.setText(correctedMemberNr);

                    MemberNrSC = new Scanner(txtMemberNr.getText());
                    checkInt(MemberNrSC);
                    MemberNrSC = new Scanner(txtMemberNr.getText());
                    lengthMember = String.valueOf(MemberNrSC.nextInt()).length();
                }
            }
            else
            {
                MemberNrCancelled = false;
            }
            try
            {
                if (mManager.checkUserNameAndPassword(MemberID, Password) == true)
                {
                    MainMenu.getInstance().setVisible(true);
                    this.setVisible(false);
                    MemberManager.getInstance().setLoggedIn(MemberID);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Indtastede medlemdsoplysninger er forkerte, prøv igen!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (Exception ex)
            {
                System.out.println("ERROR" + ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Alle felter skal udfyldes!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * Checks if the entered username is a number as it is required
     * @param MemberNrSC A scanner containing the entered number
     */
    public void checkInt(Scanner MemberNrSC)
    {
        MemberNrSC = new Scanner(txtMemberNr.getText());
        while (!MemberNrSC.hasNextInt())
        {
            String correctedMemberNr = JOptionPane.showInputDialog(null, "Medlemsnummer skal være et nummer, indtast det rigtige");
            if (correctedMemberNr == null)
            {
                MemberNrCancelled = true;
                break;
            }
            txtMemberNr.setText(correctedMemberNr);

            MemberNrSC = new Scanner(txtMemberNr.getText());
            MemberNrCancelled = false;
        }
    }
    
    /**
     * @param args the command line arguments
     * @throws Exception  
     */
    public static void main(String args[]) throws Exception
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
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
