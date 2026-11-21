
/**
 * Encryption/Decryption client/tester class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */

import java.util.Scanner;
public class CaesarTester1
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static int shiftKey;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println(" Caesar Shift Cipher Tester");
        System.out.println();
        System.out.println(" Please choose one of the following options:");
        System.out.println(" 1. Encryption");
        System.out.println(" 2. Decryption");
        System.out.println();
        
        System.out.print(" Which algorithm do you choose? (Encryption/Decryption): ");
        String algorithm = in.nextLine().toLowerCase();
        System.out.println(" Using the " + algorithm + " algorithm.");
        System.out.println();
        
        System.out.print(" Please input a shift key value (0-25): ");
        shiftKey = in.nextInt();
        while (shiftKey < 0 || shiftKey > 25)
        {
            System.out.println(" Please enter a valid shift key value.");
            System.out.print(" Input a shift key value (0-25): ");
            shiftKey = in.nextInt();
        }
        System.out.println();
        
        
        System.out.print(" How many messages will you be providing? ");
        int messages = in.nextInt();
        in.nextLine();
        
        for (int x = 0; x < messages; x++)
        {
            System.out.print(" Please enter the message modified by the " + algorithm + " algorithm: ");
            String message = in.nextLine().toLowerCase();
            if (algorithm.equals("encryption"))
            {
                System.out.println("  Message: " + Encryption1.encryption(ALPHABET, shiftKey, message));
            }
            else
            {
                System.out.println("  Message: " + Decryption1.decryption(ALPHABET, shiftKey, message));
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println(" Exited the program.");
    }
}
