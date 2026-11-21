/**
 * Candidate Implementation Class - Array Version
 *
 * @author Siddharth Sivakumar
 * @version December 2024
 */


public class ElectionTesterV3
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
    
    
    public static Candidate[] setName(Candidate[] candidates, String name, String replaceName)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
                candidates[x].setName(replaceName);
        }
        return candidates;
    }
    public static Candidate[] setVotes(Candidate[] candidates, String name, int replaceVotes)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
                candidates[x].setVotes(replaceVotes);
        }
        return candidates;
    }
    public static Candidate[] setNameAndVotes(Candidate[] candidates, String name, String replaceName, int replaceVotes)
    {
        for (int x = 0; x < candidates.length; x++)
        {
            if (candidates[x].getName().equals(name))
            {
                candidates[x].setVotes(replaceVotes);
                candidates[x].setVotes(replaceVotes);
            }
        }
        return candidates;
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
         new Candidate("Shawn Rendes", 225),
         new Candidate("Caleb Darrell", 81),
        };
        
        System.out.println(" Original Results:");
        printSummary(candidates);
        
        System.out.println(); 
        System.out.println(); 
        
        String origName = "Bruce Banner";
        String changeName = "Stan Lee";
        System.out.println("<< Changing " + origName + " to " + changeName + " >>");
        candidates = setName(candidates, origName, changeName);
        printSummary(candidates);
        
        System.out.println(); 
        System.out.println(); 
        
        origName = "Henry Pym";
        int changeVotes = 284;
        System.out.println("<< Changing " + origName + " votes to " + changeVotes + " >>");
        candidates = setVotes(candidates, origName, changeVotes);
        printSummary(candidates);
        
        System.out.println(); 
        System.out.println(); 
        
        origName = "Caleb Darrell";
        changeName = "Harry Maguire";
        changeVotes = 308;
        System.out.println("<< Changing " + origName + " to " + changeName + " and votes to " + changeVotes + " >>");
        candidates = setNameAndVotes(candidates, origName, changeName, changeVotes);
        printSummary(candidates);
    }
}
