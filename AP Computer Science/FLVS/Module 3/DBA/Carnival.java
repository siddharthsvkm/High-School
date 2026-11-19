
/**
 * The purpose of this program is to help the ticket booth operators 
 * determine the correct ticket price and print the ticket for the guest.
 *
 * @author Siddharth Sivakumar
 * @version July 2024
 */
import java.util.Scanner;
public class APCS_Carnival
{
    public static void printTicket(String name, String id, double price)   { 
        System.out.println("Welcome to the APCS Carnival, " + name +"!"); 
        System.out.println("Your user ID is " + id); 
        System.out.println("The cost of your ticket is $" + price + "."); 
        System.out.println("Have a great time at the APCS Carnival today!"); 
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean responderDiscount = false;
        boolean veteranDiscount = false;
        double ticketPrice = 0;
        double discountRate = 0.50;
        
        System.out.print("Please enter your name (first last): ");
        String userName = in.nextLine();
        
        System.out.print("Please enter your age (years): ");
        int userAge = in.nextInt();
        
        System.out.print("Are you a first responder? (Y/N): ");
        String responderConfirmed = in.next().toUpperCase();
        if (responderConfirmed.equals("Y") || responderConfirmed.equals("YES"))
            responderDiscount = true;
        
        System.out.print("Are you a veteran? (Y/N): ");
        String veteranConfirmed = in.next().toUpperCase();
        if (veteranConfirmed.equals("Y") || veteranConfirmed.equals("YES"))
            veteranDiscount = true;
        
            
        if ((responderDiscount || veteranDiscount) && userAge > 18)
            ticketPrice += 12 * (1 - discountRate);
        else if (userAge > 18)
            ticketPrice += 12;
        else if (userAge >= 6)
            ticketPrice += 11;
        else if (userAge >= 3)
            ticketPrice += 9;
        else if (userAge > 0 && userAge < 3)
            ticketPrice += 2;
        else
            System.out.println("\nYou have entered an incorrect value for the previous questions. Please try again and enter a valid answer for the correct calculation.\n");
        
        int spaceInName = userName.indexOf(" ");
        String firstName = userName.substring(0, spaceInName);
        String lastName = userName.substring(spaceInName + 1);
        int highest = 1000;
        int lowest = 1;
        int range = highest - lowest + 1;
        int randomNumber = (int)(Math.random() * range) + lowest;
        String userID = firstName.substring(0, 1) + lastName + randomNumber;   
        
        System.out.println("\n");
        
        printTicket(userName, userID, ticketPrice);
    }
}
