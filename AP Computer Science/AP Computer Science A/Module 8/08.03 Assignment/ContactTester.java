
/**
 * Contact Tester Class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class ContactTester
{
    public static void printContacts(Contact[] contacts)
    {
        String dash = "---------------------------------";
        System.out.println();
        System.out.printf(" %-22s%-15s%-15s%-17s%-18s\n", "Name", "Relation", "Birthday", "Phone Num", "Email Address");
        System.out.println(dash + dash + dash);
        
        for (Contact person: contacts) 
        {
            System.out.print(person.toString());
        }
    }
    
    
    //Selection sort by name in ascending order
    public static void sortName(Contact[] contacts) 
    {
        int length = contacts.length;
        
        for (int x = length - 1; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (contacts[y].getName().compareTo(contacts[index].getName()) > 0)
                    index = y;
            }
            Contact temp = contacts[x];
            contacts[x] = contacts[index];
            contacts[index] = temp;
        }
    }
    //Selection sort by relation in ascending order
    public static void sortRelation(Contact[] contacts) 
    {
        int length = contacts.length;
        
        for (int x = length - 1; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (contacts[y].getRelation().compareTo(contacts[index].getRelation()) > 0)
                    index = y;
            }
            Contact temp = contacts[x];
            contacts[x] = contacts[index];
            contacts[index] = temp;
        }
    }
    //Selection sort by birthday in ascending order
    public static void sortBirthday(Contact[] contacts) 
    {
        int length = contacts.length;
        
        for (int x = length - 1; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (contacts[y].getBirthday().compareTo(contacts[index].getBirthday()) > 0)
                    index = y;
            }
            Contact temp = contacts[x];
            contacts[x] = contacts[index];
            contacts[index] = temp;
        }
    }
    //Selection sort by phone number in ascending order
    public static void sortPhoneNumber(Contact[] contacts) 
    {
        int length = contacts.length;
        
        for (int x = length - 1; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (contacts[y].getPhoneNumber().compareTo(contacts[index].getPhoneNumber()) > 0)
                    index = y;
            }
            Contact temp = contacts[x];
            contacts[x] = contacts[index];
            contacts[index] = temp;
        }
    }
    //Selection sort by email address in ascending order
    public static void sortEmailAddress(Contact[] contacts) 
    {
        int length = contacts.length;
        
        for (int x = length - 1; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (contacts[y].getEmailAddress().compareTo(contacts[index].getEmailAddress()) > 0)
                    index = y;
            }
            Contact temp = contacts[x];
            contacts[x] = contacts[index];
            contacts[index] = temp;
        }
    }
    
    // Binary search methods
    public static void binSearchName(Contact[] contacts, String targetName) 
    {
        int length = contacts.length;
        int high = length - 1;
        int low = 0;
        int index = -1;
        
        while (high >= low) 
        {
            int middle = (high + low) / 2;
            
            if (contacts[middle].getName().compareTo(targetName) > 0)
                high = middle - 1;
            else if (contacts[middle].getName().compareTo(targetName) < 0)
                low = middle + 1;
            else
            {
                index = middle;
                break;
            }
        }
        System.out.println();
        if (index < 0)
            System.out.println(" The name " + targetName + " could not be found.");
        else
            System.out.println(" The name " + targetName + " is at index " + index + ".");
    }
    public static void binSearchRelationship(Contact[] contacts, String target, String field) 
    {
        int length = contacts.length;
        int high = length - 1;
        int low = 0;
        int index = -1;
        
        while (high >= low) 
        {
            int middle = (high + low) / 2;
            String contact = getField(contacts[middle], field);
            
            if (contact.compareTo(target) > 0)
                high = middle - 1;
            else if (contact.compareTo(target) < 0)
                low = middle + 1;
            else
            {
                index = middle;
                linearPrint(contacts, target, index, field);
                break;
            }
        }
        if (index < 0)
        {
            System.out.println();
            System.out.println(" Searches for the "+ field + " " + target + " could not be found.");
        }
    }
    
    // linearPrint methods
    public static String getField(Contact contact, String field) 
    {
        String birthdayMonth = contact.getBirthday();
        int space = birthdayMonth.indexOf(" ");
        birthdayMonth = birthdayMonth.substring(0, space);
        
        if (field.compareTo("name") == 0)
            return contact.getName();
        else if (field.compareTo("relation") == 0)
            return contact.getRelation();
        else if (field.compareTo("birth month") == 0) 
            return birthdayMonth;
        else if (field.compareTo("phone number") == 0)
            return contact.getPhoneNumber();
        else
            return contact.getEmailAddress();
    }
    public static void linearPrint(Contact[] contacts, String target, int index, String field) 
    {
        int start = index;
        int end = index;
        
        while(start - 1 >= 0 && getField(contacts[start - 1], field).compareTo(target) == 0)
        {
            start--;
        }
        
        while(end + 1 <= contacts.length - 1 && getField(contacts[end + 1], field).compareTo(target) == 0)
        {
            end++;
        }
        
        System.out.println();
        System.out.println(" Here are all the contacts with a " + field + " of " + target + ".");
        for (int x = start, i = 1; x <= end; x++, i++)
        {
            System.out.println("  " + i + ". " + contacts[x].getName());
        }
    }
    
    
    // Sequential search methods
    public static void seqSearchBirthday(Contact[] contacts, String target) 
    {
        int length = contacts.length;
        int matches = 0;
        
        System.out.println();
        
        for (int x = 0; x < length; x++)
        {
            String birthday = contacts[x].getBirthday();
            int space = birthday.indexOf(" ");
            String birthdayMonth = birthday.substring(0, space);
            if (birthdayMonth.compareTo(target) == 0)
            {
                matches += 1;
                if (matches == 1)
                    System.out.println(" Here are all the contacts with a birth month of " + target + ".");
                System.out.println("  " + matches + ". " + contacts[x].getName());
            }
        }
        if (matches  == 0)
            System.out.println(" Searches for the birth month " + target + " could not be found.");
    }
    public static void seqSearchPhone(Contact[] contacts, String target) 
    {
        int length = contacts.length;
        int matches = 0;
        
        System.out.println();
        
        for (int x = 0; x < length; x++)
        {
            String phone = contacts[x].getPhoneNumber();
            if (phone.compareTo(target) == 0)
            {
                matches += 1;
                if (matches == 1)
                    System.out.println(" Here are all the contacts with a phone number of " + target + ".");
                System.out.println("  " + matches + ". " + contacts[x].getName());
            }
        }
        if (matches  == 0)
            System.out.println(" Searches for the phone number " + target + " could not be found.");
    }
    public static void seqSearchEmail(Contact[] contacts, String target) 
    {
        int length = contacts.length;
        int matches = 0;
        
        System.out.println();
        
        for (int x = 0; x < length; x++)
        {
            String email = contacts[x].getEmailAddress();
            if (email.compareTo(target) == 0)
            {
                matches += 1;
                if (matches == 1)
                    System.out.println(" Here are all the contacts with a email address of " + target + ".");
                System.out.println("  " + matches + ". " + contacts[x].getName());
            }
        }
        if (matches  == 0)
            System.out.println(" Searches for the email address " + target + " could not be found.");
    }
    
    
    // Prints for each search
    public static void printData(Contact[] contacts, String target, String field) 
    {
        System.out.println();
        System.out.println();
        System.out.println(" Sorted Array (" + field + "): ");
        
        if (field.compareTo("name") == 0)
            sortName(contacts);
        else if (field.compareTo("relation") == 0)
            sortRelation(contacts);
        else if (field.compareTo("birth month") == 0) 
            sortBirthday(contacts);
        else if (field.compareTo("phone number") == 0)
            sortPhoneNumber(contacts);
        else
            sortEmailAddress(contacts);
        printContacts(contacts);
        randomSearch(contacts, target, field);
    }
    // Random search method - sequential or binary
    public static void randomSearch(Contact[] contacts, String target, String field) 
    {
        int number = (int)(Math.random() * 8);
        
        if (number % 2 == 0)
        {
            if (field.compareTo("birth month") == 0)
                seqSearchBirthday(contacts, target);
            else if (field.compareTo("phone number") == 0)
                seqSearchPhone(contacts, target);
            else if (field.compareTo("email") == 0)
                seqSearchEmail(contacts, target);
            else
                number += 1;
        }
        if (number % 2 == 1)
        {
            if (field.compareTo("name") == 0)
                binSearchName(contacts, target); 
            else
                binSearchRelationship(contacts, target, field);
        }
    }
    
    public static void main(String[] args)
    {
        Contact[] contacts = {new Contact("Neymar", "Cousin", "February 05", "732-111-1010","neymarjr@gmail.com"),
                              new Contact("Cristiano Ronaldo", "Friend", "February 05", "999-777-7777","cr7@gmail.com"),
                              new Contact("Matthew Zhiraha", "Cousin", "January 05", "625-763-2359","zhiraha@gmail.com"),
                              new Contact("Olivia Fire", "Mother", "August 21", "321-555-0811","wonderwoman@theamazon.net"),
                              new Contact("Michael Fire", "Father", "August 03", "123-546-2542","michaelf@gmail.com"),
                              new Contact("Chris Hems", "Friend", "January 09", "673-553-4373","chrishems@gmail.com"),
                              new Contact("Joshua Burns", "Friend", "August 14", "426-466-6463","josh_burns@gmail.com"),
                              new Contact("Tyler Crane", "Brother", "February 08", "245-356-3565","tylerc@gmail.com"),
                              new Contact("Justin Clark", "Friend", "January 23", "829-856-7467","jclark@gmail.com"),
                              new Contact("Stephen Curry", "Uncle", "October 10", "231-645-6143","steph30@gmail.com"),
                              new Contact("Diana Prince", "Aunt", "October 25", "321-555-0811","wonderwoman@theamazon.net"),
                              new Contact("Shade Slim", "Brother", "February 20", "732-222-0220","shades@gmail.com")};
                              
        System.out.println(" Original Array: ");
        printContacts(contacts);
        
        String target = "Neymar";
        String field = "name";
        printData(contacts, target, field);
        
        field = "birth month";
        target = "January";
        printData(contacts, target, field);
        
        field = "phone number";
        target = "321-555-0811";
        printData(contacts, target, field);
        
        field = "email address";
        target = "wonderwoman@theamazon.net";
        printData(contacts, target, field);
        
        field = "relation";
        target = "Friend";
        printData(contacts, target, field);
        
        field = "name";
        target = "Lionel Messi";
        printData(contacts, target, field);
        
        field = "birth month";
        target = "December";
        printData(contacts, target, field);
    }
}
