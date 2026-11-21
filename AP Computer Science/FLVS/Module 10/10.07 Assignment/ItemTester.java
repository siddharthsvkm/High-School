
/**
 * Item tester/client class
 * 
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */
public class ItemTester
{
    // Name - Insertion Sort (Ascending/Descending)
    public static Item[] sortName(Item[] products, String option) 
    {
        Item[] sortedArray = new Item[products.length];
        for (int x = 0; x < products.length; x++)
        {
            int insertionIndex = 0;
            for (int y = x; y > 0; y--)
            {
                if (option.equalsIgnoreCase("ascending") && products[x].getName().compareTo(sortedArray[y - 1].getName()) > 0)
                {
                    insertionIndex = y;
                    break;
                }
                else if (option.equalsIgnoreCase("descending") && products[x].getName().compareTo(sortedArray[y - 1].getName()) < 0) 
                {
                    insertionIndex = y;
                    break;
                }
                else
                {
                    sortedArray[y] = sortedArray[y - 1];
                }
            }
            sortedArray[insertionIndex] = products[x];
        }
        
        return sortedArray;
    }
    // Product Number - Selection Sort (Ascending/Descending)
    public static Item[] sortProductNumber(Item[] products, String option) 
    {
        for (int x = products.length - 1; x > 0; x--)
        {
            int insertionIndex = 0;
            
            for (int y = 1; y <= x; y++)
            {
                if (option.equalsIgnoreCase("ascending") && products[y].getProductNumber() > products[insertionIndex].getProductNumber())
                    insertionIndex = y;
                else if (option.equalsIgnoreCase("descending") && products[y].getProductNumber() < products[insertionIndex].getProductNumber())
                    insertionIndex = y;

            }
            Item temp = products[insertionIndex];
            products[insertionIndex] = products[x];
            products[x] = temp;
        }
        
        return products;
    }
    // Price - Insertion Sort (Ascending/Descending)
    public static Item[] sortPrice(Item[] products, String option) 
    {
        Item[] sortedArray = new Item[products.length];
        for (int x = 0; x < products.length; x++)
        {
            int insertionIndex = 0;
            for (int y = x; y > 0; y--)
            {
                if (option.equalsIgnoreCase("ascending") && products[x].getPrice() > sortedArray[y - 1].getPrice())
                {
                    insertionIndex = y;
                    break;
                }
                else if (option.equalsIgnoreCase("descending") && products[x].getPrice() < sortedArray[y - 1].getPrice()) 
                {
                    insertionIndex = y;
                    break;
                }
                else
                {
                    sortedArray[y] = sortedArray[y - 1];
                }
            }
            sortedArray[insertionIndex] = products[x];
        }
        
        return sortedArray;
    }
    // Quantity - Merge Sort (Ascending)
    public static void sortQuantity(Item[] products, int low, int high) 
    {
        int mid = (high + low) / 2;
        
        if (low >= high) 
        {
            return;
        }
        
        sortQuantity(products, low, mid);
        sortQuantity(products, mid + 1, high);
        merge(products, low, mid, high);
    }
    public static void merge(Item[] productArray, int low, int mid, int high) 
    {            
        Item[] newArray = new Item[high - low + 1];
        int l = low;
        int h = mid + 1;
        int index = 0;
        
        while (l <= mid || h <= high)
        {
            if (l > mid)
            {
                newArray[index] = productArray[h];
                h += 1;
                
            }
            else if (h > high)
            {
                newArray[index] = productArray[l];
                l += 1;
                
            }
            else if (productArray[l].getQuantity() > productArray[h].getQuantity())
            {
                newArray[index] = productArray[h];
                h += 1;
                
            }
            else
            {
                newArray[index] = productArray[l];
                l += 1;
                
            }
            index += 1;
        }
        
        for (int x = low; x <= high; x++ ) 
            productArray[x] = newArray[x - low]; 

    }
    
    // Print Table
    public static void printData(Item[] products)
    {
        String divider = "---------------------";
        
        System.out.printf("     %-20s %-12s %-8s %s \n", "Product Name", "Number", "Price", "Quantity");
        System.out.println(divider + divider + divider);
        for (int x = 0; x < products.length; x++)
        {
            System.out.printf(" %2d.", (x + 1)); 
            System.out.print(products[x].toString());
        }
    }
    
    public static void printSortedData(Item[] products, String field, String order)
    {
        System.out.println();
        System.out.println();
        
        System.out.println(" Sorted Array by " + field + " (" + order +"): ");
        System.out.println();
        if (field.equalsIgnoreCase("name"))
            products = sortName(products, order);
        else if (field.equalsIgnoreCase("price"))
            products = sortPrice(products, order);
        else if (field.equalsIgnoreCase("product number"))
            products = sortProductNumber(products, order);
        else if (field.equalsIgnoreCase("quantity"))
            sortQuantity(products, 0, products.length - 1);
        
        
        printData(products);
    }
    
    public static void main(String[] args)
    {
        Item[] products = {new Item("Chewbacca Mask", 1281, 19.99, 24),
                           new Item("Glasses", 1524, 14.89, 13),
                           new Item("Gel Pen", 1212, 2.99, 20),
                           new Item("Chocolate", 1809, 1.99, 80),
                           new Item("Water Bottle", 2467, 12.59, 25),
                           new Item("Ice Cream", 8967, 5.99, 75),
                           new Item("Cookie", 1723, 1.50, 90),
                           new Item("Jacket", 1342, 31.99, 35), 
                           new Item("Duffel Bag", 3568, 15.99, 30),
                           new Item("Lantern", 9534, 12.12, 27),
                           new Item("Bicycle", 9764, 29.99, 11)};
        String field, order;                   
        System.out.println(" Original Array: ");
        System.out.println();
        printData(products);
        
        field = "Name";
        order = "Descending";
        printSortedData(products, field, order);
        
        order = "Ascending";
        printSortedData(products, field, order);
        
        field = "Price";
        order = "Descending";
        printSortedData(products, field, order);
        
        order = "Ascending";
        printSortedData(products, field, order);
        
        
        field = "Product Number";
        order = "Descending";
        printSortedData(products, field, order);
        
        order = "Ascending";
        printSortedData(products, field, order);
        
        
        field = "Quantity";
        printSortedData(products, field, order);
    }
}
