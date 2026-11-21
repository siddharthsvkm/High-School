
/**
 * The purpose of this program is to calculate Body Mass Index (BMI) given a person's height and weight.
 *
 * @author Siddharth Sivakumar
 * @version July 2024
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (first last): ");
        String name = in.nextLine();
        
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightInPounds = in.next();
        double userWeight = (Integer.parseInt(weightInPounds) * 0.45359237);
        
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightInFeet = in.next();
        String heightInInches = in.next();
        double userHeight = (((Integer.parseInt(heightInFeet) * 12) + Integer.parseInt(heightInInches)) * 0.0254);
        
        double exponent = 2;
        double BMI = userWeight / Math.pow(userHeight, exponent);
        String category = "Unknown";
        
        if (BMI >= 29.2)
            category = "Obese";
        else if(BMI >= 25.0)
            category = "Overweight";
        else if(BMI > 18.5)
            category = "Healthy Weight";
        else
            category = "Underweight";
    
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + (int)(userHeight * 10)/10.0);
        System.out.println("Weight (kg): " + (int)(userWeight * 10)/10.0);
        System.out.println("BMI: " + (int)(BMI * 10)/10.0);
        System.out.println("Category: " + category);
    }
}
