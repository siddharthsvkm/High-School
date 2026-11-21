/**
 * Starter code for the Hurricane Tester
 * Siddharth Sivakumar
 * Decembr 2024
 *
 */

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //create an array to store the categories for each hurricane        
        int [] categories = new int[numValues];
        
        //convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array
        for (int x = 0; x < numValues; x++)
        {
            double mph = Math.round((windSpeeds[x] * 1.15078) * 100)/ 100.0;
            int category = 0;
            
            if (mph >= 74)
                category = 1;
            if (mph >= 96)
                category = 2;
            if (mph >= 111)
                category = 3;
            if (mph >= 130)
                category = 4;
            if (mph >= 157)
                category = 5;
            
            windSpeeds[x] = mph;
            categories[x] = category;
        }
        
        //user prompted for range of years
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter the start year: ");
        int firstYear = in.nextInt();
        System.out.print(" Enter the end year: ");
        int lastYear = in.nextInt();
        
        //create a Hurricane ArrayList of hurricane objects that are in the user's requested range
        ArrayList <Hurricane> hurricanes = new ArrayList <Hurricane>(numValues);
        
        // min/max values
        int maxCat = Integer.MIN_VALUE;
        int minCat = Integer.MAX_VALUE;
        
        int maxP = Integer.MIN_VALUE;
        int minP = Integer.MAX_VALUE;
        
        double maxWS = Double.MIN_VALUE;
        double minWS = Double.MAX_VALUE;
        
        // values to help determine average
        double totalCat = 0;
        double totalP = 0;
        double totalWS = 0;
        
        // values for category summary
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        
        int number = 0;
        
        // adds instances to ArrayList and updates other variables
        for (int x = 0; x < numValues; x++)
        {
            if (years[x] >= firstYear && years[x] <= lastYear)
            {
                hurricanes.add(new Hurricane(years[x], names[x], months[x], categories[x], pressures[x], windSpeeds[x]));
                
                totalCat += categories[x];
                totalP += pressures[x];
                totalWS += windSpeeds[x];
                
                if (categories[x] > maxCat)
                    maxCat = categories[x];
                if (categories[x] < minCat)
                    minCat = categories[x];
                if (pressures[x] > maxP)
                    maxP = pressures[x];
                if (pressures[x] < minP)
                    minP = pressures[x];
                if (windSpeeds[x] > maxWS)
                    maxWS = windSpeeds[x];
                if (windSpeeds[x] < minWS)
                    minWS = windSpeeds[x];
                
                if (categories[x] == 1)
                    cat1 += 1;
                if (categories[x] == 2)
                    cat2 += 1;
                if (categories[x] == 3)
                    cat3 += 1;
                if (categories[x] == 4)
                    cat4 += 1;
                if (categories[x] == 5)
                    cat5 += 1;
                    
                number += 1;
            }
        }
        
        double avgWS = totalWS/number;
        double avgP = totalP/number;
        double avgCat = totalCat/number;
        
        //print the hurricanes in the user's requested range
        String separate = "=========================================================================";
        System.out.println();
        System.out.printf("%30s %d - %d\n", "Hurricanes", firstYear, lastYear);
        System.out.println();
        System.out.printf(" %-8s %-14s %-13s %-17s %s\n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println(separate);
        for (Hurricane h: hurricanes)
        {
            System.out.println(h.toString());
        }
        
        //calculate and display the summary data using the ArrayList
        System.out.println(separate);
        System.out.printf("%s %-19s %-12.1f %4.1f %18.2f \n","       ", "Average:", avgCat, avgP, avgWS);
        System.out.printf("%s %-19s %-11d %4d %20.2f \n","       ", "Minimum:", minCat, minP, minWS);
        System.out.printf("%s %-19s %-11d %4d %20.2f \n","       ", "Maximum:", maxCat, maxP, maxWS);
        
        System.out.println();
        System.out.println(" Summary of Categories: ");
        System.out.printf("%10s %2d\n", "Cat 1:", cat1);
        System.out.printf("%10s %2d\n", "Cat 2:", cat2);
        System.out.printf("%10s %2d\n", "Cat 3:", cat3);
        System.out.printf("%10s %2d\n", "Cat 4:", cat4);
        System.out.printf("%10s %2d\n", "Cat 5:", cat5);
     }
}
