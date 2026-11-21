
/**
 * This program calculates the hypotenuse of two right triangles.
 *
 * @author Siddharth Sivakumar
 * @version June 26,2024
 */
public class PyTheorem
{
    public static void main(String[] args)
    {
        double square = 2;
        
        System.out.print("Triangle 1\t");
        int sideA_t1 = (int)(Math.random() * (22 - 5 + 1) + 5);
        int sideB_t1 = (int)(Math.random() * (22 - 5 + 1) + 5);
        System.out.print("Side 1: " + sideA_t1 + "\tSide 2: " + sideB_t1 + "\t");
        double hypotenuse_t1 = Math.sqrt(Math.pow(((double)sideA_t1),square) + Math.pow(((double)sideB_t1),square));
        System.out.println("Hypotenuse: " + hypotenuse_t1);
        
        System.out.print("Triangle 2\t");
        int sideA_t2 = (int)(Math.random() * (22 - 5 + 1) + 5);
        int sideB_t2 = (int)(Math.random() * (22 - 5 + 1) + 5);
        System.out.print("Side 1: " + sideA_t2 + "\tSide 2: " + sideB_t2 + "\t");
        double hypotenuse_t2 = Math.sqrt(Math.pow(((double)sideA_t2),square) + Math.pow(((double)sideB_t2),square));
        System.out.println("Hypotenuse: " + hypotenuse_t2);
        
    }
}
