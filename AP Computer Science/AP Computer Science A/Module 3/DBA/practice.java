
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practice
{
    public static void main(String[] args)
    {
    String s = "sabsabc";
    String t = "abc";
    System.out.println(s.indexOf( t ));
    
    	
        int n = 0;
    int sSize = s.length();
    int tSize = t.length();
    boolean found = false;
    while ( !found && n + tSize <= sSize )
    {
      if ( t.equals( s.substring( n, n + tSize ) ) )
        found = true;

      n++;
    }
    if ( found )
      n--;
    else
      n = -1;    
    
    System.out.println(n);
    }
}
