package BLL;

import BE.Court;
import BE.Reservation;
import DAL.ReservationDBManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookingManager
{

    private ReservationDBManager db = null;
    private static BookingManager instance = null;

    /*
     * Constructor for the booking manager class
     */
    private BookingManager()
    {
        try
        {
            db = new ReservationDBManager();

        }
        catch (Exception e)
        {
            System.out.println("ERROR -" + e.getLocalizedMessage());
        }
    }

    /*
     * Conversion of booking manager using a singleton pattern
     */
    public static BookingManager getInstance()
    {
        if (instance == null)
        {
            instance = new BookingManager();
        }
        return instance;
    }

    /*
     * Connects the database to the gui allowing a reservation to be send between them
     */
    public Reservation reserveCourt(Reservation r) throws Exception
    {
        return db.reserveCourt(r);
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve a list of all the court names
     */
    public ArrayList<String> getCourtsName() throws SQLException
    {
        return db.getCourtsName();
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve the id of a court using the court name
     */
    public int getIdByName(String name) throws SQLException
    {
        return db.getIdByName(name);
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve the id of a court using the court name
     */
    public String getNameById(int id) throws SQLException
    {
        return db.getNameById(id);
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve all reservations currently made
     */
    public ArrayList<Reservation> getReservations() throws SQLException
    {
        return db.getReservations();
    }
}
