
/**
 * The purpose of this program is to create an object class.
 *
 * @author Siddharth Sivakumar
 * @version October 2024
 */
public class Avatar
{
    private String avatarName;
    private int avatarLevel;

    public Avatar(String name, int level)
    {
        avatarName = name;
        if (level >= 0)
            avatarLevel = level;
    }

    public String getName() 
    {
        return avatarName;
    }
    public int getLevel() 
    {
        return avatarLevel;
    }
    
    public void setName(String newName)
    {
        avatarName = newName;
    }
    public void updateLevel(int changeLevel)
    {
        avatarLevel += changeLevel;
        if (!(avatarLevel >= 0))
            avatarLevel = 0;
    }
}
