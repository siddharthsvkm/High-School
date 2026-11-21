
/**
 * The purpose of this program is to calculate
 * the probability that a family with two children 
 * will consist of two boys, a boy and a girl, or two girls.
 *
 * @author Siddharth Sivakumar
 * @version July 2024
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        int totalFamilies = 0;
        int familyTwoBoys = 0;
        double probabilityOfFamilyTwoBoys = 0;
        int familyTwoGirls = 0;
        double probabilityOfFamilyTwoGirls = 0;
        int familyOneBoyOneGirl = 0;
        double probabilityOfFamilyOneBoyOneGirl = 0;
        String token = "";
        File readFile = new File("familyMembers.txt");
        Scanner inFile = new Scanner(readFile);
        
        while (inFile.hasNext())
        {
            token = inFile.next();
            if(token.equals("BB")){
            familyTwoBoys++;
            totalFamilies++;
            }else if(token.equals("GG")){
            familyTwoGirls++;
            totalFamilies++;
            }else {
            familyOneBoyOneGirl++;
            totalFamilies++;
            }      
        }
                 
        
        inFile.close();
        
        probabilityOfFamilyTwoBoys = (int)((double)familyTwoBoys / totalFamilies * 1000) / 10.0;
        probabilityOfFamilyTwoGirls = (int)((double)familyTwoGirls / totalFamilies * 1000) / 10.0;
        probabilityOfFamilyOneBoyOneGirl = (int)((double)familyOneBoyOneGirl / totalFamilies * 1000) / 10.0;
        
        System.out.println("Composition statistics for families with two children.\n");
        
        System.out.println("Total number of families: " + totalFamilies);
        
        System.out.println("\nNumber of families with");
        System.out.println("\t   2 boys: " + familyTwoBoys + " represents " + probabilityOfFamilyTwoBoys + "%");
        System.out.println("\t  2 girls: " + familyTwoGirls + " represents " + probabilityOfFamilyTwoGirls + "%");
        System.out.println(" 1 boy and 1 girl: " + familyOneBoyOneGirl + " represents " + probabilityOfFamilyOneBoyOneGirl +"%");
    }
}
