/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Siddharth Sivakumar
 * @version November 2024
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);
        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    ";

        //  Add examples below for the following methods:
        //    trim()
        System.out.println();
        sample += " The quick brown fox was intelligent.  ";
        System.out.println("sample = " + sample);
        System.out.println("sample.trim() = " + sample.trim());
        System.out.println();
        
        //    length()
        String input = "The quick brown fox was intelligent.";
        System.out.println("input = " + input);
        System.out.println("input.length().trim() = " + input.length());
        System.out.println();
        
        //    indexOf with one and two parameters
        input = "I know nothing.";
        System.out.println("input = " + input);
        System.out.println("input.indexOf('no') = " + input.indexOf("no"));
        int index1 = input.indexOf("no");
        System.out.println("input.indexOf('no', index1 + 1) = " + input.indexOf("no", index1 + 1));
        System.out.println();
        
        //    substring() with one and two parameters
        System.out.println("input = " + input);
        System.out.println("input.substring(5) = " + input.substring(5));
        System.out.println("input.substring(7, 10) = " + input.substring(7, 10));
        System.out.println();
        
        //    compareTo()
        String example1 = "i eat apple";
        String example2 = "i eat apples";
        System.out.println("example1 = " + example1);
        System.out.println("example2 = " + example2);
        System.out.println("example1.compareTo(example2) = " + example1.compareTo(example2));
        System.out.println();
        
        //    any other String methods you'd like to try
        String demonstration = "This a very important demonstration of String methods.";
        System.out.println("demonstration = " + demonstration);
        int n = 3;
        System.out.println("demonstration.toUpperCase().substring(7) = " + demonstration.toUpperCase().substring(7));

    }

}
