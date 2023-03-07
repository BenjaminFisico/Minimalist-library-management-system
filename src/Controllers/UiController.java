package Controllers;

import UserInterfaces.ConfigFrame;
import UserInterfaces.ShowBooksFrame;
import java.util.ArrayList;
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
    
    private JFrame activeScreen;
    private ArrayList<JFrame> allScreens = new ArrayList<>();

    public UiController() {
        // Instanciate all screens.
        allScreens.add(new ShowBooksFrame(this));
        allScreens.add(new ConfigFrame(this));
        
        activeScreen = allScreens.get(0);
        activeScreen.setVisible(true);
    }
    
    public void ChangeFrame(int index){
        activeScreen.setVisible(false);
        activeScreen = allScreens .get(index);
        activeScreen.setVisible(true);
    }
       
}
