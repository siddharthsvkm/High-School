/**
 * The purpose of this program is to create an client class for the HumanV3 class.
 *
 * @author Siddharth Sivakumar
 * @version September 2024
 */
public class HumanTesterV3
{
    public static void printData(String firstName, String lastName, String gender, int fullNameLength, double centimeterHeight)
    {
        String tab = "\t";
        System.out.print(" " + firstName + " " + lastName + tab);
        System.out.print(gender + tab);
        System.out.print(fullNameLength + tab);
        System.out.println(centimeterHeight);
    }
    public static void main(String[] args)
    {
        String tab = "\t"; // Since tab doesn't format consistently, I will be using white space.
        System.out.println("                              " + "Humans:" + "                              ");
        System.out.println("Full Name" + tab + "Gender" + tab + "Name Length" + tab + "Centimeter Height");
        System.out.println("======================================================================================");
        
        
        String firstName = "John";
        String lastName = "Doe";
        String gender = "Male";
        int heightInFeet = 6;
        int heightInInches = 5;
        
        HumanV3 human1 = new HumanV3();
       
        int fullNameLength = human1.fullNameCalculation(firstName, lastName);
        double centimeterHeight = human1.centimeterHeightCalculation(heightInFeet, heightInInches);
        printData(firstName, lastName, gender, fullNameLength, centimeterHeight);
        
        
        
        firstName = "Jane";
        lastName = "Doe";
        gender = "Female";
        heightInFeet = 4;
        heightInInches = 7;
        
        HumanV3 human2 = new HumanV3();
       
        fullNameLength = human2.fullNameCalculation(firstName, lastName);
        centimeterHeight = human2.centimeterHeightCalculation(heightInFeet, heightInInches);
        printData(firstName, lastName, gender, fullNameLength, centimeterHeight);
        
        
        
        

    }
}
