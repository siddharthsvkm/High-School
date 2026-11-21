
/**
 * Write a description of class Coin here.
 *
 * @author Siddharth Sivakumar
 * @version March 2025
 */

public class Coin{
    private int mintYear; //year coin was made
    private double faceValue; //value of coin at time it was made
    private String country; //origin country
    public Coin(int year, double value, String ctry){
        mintYear = year;
        faceValue = value;
        country = ctry;
    }
    //other constructors and methods not shown
    public int getYear(){
        return mintYear;
    }   
}
