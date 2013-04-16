package DAL;

import BE.Member;
import BE.MembershipFee;
import BE.MembershipType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MembershipTypeDBManager extends TieBreakDBManager
{
    /**
     * Constructor for the membership type db manager
     *
     * @throws Exception
     */
    public MembershipTypeDBManager() throws Exception
    {
        super();
    }

    /**
     * Pulls every membership type name from the database and collects them in
     * an ArrayList
     * @return An ArrayList of the names of all membership types
     * @throws SQLException
     */
    public ArrayList getMTName() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MembershipName FROM MembershipType");

            ArrayList mt = new ArrayList<>();
            while (rs.next())
            {
                String membershipName = rs.getString("MembershipName");


                mt.add(membershipName);
            }
            return mt;
        }
    }

    /**
     * Pulls a membership type from the database using the ID
     *
     * @param id The ID of the membership type
     * @return A membership type object
     * @throws SQLException
     */
    public MembershipType getMemberByID(int id) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM MembershipType WHERE ID = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                String membershipName = rs.getString("MembershipName");
                int Price = rs.getInt("Price");


                MembershipType mt = new MembershipType(id, membershipName, Price);

                return mt;
            }
        }
        return null;
    }

    /**
     * Adds a price to the membership type in the database
     *
     * @param mt Contains membership type ID and the new price
     * @throws SQLException
     */
    public void addPrice(MembershipType mt) throws SQLException
    {
        String sql = "UPDATE MembershipType SET Price = ? WHERE ID = ?";
        Connection con = ds.getConnection();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, mt.getPrice());
        ps.setInt(2, mt.getId());

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Kunne ikke opdatere medlemstype");
        }
    }

    /**
     * Pulls the ID of a membership type using the name
     *
     * @param name The name of the membership type being pulled
     * @return The id of the membership type
     * @throws SQLException
     */
    public int getIdByName(String name) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT Id FROM MembershipType WHERE membershipName = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                int id = rs.getInt("Id");

                return id;
            }
        }
        return 0;
    }

    public MembershipFee invoiceSent(MembershipFee mf) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "INSERT INTO MembershipFee VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mf.getMemberId());
            ps.setInt(2, mf.getTypeId());
            ps.setTimestamp(3, new java.sql.Timestamp(mf.getInvoiceSent().getTimeInMillis()));
            ps.setTimestamp(4, null);

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Kunne ikke tilføje kontingent information!");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            return new MembershipFee(mf.getMemberId(), mf.getTypeId(), mf.getInvoiceSent());
        }
    }
    
    public Calendar getSent(int memberId) throws SQLException
    {
         try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM MembershipFee WHERE MemberId = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, memberId);

            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                Timestamp invoice = rs.getTimestamp("InvoiceSent");
                
                Calendar time = new GregorianCalendar();
                time.set(invoice.getYear() + 1900, invoice.getMonth(), invoice.getDate(), invoice.getHours(), 0, 0);

                return time;
            }
        }
        return null;
    }
    
    public void paymentRecieved (int memberId, Calendar paymentReceived) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "UPDATE MembershipFee SET PaymentReceived = ? WHERE MemberID = ?";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, new java.sql.Timestamp(paymentReceived.getTimeInMillis()));
            ps.setInt(2, memberId);
            
            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Kunne ikke tilføje kontingent information!");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
        }


    }
    
    public Calendar getPaid(int memberId) throws SQLException
    {
         try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM MembershipFee WHERE MemberId = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, memberId);

            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                Timestamp payment = rs.getTimestamp("PaymentReceived");
                
                Calendar time = new GregorianCalendar();
                if(payment != null)
                {
                time.set(payment.getYear() + 1900, payment.getMonth(), payment.getDate(), payment.getHours(), 0, 0);
                }
                else time = null;
               
                return time;
            }
        }
        return null;
    }
}
