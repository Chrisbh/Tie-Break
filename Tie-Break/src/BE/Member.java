/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Chris
 */
public class Member
{

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private int zipCode;
    private String city;
    private String email;
    private int phoneNumber;
    private String cpr;

    public Member(int id, String firstName, String lastName, String address, int zipCode, String city, String email, int phoneNumber, String cpr)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cpr = cpr;
    }

    public Member(String firstName, String lastName, String address, int zipCode, String city, String email, int phoneNumber)
    {
        this(-1, firstName, lastName, address, zipCode, city, email, phoneNumber, "");
    }

    public Member(int id, Member m, String cpr)
    {
        this(id, m.firstName, m.lastName, m.address, m.zipCode, m.city, m.email, m.phoneNumber, cpr);
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the zipCode
     */
    public int getZipCode()
    {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the cpr
     */
    public String getCpr()
    {
        return cpr;
    }

    /**
     * @param cpr the cpr to set
     */
    public void setCpr(String cpr)
    {
        this.cpr = cpr;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
}