/**
 * Annual WeatherV2 client class- The purpose of this program is to display the average temperature
 * and the annual precipitation for a selected city.
 * 
 * @author Siddharth Sivakumar
 * @version October 2024
 */
import java.util.Scanner;
public class CityWeatherTesterV2_1
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    public static void printData(String [] month, double [] temperature, double [] precipitation, String tempLabel, String precipLabel, String city, String state, double avgTemp, double totalPrecip) {
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
           System.out.printf("  %s.", month[index]);
           System.out.printf("%14.1f", temperature[index]);
           System.out.printf("%16.1f%n",precipitation[index]);
        }
        System.out.println("********************************************");
        System.out.printf("   Average: %2.1f    Annual: %2.1f" , avgTemp, totalPrecip);


        
        
    }
    
    public static void main (String [ ] args)
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Tallahassee";  //choose a city from the table provided
        String state = "FL";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "Mar",    "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",    "Dec"};     //complete initialization of months array
        double [] temperature ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};     //complete initialization of temperatures array
        double [] precipitation ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        
        //instantiate CityWeatherV1 object 
        CityWeatherV2_1 tallahassee = new CityWeatherV2_1(month, temperature, precipitation);
        //print average temperature and total precipitation
        
              

        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempScale = in.next();
        
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        String precipScale = in.next();
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (tempScale.equalsIgnoreCase("C")) {
            temperature = tallahassee.calcTemp(temperature);
            tempLabel = "C";
        }
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if (precipScale.equalsIgnoreCase("C")) {
            precipitation = tallahassee.calcPrecip(precipitation);
            precipLabel = "cm.";
        }
        
        //method call to calculate the average temperature
        double avgTemp = tallahassee.averageTemperature();
        
        //method call to calculate the total precipitation
        double totalPrecip = tallahassee.totalAnnualPrecipitation();
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        printData(month, temperature, precipitation, tempLabel, precipLabel, city, state, avgTemp, totalPrecip);
    
    
    


    }//end main
}//end class

