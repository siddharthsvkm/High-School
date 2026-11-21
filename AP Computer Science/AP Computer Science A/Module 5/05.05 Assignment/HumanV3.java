/**
 * The purpose of this program is to create an implementation class for the HumanV3 class.
 *
 * @author Siddharth Sivakumar
 * @version September 2024
 */
public class HumanV3
{
    public HumanV3()
    {
        
    }


    public int fullNameCalculation(String firstName, String lastName) //Returns the calculated length of the full name of the human
    {
        int fullNameLength = firstName.length() + lastName.length();
        return fullNameLength;
    }
    
    
    public double centimeterHeightCalculation(int heightInFeet, int heightInInches) //Returns the calculated length of the height in centimeters of the human
    {
        double centimeterHeight = ((heightInFeet * 12) + heightInInches) * 2.54;
        return centimeterHeight;
    }
}
