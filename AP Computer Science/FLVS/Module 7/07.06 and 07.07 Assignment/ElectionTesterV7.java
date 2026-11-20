
/**
 * Candidate Implementation Class - Array Version
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */


public class ElectionTesterV7
{
    
    public static void printData(Candidate[] candidates)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x] != null)
                System.out.println(" " + candidates[x].getName() + " recieved " + candidates[x].getVotes() + " votes.");
        }
    }
    public static int candidateVotes(Candidate[] candidates)
    {
        int totalVotes = 0;
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x] != null)
                totalVotes += candidates[x].getVotes();
        }
        
        return totalVotes;
    }
    
    
    public static void setName(Candidate[] candidates, String name, String replaceName)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
                candidates[x].setName(replaceName);
        }
    }
    public static void setVotes(Candidate[] candidates, String name, int replaceVotes)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
                candidates[x].setVotes(replaceVotes);
        }
    }
    public static void setNameAndVotes(Candidate[] candidates, String name, String replaceName, int replaceVotes)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
            {
                candidates[x].setVotes(replaceVotes);
                candidates[x].setVotes(replaceVotes);
            }
        }
    }
    
    
    public static void insertLocation(Candidate[] candidates, int position, String candidateName, int candidateVotes)
    {
        for (int x = candidates.length - 1; x > position; x--) 
        {
            candidates[x] = candidates[x - 1];
        }
        candidates[position] = new Candidate(candidateName, candidateVotes);
    }
    public static void insertBeforeName(Candidate[] candidates, String name, String candidateName, int candidateVotes)
    {
        int currentPosition = 0;
        for (int x = 0; x < candidates.length; x++) 
        {
            if (candidates[x].getName().equals(name))
                currentPosition = x;
        }
        
        for (int x = candidates.length - 1; x > currentPosition; x--) 
        {
            candidates[x] = candidates[x - 1];
        }
        candidates[currentPosition] = new Candidate(candidateName, candidateVotes);
    }
    
    
    public static void deleteByPosition(Candidate[] candidates, int position)
    {
        int length = candidates.length;
        if (position >= 0 && position < length)
        {
            for (int x = position; x < length - 1; x++)
            {
                candidates[x] = candidates[x + 1];
            }
            candidates[length - 1] = null;
        }
    }
    public static void deleteByName(Candidate[] candidates, String name)
    {
        int length = candidates.length;
        int position = -1;
        for (int x = 0; x < length; x++)
        {
            if (candidates[x] != null && candidates[x].getName().equals(name)) //shortcircuiting
                position = x;
        } 
        
        if (position >= 0 && position < length)
        {
            for (int x = position; x < length - 1; x++)
            {
                candidates[x] = candidates[x + 1];
            }
            candidates[length - 1] = null;
        }
    }
    
    
    public static void printSummary(Candidate[] candidates)
    { 
        System.out.println(); 
        System.out.printf(" %-15s %-20s %s\n", "Candidate", "Votes Received", "% of Total Votes"); 
        System.out.println("========================================================");
        
        
        int totalVotes = candidateVotes(candidates);
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x] != null)
            {
                String name = candidates[x].getName();
                int votes = candidates[x].getVotes();
                double percentageVotes = (double)votes / totalVotes * 100;
            
                System.out.printf(" %-16s %9d %19.2f \n", name, votes, percentageVotes);
            }   
        }
        System.out.println(); 
        System.out.println("The total number of votes is: " + totalVotes); 
    }
    
    public static void main(String[] args)
    {
        Candidate[] candidates = 
        {new Candidate("Tony Stark", 751),
         new Candidate("Henry Pym", 496),                                
         new Candidate("Bruce Banner", 303),             
         new Candidate("Steve Rogers", 225),
         new Candidate("Carol Danvers", 451),
         new Candidate("Pepper Potts", 634),
         new Candidate("Phil Coulson", 235),
         new Candidate("Maria Hill", 204)
        };
        
        
        printSummary(candidates);
        System.out.println(); 
        
        
        int deletePosition = 4;
        System.out.println("<<Delete position " + deletePosition + ">>");
        deleteByPosition(candidates, deletePosition);
        printSummary(candidates);
        System.out.println(); 
        
        
        String deleteName = "Henry Pym";
        System.out.println("<<Delete " + deleteName + ">>");
        deleteByName(candidates, deleteName);
        printSummary(candidates);
        System.out.println();
    }
}
