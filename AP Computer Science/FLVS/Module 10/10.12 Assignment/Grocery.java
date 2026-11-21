public class Grocery
{
   /*there may be other instance variables,
    constructors and methods not shown*/
   private String category;
   private int qtyOnHand;
   private double price;
    public Grocery(String categ, int qty, double pr){    
       category = categ;
       qtyOnHand = qty;
       price = pr;
   }
   
   public String getCategory(){
      return category;
   }

   public int getQtyOnHand(){
      return qtyOnHand;
   }

   public double getPrice(){
      return price;
   }
}
