
/**
 * Student class
 *
 * @author Siddharth Sivakumar
 * @version January 2024
 */
public class StudentGrade
{
    private String studentName;
    private int[] quizScores = new int[5];
    
    public StudentGrade(String name, int score1, int score2, int score3, int score4, int score5)
    {
        studentName = name;
        quizScores[0] = score1;
        quizScores[1] = score2;
        quizScores[2] = score3;
        quizScores[3] = score4;
        quizScores[4] = score5;
    }

    
    public int getGrade(int quizNumber)
    {
        return quizScores[quizNumber - 1];
    }
    public void setGrade(int quizNumber, int quizScore)
    {
        quizScores[quizNumber - 1] = quizScore;
    }
    
    
    public String getName()
    {
        return studentName;
    }
    public void setName(String name)
    {
         studentName = name;
    }
    
    
    public String toString()
    {
        return String.format("%-17s %5d %5d %5d %5d %5d \n", studentName, quizScores[0], quizScores[1], quizScores[2], quizScores[3], quizScores[4]);
    }
}
