
/**
 * Candidate Implementation Class - Array Version
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */


public class ElectionTesterV5
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
    
    
    public static void printSummary(Candidate[] candidates)
    { 
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
        {new Candidate("Tony Stark", 751),
         new Candidate("Henry Pym", 496),                                
         new Candidate("Bruce Banner", 303),             
         new Candidate("Steve Rogers", 225),
         new Candidate("Carol Danvers", 81),
        };
        
        System.out.println(" Original Results:");
        printSummary(candidates);
        
        System.out.println(); 
        
        String addName = "Nick Fury";
        int addVotes = 518;
        int position = 2;
        System.out.println("<<In position " + position + ", add " + addName + ", " + addVotes + " votes>>");
        insertLocation(candidates, position, addName, addVotes);
        printSummary(candidates);
        
        System.out.println(); 
        
        addName = "Clint Barton";
        addVotes = 426;
        String nameBefore = "Bruce Banner";
        System.out.println("<<Before " + nameBefore + ", add " + addName + ", " + addVotes + " votes>>");
        insertBeforeName(candidates, nameBefore, addName, addVotes);
        printSummary(candidates);
    }
}
