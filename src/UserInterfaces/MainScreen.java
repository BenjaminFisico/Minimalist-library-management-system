package UserInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 */
public class MainScreen extends JFrame{
    
    // Component declaration.
    private JPanel jPnlNav;
    private JPanel jPnlBookImgs;
    private JPanel jPnlBookDesc;
    
    private JPanel jPnlImg1;
    private JTextField jTSrBook;
    private JButton jBtnChgImg;
    // Proporties declaration
    private Color focusColor = new Color(0, 0, 0);
    private Color lstFocusColor = new java.awt.Color(153, 153, 153);
    private Font firstFont = new Font("Segoe UI", 0, 14);
    
    //Constructors
    public MainScreen(){
        Init();
    }
    
    public MainScreen(Font frsFont){
        this.firstFont = frsFont;
        Init();
    }
    
    //Used to initialize all components and properties of the screen.
    private void Init(){
        // This Jframe 
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setTitle("Library Management System - V 0.0");
        
        jPnlNav = new JPanel();
        jPnlNav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPnlNav.setSize(150,600);
        
        this.getContentPane().add(jPnlNav);
        
    }
}
