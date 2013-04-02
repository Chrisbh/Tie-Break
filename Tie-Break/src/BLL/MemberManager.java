/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;
import DAL.MembersDBManager;

/**
 *
 * @author Chris, Lasse, Rasmus, Dennis
 */
public class MemberManager
{

    private MembersDBManager db = null;
    private static MemberManager instance = null;

    private MemberManager()
    {
        try
        {
            db = new MembersDBManager();
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getLocalizedMessage());
        }
    }

    public static MemberManager getInstance()
    {
        if (instance == null)
        {
            instance = new MemberManager();
        }
        return instance;
    }

    public Member addMember(Member m)
    {
        try
        {
            return db.addMember(m);
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getLocalizedMessage());
        }
        return null;
    }
}
