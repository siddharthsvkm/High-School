
/**
 * Purpose: Contact Implementation Class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 *
 */
public class Contact
{
    // instance variables
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String emailAddress;

    // Constructor for objects of class Music
    public Contact(String n, String title, String natalDay, String phone, String email)
    {
        // initialize instance variables
        name = n;
        relation = title;
        birthday = natalDay;
        phoneNumber = phone;
        emailAddress = email;
    }

    public String getName()
    {
        return name;
    }
   
    public void setName(String n)
    {
        name = n;
    }
   
    public String getRelation()
    {
        return relation;
    }
    
    public void setRelation(String r)
    {
        relation = r;
    }
   
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String b)
    {
        birthday = b;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String pN)
    {
        phoneNumber = pN;
    }
    
    public String getEmailAddress()
    {
        return emailAddress;
    }
    
    public void setEmailAddress(String eA)
    {
        emailAddress = eA;
    }
   
    public String toString()
    {
        return String.format(" %-22s%-15s%-15s%-17s%-18s\n", name,  relation, birthday, phoneNumber, emailAddress);
    }
}
