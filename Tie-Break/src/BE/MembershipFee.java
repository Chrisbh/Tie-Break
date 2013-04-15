/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author ZavezX
 */
public class MembershipFee
{

    private int id;
    private int memberId;
    private int membershipId;
    private boolean isPaid;

    /*
     * Membershipfee constructor with everything
     */
    public MembershipFee(int id, int memberId, int membershipId, boolean isPaid)
    {
        this.id = id;
        this.memberId = memberId;
        this.membershipId = membershipId;
        this.isPaid = isPaid;
    }
    
    /*
     * Membershipfee without id
     */
    public MembershipFee(int memberId, int membershipId, boolean isPaid)
    {
        this(-1, memberId, membershipId, isPaid);
    }

    /*
     * Membershipfee with id, and a membershipfee object
     */
    public MembershipFee(int id, MembershipFee m)
    {
        this(id, m.memberId, m.membershipId, m.isPaid);
    }

    /**
     * Returns the id of a membershipfee
     * @return the id
     */
    public int getId()
    {
        return id;
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
     * @return the membershipId
     */
    public int getMembershipId()
    {
        return membershipId;
    }

    /**
     * @param membershipId the membershipId to set
     */
    public void setMembershipId(int membershipId)
    {
        this.membershipId = membershipId;
    }

    /**
     * @return the isPaid
     */
    public boolean isIsPaid()
    {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(boolean isPaid)
    {
        this.isPaid = isPaid;
    }
}
