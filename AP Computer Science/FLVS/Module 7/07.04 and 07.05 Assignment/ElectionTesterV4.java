/**
 * Candidate Implementation Class - ArrayList Version
 *
 * @author Siddharth Sivakumar
 * @version December 2024
 */

import java.util.ArrayList;
public class ElectionTesterV4
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
    
    
    public static ArrayList<Candidate> setName(ArrayList <Candidate> candidates, String name, String replaceName)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
                person.setName(replaceName);
        }
        return candidates;
    }
    public static ArrayList<Candidate> setVotes(ArrayList <Candidate> candidates, String name, int replaceVotes)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
                person.setVotes(replaceVotes);
        }
        return candidates;
    }
    public static ArrayList<Candidate> setNameAndVotes(ArrayList <Candidate> candidates, String name, String replaceName, int replaceVotes)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
            {
                person.setVotes(replaceVotes);
                person.setVotes(replaceVotes);
            }
        }
        return candidates;
    }
    
    
    public static void printSummary(ArrayList <Candidate> candidates)
    { 
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
        
        candidates.add(new Candidate("Tony Stark", 751));
        candidates.add(new Candidate("Henry Pym", 496));                             
        candidates.add(new Candidate("Bruce Banner", 303));             
        candidates.add(new Candidate("Shawn Rendes", 225));
        candidates.add(new Candidate("Caleb Darrell", 81));
        
        
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
