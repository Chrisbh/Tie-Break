/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Member;
import DAL.MembersDBManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chris, Lasse, Rasmus, Dennis
 */
public class MemberManager
{

    private MembersDBManager db = null;
    private static MemberManager instance = null;
    private int memberID;

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

    public Member addMember(Member m) throws Exception
    {
        return db.addMember(m);
    }
    
    public void updateMember (Member m) throws SQLException
    {
        db.updateMember(m);
    }
    
    public void deleteMember (int id) throws SQLException
    {
        db.deleteMember(id);
    }

    public ArrayList getIds() throws SQLException
    {
        return db.getIds();
    }
    
    public ArrayList getByName() throws SQLException
    {
        return db.getByName();
    }
    
    public ArrayList getAllMembers() throws SQLException
    {
        return db.getAllMembers();
    }
    
    public Member getMemberByID(int id) throws SQLException
    {
        return db.getMemberByID(id);
    }
    
    public boolean checkUserNameAndPassword(int ID, String Password) throws Exception
    {
        return db.checkUserNameAndPassword(ID, Password);
    }
    
    public void setLoggedIn(int memberID)
    {
        this.memberID = memberID;
    }
    
    public int getLoggedIn()
    {
        return this.memberID;
    }
}
