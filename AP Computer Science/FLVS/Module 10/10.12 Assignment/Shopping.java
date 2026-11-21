import java.util.ArrayList;
public class Shopping{

   /*there may be other instance variables, constructors and methods not shown*/

   public static final int REORDER=4;

   public ArrayList<Grocery> addGroc(Grocery[] groc){
       ArrayList<Grocery> shoppingList = new ArrayList<Grocery>();

       for (int x = 0; x < groc.length; x++ )

       {
            if (groc[x].getQtyOnHand() < REORDER)
                shoppingList.add(groc[x]);
       }

       return shoppingList;
   }


   public int totalQty(ArrayList<Grocery> shoppingList, String c){
       int total = 0;

       for (int x = 0; x < shoppingList.size(); x++ )
        {
           if (shoppingList.get(x).getCategory().equals(c))

                     total += shoppingList.get(x).getQtyOnHand();
        }
       return total;
    }

}
