
/**
 * Candidate Implementation Class - ArrayList Version
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

import java.util.ArrayList;
public class ElectionTesterV8
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
    
    
    public static void setName(ArrayList <Candidate> candidates, String name, String replaceName)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
                person.setName(replaceName);
        }
    }
    public static void setVotes(ArrayList <Candidate> candidates, String name, int replaceVotes)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
                person.setVotes(replaceVotes);
        }
    }
    public static void setNameAndVotes(ArrayList <Candidate> candidates, String name, String replaceName, int replaceVotes)
    {
        for (Candidate person: candidates)
        {
            if (person.getName().equals(name))
            {
                person.setVotes(replaceVotes);
                person.setVotes(replaceVotes);
            }
        }
    }
    
    
    public static void insertLocation(ArrayList <Candidate> candidates, int position, String candidateName, int candidateVotes)
    {
        candidates.add(position, new Candidate(candidateName, candidateVotes));
    }
    public static void insertBeforeName(ArrayList <Candidate> candidates, String name, String candidateName, int candidateVotes)
    {
        int currentPosition = 0;
        for (int x = 0; x < candidates.size(); x++) 
        {
            if (candidates.get(x).getName().equals(name))
                currentPosition = x;
        }
        
        candidates.add(currentPosition, new Candidate(candidateName, candidateVotes));
    }
    
    
    public static void deleteByPosition(ArrayList <Candidate> candidates, int position)
    {
        int length = candidates.size();
        if (position >= 0 && position < length)
            candidates.remove(position);
    }
    public static void deleteByName(ArrayList <Candidate> candidates, String name)
    {
        int length = candidates.size();
        int position = -1;
        for (int x = 0; x < length; x++)
        {
            if (candidates.get(x) != null && candidates.get(x).getName().equals(name)) //shortcircuiting
                position = x;
        } 
        
        if (position >= 0 && position < length)
            candidates.remove(position);
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
        candidates.add(new Candidate("Steve Rogers", 225));
        candidates.add(new Candidate("Carol Danvers", 451));
        candidates.add(new Candidate("Pepper Potts", 634));
        candidates.add(new Candidate("Phil Coulson", 235));
        candidates.add(new Candidate("Maria Hill", 204));
        
        printSummary(candidates);
        System.out.println(); 
        
        int position = 4;
        System.out.println("<<Delete position " + position + ">>");
        deleteByPosition(candidates, position);
        printSummary(candidates);
        System.out.println(); 
        
        String deleteName = "Henry Pym";
        System.out.println("<<Delete " + deleteName + ">>");
        deleteByName(candidates, deleteName);
        printSummary(candidates);
    }
}
