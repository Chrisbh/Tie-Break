/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Court;
import BE.Reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

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

    public ArrayList<Court> getCourtsName() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT CourtName FROM Courts");

            ArrayList courts = new ArrayList<>();
            while (rs.next())
            {
                String CourtName = rs.getString("CourtName");


                courts.add(CourtName);
            }
            return courts;
        }
    }

    public int getIdByName(String name) throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            String sql = ("SELECT Id FROM Courts WHERE CourtName = ?");
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
    
    public ArrayList<Reservation> getReservations() throws SQLException
    {
        try (Connection con = ds.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT CourtID, ReservationDate FROM Reservation");

            ArrayList reservations = new ArrayList<>();
            while (rs.next())
            {
                int CourtID = rs.getInt("CourtID");
                Timestamp ReservationDate = rs.getTimestamp("ReservationDate");


                reservations.add(CourtID);
                reservations.add(ReservationDate);
            }
            return reservations;
        }
    }
}