/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Reservation;
import DAL.ReservationDBManager;

/**
 *
 * @author Rasmus
 */
public class BookingManager
{
    
    private ReservationDBManager db = null;
    private static BookingManager instance = null;
    
    private BookingManager()
    {
        try
        {
            db = new ReservationDBManager();
            
        }
        catch (Exception e)
        {
            System.out.println("ERROR -"+ e.getLocalizedMessage());
        }
    }
    
    public static BookingManager getInstance()
    {
        if(instance == null)
        {
            instance = new BookingManager();
        }
        return instance;
    }
    
    public Reservation reserveCourt(Reservation r) throws Exception
    {
        return db.reserveCourt(r);
    }
    
}
