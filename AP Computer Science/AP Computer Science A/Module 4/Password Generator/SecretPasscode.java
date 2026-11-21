/**
 * The purpose of this program is to generate random passwords; the user should be able to select the length.
 *
 * @author Siddharth Sivakumar
 * @version August 2024
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0; 
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("testfile.txt"));

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        
        // the user wants to continue
        while (userChoice.equalsIgnoreCase("Y"))
        {
            // Ask for password length 
            while (pwLength < 6)
            {
                System.out.print("Enter a password Length (6 or more): ");
                pwLength = in.nextInt();
                
                // validate password length
                if (pwLength < 6)
                {
                    System.out.println("  Password length too short. Please try again.");
                }
            }
            
            // generate a random character in the correct character set
            for (int i = 0; i < pwLength; i++)
            {
                while (!((randNum >= 48 && randNum <= 57) || (randNum >= 65 && randNum <= 90) || (randNum >= 97 && randNum <= 122)))
                {
                    randNum = (int)(Math.random() * 75) + 48;
                }
                // concatenate the character to the password
                password += ((char)randNum);
                randNum = 0;
            }
            
            // write the password to the file
            outFile.println(password);
            System.out.println("\nA password has been written to the text file");
            
            password = "";
            pwLength = 0;
            System.out.print("Would you like to generate another password? Y/N ");
            userChoice = in.next();
        }
        
        // when the user is done, close the text file so that it can be re-opened and read
        outFile.close();
        System.out.println("\nThank you for using the Pass Code Generator.");
        
        // Read passwords back from text file and display to the screen
        System.out.println("\nHere are you randomly generated codes: ");
        File fileName = new File("testfile.txt"); 
        Scanner inFile = new Scanner(fileName); 
        String token = "";
                    
        for(int i = 1; inFile.hasNext(); i++) 
        {        
             token = inFile.next( ); 
             System.out.println("  " + i + ".      " + token); 

        } 
        inFile.close(); 

  }//end main
}//end class
