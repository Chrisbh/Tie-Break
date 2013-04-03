/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.util.GregorianCalendar;

/**
 *
 * @author ZavezX
 */
public class Reservation
{
    private int id;
    private int courtId;
    private int memberId;
    private GregorianCalendar reservationTime;
    private boolean isReserved;
    
    public Reservation(int id, int courtId, int memberId, GregorianCalendar reservationTime, boolean isReserved)
    {
        this.id = id;
        this.courtId = courtId;
        this.memberId = memberId;
        this.reservationTime = reservationTime;
        this.isReserved = isReserved;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the courtId
     */
    public int getCourtId()
    {
        return courtId;
    }

    /**
     * @param courtId the courtId to set
     */
    public void setCourtId(int courtId)
    {
        this.courtId = courtId;
    }

    /**
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    /**
     * @return the reservationTime
     */
    public GregorianCalendar getReservationTime()
    {
        return reservationTime;
    }

    /**
     * @param reservationTime the reservationTime to set
     */
    public void setReservationTime(GregorianCalendar reservationTime)
    {
        this.reservationTime = reservationTime;
    }

    /**
     * @return the isReserved
     */
    public boolean isIsReserved()
    {
        return isReserved;
    }

    /**
     * @param isReserved the isReserved to set
     */
    public void setIsReserved(boolean isReserved)
    {
        this.isReserved = isReserved;
    }
}
