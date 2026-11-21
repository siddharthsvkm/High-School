
/**
 * Item implementation class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */
public class Item
{
    private String name;
    private int productNumber, quantity;
    private double price;
    
    
    public Item(String n, int num, double p, int q)
    {
        name = n;
        productNumber = num;
        price = p;
        quantity = q;
    }

    // Mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setProductNumber(int num)
    {
        productNumber = num;
    }
    
    public void setQuantity(int q)
    {
        quantity = q;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    
    // Accessor methods
    public String getName()
    {
        return name;
    }
    
    public int getProductNumber()
    {
        return productNumber;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    
    // toString method
    public String toString()
    {
        return String.format(" %-21s %-11d $%5.2f %7d \n", name, productNumber, price, quantity);
    }
}
