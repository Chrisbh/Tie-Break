/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            String sql = "INSERT INTO Member(Cpr, Name, Address, ZipCode, City, Email, Phone)" + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, m.);
        }
        
        
        
    }
    
    
}
