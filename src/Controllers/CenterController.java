package Controllers;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 */
public class CenterController {
    private UiController uiController;
    private DbController dataBase = null;

    public CenterController() {
        uiController = new UiController();
        System.out.println("Okey let's GO!");
    }
    
    private DbController getDB(){
    if (dataBase == null){
        dataBase = new DbController();
    }
    return dataBase;
    }
    
}
