package BLL;

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

    /**
     * Conversion of booking manager using a singleton pattern
     * @return An instance of the BookingManger class
     */
    public static BookingManager getInstance()
    {
        if (instance == null)
        {
            instance = new BookingManager();
        }
        return instance;
    }

    /**
     * Connects the database to the gui allowing a reservation to be send between them
     * @param r a reservation of a court
     * @return a reservation
     * @throws Exception
     */
    public Reservation reserveCourt(Reservation r) throws Exception
    {
        return db.reserveCourt(r);
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve a list of all the court names
     * @return an ArrayList with all court names
     * @throws SQLException
     */
    public ArrayList<String> getCourtsName() throws SQLException
    {
        return db.getCourtsName();
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve the id of a court using the court name
     * @param name the name used to get the ID
     * @return a reservation ID
     * @throws SQLException
     */
    public int getIdByName(String name) throws SQLException
    {
        return db.getIdByName(name);
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve the id of a court using the court name
     * @param id the ID used to get the name
     * @return a reservation name
     * @throws SQLException
     */
    public String getNameById(int id) throws SQLException
    {
        return db.getNameById(id);
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve all reservations currently made
     * @return an Arraylist with all reservations
     * @throws SQLException
     */
    public ArrayList<Reservation> getReservations() throws SQLException
    {
        return db.getReservations();
    }
}
