/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Rasmus
 */
public class MembersDBManager extends TieBreakDBManager
{

    public MembersDBManager() throws Exception
    {
        super();
    }

    public Member addMember(Member m) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {

            String sql = "INSERT INTO Members VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getFirstName());
            ps.setString(2, m.getLastName());
            ps.setString(3, m.getAddress());
            ps.setInt(4, m.getZipCode());
            ps.setString(5, m.getCity());
            ps.setString(6, m.getEmail());
            ps.setInt(7, m.getPhoneNumber());
            ps.setTimestamp(8, new java.sql.Timestamp(m.getBday().getTimeInMillis()));
            ps.setString(9, m.getPassword());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Kunne ikke oprette medlem");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int id = keys.getInt(1);
            return new Member(id, m);
        }
    }

    public void updateMember(Member m) throws SQLException
    {
        String sql = "UPDATE Members SET FirstName = ?, LastName = ?, Address = ?, ZipCode = ?, City = ?, Email = ?, Phone = ? WHERE ID = ?";
        Connection con = ds.getConnection();


        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, m.getFirstName());
        ps.setString(2, m.getLastName());
        ps.setString(3, m.getAddress());
        ps.setInt(4, m.getZipCode());
        ps.setString(5, m.getCity());
        ps.setString(6, m.getEmail());
        ps.setInt(7, m.getPhoneNumber());
        ps.setInt(8, m.getId());

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Kunne ikke opdatere medlem");
        }

    }

    public void deleteMember(int id) throws SQLException
    {
        String sql = "DELETE FROM RESERVATION WHERE MemberID = ?";
        String sql1 = "DELETE FROM Members WHERE ID = ?";
        Connection con = ds.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        PreparedStatement ps1 = con.prepareStatement(sql1);
        ps.setInt(1, id);
        ps1.setInt(1, id);

        int affectedRows = ps.executeUpdate();
        int affectedRows1 = ps1.executeUpdate();
    }

    public ArrayList getIds() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID FROM Members");

            ArrayList members = new ArrayList<>();
            while (rs.next())
            {
                int id = rs.getInt("Id");

                members.add(id);
            }
            return members;
        }
    }

    public ArrayList getByName() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID, FirstName, LastName FROM Members");

            ArrayList memberNames = new ArrayList();
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String memberName = rs.getString("FirstName") + " " + rs.getString("LastName");

                memberNames.add(id);
                memberNames.add(memberName);
            }
            return memberNames;
        }
    }

    public ArrayList getAllMembers() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Members");

            ArrayList<Member> members = new ArrayList<>();
            while (rs.next())
            {
                int id = rs.getInt("ID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                int zipCode = rs.getInt("ZipCode");
                String city = rs.getString("City");
                String email = rs.getString("Email");
                int phoneNumber = rs.getInt("Phone");
                Timestamp bday = rs.getTimestamp("Bday");
                Calendar time = new GregorianCalendar();
                time.setTime(bday);
                String password = rs.getString("Password");

                Member m = new Member(id, firstName, lastName, address, zipCode, city, email, phoneNumber, time, password);


                members.add(m);
            }
            return members;
        }
    }

    public Member getMemberByID(int id) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM Members WHERE ID = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                int zipCode = rs.getInt("ZipCode");
                String city = rs.getString("City");
                String email = rs.getString("Email");
                int phoneNumber = rs.getInt("Phone");
                Timestamp bday = rs.getTimestamp("Bday");
                Calendar time = new GregorianCalendar();
                time.setTime(bday);
                String password = rs.getString("Password");

                Member m = new Member(id, firstName, lastName, address, zipCode, city, email, phoneNumber, time, password);

                return m;
            }
        }
        return null;
    }

    public boolean checkUserNameAndPassword(int ID, String Password) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "SELECT ID, Password FROM Members WHERE ID = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.setString(2, Password);

            ResultSet rs = ps.executeQuery();
            return (rs.next());

        }


    }

}
