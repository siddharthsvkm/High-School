
/**
 * Music Tester Class - Binary Search Methods
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class MusicTesterV3
{
    // Print Array
    public static void printMusic(Music[] musics)
    {
        System.out.printf(" %-25s %4s   %-20s \n", "Song Title", "Year", "Artist Name");
        System.out.println("-------------------------------------------------------");
        for (Music element: musics)
        {
            System.out.println(element.toString());
        }
    }
    
    // Sort methods
    // Sort song titles in ascending order through selection sort
    public static Music[] sortTitle(Music[] musics) 
    {
        int length = musics.length - 1;
        
        for (int x = length; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (musics[y].getTitle().compareTo(musics[index].getTitle()) > 0)
                    index = y;
            }
            
            Music temp = musics[x];
            musics[x] = musics[index];
            musics[index] = temp;
        }
        return musics;
    }
    // Sort song years in ascending order through selection sort
    public static Music[] sortYear(Music[] musics) 
    {
        int length = musics.length - 1;
        
        for (int x = length; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (musics[y].getYear() > musics[index].getYear())
                    index = y;
            }
            
            Music temp = musics[x];
            musics[x] = musics[index];
            musics[index] = temp;
        }
        return musics;
    }
    // Sort artist names in ascending order through selection sort
    public static Music[] sortArtist(Music[] musics) 
    {
        int length = musics.length - 1;
        
        for (int x = length; x > 0; x--)
        {
            int index = 0;
            for (int y = 1; y <= x; y++)
            {
                if (musics[y].getArtist().compareTo(musics[index].getArtist()) > 0)
                    index = y;
            }
            
            Music temp = musics[x];
            musics[x] = musics[index];
            musics[index] = temp;
        }
        return musics;
    }
    
    
    // Search methods
    public static int searchTitle(Music[] musics, String title)
    {
        int low = 0;
        int high = musics.length - 1;
        int index = -1;
        while (low <= high)
        {
            int middle = (high + low) / 2;

            if (musics[middle].getTitle().compareTo(title) > 0)
            {
                high = middle - 1;
            }
            else if (musics[middle].getTitle().compareTo(title) < 0)
            {
                low = middle + 1;
            }
            else
            {
                index = middle;
                return index;
            }
        }
        return index;
    }
    public static String[] searchYear(Music[] musics, int year)
    {
        int low = 0;
        int high = musics.length - 1;
        int index = -1;
        while (low <= high)
        {
            int middle = (high + low) / 2;

            if (musics[middle].getYear() > year)
            {
                high = middle - 1;
            }
            else if (musics[middle].getYear() < year)
            {
                low = middle + 1;
            }
            else
            {
                index = middle;
                return linearLoc(musics, index, year);
            }
        }
        String[] nothing = {null};
        return nothing;
    }
    public static String[] searchArtist(Music[] musics, String artist)
    {
        int low = 0;
        int high = musics.length - 1;
        int index = -1;
        while (low <= high)
        {
            int middle = (high + low) / 2;

            if (musics[middle].getArtist().compareTo(artist) > 0)
            {
                high = middle - 1;
            }
            else if (musics[middle].getArtist().compareTo(artist) < 0)
            {
                low = middle + 1;
            }
            else
            {
                index = middle;
                return linearLoc(musics, index, artist);
            }
        }
        String[] nothing = {null};
        return nothing;
    }
    
    // Methods to assist with printing all matches after a binary search
    public static String[] linearLoc(Music[] musics, int index, int target)
    {
        int length = musics.length;
        int highest = index;
        int lowest = index;
        int i = lowest - 1;
        String[] musicInYear;
        
        while (i >= 0 && musics[i].getYear() == target)
        {
            lowest = i;
            i--;
        }
        
        i = highest + 1;
        while (i < length && musics[i].getYear() == target)
        {
            highest = i;
            i++;
        }
        
        musicInYear = new String[highest - lowest + 1];
        for (int x = lowest; x <= highest; x++)
        {
            musicInYear[x - lowest] = musics[x].getTitle();
        }
        
        return musicInYear;
    }
    public static String[] linearLoc(Music[] musics, int index, String target)
    {
        int length = musics.length;
        int highest = index;
        int lowest = index;
        int i = lowest - 1;
        String[] musicInYear;
        
        while (i >= 0 && musics[i].getArtist().compareTo(target) == 0) // I did compareTo due previous confirmations to do so
        {
            lowest = i;
            i--;
        }
        
        i = highest + 1;
        while (i < length && musics[i].getArtist().compareTo(target) == 0)
        {
            highest = i;
            i++;
        }
        
        musicInYear = new String[highest - lowest + 1];
        for (int x = lowest; x <= highest; x++)
        {
            musicInYear[x - lowest] = musics[x].getTitle();
        }
        
        return musicInYear;
    }
    
    //Print matches/search results (overloading)
    public static void printSearch(Music[] musics, String[] musicByArtist, String artist)
    {
        System.out.println();
        System.out.println();
        System.out.println(" <<Looking for songs performed by artist " + artist + ">>");
        int matches = 0;
        for (int x = 0; x < musicByArtist.length; x++)
        {
            if (musicByArtist[x] == null)
                break;
            matches += 1;
        }
        
        System.out.println(" " + matches + " songs performed by artist " + artist + " were found.");
        if (matches != 0) 
        {
            for (int x = 0; x < matches; x++)
            {
                System.out.println(" " + (x+1) + ". " + musicByArtist[x]);
            }
        }
    }
    public static void printSearch(Music[] musics, String[] musicByArtist, int year)
    {
        System.out.println();
        System.out.println();
        System.out.println(" <<Looking for songs created in the year " + year + ">>");
        int matches = 0;
        for (int x = 0; x < musicByArtist.length; x++)
        {
            if (musicByArtist[x] == null)
                break;
            matches += 1;
        }
        
        System.out.println(" " + matches + " songs in the year " + year + " were found.");
        if (matches != 0) 
        {
            for (int x = 0; x < matches; x++)
            {
                System.out.println(" " + (x+1) + ". " + musicByArtist[x]);
            }
        }
    }
    public static void printSearch(String title, int index)
    {
        System.out.println();
        System.out.println();
        System.out.println(" <<Looking for the song '" + title + "'>>");
        if (index < 0)
        {
            System.out.println(" No occurences of the song '" + title + "' could be found.");
        }
        else
        {
            String song = " The song '";
            String find = "' was found at index ";
            System.out.println(song + title + find + index + " in the array.");
        }
    }
    
    
    public static void main(String[] args)
    {
        Music[] musics = {new Music("Smooth Criminal", 1987, "Michael Jackson"),
                          new Music("Better Now", 2019, "Post Malone"),
                          new Music("Fine Line", 2019, "Harry Styles"),
                          new Music("Watermelon Sugar", 2020, "Harry Styles"),
                          new Music("Butter", 2021, "BTS"),
                          new Music("Thriller", 1983, "Michael Jackson"),
                          new Music("Dynamite", 2020, "BTS"),
                          new Music("Save Your Tears", 2021, "The Weeknd"),
                          new Music("Circles", 2020, "Post Malone"),
                          new Music("Beat It", 1983, "Michael Jackson"),
                          new Music("Billie Jean", 1983, "Michael Jackson"),
                          new Music("Blinding Lights", 2020, "The Weeknd"),
                          new Music("Thick Of It", 2024, "KSI")};
        
        System.out.println(" Original Array: ");
        System.out.println();
        printMusic(musics);
        
        System.out.println();
        System.out.println();
        
        System.out.println(" Sorted Array by Title:");
        System.out.println();
        String title = "Thick Of It";
        printMusic(sortTitle(musics));
        printSearch(title, searchTitle(musics, title));
        
        
        System.out.println();
        System.out.println();
        
        System.out.println(" Sorted Array by Year:");
        System.out.println();
        int year = 2020;
        printMusic(sortYear(musics));
        printSearch(musics, searchYear(musics, year), year);
        
        System.out.println();
        System.out.println();
        
        System.out.println(" Sorted Array by Artist:");
        System.out.println();
        String artist = "Michael Jackson";
        printMusic(sortArtist(musics));
        printSearch(musics, searchArtist(musics, artist), artist);
    }
}
