/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Rasmus
 */
public class LoginCheckDBManager
{

    private SQLServerDataSource ds;

    public LoginCheckDBManager() throws Exception
    {
        Properties props = new Properties();
        props.load(new FileReader("TieBreak.cfg"));

        ds = new SQLServerDataSource();

        ds.setServerName(props.getProperty("SERVER"));
        ds.setPortNumber(Integer.parseInt(props.getProperty("PORT")));
        ds.setDatabaseName(props.getProperty("DATABASE"));
        ds.setUser(props.getProperty("USER"));
        ds.setPassword(props.getProperty("PASSWORD"));
    }

    public boolean checkUserNameAndPassword(int MemberID, String Password) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            String sql = "SELECT * FROM Login WHERE MemberID = ? AND Password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, MemberID);
            System.out.println(MemberID);
            ps.setString(2, Password);
            System.out.println(Password);

            ResultSet rs = ps.executeQuery();
            return (rs.next());
            
        }


    }
}
