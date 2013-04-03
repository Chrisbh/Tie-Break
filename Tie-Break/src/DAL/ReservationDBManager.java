/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Court;
import BE.Reservation;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;

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
        System.out.println((Time) r.getReservationTime().getTime());
         try (Connection con = ds.getConnection())
        {
            
            
            
            String sql = "INSERT INTO Reservation VALUES(?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, r.getId());
            ps.setInt(2, r.getCourtId());
            ps.setInt(3, r.getMemberId());
            ps.setTime(4, (Time) r.getReservationTime().getTime(), r.getReservationTime());
            ps.setBoolean(5, r.isIsReserved());

            int affectedRows = ps.executeUpdate();
            if (affectedRows == 0)
            {
                throw new SQLException("Unable to add Member");
            }
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            int id = keys.getInt(1);
            return null;
        }
    }
}
