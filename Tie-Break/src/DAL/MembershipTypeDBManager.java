/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.MembershipType;
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
public class MembershipTypeDBManager extends TieBreakDBManager
{

    public MembershipTypeDBManager() throws Exception
    {
        super();
    }

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
            throw new SQLException("Kunne ikke opdatere medlem");
        }
    }

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
}