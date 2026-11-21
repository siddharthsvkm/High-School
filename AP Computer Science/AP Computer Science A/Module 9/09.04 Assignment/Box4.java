/**
 * This class defines a Box object by extending Rectangle and includes height.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    public String toString()
    {
        return " Box - " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(Object comparison)
    {
        if(!(comparison instanceof Box4))
        {
            return false;
        }
        
        Box4 values = (Box4)comparison;
        return values.getLength() == getLength() && values.getWidth() == getWidth() && values.getHeight() == getHeight();
    }
}
