package Controllers;

import UserInterfaces.MainScreen;
import UserInterfaces.ShowBooksFrame;
import javax.swing.JFrame;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 */
public class UiController {
    
    private JFrame ActiveScreen;

    public UiController() {
        //ActiveScreen = new MainScreen();
        ActiveScreen = new ShowBooksFrame();
        ActiveScreen.setVisible(true);
    }
       
}
