
/**
 * The purpose of this program is to encrypt plaintext message.
 * Encryption object class
 *
 * @author Siddharth Sivakumar
 * @version February 2025
 */
public class Encryption1
{
    public static String changeAlphabet(String alphabet, int shiftKey)
    {
        StringBuilder changedAlphabet = new StringBuilder();
        for (int x = 0; x < 26; x++)
        {
            int index;
            if (0 <= x + shiftKey && x + shiftKey < 26)
            {  
                index = x + shiftKey;
            }
            else
            {
                index = x + shiftKey - 26;
            }
            changedAlphabet.append(alphabet.substring(index, index + 1));
        }
        return changedAlphabet.toString();
    }
        
    public static String encryption(String alphabet, int shiftKey, String input)
    {
        String newString = "";
        String changedAlphabet = changeAlphabet(alphabet, shiftKey);
        for (int x = 0; x < input.length(); x++) {
            String character = input.substring(x, x + 1);
            if (character.equals(" "))
            {
                newString += character;
            }
            else
            {
                int index = alphabet.indexOf(character);
                newString += changedAlphabet.substring(index, index + 1);
            }
        }
        return newString;
    }
}
