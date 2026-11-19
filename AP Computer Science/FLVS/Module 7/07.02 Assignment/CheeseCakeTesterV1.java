/**
 * @The purpose of this program is to create an client class for the CheeseCakeV1 class.
 *
 * @author Siddharth Sivakumar
 * @version December 2024
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        
        String cheesecakeFlavor1 = "Blueberry";
        int cheesecakeQuantity1 = 5;
        
        String cheesecakeFlavor2 = "Strawberry";
        int cheesecakeQuantity2 = 6;
        
        String cheesecakeFlavor3 = "Cherry";
        int cheesecakeQuantity3 = 4;
        
        String cheesecakeFlavor4 = "Jalopeno";
        int cheesecakeQuantity4 = 1;
        
        String cheesecakeFlavor5 = "Dill Pickle";
        int cheesecakeQuantity5 = 2;
        
        String cheesecakeFlavor6 = "Fig";
        int cheesecakeQuantity6 = 3;
                
        
        // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1(cheesecakeFlavor1, cheesecakeQuantity1));
        cake.add(new CheeseCakeV1(cheesecakeFlavor2, cheesecakeQuantity2));
        cake.add(new CheeseCakeV1(cheesecakeFlavor3, cheesecakeQuantity3));
        cake.add(new CheeseCakeV1(cheesecakeFlavor4, cheesecakeQuantity4));
        cake.add(new CheeseCakeV1(cheesecakeFlavor5, cheesecakeQuantity5));
        cake.add(new CheeseCakeV1(cheesecakeFlavor6, cheesecakeQuantity6));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            // invoke methods
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            // print each CheeseCake's data
            System.out.printf(" |%4d   |", index);
            System.out.println(cake.get(index).toString());
        }
    }
}
