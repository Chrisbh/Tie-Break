package BLL;

import BE.Member;
import DAL.MembersDBManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberManager
{

    private MembersDBManager db = null;
    private static MemberManager instance = null;
    private int memberID;

    /*
     * Constructor for the member manager class
     */
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

    /*
     * Conversion of Member manager using a singleton pattern
     */
    public static MemberManager getInstance()
    {
        if (instance == null)
        {
            instance = new MemberManager();
        }
        return instance;
    }

    /*
     * Connects the database to the gui allowing the gui to add a member to the database
     */
    public Member addMember(Member m) throws Exception
    {
        return db.addMember(m);
    }
    
    /*
     * Connects the database to the gui allowing the gui to update a member 
     */
    public void updateMember(Member m) throws SQLException
    {
        db.updateMember(m);
    }

    /*
     * Connects the database to the gui allowing the gui to delete a member
     */
    public void deleteMember(int id) throws SQLException
    {
        db.deleteMember(id);
    }

    /*
     * Connects the database to the gui allowing the gui to 
     */
    public ArrayList getIds() throws SQLException
    {
        return db.getIds();
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve a list of all names of the members in the club
     */
    public ArrayList getByName() throws SQLException
    {
        return db.getByName();
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve a list of all members in the club, with all the information the club has about the member
     */
    public ArrayList getAllMembers() throws SQLException
    {
        return db.getAllMembers();
    }

    /*
     * Connects the database to the gui allowing the gui to get a member using the member ID
     */
    public Member getMemberByID(int id) throws SQLException
    {
        return db.getMemberByID(id);
    }

    /*
     * Connects the database to the gui allowing the gui to retrieve the id(username) and password of a member
     * This is used during the login to check if the entered login information is correct
     */
    public boolean checkUserNameAndPassword(int ID, String Password) throws Exception
    {
        return db.checkUserNameAndPassword(ID, Password);
    }

    /*
     * Connects the database to the gui allowing the gui to set whether a member has logged in or not
     */
    public void setLoggedIn(int memberID)
    {
        this.memberID = memberID;
    }

    /*
     * Connects the database to the gui allowing the gui to see who is logged in
     */
    public int getLoggedIn()
    {
        return this.memberID;
    }
}
