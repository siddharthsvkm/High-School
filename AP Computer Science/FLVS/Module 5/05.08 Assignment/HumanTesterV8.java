/**
 * The purpose of this program is to create an client class for the HumanV8 class.
 *
 * @author Siddharth Sivakumar
 * @version October 2024
 */
public class HumanTesterV8
{
    // Print the results in a user-friendly format
    public static void printData(String firstName, String lastName, String gender, int fullNameLength, double centimeterHeight)
    {
        String tab = "\t";
        System.out.print(" " + firstName + " " + lastName + tab);
        System.out.print(gender + tab);
        System.out.print(fullNameLength + tab);
        System.out.println(centimeterHeight);
    }
    
    // Executes the code
    public static void main(String[] args)
    {
        // Format for readability
        String tab = "\t"; 
        System.out.println("                              " + "Humans:" + "                              ");
        System.out.println("Full Name" + tab + "Gender" + tab + "Name Length" + tab + "Centimeter Height");
        System.out.println("======================================================================================");
        
        // First instance of V8 object
        String firstName = "Alex";
        String lastName = "Doe";
        String gender = "Male";
        int heightInFeet = 6;
        int heightInInches = 5;
        
        HumanV8 human1 = new HumanV8();
       
        int fullNameLength = human1.fullNameCalculation(firstName, lastName);
        double centimeterHeight = human1.centimeterHeightCalculation(heightInFeet, heightInInches);
        printData(firstName, lastName, gender, fullNameLength, centimeterHeight);
        
        
        // Second instance of V8 object
        // Do not use variables, just enter the values in the parameter list
        // Overloaded constructor
        HumanV8 human2 = new HumanV8("Amanda", "Doe", 4, 7);
        gender = "Female";
        
        fullNameLength = human2.fullNameCalculation();
        centimeterHeight = human2.centimeterHeightCalculation();
        // Getter methods used
        printData(human2.getFirstName(), human2.getLastName(), gender, fullNameLength, centimeterHeight);
        
        
        // Third instance of V8 object
        // Overloaded constructor
        HumanV8 human3 = new HumanV8("Jackson", "Doe");
        heightInFeet = 5;
        heightInInches = 0;
        gender = "Male";
        
        fullNameLength = human3.fullNameCalculation();
        centimeterHeight = human3.centimeterHeightCalculation(heightInFeet, heightInInches);
        // Getter methods used
        printData(human3.getFirstName(), human3.getLastName(), gender, fullNameLength, centimeterHeight);
        
        

    }
}
