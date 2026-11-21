
/**
 * The purpose of this program is to create a tester (client) class.
 *
 * @author Siddharth Sivakumar
 * @version October 2024
 */

import java.util.Scanner;
public class AvatarTester {
public static void main (String [] args)
{
    String aName = null;
    Scanner in = new Scanner(System.in);
    
    Avatar player1 = new Avatar(aName, 0);
    System.out.print("What is the name of the avatar?");
    aName = in.next();
    player1.setName(aName);
    
    for (int x = 0; x < 3; x++)
    {
       System.out.print("Enter the level: ");
       int level = in.nextInt();
       player1.updateLevel(level);
    }
    
    String currentAvatarName = player1.getName();
    int currentLevel = player1.getLevel();
    System.out.println("\n" + "Avatar Name: " + currentAvatarName + "\t" + "Current Level: " + currentLevel);
}
}
