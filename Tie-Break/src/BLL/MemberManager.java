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

    public Member addMember(Member m)
    {
        return m;
    }
}
