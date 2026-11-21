
/**
 * Movie Client/Tester Class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class MoviesTesterV2
{
    public static void printMovies(Movie[] movies) 
    {
        System.out.println();
        System.out.printf(" %-30s %4s   %-20s\n", "Movie Title", "Year", "Studio");
        System.out.println("-----------------------------------------------------------------");
        for (Movie animation: movies)
        {
            System.out.println(animation.toString());
        }
    }
    
    public static Movie[] sortTitle(Movie[] movies, int option) 
    {
        int length = movies.length;
        Movie[] newArray = new Movie[length];
        for (int x = 0; x < length; x++)
        {
            int insertionIndex = 0;
            for (int y = x; y > 0; y--)
            {
                if (option == 1 && movies[x].getTitle().compareTo(newArray[y - 1].getTitle()) > 0)
                {
                    insertionIndex = y;
                    break;
                }
                else if (option == 2 && movies[x].getTitle().compareTo(newArray[y - 1].getTitle()) < 0) 
                {
                    insertionIndex = y;
                    break;
                }
                else
                {
                    newArray[y] = newArray[y - 1];
                }
            }
            newArray[insertionIndex] = movies[x];
        }
        
        return newArray;
    }
    public static Movie[] sortYear(Movie[] movies, int option) 
    {
        int length = movies.length;
        Movie[] newArray = new Movie[length];
        for (int x = 0; x < length; x++)
        {
            int insertionIndex = 0;
            for (int y = x; y > 0; y--)
            {
                if (option == 1 && movies[x].getYear() > newArray[y - 1].getYear())
                {
                    insertionIndex = y;
                    break;
                }
                else if (option == 2 && movies[x].getYear() < newArray[y - 1].getYear()) 
                {
                    insertionIndex = y;
                    break;
                }
                else
                {
                    newArray[y] = newArray[y - 1];
                }
            }
            newArray[insertionIndex] = movies[x];
        }
        
        return newArray;
    }
    public static Movie[] sortStudio(Movie[] movies, int option) 
    {
        int length = movies.length;
        Movie[] newArray = new Movie[length];
        for (int x = 0; x < length; x++)
        {
            int insertionIndex = 0;
            for (int y = x; y > 0; y--)
            {
                if (option == 1 && movies[x].getStudio().compareTo(newArray[y - 1].getStudio()) > 0)
                {
                    insertionIndex = y;
                    break;
                }
                else if (option == 2 && movies[x].getStudio().compareTo(newArray[y - 1].getStudio()) < 0) 
                {
                    insertionIndex = y;
                    break;
                }
                else
                {
                    newArray[y] = newArray[y - 1];
                }
            }
            newArray[insertionIndex] = movies[x];
        }
        
        return newArray;
    }
    
    public static void printVersion(Movie[] movies, int option, String order, String field) 
    {
        System.out.println();
        System.out.println();
        System.out.println("<<Sorting the movies array by " + field + " in " + order + " order>>");
        printMovies(movies);
    }
    
    public static void main(String [] args)
    {
        Movie[] movies = {new Movie("The Dark Knight", 2008, "Warner Bros."),
                          new Movie("The Godfather", 1972, "Paramount Pictures"),
                          new Movie("Avatar", 2009, "20th Century Fox"),
                          new Movie("Red One", 2024, "Amazon MGM Studios"),
                          new Movie("Juno", 2007, "Mandate Pictures"),
                          new Movie("Doctor Strange", 2016, "Marvel Studios"),
                          new Movie("The Karate Kid", 2010, "Columbia Pictures"),
                          new Movie("Aladdin", 2019, "Walt Disney Pictures"),
                          new Movie("Skyfall", 2012, "Eon Productions"),
                          new Movie("Furious 7", 2015, "Universal Pictures")};
        
        System.out.println(" Original Movie Array:");
        printMovies(movies);
        
        printVersion(sortTitle(movies, 1), 1, "ascending", "movie title");
        printVersion(sortTitle(movies, 2), 2, "descending", "movie title");
        
        printVersion(sortYear(movies, 1), 1, "ascending", "year");
        printVersion(sortYear(movies, 2), 2, "descending", "year");
        
        printVersion(sortStudio(movies, 1), 1, "ascending", "studio");
        printVersion(sortStudio(movies, 2), 2, "descending", "studio");
    }
}
