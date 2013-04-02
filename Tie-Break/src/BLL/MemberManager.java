/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;

/**
 *
 * @author Chris, Lasse, Rasmus, Dennis
 */
public class MemberManager
{
    private Member member;
    private static MemberManager instance = null;

    private MemberManager()
    {
        
    }

    public static MemberManager getInstance()
    {
        if (instance == null)
        {
            instance = new MemberManager();
        }
        return instance;
    }

    public void getID()
    {
        member.getId();
    }
    
    public void getName()
    {
        String name =  member.getFirstName() + " " + member.getLastName();
    }
    
    public void setFirstName(String firstName)
    {
        member.setFirstName(firstName);
    }
    
    public void setLastName(String lastName)
    {
        member.setLastName(lastName);
    }
}
