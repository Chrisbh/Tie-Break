/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Reservation;

/**
 *
 * @author Rasmus
 */
public class BookingManager
{
    
    private BookingDBManager db = null;
    private static BookingManager instance = null;
    
    private BookingManager()
    {
        try
        {
            db = new BookingManager();
            
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
    
    public Reservation addBooking(Reservation r) throws Exception
    {
        return db.addBooking(r);
    }
    
}
