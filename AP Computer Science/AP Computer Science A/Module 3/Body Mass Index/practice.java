/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practice
{
    public static void main(String [] args)
    {
    boolean a = false;
    boolean b = false;
    boolean c = true;

    System.out.println(!(a && !(b && !c)));
    
    System.out.println(!a || (!b || c));
    System.out.println(!a || (b && !c));
    System.out.println((!a || b) && !c);
    }
}
