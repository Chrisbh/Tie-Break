package BE;

import java.util.Calendar;

public class Reservation
{

    private int id;
    private int courtId;
    private int memberId;
    private Calendar reservationTime;

    /**
     * Constructor for reservation with everything
     * @param id reservation ID
     * @param courtId court ID
     * @param memberId member ID
     * @param reservationTime the time reserved
     */
    public Reservation(int id, int courtId, int memberId, Calendar reservationTime)
    {
        this.id = id;
        this.courtId = courtId;
        this.memberId = memberId;
        this.reservationTime = reservationTime;
    }

    /**
     * Constructor for reservation without id
     * @param courtId court ID
     * @param memberId member ID
     * @param reservationTime the time reserved
     */
    public Reservation(int courtId, int memberId, Calendar reservationTime)
    {
        this(-1, courtId, memberId, reservationTime);
    }

    /**
     * Constructor for reservation with id and a reservation object
     * @param id reservation ID
     * @param r a given reservation object
     */
    public Reservation(int id, Reservation r)
    {
        this(id, r.courtId, r.memberId, r.reservationTime);
    }

    /**
     * Constructor with just the reservation time
     * @param reservationTime the time reserved
     */
    public Reservation(Calendar reservationTime)
    {
        this(-1, -1, -1, reservationTime);
    }

    /**
     * Returns the id of a reservation
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the court ID of a reservation
     * @return the courtId
     */
    public int getCourtId()
    {
        return courtId;
    }

    /**
     * Sets the court of a reservation
     * @param courtId the courtId to set
     */
    public void setCourtId(int courtId)
    {
        this.courtId = courtId;
    }

    /**
     * Returns the member ID of a reservation
     * @return the memberId
     */
    public int getMemberId()
    {
        return memberId;
    }

    /**
     * Sets the member ID of a reservation
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    /**
     * Returns the reservation time of a reservation
     * @return the reservationTime
     */
    public Calendar getReservationTime()
    {
        return reservationTime;
    }

    /**
     * Sets the reservation time of a reservation
     * @param reservationTime the reservationTime to set
     */
    public void setReservationTime(Calendar reservationTime)
    {
        this.reservationTime = reservationTime;
    }

    /*
     * Checks whether a reservation is equal to another reservation by comparing
     * when the reservation is reserved and if it collides with an existing reservation
     */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Reservation))
        {
            return false;
        }
        Reservation r = (Reservation) obj;
        return this.reservationTime.getTime().equals(r.reservationTime.getTime());

    }
}
