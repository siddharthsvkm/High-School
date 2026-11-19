
/**
 * Candidate Implementation Class - Array Version
 *
 * @author Siddharth Sivakumar
 * @version December 2024
 */


public class ElectionTesterV1
{
    public static void printData(Candidate[] candidates)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            System.out.println(" " + candidates[x].getName() + " recieved " + candidates[x].getVotes() + " votes.");
        }
    }
    
    public static int candidateVotes(Candidate[] candidates)
    {
        int totalVotes = 0;
        for (int x = 0; x < candidates.length; x++)
        {
            totalVotes += candidates[x].getVotes();
        }
        
        return totalVotes;
    }
    
    public static void printSummary(Candidate[] candidates)
    {
        System.out.println(" Election Results:"); 
        System.out.println(); 
        System.out.printf(" %-15s %-20s %s\n", "Candidate", "Votes Received", "% of Total Votes"); 
        System.out.println("========================================================");
        
        
        int totalVotes = candidateVotes(candidates);
        for (int x = 0; x < candidates.length; x++)
        {
            String name = candidates[x].getName();
            int votes = candidates[x].getVotes();
            double percentageVotes = (double)votes / totalVotes * 100;
            
            System.out.printf(" %-16s %9d %19.2f \n", name, votes, percentageVotes);
            
        }
        System.out.println(); 
        System.out.println("The total number of votes is: " + totalVotes); 
    }
    
    public static void main(String[] args)
    {
        Candidate[] candidates = 
        {new Candidate("Tony Stark", 3691),
         new Candidate("Henry Pym", 2691),                                
         new Candidate("Blake Butler", 1962),             
         new Candidate("Shawn Rendes", 1491),
         new Candidate("Caleb Darrell", 1968),
        };
        
        System.out.println(" Raw Election Data:"); 
        System.out.println(); 
        printData(candidates);
        System.out.println(); 
        System.out.println(); 
        printSummary(candidates);
        
    }
}
