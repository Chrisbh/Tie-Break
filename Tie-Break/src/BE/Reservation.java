/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.util.Calendar;

/**
 *
 * @author ZavezX
 */
public class Reservation
{

    private int id;
    private int courtId;
    private int memberId;
    private Calendar reservationTime;


    public Reservation(int id, int courtId, int memberId, Calendar reservationTime)
    {
        this.id = id;
        this.courtId = courtId;
        this.memberId = memberId;
        this.reservationTime = reservationTime;

    }

    public Reservation(int courtId, int memberId, Calendar reservationTime)
    {
        this(-1, courtId, memberId, reservationTime);
    }

    public Reservation(int id, Reservation r)
    {
        this(id, r.courtId, r.memberId, r.reservationTime);
    }
    
    public Reservation(int courtId, Calendar reservationTime)
    {
        this(-1, courtId, -1, reservationTime);
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
    public Calendar getReservationTime()
    {
        return reservationTime;
    }

    /**
     * @param reservationTime the reservationTime to set
     */
    public void setReservationTime(Calendar reservationTime)
    {
        this.reservationTime = reservationTime;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (! (obj instanceof Reservation)) return false;
        Reservation r = (Reservation) obj;
        return this.reservationTime.equals(r.reservationTime) && this.courtId == r.courtId;
    }
}
