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
}
