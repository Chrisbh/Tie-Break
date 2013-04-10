/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Rasmus
 */
public class LoginCheck
{

    private int MemberID;
    private String Password;

    public LoginCheck(int MemberID, String Password)
    {
        this.MemberID = MemberID;
        this.Password = Password;
        
    }

    /**
     * @return the MemberID
     */
    public int getMemberID()
    {
        return MemberID;
    }

    /**
     * @param MemberID the MemberID to set
     */
    public void setMemberID(int MemberID)
    {
        this.MemberID = MemberID;
    }

    /**
     * @return the Password
     */
    public String getPassword()
    {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password)
    {
        this.Password = Password;
    }
}
