/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Member;
import BLL.MemberManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Chris
 */
public class UpdateMember extends javax.swing.JFrame
{

    private String name;
    private MemberManager mManager;
    private boolean zipCancelled = false;
    private boolean phoneCancelled = false;
    private boolean bdCancelled = false;
    private static UpdateMember instance = null;

    /**
     * Creates new form Registration
     */
    private UpdateMember()
    {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        mManager = MemberManager.getInstance();
        setTitle("Opdatering af medlem");
        ShowMember();

        splMemberID.addListSelectionListener(
                new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                if (!(lse.getValueIsAdjusting() || splMemberID.isSelectionEmpty()))
                {
                    insertMemberToList();
                }
            }
        });

    }

    public static UpdateMember getInstance()
    {
        if (instance == null)
        {
            instance = new UpdateMember();
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
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPostNrByAdskiller = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMemberID = new javax.swing.JLabel();
        spMemberID = new javax.swing.JScrollPane();
        splMemberID = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        btnUpdate.setText("Opdater");
        btnUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateActionPerformed(evt);
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
        lblTitle.setText("Opdatering af medlem");

        lblPostNrByAdskiller.setText("/");

        txtFirstName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblMemberID.setText("MedlemsID:");

        spMemberID.setViewportView(splMemberID);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addComponent(lblZipCodeCity)
                            .addComponent(lblEmail)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblMemberID))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMemberID)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addComponent(spMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnUpdate)
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateActionPerformed
    {//GEN-HEADEREND:event_btnUpdateActionPerformed
        addMember();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        clearFields();
        Administration.getInstance().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void ShowMember()
    {

        DefaultListModel memberids = new DefaultListModel();
        memberids.clear();
        try
        {
            ArrayList ids = mManager.getIds();
            for (int i = 0; i < ids.size(); i++)
            {
                String id = ids.get(i).toString();
                ids.get(i).toString();
                memberids.addElement(id);
            }

        }
        catch (SQLException ex)
        {
            System.out.println("error");;
        }
        splMemberID.setModel(memberids);
    }

    public void insertMemberToList()
    {
        String name = (String) splMemberID.getSelectedValue();
        String parts[] = name.split(" : ");
        int id = Integer.parseInt(parts[0]);
        try
        {
            Member m = mManager.getMemberByID(id);
            txtFirstName.setText(m.getFirstName());
            txtLastName.setText(m.getLastName());
            txtAddress.setText(m.getAddress());
            txtZipCode.setText(Integer.toString(m.getZipCode()));
            txtCity.setText(m.getCity());
            txtEmail.setText(m.getEmail());
            txtPhoneNumber.setText(Integer.toString(m.getPhoneNumber()));
        }
        catch (SQLException e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }

    }

    @SuppressWarnings("empty-statement")
    public void addMember()
    {
        if (txtFirstName.getText().length() != 0 && txtLastName.getText().length() != 0
                && txtAddress.getText().length() != 0 && txtCity.getText().length() != 0
                && txtEmail.getText().length() != 0)
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

            if (!zipCancelled && !phoneCancelled && !bdCancelled)
            {
                String name = (String) splMemberID.getSelectedValue();
                String parts[] = name.split(" : ");
                int id = Integer.parseInt(parts[0]);
                if (JOptionPane.showConfirmDialog(null, "Vil du gemme brugeren?", "Advarsel",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_OPTION)
                {
                    try
                    {
                        Member m = mManager.getMemberByID(id);
                        String firstName = txtFirstName.getText();
                        String lastName = txtLastName.getText();
                        String address = txtAddress.getText();
                        int zipCode = Integer.parseInt(txtZipCode.getText());
                        String city = txtCity.getText();
                        String email = txtEmail.getText();
                        int phoneNumber = Integer.parseInt(txtPhoneNumber.getText());
                        Member x = new Member(id, firstName, lastName, address, zipCode, city, email, phoneNumber);
                        try
                        {
                            mManager.updateMember(x);
                            clearFields();
                            dispose();
                        }
                        catch (Exception e)
                        {
                            System.out.println("ERROR - " + e);
                        }
                        Administration.getInstance().setVisible(true);
                    }
                    catch (SQLException ex)
                    {
                        Logger.getLogger(UpdateMember.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                zipCancelled = false;
                phoneCancelled = false;
                bdCancelled = false;

            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Alle felter skal udfyldes!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void clearFields()
    {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        txtZipCode.setText("");
        txtCity.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
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
                new UpdateMember().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMemberID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPostNrByAdskiller;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCodeCity;
    private javax.swing.JScrollPane spMemberID;
    private javax.swing.JList splMemberID;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
