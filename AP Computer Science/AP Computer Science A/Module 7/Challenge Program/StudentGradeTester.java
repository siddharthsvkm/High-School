
/**
 * Client Class
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */

import java.util.ArrayList;
public class StudentGradeTester
{
    public static void printGrades(ArrayList <StudentGrade> students)
    {
        System.out.println();
        System.out.printf("%-19s %3s %5s %5s %5s %5s \n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("------------------------------------------------------");
        
        for (StudentGrade person: students)
        {
            String name = person.getName();
            int score1 = person.getGrade(1);
            int score2 = person.getGrade(2);
            int score3 = person.getGrade(3);
            int score4 = person.getGrade(4);
            int score5 = person.getGrade(5);
            System.out.print(person.toString());
        }
    }

    public static void replaceName(ArrayList <StudentGrade> students, String replaceName, String newName)
    {
        for (StudentGrade person: students)
        {
            if (person.getName().equals(replaceName))
                person.setName(newName);
        }
    }
    public static void replaceGrade(ArrayList <StudentGrade> students, String name, int quizNumber, int newScore)
    {
        for (StudentGrade person: students)
        {
            if (person.getName().equals(name))
                person.setGrade(quizNumber, newScore);
        }
    }
    public static void replaceStudent(ArrayList <StudentGrade> students, String replaceName, String newName, int[] scores)
    {
        int location = 0;
        for (StudentGrade person: students)
        {
            if (person.getName().equals(replaceName))
                students.set(location, new StudentGrade(newName, scores[0], scores[1], scores[2], scores[3], scores[4]));
            else
                location += 1;
        }
    }
    
    public static void insertBeforeStudent(ArrayList <StudentGrade> students, String beforeName, String newName, int[] scores)
    {
        int location = -1;
        for (int x = 0; x < students.size(); x++)
        {
            if (students.get(x).getName().equals(beforeName))
                location = x;
        }
        if (location >= 0)
            students.add(location, new StudentGrade(newName, scores[0], scores[1], scores[2], scores[3], scores[4]));

    }
    
    public static void deleteName(ArrayList <StudentGrade> students, String deleteName)
    {
        int location = -1;
        for (int x = 0; x < students.size(); x++)
        {
            if (students.get(x) != null && students.get(x).getName().equals(deleteName))
                location = x;
        }
        
        if (location >= 0)
            students.remove(location);
    }
    
    public static void main(String[] args)
    {
        ArrayList <StudentGrade> students = new ArrayList <StudentGrade>(5);
        
        students.add(new StudentGrade("Don Ronaldo"  , 89, 90, 98, 92, 88));
        students.add(new StudentGrade("Neymar Júnior", 99, 95, 97, 95, 98));
        students.add(new StudentGrade("Luis Suárez"  , 81, 86, 80, 85, 90));
        students.add(new StudentGrade("Mohamed Salah", 80, 88, 90, 85, 80));
        students.add(new StudentGrade("Son Heung-min", 88, 82, 91, 87, 89));
        
        System.out.println(" Starting Gradebook:");
        printGrades(students);
        System.out.println();
        System.out.println();
        
        String replaceName = "Son Heung-min";
        String newName = "Kylian Mbappé";
        System.out.println("<<Replacing the name " + replaceName + " with " + newName + ">>");
        replaceName(students, replaceName, newName);
        printGrades(students);
        System.out.println();
        System.out.println();
        
        replaceName = "Neymar Júnior";
        int quizNumber = 1;
        int newScore = 50;
        System.out.println("<<Replacing " + replaceName + "'s Q" + quizNumber + " grade to " + newScore + ">>");
        replaceGrade(students, replaceName, quizNumber, newScore);
        printGrades(students);
        System.out.println();
        System.out.println();
        
        replaceName = "Don Ronaldo";
        newName = "Lionel Messi";
        int[] newScores = {99, 97, 94, 93, 95};
        System.out.println("<<Replacing " + replaceName + "'s status as a student with " + newName + ">>");
        replaceStudent(students, replaceName, newName, newScores);
        printGrades(students);
        System.out.println();
        System.out.println();
        
        String beforeName = "Neymar Júnior";
        newName = "Vinícius Júnior";
        int[] scores = {89, 87, 84, 83, 85};
        System.out.println("<<Adding " + newName + " as a student before " + beforeName + ">>");
        insertBeforeStudent(students, beforeName, newName, scores);
        printGrades(students);
        System.out.println();
        System.out.println();
        
        String deleteName = "Mohamed Salah";
        System.out.println("<<Removing " + deleteName + "'s status as a student and from the class>>");
        deleteName(students, deleteName);
        printGrades(students);
        System.out.println();
    }
}
