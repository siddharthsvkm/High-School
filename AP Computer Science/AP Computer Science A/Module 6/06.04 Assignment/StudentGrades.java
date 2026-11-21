
/**
 * StudentGrades Object class
 *
 * @author Siddharth Sivakumar
 * @version November 2024
 */
public class StudentGrades
{
    private String studentName;
    private int[] studentGrades;

    // Constructors
    public StudentGrades()
    {

    }
    
    public StudentGrades(String name)
    {
        studentName = name;
    }
    
    public StudentGrades(String name, int[] grades)
    {
        studentName = name;
        studentGrades = grades;
    }

    
    // Difference
    public double calculateDifference(int[] grades)
    {
        return grades[1] - (double)grades[0];
    }
    
    public double calculateDifference()
    {
        return studentGrades[1] - (double)studentGrades[0];
    }
    
    
    // Average
    public double calculateAverage(int[] grades)
    {
        return (grades[1] + grades[0]) / (double)2;
    }
    
    public double calculateAverage()
    {
        return (studentGrades[1] + studentGrades[0]) / (double)2;
    }
    
    
    //toString
    public String toString() {
        return String.format("%12s%16s%16s%16.2f%16.2f", studentName, studentGrades[0], studentGrades[1], this.calculateDifference(), this.calculateAverage());
    }
    
    
    // Setter methods
    public void setName(String name) {
        studentName = name;
    }
    
    public void setGrades(int[] grades) {
        studentGrades = grades;
    }
    
    
    // Getter methods
    public int[] getGrades() {
        return studentGrades;
    }
    
    public String getName() {
        return studentName;
    }
    
}
