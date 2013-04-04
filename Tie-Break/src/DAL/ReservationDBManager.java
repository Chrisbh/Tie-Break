/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ZavezX
 */
public class ReservationDBManager extends TieBreakDBManager
{

    /**
     *
     * @throws Exception
     */
    public ReservationDBManager() throws Exception
    {
        super();
    }
    
    /**
     *
     * @param c
     * @return
     * @throws SQLException
     */
    public Reservation reserveCourt(Reservation r) throws SQLException
    {
         try (Connection con = ds.getConnection())
        {
            
            
            
            String sql = "INSERT INTO Reservation VALUES(?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            //ps.setInt(1, r.getId());
            ps.setInt(1, r.getCourtId());
            ps.setInt(2, r.getMemberId());
            ps.setTimestamp(3, new java.sql.Timestamp(r.getReservationTime().getTimeInMillis()));
            ps.setBoolean(4, r.isIsReserved());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to book court.");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int id = keys.getInt(1);
            return new Reservation(id, r);
        }
    }
}
