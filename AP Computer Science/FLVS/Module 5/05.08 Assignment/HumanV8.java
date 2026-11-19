/**
 * The purpose of this program is to create an implementation class for the HumanV8 class.
 *
 * @author Siddharth Sivakumar
 * @version October 2024
 */
public class HumanV8
{
   // Declare private instance variables
   private String firstName, lastName;
   private int heightInFeet, heightInInches;
   
   // Default constructor
   public HumanV8()
    {
        
    }

   // Overloaded constructors
   public HumanV8(String givenName, String familyName, int feet, int inches)
    {
        firstName = givenName; 
        lastName = familyName;
        heightInFeet = feet;
        heightInInches = inches;
    }
   
   public HumanV8(String gName, String fName)
    {
        firstName = gName; 
        lastName = fName;
    } 
    
   // Overloaded methods
   public int fullNameCalculation()
    {
        int fullNameLength = firstName.length() + lastName.length();
        return fullNameLength;
    }
   
   public int fullNameCalculation(String fN, String lN)
    {
        int fullNameLength = fN.length() + lN.length();
        return fullNameLength;
    }
    
   public double centimeterHeightCalculation()
    {
        double centimeterHeight = ((heightInFeet * 12) + heightInInches) * 2.54;
        return centimeterHeight;
    }
    
   public double centimeterHeightCalculation(int hIF, int hII)
    {
        double centimeterHeight = ((hIF * 12) + hII) * 2.54;
        return centimeterHeight;
    }
    
   // Getter methods 
   public String getFirstName() {
      return firstName; 
   }
   
   public String getLastName() {
      return lastName; 
   }
   
   public int getHeightInFeet() {
      return heightInFeet; 
   }
   
   public int getHeightInInches() {
      return heightInInches; 
   }
   
   // Setter methods
   public void setFirstName(String fN) {
      firstName = fN; 
   }
   
   public void setLastName(String lN) {
      lastName = lN; 
   }
   
   public void setHeightInFeet(int hIF) {
      heightInFeet = hIF;  
   }
   
   public void setHeightInInches(int hII) {
      heightInInches = hII; 
   }
}
