
/**
 * This shape tester class demonstrates classes that override the toString and equals methods.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

import java.util.ArrayList;
public class ShapesTester4
{
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(12, 20);
        Rectangle4 two = new Box4(4, 4, 4);
        Rectangle4 three = new Box4(4, 12, 8);
        Box4 four = new Cube4(4);
        Rectangle4 five = new Rectangle4(12, 1);
        Rectangle4 six = new Box4(18, 1, 1);
        
        Rectangle4 seven = new Square4(8);
        Parallelogram4 eight = new Parallelogram4(12, 6);

        //Print all shapes
        ArrayList<Parallelogram4> shapes = new ArrayList<Parallelogram4>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);
        shapes.add(eight);
        
        System.out.println(" My shapes:");
        System.out.println();

        for(Parallelogram4 rect: shapes)
        {
            System.out.println(rect);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println(" Test for equality:");
        System.out.println();
        
        showEquality(two, four);
        showEquality(three, two);
    }

    
    public static void showEquality(Parallelogram4 comparison, Parallelogram4 other)
    {
        String outcome;
        
        if (comparison.equals(other) == true)
        {
            outcome = " IS";
        }
        else
        {
            outcome = " is NOT";
        }
        
        System.out.println(comparison + outcome + " the same size as" + other);
        System.out.println();
    }
}
