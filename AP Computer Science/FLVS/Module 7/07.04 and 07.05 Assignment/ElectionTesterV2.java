
/**
 * Candidate Implementation Class - ArrayList Version
 *
 * @author Siddharth Sivakumar
 * @version December 2024
 */

import java.util.ArrayList;
public class ElectionTesterV2
{
    public static void printData(ArrayList <Candidate> candidates)
    {
        for (Candidate person: candidates)
        {
            System.out.println(" " + person.getName() + " recieved " + person.getVotes() + " votes.");
        }
    }
    
    public static int candidateVotes(ArrayList <Candidate> candidates)
    {
        int totalVotes = 0;
        for (Candidate person: candidates)
        {
            totalVotes += person.getVotes();
        }
        
        return totalVotes;
    }
    
    public static void printSummary(ArrayList <Candidate> candidates)
    {
        System.out.println(" Election Results:"); 
        System.out.println(); 
        System.out.printf(" %-15s %-20s %s\n", "Candidate", "Votes Received", "% of Total Votes"); 
        System.out.println("========================================================");
        
        
        int totalVotes = candidateVotes(candidates);
        for (Candidate person: candidates)
        {
            String name = person.getName();
            int votes = person.getVotes();
            double percentageVotes = (double)votes / totalVotes * 100;
            
            System.out.printf(" %-16s %9d %19.2f \n", name, votes, percentageVotes);
            
        }
        System.out.println(); 
        System.out.println("The total number of votes is: " + totalVotes); 
    }
    
    public static void main(String[] args)
    {
        ArrayList <Candidate> candidates = new ArrayList<Candidate>(5);
        
        candidates.add(new Candidate("Tony Stark", 3691));
        candidates.add(new Candidate("Henry Pym", 2691));                             
        candidates.add(new Candidate("Blake Butler", 1962));             
        candidates.add(new Candidate("Shawn Rendes", 1491));
        candidates.add(new Candidate("Caleb Darrell", 1968));
    
        
        System.out.println(" Raw Election Data:"); 
        System.out.println(); 
        printData(candidates);
        System.out.println(); 
        System.out.println(); 
        printSummary(candidates);
        
    }
}
