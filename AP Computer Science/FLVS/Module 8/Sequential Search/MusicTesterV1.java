
/**
 * Music Tester Class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class MusicTesterV1
{
    public static void printMusic(Music[] musics)
    {
        System.out.printf(" %-25s %4s   %-20s \n", "Song Title", "Year", "Artist Name");
        System.out.println("-------------------------------------------------------");
        for (Music element: musics)
        {
            System.out.println(element.toString());
        }
    }
    
    public static int searchTitle(Music[] musics, String title)
    {
        int index = -1;
        int length = musics.length;
        
        for (int x = 0; x < length; x++)
        {
            if (musics[x].getTitle().equals(title))
            {
                index = x;
                break;
            }
        }
        return index;
    }
    public static String[] searchYear(Music[] musics, int year)
    {
        int length = musics.length;
        String[] musicInYear = new String[length];
        int matches = 0;
        
        for (int x = 0; x < length; x++)
        {
            if (musics[x].getYear() == year)
            {
                musicInYear[matches] = musics[x].getTitle();
                matches += 1;
            }
        }
        return musicInYear;
    }
    public static String[] searchArtist(Music[] musics, String artist)
    {
        int length = musics.length;
        String[] musicByArtist = new String[length];
        int matches = 0;
        
        for (int x = 0; x < length; x++)
        {
            if (musics[x].getArtist().equals(artist))
            {
                musicByArtist[matches] = musics[x].getTitle();
                matches += 1;
            }
        }
        return musicByArtist;
    }
    
    //Print matches/searches
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
        
        System.out.println(" Matches for " + matches + " songs in the year " + year + " were found.");
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
            String number = " or was ranked #";
            System.out.println(song + title + find + index + number + (index+1) + " in the array.");
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
                          
        printMusic(musics);
        
        String title = "Thick Of It";
        printSearch(title, searchTitle(musics, title));
        
        int year = 2020;
        printSearch(musics, searchYear(musics, year), year);
        
        String artist = "Michael Jackson";
        printSearch(musics, searchArtist(musics, artist), artist);
    }
}
