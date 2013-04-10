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
import java.util.ArrayList;

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

            String sql = "INSERT INTO Members VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getFirstName());
            ps.setString(2, m.getLastName());
            ps.setString(3, m.getAddress());
            ps.setInt(4, m.getZipCode());
            ps.setString(5, m.getCity());
            ps.setString(6, m.getEmail());
            ps.setInt(7, m.getPhoneNumber());
            ps.setString(8, m.getCpr());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to add Member");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int id = keys.getInt(1);
            return new Member(id, m, m.getCpr());
        }
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
                int phoneNumber = rs.getInt("PhoneNumber");
                String cpr = rs.getString("Cpr");
                
                Member m = new Member(id, firstName, lastName, address, zipCode, city, email, phoneNumber, cpr);

                
                members.add(m);
            }
            return members;
        }
    }
}
