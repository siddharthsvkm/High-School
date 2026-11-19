
/**
 * Write a description of class practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class practice
{
  
  public static String atLongLast( String[] a )
  {
    if ( a.length == 0 )
      return "";

    int maxIdx = 0;
    for ( int i = 1 ; i < a.length ; i++ )
    {
      if ( a[ maxIdx ].length() < a[ i ].length() )
        maxIdx = i;
    }
    return a[ maxIdx ].substring( a[ maxIdx ].length() - 1 );
  }	
  	
  	
  
  public static void Laugh()
  {
    System.out.println(atLongLast( {"has", "one", "humongously", "long", "string" } ));


  }

}

