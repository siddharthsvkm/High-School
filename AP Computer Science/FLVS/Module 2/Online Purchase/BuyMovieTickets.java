
/**
 * The purpose of this program is to simulate an online purchase by asking the user for input and displaying a receipt.
 *
 * @Siddharth Sivakumar
 * @July 5th, 2024
 */

import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        // Greeting
        System.out.println("Good Evening.");
        
        // User Input
        Scanner in = new Scanner(System.in);
        // User Input - Name
        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String firstInitial = firstName.substring(0, 1) + ".";
        String lastName = in.next();
        
        // User Input - Date
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        String acceptableDate = date.substring(0, 2) + "-" + date.substring(3, 5) + "-" + date.substring(6, 10);
        
        // User Input - Movie
        System.out.print("What movie would you like to see? ");
        String movieName = in.next();
        movieName += in.nextLine();
        
        // User Input - Ticket Number
        System.out.print("How many tickets? ");
        String tickets = in.next();
        int ticketNumber = Integer.parseInt(tickets);
        
        // User Input - Ticket Price
        System.out.print("What is the ticket price? $");
        String ticketPrice = in.next();
        double ticketPriceNumber = Double.parseDouble(ticketPrice);
        
        // User Input - Debit Card Number
        System.out.print("Enter your debit card number (#####-###-####): ");
        String debitCard = in.next();
        String debitCardNumber = debitCard.substring(10);
        
        // User Input - PIN Number
        System.out.print("Enter your PIN (#####): ");
        String pin = in.next();
        int pinNumber = Integer.parseInt(pin);
        
        // Recipt Variables
        double orderPrice = ticketPriceNumber * ticketNumber;
        String orderNumber = lastName.substring(1, 3) + debitCard.substring(6, 9);
        String indentSpace = "  ";
        
        // Recipt Beginning
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("Your e-Receipt");
        System.out.println();
        
        // Recipt - Date/Order
        System.out.println(acceptableDate);
        System.out.println("Order number: " + orderNumber + "\n");
        
        // Recipt - Name/Concealed Debit Card Number/Movie Name/ Ticket Number & Cost
        System.out.println(indentSpace + firstInitial + " " + lastName);
        System.out.println(indentSpace + "Account: #####-###-" + debitCardNumber);
        System.out.println(indentSpace + "Movie: " + movieName);
        System.out.println(indentSpace + "Number of Tickets: " + ticketNumber);
        System.out.println(indentSpace + "Ticket Price: " + ticketPriceNumber + "\n");
        
        // Recipt - Total Cost of the Order
        System.out.println(indentSpace + "$" + orderPrice +" will be debited to your account.\n");
        
        // Recipt Ending
        System.out.println(indentSpace + "Thank you. Enjoy your movie tonight.");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
    }
}
