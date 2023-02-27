package Controllers;

import UserInterfaces.ConfigFrame;
import UserInterfaces.ShowBooksFrame;
import java.util.ArrayList;
import javax.swing.JFrame;
import libraryClasses.*;

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
    private CenterController CenterC;

    public UiController(CenterController c) {
        // Instanciate all screens.
        allScreens.add(new ShowBooksFrame(this));
        allScreens.add(new ConfigFrame(this));
        
        activeScreen = allScreens.get(0);
        activeScreen.setVisible(true);
        
        this.CenterC = c;
    }
    
    public void ChangeFrame(int index){
        activeScreen.setVisible(false);
        activeScreen = allScreens .get(index);
        activeScreen.setVisible(true);
        CallDbGetMembers();
    }
    
    public ArrayList<Member> CallDbGetMembers(){
        return CenterC.getDB().GetMembers("");
    }
    
    public String[] CallDbGetMembersName(){
        return CenterC.getDB().GetMembersName("");
    }
    
    public void CallDbSaveMember(Member member){
        if (CenterC.getDB().SaveMember(member)){
            System.out.println("EXITO");
        } else {
            System.out.println("FALLO");
        }
    }
    
    
       
}
