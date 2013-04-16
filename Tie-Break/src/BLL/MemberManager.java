package BLL;

import BE.Member;
import DAL.MembersDBManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

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

    /**
     * Conversion of Member manager using a singleton pattern
     * @return An instance of the MemberManager class
     */
    public static MemberManager getInstance()
    {
        if (instance == null)
        {
            instance = new MemberManager();
        }
        return instance;
    }

    /**
     * Connects the database to the gui allowing the gui to add a member to the
     * database
     * @param m a member object
     * @return the member object to the database
     * @throws Exception
     */
    public Member addMember(Member m) throws Exception
    {
        return db.addMember(m);
    }

    /**
     * Connects the database to the gui allowing the gui to update a member 
     * @param m a member object
     * @throws SQLException
     */
    public void updateMember(Member m) throws SQLException
    {
        db.updateMember(m);
    }

    /**
     * Connects the database to the gui allowing the gui to delete a member
     * @param id the id of the member being deleted
     * @throws SQLException
     */
    public void deleteMember(int id) throws SQLException
    {
        db.deleteMember(id);
    }

    /**
     * An ArrayList with all member ID's
     * @return all member ID's
     * @throws SQLException
     */
    public ArrayList getIds() throws SQLException
    {
        return db.getIds();
    }

    /**
     * An ArrayList with ID's of members and the corresponding name
     * @return ID and name of every member
     * @throws SQLException
     */
    public ArrayList getByName() throws SQLException
    {
        return db.getByName();
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve a list of all members in the club, 
     * with all the information the club has about the member
     * @return ArrayList with all information about every member
     * @throws SQLException
     */
    public ArrayList getAllMembers() throws SQLException
    {
        return db.getAllMembers();
    }

    /**
     * Connects the database to the gui allowing the gui to get a member using the member ID
     * @param id the ID of the member being pulled
     * @return a member object
     * @throws SQLException
     */
    public Member getMemberByID(int id) throws SQLException
    {
        return db.getMemberByID(id);
    }

    /**
     * Connects the database to the gui allowing the gui to get a members bday using the member ID
     * @param id the ID of the member being pulled
     * @return the birthday of a specific member
     * @throws SQLException
     */
    public Calendar getMembersBDayByID(int id) throws SQLException
    {
        return db.getMembersBDayByID(id);
    }

    /**
     * Connects the database to the gui allowing the gui to retrieve the id(username) and password of a member
     * This is used during the login to check if the entered login information is correct
     * @param ID username for the login
     * @param Password password for the login
     * @return username and password used for logging in
     * @throws Exception
     */
    public boolean checkUserNameAndPassword(int ID, String Password) throws Exception
    {
        return db.checkUserNameAndPassword(ID, Password);
    }

    /**
     * Connects the database to the gui allowing the gui to set whether a member has logged in or not
     * @param memberID ID of the member getting their logged in state changed
     */
    public void setLoggedIn(int memberID)
    {
        this.memberID = memberID;
    }

    /**
     * Connects the database to the gui allowing the gui to see who is logged in
     * @return the member currently logged in
     */
    public int getLoggedIn()
    {
        return this.memberID;
    }
}
