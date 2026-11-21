
/**
 * The purpose of this program is to calculate total daily energy expenditure.
 *
 * @author Siddharth Sivakumar
 * @version July 2023
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double activityFactor;
        
        System.out.print("Please enter your name: ");
        String userName = in.nextLine();
        
        System.out.print("Please enter your BMR: ");
        String bmr = in.next();
        double userBMR = Double.parseDouble(bmr);
        
        System.out.print("Please enter your gender (M/F): ");
        String userGender = in.next().toUpperCase();
        
        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)\n");
        
        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevel = in.next().toUpperCase();
        
        if (userGender.equals("F") && activityLevel.equals("A"))
        {
	    activityFactor = 1.0;
	}
	else if (userGender.equals("F") && activityLevel.equals("B")) 
	{
            activityFactor = 1.3;
        }          
	else if (userGender.equals("F") && activityLevel.equals("C")) 
	{
            activityFactor = 1.5;
        }
        else if (userGender.equals("F") && activityLevel.equals("D")) 
	{
            activityFactor = 1.6;
        }
	else if (userGender.equals("F") && activityLevel.equals("E")) 
	{
            activityFactor = 1.9;
        }
        else if (userGender.equals("F") && activityLevel.equals("F")) 
	{
            activityFactor = 2.2;
        }
        else if (userGender.equals("M") && activityLevel.equals("A")) 
	{    
            activityFactor = 1.0;
        }
        else if (userGender.equals("M") && activityLevel.equals("B")) 
	{
            activityFactor = 1.3;
        }
        else if (userGender.equals("M") && activityLevel.equals("C")) 
	{
            activityFactor = 1.6;
        }
        else if (userGender.equals("M") && activityLevel.equals("D")) 
	{
            activityFactor = 1.7;
        }
        else if (userGender.equals("M") && activityLevel.equals("E")) 
	{
            activityFactor = 2.1;
        }
        else if (userGender.equals("M") && activityLevel.equals("F")) 
	{    
            activityFactor = 2.4;
        }
        else 
        {
            activityFactor = 0;
            System.out.println("\nYou have entered an invalid choice. Please enter a valid choice for calculation. ");
        }
        
        double userTDEE = userBMR * activityFactor;
        
        System.out.println("\n\nYour results:");
        System.out.println("Name: " + userName + "\t\t\tGender: " + userGender);
        System.out.println("BMR: " + userBMR + " calories\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + userTDEE + " calories");
    }
}
