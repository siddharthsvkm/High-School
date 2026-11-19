
/**
 * StudentGrades Tester class
 *
 * @author Siddharth Sivakumar
 * @version November 2024
 */
public class StudentGradesTester
{
    public static void main(String[] args)
    {
        // Format
        System.out.printf("%45s\n", "Quiz Results");
        System.out.printf("%12s%16s%16s%16s%16s\n", "Student Name", "Quiz1 Grade", "Quiz2 Grade", "Difference", "Average");
        System.out.println("=".repeat(16 * 5));
        
        // Grades for each student in array
        int[] student1 = {92, 88};
        int[] student2 = {78, 85};
        int[] student3 = {93, 80};
        int[] student4 = {92, 95};
        int[] student5 = {95, 98};
        
        // Store instances in array
        StudentGrades[] people = 
        {
            new StudentGrades("Aaron", student1),
            new StudentGrades("Blake", student2),
            new StudentGrades("Jaqueline", student3),
            new StudentGrades("Denis", student4),
            new StudentGrades("Siddharth", student5)
        };
        // Prints data in array
        for (StudentGrades information: people) {
            System.out.println(information.toString());
        }
    }
}
