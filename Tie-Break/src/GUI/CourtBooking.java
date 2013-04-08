/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BE.Reservation;
import BLL.BookingManager;
import BLL.MemberManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane; 
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Dennis
 */
public class CourtBooking extends javax.swing.JFrame
{

    /**
     * Creates new form CourtBooking
     */
    public CourtBooking()
    {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Banebooking");

        try
        {
            DefaultListModel modelB = new DefaultListModel();
            ArrayList alB = new ArrayList(BookingManager.getInstance().getCourtsName());

            for (Object i : alB)
            {
                modelB.addElement(i.toString());
            }
            splCourt.setModel(modelB);
            System.out.println(alB);

        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getMessage());
        }

        splMonth.addListSelectionListener(
                new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent lse)
            {
                if (!(lse.getValueIsAdjusting() || splMonth.isSelectionEmpty()))
                {
                    dayList();
                }

            }
        });
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

        lblHeader = new javax.swing.JLabel();
        cmbxTime = new javax.swing.JComboBox();
        lblTime = new javax.swing.JLabel();
        btnAddBooking = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        spMonth = new javax.swing.JScrollPane();
        splMonth = new javax.swing.JList();
        lblMonth = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spDay = new javax.swing.JScrollPane();
        splDay = new javax.swing.JList();
        spCourt = new javax.swing.JScrollPane();
        splCourt = new javax.swing.JList();
        lblCourt = new javax.swing.JLabel();
        txtMemberId = new javax.swing.JTextField();
        lblMemberId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Bookning af Baner");

        cmbxTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21" }));
        cmbxTime.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbxTimeActionPerformed(evt);
            }
        });

        lblTime.setText("Tidsrum");

        btnAddBooking.setText("Tilføj booking");
        btnAddBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddBookingActionPerformed(evt);
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

        splMonth.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spMonth.setViewportView(splMonth);

        lblMonth.setText("Måned");

        jLabel1.setText("Dag");

        spDay.setViewportView(splDay);

        spCourt.setViewportView(splCourt);

        lblCourt.setText("Bane");

        txtMemberId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtMemberIdActionPerformed(evt);
            }
        });

        lblMemberId.setText("Medlemsnummer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMonth)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(spDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCourt)
                    .addComponent(spCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddBooking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime)
                            .addComponent(cmbxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMemberId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMemberId))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(lblMonth)
                    .addComponent(jLabel1)
                    .addComponent(lblCourt)
                    .addComponent(lblMemberId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemberId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddBooking)
                            .addComponent(btnCancel)))
                    .addComponent(spMonth)
                    .addComponent(spCourt)
                    .addComponent(spDay)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxTimeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbxTimeActionPerformed
    {//GEN-HEADEREND:event_cmbxTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTimeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddBookingActionPerformed
    {//GEN-HEADEREND:event_btnAddBookingActionPerformed
        addBooking();
    }//GEN-LAST:event_btnAddBookingActionPerformed

    private void txtMemberIdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtMemberIdActionPerformed
    {//GEN-HEADEREND:event_txtMemberIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIdActionPerformed

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
                new CourtBooking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBooking;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox cmbxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCourt;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblTime;
    private javax.swing.JScrollPane spCourt;
    private javax.swing.JScrollPane spDay;
    private javax.swing.JScrollPane spMonth;
    private javax.swing.JList splCourt;
    private javax.swing.JList splDay;
    private javax.swing.JList splMonth;
    private javax.swing.JTextField txtMemberId;
    // End of variables declaration//GEN-END:variables

    private void dayList()
    {
        int month = new Scanner(splMonth.getSelectedValue().toString()).nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            DefaultListModel model = new DefaultListModel();
            for (int i = 1; i <= 31; i++)
            {
                model.addElement(i);
            }
            splDay.setModel(model);
        }

        if (month == 2)
        {
            DefaultListModel model = new DefaultListModel();
            for (int i = 1; i <= 28; i++)
            {
                model.addElement(i);
            }
            splDay.setModel(model);
        }

        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            DefaultListModel model = new DefaultListModel();
            for (int i = 1; i <= 30; i++)
            {
                model.addElement(i);
            }
            splDay.setModel(model);
        }

    }

    private void addBooking()
    {



        if (splMonth.getSelectedValue() != null && splDay.getSelectedValue() != null && splCourt.getSelectedValue() != null && txtMemberId.getText().length() != 0)
        {
            Calendar booking = new GregorianCalendar();

            int year = Calendar.getInstance().get(Calendar.YEAR);
            int month = new Scanner(splMonth.getSelectedValue().toString()).nextInt() - 1;
            int date = new Scanner(splDay.getSelectedValue().toString()).nextInt();
            int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
            int currentDate = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            int currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int time = Integer.parseInt(cmbxTime.getSelectedItem().toString());
            booking.set(year, month, date, time, 0, 0);

            // Makes the year go to the next year, if the date and time chosen is before the current date and time.
            if (month < currentMonth || (month == currentMonth && date < currentDate) || (month == currentMonth && date == currentDate && time < currentTime))
            {
                booking.add(Calendar.YEAR, +1);
            }

            try
            {
                Scanner sc = new Scanner(txtMemberId.getText());

                if (sc.hasNextInt())
                {
                    ArrayList ids = MemberManager.getInstance().getIds();
                    int memberId = new Scanner(txtMemberId.getText()).nextInt();

                    if (ids.contains(memberId))
                    {
                        String court = splCourt.getSelectedValue().toString();

                        if (JOptionPane.showConfirmDialog(null, "Den valgte dato: " + booking.getTime() + ". Vil du bestille denne tid?", "Reservation",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                                == JOptionPane.YES_OPTION)
                        {

                            int courtId = BookingManager.getInstance().getIdByName(court);
                            

                            Reservation r = new Reservation(courtId, memberId, booking);
                            BookingManager.getInstance().reserveCourt(r);

                            booking.clear();
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Medlemsnummer eksisterer ikke!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Medlemsnummer skal være et tal!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (Exception e)
            {
                System.out.println("ERROR - " + e);
            }



        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dato, bane eller medlem ikke valgt!", "Advarsel", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
