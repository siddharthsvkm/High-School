/**
 * Annual WeatherV2 object class - The purpose of this program is to display the average temperature
 * and the annual precipitation for a selected city.
 * 
 * @author Siddharth Sivakumar
 * @version October 2024
 */

public class CityWeatherV2_1 {
    // private instance variables - three arrays
    private String[] months;
    private double[] temperature;
    private double[] precipitation;
    
    // constructor with parameters
    public CityWeatherV2_1(String[] cityMonths, double[] cityTemperature, double[] cityPrecipitation)
    {
        months = cityMonths;
        temperature = cityTemperature;
        precipitation = cityPrecipitation;
    }
    
    
    // setters and getters for each private instance variable
    public void setTemperature(double[] updateTemperature)
    {
        temperature = updateTemperature;
    }
    public void setPrecipitation(double[]updatePrecipitation)
    {
        precipitation = updatePrecipitation;
    }    
    
    public double[] getTemperature()
    {
        return temperature;
    }
    public double[] getPrecipitation()
    {
        return precipitation;
    }    
    
    
    // method to calculate the average of temperature
    public double averageTemperature()
    {
        double avgTemp = 0;
        for (int x = 0; x < temperature.length; x++)
        {
            avgTemp += temperature[x];
        }
        avgTemp /= temperature.length;
        
        return avgTemp;
    }
    
    
    // method to calculate total precipitation array
    public double totalAnnualPrecipitation()
    {
        double totAnnPrec = 0;
        for (int x = 0; x < precipitation.length; x++)
        {
            totAnnPrec += precipitation[x];
        }
        
        return totAnnPrec;
    }   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public static double[] calcTemp(double [] temperatures)
    {
        for (int x = 0; x < temperatures.length; x++)
        {
            temperatures[x] = (temperatures[x] - 32) * 5.0/9;
        }
        
        return temperatures;
    } 
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public static double[] calcPrecip(double [] precip)
    {
        for (int x = 0; x < precip.length; x++)
        {
            precip[x] = precip[x] * 2.54;
        }
        
        return precip;
    } 

}
