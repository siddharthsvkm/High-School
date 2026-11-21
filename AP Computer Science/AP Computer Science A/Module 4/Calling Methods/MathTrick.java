/**
 * The purpose of this program is to perform the static methods stated in the Challenge Program.
 * 
 * @author Siddharth Sivakumar
 * @version August 2024
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
    
        /**
     * 
     ******  DO NOT USE ARRAYS AT ALL,  AND DO NOT CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
     *
     */
    
    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    //          use modulus to find the last digit and divide by 100 for the first digit.
    //         calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    //          while the difference of the digits is less than 2, create a new random number and try again

    public static int getRandomNum() 
    {   int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        // complete the method        
        while (Math.abs(firstDigit - lastDigit) <= 1)
        {
            num = (int)(Math.random() * 900) + 100;
            firstDigit = num % 10;
            lastDigit = num / 100;
        }
        return num;
        }

    // Step 2 & 4) reverse the digits of a number
    // Hint: to reverse a number without converting it to a String:
    //        create a new variable to store the reversed number
    //        while the original number > 0
    //        for each digit, multiply the new variable by 10 (to make room for the new digit) 
    //        then add the last digit (remember modulus?) to the new variable
    //        divide the original number by 10 to get rid of the last digit
    //    Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

    public static int reverseDigits(int num) {
    
        // complete the method
        int reversedNumber = 0;
        for (; num > 0; num /= 10)
        {
            reversedNumber *= 10;
            reversedNumber += (num % 10);
                }
        return reversedNumber;
    }
    
    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str)
    {
        // complete the method
        String digits = "0123456789";
        String letters = "YMPLROFAIB";
        for (int i = 0; i < digits.length(); i++) {
            str = str.replace(digits.substring(i, i + 1), letters.substring(i, i + 1));
        }
        return str;
    }
    
    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable 
    //         loop through the original word   
    //         add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str) {
        // complete the method
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversedString += str.substring(i, i+ 1);
        }
        return reversedString;
    }
        
    public static void main(String[] args) 
    {
        //        1.    Generate a random 3-digit number so that the first and third digits differ by more than one.
        int num1 = getRandomNum();
        System.out.println("1. The starting number: " + num1);
        //        2.    Now reverse the digits to form a second number.
        int num2 = reverseDigits(num1);
        System.out.println("2. The reversed number: " + num2);
        //        3.    Subtract the smaller number from the larger one.
        int num3 = Math.abs(num2 - num1);
        System.out.println("3. The difference is: " + num3);
        //        4.    Now reverse the digits in the answer you got in step 3 and add it to that number.
        int num4 = reverseDigits(num3) + num3;
        System.out.println("4. The reversed number added to difference: " + num4);
        //        5.    Multiply by one million.
        int num5 = num4 * 1000000;
        System.out.println("5. Number x one million: " + num5);    
        //        6.    Subtract 733,361,573.
        String numberString = "" + (num5 - 733361573);
        System.out.println("6. Number subtracted and converted to String: " + numberString);
        //        7.    Convert the number to a string in order to replace the numbers with letters.
        //                 Ex: String str = String.valueOf(myNumber);
        //            Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String replacedString = replaceLtr(numberString);
        System.out.println("7. Replaced string: " + replacedString);
        //        8.    Now reverse the letters in the string to read your message backward.
        String reverseReversedString = reverseString(replacedString);
        System.out.println("8. Reversed string: " + reverseReversedString);
    } // end main
} // end class
