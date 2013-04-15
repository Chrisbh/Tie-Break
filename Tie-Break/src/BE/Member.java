package BE;

import java.util.Calendar;

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
    private Calendar bday;
    private String password;

    /*
     * Member constructor without cpr and password
     */
    public Member(int id, String firstName, String lastName, String address, int zipCode, String city, String email, int phoneNumber)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /*
     * Member constructor containing everything
     */
    public Member(int id, String firstName, String lastName, String address, int zipCode, String city, String email, int phoneNumber, Calendar bday, String password)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bday = bday;
        this.password = password;
    }

    /*
     * Member constructor without id, cpr and password
     */
    public Member(String firstName, String lastName, String address, int zipCode, String city, String email, int phoneNumber)
    {
        this(-1, firstName, lastName, address, zipCode, city, email, phoneNumber);
    }

    /*
     * Member constructor with id, a member object and cpr
     */
    public Member(int id, Member m)
    {
        this(id, m.firstName, m.lastName, m.address, m.zipCode, m.city, m.email, m.phoneNumber, m.bday, m.password);
    }

    /**
     * Returns the id of a member
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the first name of a member
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the first name of a member
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Returns the address of a member
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Sets the address of a member
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * Returns the zip code of a member
     * @return the zipCode
     */
    public int getZipCode()
    {
        return zipCode;
    }

    /**
     * Sets the zip code of a member
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode)
    {
        this.zipCode = zipCode;
    }

    /**
     * Returns the city of a member
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets the city of a member
     * @param city the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * Returns the email of a member
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Sets the email of a member
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Returns the phone number of a member
     * @return the phoneNumber
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Sets the phone number of a member
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the last name of a member
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the last name of a member
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Returns the password of a member
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets the password of a member
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    /**
     * @return the bday
     */
    public Calendar getBday()
    {
        return bday;
    }

    /**
     * @param bday the bday to set
     */
    public void setBday(Calendar bday)
    {
        this.bday = bday;
    }
}