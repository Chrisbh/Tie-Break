/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoginCheckDBManager;

/**
 *
 * @author Rasmus
 */
public class LoginCheckManager
{

    private LoginCheckDBManager db = null;
    private static LoginCheckManager instance = null;

    private LoginCheckManager()
    {
        try
        {
            db = new LoginCheckDBManager();
        }
        catch (Exception e)
        {
            System.out.println("ERROR - " + e.getLocalizedMessage());
        }
    }

    public static LoginCheckManager getInstance()
    {
        if (instance == null)
        {
            instance = new LoginCheckManager();
        }
        return instance;
    }

    public boolean checkUserNameAndPassword(int MemberID, String Password) throws Exception
    {
        return checkUserNameAndPassword(MemberID, Password);
    }
}
