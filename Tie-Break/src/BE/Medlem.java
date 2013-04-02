/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Chris
 */
public class Medlem
{
    private int id;
    private String navn;
    private String adresse;
    private int postnr;
    private String by;
    private String email;
    private int telefon;
    private String cpr;
    
    public Medlem(int id, String navn, String adresse, int postnr, String by, String email, int telefon, String cpr)
    {
        this.id = id;
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.by = by;
        this.email = email;
        this.telefon = telefon;
        this.cpr = cpr;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the navn
     */
    public String getNavn()
    {
        return navn;
    }

    /**
     * @param navn the navn to set
     */
    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    /**
     * @return the adresse
     */
    public String getAdresse()
    {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    /**
     * @return the postnr
     */
    public int getPostnr()
    {
        return postnr;
    }

    /**
     * @param postnr the postnr to set
     */
    public void setPostnr(int postnr)
    {
        this.postnr = postnr;
    }

    /**
     * @return the by
     */
    public String getBy()
    {
        return by;
    }

    /**
     * @param by the by to set
     */
    public void setBy(String by)
    {
        this.by = by;
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
     * @return the telefon
     */
    public int getTelefon()
    {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(int telefon)
    {
        this.telefon = telefon;
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
}
