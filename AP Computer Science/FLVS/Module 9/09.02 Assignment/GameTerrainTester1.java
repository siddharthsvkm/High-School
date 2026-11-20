
/**
 * This class tests the Terrain class hierarchy.
 *
 * @author Siddharth Sivakumar
 * @version January 2025
 */
public class GameTerrainTester1
{
    public static void printData(String terrain)
    {
        System.out.println(" " + terrain);
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        Terrain1 land = new Terrain1(150, 240);
        Forest1 black = new Forest1(400, 400, 180);
        Mountain1 fuji = new Mountain1(600, 200, 12);
        WinterMountain1 everest = new WinterMountain1(500, 500, 30, 12.24);
        
        RainForest1 amazon = new RainForest1(500, 800, 1000, 2000);
        Beach1 sidious = new Beach1(50, 200, 7); 
        
        printData(land.getTerrainSize());
        
        printData(black.getForestSize());
        
        printData(fuji.getMountainSize());
        
        printData(everest.getWinterMountainSize());
        
        printData(amazon.getRainForestSize());
        
        printData(sidious.getBeachSize());
    }
}
