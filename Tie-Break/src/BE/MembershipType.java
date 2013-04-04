/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author ZavezX
 */
public class MembershipType
{
    private int id;
    private String membershipName;
    
    public MembershipType(int id, String membershipName)
    {
        this.id = id;
        this.membershipName = membershipName;
    }
    
    public MembershipType(String membershipName)
    {
        this(-1, membershipName);
    }
    
    public MembershipType(int id, MembershipType mt)
    {
        this(mt.membershipName);
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the membershipName
     */
    public String getMembershipName()
    {
        return membershipName;
    }

    /**
     * @param membershipName the membershipName to set
     */
    public void setMembershipName(String membershipName)
    {
        this.membershipName = membershipName;
    }
    
    
}
