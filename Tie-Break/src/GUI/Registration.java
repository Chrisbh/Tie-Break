/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Member;
import BLL.MemberManager;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Chris
 */
public class Registration extends javax.swing.JFrame
{

    private String name;
    private MemberManager mManager;
    private boolean zipCancelled = false;
    private boolean phoneCancelled = false;
    private boolean bdCancelled = false;
    private boolean cprCancelled = false;

    /**
     * Creates new form Registration
     */
    public Registration()
    {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mManager = MemberManager.getInstance();
        setTitle("Registrering af medlem");
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

        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblZipCodeCity = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCPR = new javax.swing.JLabel();
        txtBirthDay = new javax.swing.JTextField();
        txtCPR = new javax.swing.JTextField();
        lblCPRStreg = new javax.swing.JLabel();
        lblPostNrByAdskiller = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Navn");

        lblAddress.setText("Adresse");

        lblZipCodeCity.setText("Postnr/By");

        lblEmail.setText("Email");

        lblPhoneNumber.setText("Telefonnr");

        txtLastName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtLastNameActionPerformed(evt);
            }
        });

        btnAdd.setText("Tilføj");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnCancel.setText("Annuller");
        btnCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelActionPerformed(evt);
            }
        });

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Tilføjelse af nyt medlem");

        lblCPR.setText("CPR");

        lblCPRStreg.setText("-");

        lblPostNrByAdskiller.setText("/");

        txtFirstName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtFirstNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addGap(10, 10, 10))
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblAddress)
                    .addComponent(lblZipCodeCity)
                    .addComponent(lblEmail)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblCPR))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPhoneNumber)
                    .addComponent(txtEmail)
                    .addComponent(txtAddress)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblPostNrByAdskiller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPRStreg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCodeCity)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostNrByAdskiller))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPR)
                    .addComponent(txtBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPRStreg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtFirstNameActionPerformed
    {//GEN-HEADEREND:event_txtFirstNameActionPerformed
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtLastNameActionPerformed
    {//GEN-HEADEREND:event_txtLastNameActionPerformed
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        addMember();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    @SuppressWarnings("empty-statement")
    public void addMember()
    {

        if (txtFirstName.getText().length() != 0 && txtLastName.getText().length() != 0
                && txtAddress.getText().length() != 0 && txtCity.getText().length() != 0
                && txtEmail.getText().length() != 0 && txtBirthDay.getText().length() != 0
                && txtCPR.getText().length() != 0)
        {
            Scanner zipCodeSc = new Scanner(txtZipCode.getText());
            Scanner phoneSc = new Scanner(txtPhoneNumber.getText());

            checkInt(zipCodeSc, phoneSc);

            if (!zipCancelled)
            {
                zipCodeSc = new Scanner(txtZipCode.getText());
                int lengthZip = String.valueOf(zipCodeSc.nextInt()).length();
                while (lengthZip != 4)
                {
                    String correctedZipCode = JOptionPane.showInputDialog(null, "Postnummer skal være på 4 cifre, intast det rigtige!");
                    if (correctedZipCode == null)
                    {
                        zipCancelled = true;
                        break;
                    }
                    txtZipCode.setText(correctedZipCode);

                    zipCodeSc = new Scanner(txtZipCode.getText());
                    checkInt(zipCodeSc, phoneSc);
                    zipCodeSc = new Scanner(txtZipCode.getText());
                    lengthZip = String.valueOf(zipCodeSc.nextInt()).length();
                }
            }

            if (!phoneCancelled)
            {
                checkInt(zipCodeSc, phoneSc);
                phoneSc = new Scanner(txtPhoneNumber.getText());
                int lengthPhone = String.valueOf(phoneSc.nextInt()).length();

                while (lengthPhone != 8)
                {
                    String correctedPhone = JOptionPane.showInputDialog(null, "TelefonNummer skal være på 8 cifre, intast det rigtige!");
                    if (correctedPhone == null)
                    {
                        phoneCancelled = true;
                        break;
                    }
                    txtPhoneNumber.setText(correctedPhone);

                    phoneSc = new Scanner(txtPhoneNumber.getText());
                    checkInt(zipCodeSc, phoneSc);
                    phoneSc = new Scanner(txtPhoneNumber.getText());
                    lengthPhone = String.valueOf(phoneSc.nextInt()).length();
                }
            }

            if (!bdCancelled)
            {
                checkInt(zipCodeSc, phoneSc);
                
                while (txtBirthDay.getText().length() != 8)
                {
                    String corredtedBD = JOptionPane.showInputDialog(null, "Der skal være 8 cifre i det første af CPR, intast det rigtige!");
                    if (corredtedBD == null)
                    {
                        bdCancelled = true;
                        break;
                    }
                    txtBirthDay.setText(corredtedBD);
                    bdCancelled = false;
                    checkInt(zipCodeSc, phoneSc);
                }
            }

            if (!cprCancelled)
            {
                checkInt(zipCodeSc, phoneSc);
                while (txtCPR.getText().length() != 4)
                {
                    String corredtedCPR = JOptionPane.showInputDialog(null, "Der skal være 4 cifre i det sidste af CPR, intast det rigtige!");
                    if (corredtedCPR == null)
                    {
                        cprCancelled = true;
                        break;
                    }
                    txtCPR.setText(corredtedCPR);
                    cprCancelled = false;
                    checkInt(zipCodeSc, phoneSc);
                }
            }

            if (!zipCancelled && !phoneCancelled && !bdCancelled && !cprCancelled)
            {
                if (JOptionPane.showConfirmDialog(null, "Vil du gemme brugeren?", "Advarsel",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_OPTION)
                {
                    String firstName = txtFirstName.getText();
                    String lastName = txtLastName.getText();
                    String address = txtAddress.getText();
                    int zipCode = Integer.parseInt(txtZipCode.getText());
                    String city = txtCity.getText();
                    String email = txtEmail.getText();
                    int phoneNumber = Integer.parseInt(txtPhoneNumber.getText());
                    String cpr = txtBirthDay.getText() + "-" + txtCPR.getText();
                    Member m = new Member(zipCode, firstName, lastName, address, zipCode, city, email, phoneNumber, cpr);
                    try
                    {
                        mManager.addMember(m);
                    }
                    catch (Exception e)
                    {
                        System.out.println("ERROR - " + e);
                    }

                    dispose();
                }
            }
            else
            {
                zipCancelled = false;
                phoneCancelled = false;
                bdCancelled = false;
                cprCancelled = false;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Alle felter skal udfyldes!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void checkInt(Scanner zipCodeSc, Scanner phoneSc)
    {
        zipCodeSc = new Scanner(txtZipCode.getText());
        while (!zipCodeSc.hasNextInt())
        {
            String correctedZipCode = JOptionPane.showInputDialog(null, "Postnummer skal være et nummer, intast det rigtige!");
            if (correctedZipCode == null)
            {
                zipCancelled = true;
                break;
            }
            txtZipCode.setText(correctedZipCode);

            zipCodeSc = new Scanner(txtZipCode.getText());
            zipCancelled = false;
        }

        phoneSc = new Scanner(txtPhoneNumber.getText());
        while (!phoneSc.hasNextInt())
        {
            String correctedPhone = JOptionPane.showInputDialog(null, "TelefonNummer skal være et nummer, intast det rigtige!");
            if (correctedPhone == null)
            {
                phoneCancelled = true;
                break;
            }
            txtPhoneNumber.setText(correctedPhone);

            phoneSc = new Scanner(txtPhoneNumber.getText());
            phoneCancelled = false;
        }
        
        Scanner bdSc = new Scanner(txtBirthDay.getText());
        while(!bdSc.hasNextInt())
        {
            String correctedBD = JOptionPane.showInputDialog(null, "Det første af CPR skal være et nummer, intast det rigtige!");
            if (correctedBD == null)
            {
                bdCancelled = true;
                break;
            }
            txtBirthDay.setText(correctedBD);
            
            bdSc = new Scanner(txtBirthDay.getText());
            bdCancelled = false;
        }
        
        Scanner cprSc = new Scanner(txtCPR.getText());
        while(!cprSc.hasNextInt())
        {
            String correctedCPR = JOptionPane.showInputDialog(null, "Det sidste af CPR skal være et nummer, intast det rigtige!");
            if (correctedCPR == null)
            {
                cprCancelled = true;
                break;
            }
            txtCPR.setText(correctedCPR);
            
            cprSc = new Scanner(txtBirthDay.getText());
            cprCancelled = false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            //Do nothing
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCPR;
    private javax.swing.JLabel lblCPRStreg;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPostNrByAdskiller;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCodeCity;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthDay;
    private javax.swing.JTextField txtCPR;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
