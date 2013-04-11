/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rasmus
 */
public class LoginCheckDBManager extends TieBreakDBManager
{
    public LoginCheckDBManager() throws Exception
    {
        super();
    }
    
    public boolean checkUserNameAndPassword(int MemberID, String Password) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Login WHERE MemberID = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, MemberID);
            ps.setString(2, Password);

            ResultSet rs = ps.executeQuery();
            return (rs.next());
            
        }


    }
}
