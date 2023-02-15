package UserInterfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 *
 *  This class contains all interfaces with users to work. 
 *  When Section are changed, frame does not swiped, but central panel swiped.
 * 
 */

public class ShowBooksFrame extends javax.swing.JFrame {
    
    // Style - attributes
    private Font mFrstFont = new Font("Segoe UI", 0, 17);
    private Font mScdFont = new Font("Segoe UI",0,17);
    private final Color bgFrsColor = new Color(242, 242, 242); // gray
    private final Color bgScdColor = new Color(204,204,204); // Dark gray.
    private final Color fontFrsColor = new Color(0,0,0); // black
    private final Color fontScdColor = new Color(153,0,0); // Dark red.
    private Timer timerExp;
    private Timer timerCon;
    private JPanel extendPanel;
    
    // Constructor
    public ShowBooksFrame() {
        initComponents();
        initTimers();
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Minimalist Management Library - V 0.0");
    }
    
    /*
    * This method is used to initializate the timer's actionListener.
    */
    private void initTimers(){
        // This timer is used to expand the jPanel that is set in extendPanel, then will stop itself.
        timerExp = new Timer(16, new ActionListener (){
            public void actionPerformed(ActionEvent e) {
                if (extendPanel.getHeight() < extendPanel.getMaximumSize().height){
                    extendPanel.setSize(extendPanel.getWidth(), extendPanel.getHeight() +5);
                    // If the panel is the first child of its parent, move the other child DOWN. 
                    if (extendPanel.getParent().getComponent(0) == extendPanel){
                        JPanel movePanel = (JPanel)extendPanel.getParent().getComponent(1);
                        movePanel.setLocation(movePanel.getX(), movePanel.getY() + 5);
                    }
                } else {
                    timerExp.stop();
                }
            }
        });
        
        // This timer is used to contract the jPanel that is set in extendPanel, then stop itself.
        timerCon = new Timer(16,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if (extendPanel.getHeight() > extendPanel.getComponent(0).getHeight() ){
                    extendPanel.setSize(extendPanel.getWidth(), extendPanel.getHeight() -3);
                    // If the panel is the first child of its parent, move the other child UP. 
                     if (extendPanel.getParent().getComponent(0) == extendPanel){
                        JPanel movePanel = (JPanel)extendPanel.getParent().getComponent(1);
                        movePanel.setLocation(movePanel.getX(), movePanel.getY() - 2);
                    }
                } else {
                    timerCon.stop();
                }
            }
        });
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPnlAddBkContent = new javax.swing.JPanel();
        jPnlAddBkPnlContent = new javax.swing.JPanel();
        jTxtTtl = new javax.swing.JTextField();
        jTxtAthr = new javax.swing.JTextField();
        jBtnAddBk = new javax.swing.JButton();
        jTxtPgs = new javax.swing.JFormattedTextField();
        jScrGnr = new javax.swing.JScrollPane();
        jLstGenres = new javax.swing.JList<>();
        jBtnAddGnr = new javax.swing.JButton();
        jBtnDelGnr = new javax.swing.JButton();
        jPnlSeeIndBkContent = new javax.swing.JPanel();
        jPnlSeeIndBkPnlContent = new javax.swing.JPanel();
        jLblSeeTitle = new javax.swing.JLabel();
        jTxtSeeAthr = new javax.swing.JTextField();
        jTxtSeePgs = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLslSeeGnr = new javax.swing.JList<>();
        jBtnMod = new javax.swing.JButton();
        jPnlSeeImg = new javax.swing.JPanel();
        jPnlAddMbrContent = new javax.swing.JPanel();
        jBtnAddMbr = new javax.swing.JButton();
        jLblMbrName = new javax.swing.JLabel();
        jTxtMbrName = new javax.swing.JTextField();
        jLblMbrSurname = new javax.swing.JLabel();
        jTxtMbrSurname = new javax.swing.JTextField();
        jLblMbrFile = new javax.swing.JLabel();
        jTxtMbrFile = new javax.swing.JTextField();
        jLblMbrID = new javax.swing.JLabel();
        jTxtMbrID = new javax.swing.JTextField();
        jLblMbrStreet = new javax.swing.JLabel();
        jTxtMbrStreet = new javax.swing.JTextField();
        jLblMbrHNum = new javax.swing.JLabel();
        jTxtMbrHNum = new javax.swing.JTextField();
        jLblMbrFlat = new javax.swing.JLabel();
        jTxtMbrFlat = new javax.swing.JTextField();
        jLblMbrAge = new javax.swing.JLabel();
        jTxtMbrAge = new javax.swing.JFormattedTextField();
        jLblMbrTlp1 = new javax.swing.JLabel();
        jTxtMbrTlp1 = new javax.swing.JTextField();
        jLblMbrTlp2 = new javax.swing.JLabel();
        jTxtMbrTlp2 = new javax.swing.JTextField();
        jLblMbrTitleDetail = new javax.swing.JLabel();
        jPnlSeeAllMbrContent = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstMbrSrch = new javax.swing.JList<>();
        jTxtMbrSrch = new javax.swing.JTextField();
        jBtnMbrSrch = new javax.swing.JButton();
        jLblMbrSrchDetail = new javax.swing.JLabel();
        jPnlNav = new javax.swing.JPanel();
        jPnlSecOne = new javax.swing.JPanel();
        jLblShowBks = new javax.swing.JLabel();
        jPnlSecOneContent = new javax.swing.JPanel();
        jLblAddBk = new javax.swing.JLabel();
        jLblShowBksInd = new javax.swing.JLabel();
        jLblShowBksAll = new javax.swing.JLabel();
        jPnlSecTwo = new javax.swing.JPanel();
        jLblShowMbr = new javax.swing.JLabel();
        jPnlSecTwoContent = new javax.swing.JPanel();
        jLblAddMbr = new javax.swing.JLabel();
        jLblShowMbrAll = new javax.swing.JLabel();
        JpnlConfig = new javax.swing.JPanel();
        jLblConfig = new javax.swing.JLabel();
        jPnlIcon = new javax.swing.JPanel();
        jPnlSeeAllBkContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTxtSrchBk = new javax.swing.JTextField();
        jBtnSrchBk = new javax.swing.JButton();
        jLblSrchBk = new javax.swing.JLabel();
        jLblDetail = new javax.swing.JLabel();
        jPnlBottom = new javax.swing.JPanel();
        jPnlMaxRow = new javax.swing.JPanel();
        jSpnMaxRow = new javax.swing.JSpinner();
        jLblToolTipMaxRow = new javax.swing.JLabel();
        jPnlGenres = new javax.swing.JPanel();
        jCmbGenres = new javax.swing.JComboBox<>();

        jPnlAddBkContent.setBackground(bgScdColor);
        jPnlAddBkContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPnlAddBkPnlContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPnlAddBkPnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtTtl.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulo"));
        jPnlAddBkPnlContent.add(jTxtTtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 275, -1));

        jTxtAthr.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));
        jPnlAddBkPnlContent.add(jTxtAthr, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 53, 275, -1));

        jBtnAddBk.setText("Añadir");
        jPnlAddBkPnlContent.add(jBtnAddBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 107, 38));

        jTxtPgs.setBorder(javax.swing.BorderFactory.createTitledBorder("Pags"));
        jTxtPgs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPnlAddBkPnlContent.add(jTxtPgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 98, 64, -1));

        jLstGenres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLstGenres.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fantasy" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLstGenres.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrGnr.setViewportView(jLstGenres);

        jPnlAddBkPnlContent.add(jScrGnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 98, 199, 170));

        jBtnAddGnr.setText("+");
        jPnlAddBkPnlContent.add(jBtnAddGnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 270, -1, -1));

        jBtnDelGnr.setText("-");
        jPnlAddBkPnlContent.add(jBtnDelGnr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        javax.swing.GroupLayout jPnlAddBkContentLayout = new javax.swing.GroupLayout(jPnlAddBkContent);
        jPnlAddBkContent.setLayout(jPnlAddBkContentLayout);
        jPnlAddBkContentLayout.setHorizontalGroup(
            jPnlAddBkContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAddBkContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlAddBkPnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlAddBkContentLayout.setVerticalGroup(
            jPnlAddBkContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAddBkContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlAddBkPnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnlSeeIndBkContent.setBackground(bgScdColor);
        jPnlSeeIndBkContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlSeeIndBkContent.setPreferredSize(new java.awt.Dimension(311, 442));

        jPnlSeeIndBkPnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblSeeTitle.setFont(mFrstFont);
        jLblSeeTitle.setText("Cuestion de confianza");
        jPnlSeeIndBkPnlContent.add(jLblSeeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 6, -1, -1));

        jTxtSeeAthr.setEditable(false);
        jTxtSeeAthr.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));
        jPnlSeeIndBkPnlContent.add(jTxtSeeAthr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, -1));

        jTxtSeePgs.setEditable(false);
        jTxtSeePgs.setBorder(javax.swing.BorderFactory.createTitledBorder("Pags"));
        jPnlSeeIndBkPnlContent.add(jTxtSeePgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 275, 64, -1));

        jLslSeeGnr.setBorder(javax.swing.BorderFactory.createTitledBorder("Generos"));
        jLslSeeGnr.setEnabled(false);
        jScrollPane3.setViewportView(jLslSeeGnr);

        jPnlSeeIndBkPnlContent.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 100));

        jBtnMod.setText("Modificar");
        jPnlSeeIndBkPnlContent.add(jBtnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 40));

        jPnlSeeImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPnlSeeImgLayout = new javax.swing.GroupLayout(jPnlSeeImg);
        jPnlSeeImg.setLayout(jPnlSeeImgLayout);
        jPnlSeeImgLayout.setHorizontalGroup(
            jPnlSeeImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPnlSeeImgLayout.setVerticalGroup(
            jPnlSeeImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jPnlSeeIndBkPnlContent.add(jPnlSeeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 30, 150, 190));

        javax.swing.GroupLayout jPnlSeeIndBkContentLayout = new javax.swing.GroupLayout(jPnlSeeIndBkContent);
        jPnlSeeIndBkContent.setLayout(jPnlSeeIndBkContentLayout);
        jPnlSeeIndBkContentLayout.setHorizontalGroup(
            jPnlSeeIndBkContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSeeIndBkContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlSeeIndBkPnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlSeeIndBkContentLayout.setVerticalGroup(
            jPnlSeeIndBkContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSeeIndBkContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlSeeIndBkPnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnlAddMbrContent.setBackground(bgScdColor);
        jPnlAddMbrContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnAddMbr.setText("Añadir ");

        jLblMbrName.setText("Nombre:");

        jLblMbrSurname.setText("Apellido:");

        jLblMbrFile.setText("Legajo:");

        jLblMbrID.setText("DNI:");

        jLblMbrStreet.setText("Calle:");

        jLblMbrHNum.setText("Numero:");

        jLblMbrFlat.setText("Depto:");

        jLblMbrAge.setText("Edad:");

        jTxtMbrAge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLblMbrTlp1.setText("Telefono:");

        jLblMbrTlp2.setText("Telefono alternativo:");

        jLblMbrTitleDetail.setFont(mFrstFont);
        jLblMbrTitleDetail.setText("Agregar Socio:");

        javax.swing.GroupLayout jPnlAddMbrContentLayout = new javax.swing.GroupLayout(jPnlAddMbrContent);
        jPnlAddMbrContent.setLayout(jPnlAddMbrContentLayout);
        jPnlAddMbrContentLayout.setHorizontalGroup(
            jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                        .addComponent(jLblMbrStreet)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                        .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblMbrTlp1)
                            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                                .addComponent(jLblMbrTlp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtMbrTlp2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblMbrHNum)
                                    .addComponent(jLblMbrID)
                                    .addComponent(jLblMbrFile)
                                    .addComponent(jLblMbrSurname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                                        .addComponent(jTxtMbrHNum, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLblMbrFlat)
                                        .addGap(126, 126, 126))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtMbrFlat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtMbrSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtMbrFile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtMbrID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtMbrStreet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtMbrTlp1, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                                .addComponent(jLblMbrAge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtMbrAge, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnAddMbr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                                .addComponent(jLblMbrName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtMbrName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(50, Short.MAX_VALUE))))
            .addGroup(jPnlAddMbrContentLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLblMbrTitleDetail)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPnlAddMbrContentLayout.setVerticalGroup(
            jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlAddMbrContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblMbrTitleDetail)
                .addGap(18, 18, 18)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrName)
                    .addComponent(jTxtMbrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrSurname)
                    .addComponent(jTxtMbrSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrFile)
                    .addComponent(jTxtMbrFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrID)
                    .addComponent(jTxtMbrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrStreet)
                    .addComponent(jTxtMbrStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrHNum)
                    .addComponent(jTxtMbrHNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblMbrFlat)
                    .addComponent(jTxtMbrFlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrTlp1)
                    .addComponent(jTxtMbrTlp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrTlp2)
                    .addComponent(jTxtMbrTlp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlAddMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblMbrAge)
                    .addComponent(jTxtMbrAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jBtnAddMbr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnlSeeAllMbrContent.setBackground(bgScdColor);
        jPnlSeeAllMbrContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLstMbrSrch.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jose" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jLstMbrSrch);

        jLblMbrSrchDetail.setText("( Doble click para ver informacion del socio)");

        javax.swing.GroupLayout jPnlSeeAllMbrContentLayout = new javax.swing.GroupLayout(jPnlSeeAllMbrContent);
        jPnlSeeAllMbrContent.setLayout(jPnlSeeAllMbrContentLayout);
        jPnlSeeAllMbrContentLayout.setHorizontalGroup(
            jPnlSeeAllMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlSeeAllMbrContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlSeeAllMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(jPnlSeeAllMbrContentLayout.createSequentialGroup()
                        .addGroup(jPnlSeeAllMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlSeeAllMbrContentLayout.createSequentialGroup()
                                .addComponent(jTxtMbrSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnMbrSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnlSeeAllMbrContentLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLblMbrSrchDetail)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPnlSeeAllMbrContentLayout.setVerticalGroup(
            jPnlSeeAllMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlSeeAllMbrContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlSeeAllMbrContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtMbrSrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMbrSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLblMbrSrchDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPnlNav.setBorder(javax.swing.BorderFactory.createLineBorder(fontFrsColor));
        jPnlNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPnlSecOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlSecOne.setMaximumSize(new java.awt.Dimension(144, 134));
        jPnlSecOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblShowBks.setFont(mFrstFont);
        jLblShowBks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblShowBks.setText("Libros");
        jLblShowBks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblShowBks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblShowBksMouseClicked(evt);
            }
        });
        jPnlSecOne.add(jLblShowBks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 144, 34));

        jPnlSecOneContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlSecOneContent.setFocusTraversalPolicyProvider(true);
        jPnlSecOneContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblAddBk.setForeground(fontFrsColor);
        jLblAddBk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblAddBk.setText("Añadir");
        jLblAddBk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblAddBk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblAddBkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblAddBkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblAddBkMouseExited(evt);
            }
        });
        jPnlSecOneContent.add(jLblAddBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 33));

        jLblShowBksInd.setForeground(fontFrsColor);
        jLblShowBksInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblShowBksInd.setText("Ver individual");
        jLblShowBksInd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblShowBksInd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblShowBksIndMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblShowBksIndMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblShowBksIndMouseExited(evt);
            }
        });
        jPnlSecOneContent.add(jLblShowBksInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 144, 33));

        jLblShowBksAll.setForeground(fontFrsColor);
        jLblShowBksAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblShowBksAll.setText("Ver todos");
        jLblShowBksAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblShowBksAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblShowBksAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblShowBksAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblShowBksAllMousePressed(evt);
            }
        });
        jPnlSecOneContent.add(jLblShowBksAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 144, 33));

        jPnlSecOne.add(jPnlSecOneContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 34, 143, 98));

        jPnlNav.add(jPnlSecOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 145, 34));

        jPnlSecTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlSecTwo.setMaximumSize(new java.awt.Dimension(144, 99));
        jPnlSecTwo.setMinimumSize(new java.awt.Dimension(144, 34));
        jPnlSecTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblShowMbr.setFont(mFrstFont);
        jLblShowMbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblShowMbr.setText("Socios");
        jLblShowMbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblShowMbr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblShowMbrMouseClicked(evt);
            }
        });
        jPnlSecTwo.add(jLblShowMbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 34));

        jPnlSecTwoContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPnlSecTwoContent.setFocusTraversalPolicyProvider(true);
        jPnlSecTwoContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblAddMbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblAddMbr.setText("Añadir");
        jLblAddMbr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblAddMbr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblAddMbrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblAddMbrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblAddMbrMouseExited(evt);
            }
        });
        jPnlSecTwoContent.add(jLblAddMbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 33));

        jLblShowMbrAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblShowMbrAll.setText("Ver todos");
        jLblShowMbrAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLblShowMbrAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblShowMbrAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLblShowMbrAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLblShowMbrAllMouseExited(evt);
            }
        });
        jPnlSecTwoContent.add(jLblShowMbrAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 144, 33));

        jPnlSecTwo.add(jPnlSecTwoContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 34, 143, 66));

        jPnlNav.add(jPnlSecTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 145, 34));

        JpnlConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLblConfig.setFont(mFrstFont);
        jLblConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblConfig.setText("Configuracion");
        jLblConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JpnlConfigLayout = new javax.swing.GroupLayout(JpnlConfig);
        JpnlConfig.setLayout(JpnlConfigLayout);
        JpnlConfigLayout.setHorizontalGroup(
            JpnlConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        JpnlConfigLayout.setVerticalGroup(
            JpnlConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLblConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPnlNav.add(JpnlConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 427, 145, 34));

        javax.swing.GroupLayout jPnlIconLayout = new javax.swing.GroupLayout(jPnlIcon);
        jPnlIcon.setLayout(jPnlIconLayout);
        jPnlIconLayout.setHorizontalGroup(
            jPnlIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        jPnlIconLayout.setVerticalGroup(
            jPnlIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        jPnlNav.add(jPnlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 121));

        getContentPane().add(jPnlNav, java.awt.BorderLayout.WEST);

        jPnlSeeAllBkContent.setBackground(bgScdColor);
        jPnlSeeAllBkContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPnlSeeAllBkContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "El señor de los anillos - Tolkien", "Cuestion de confianza - Russ Harris - Autoayuda" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPnlSeeAllBkContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 57, 320, 332));
        jPnlSeeAllBkContent.add(jTxtSrchBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 280, -1));
        jPnlSeeAllBkContent.add(jBtnSrchBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 15, 20, 20));

        jLblSrchBk.setText("Buscar libro...");
        jPnlSeeAllBkContent.add(jLblSrchBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLblDetail.setForeground(new java.awt.Color(51, 51, 51));
        jLblDetail.setText("( Doble click sobre el nombre de un libro para visualizarlo)");
        jPnlSeeAllBkContent.add(jLblDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, -1, -1));

        jPnlMaxRow.setBorder(javax.swing.BorderFactory.createTitledBorder("Maximo filas"));
        jPnlMaxRow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSpnMaxRow.setPreferredSize(new java.awt.Dimension(80, 22));
        jSpnMaxRow.setValue(100);
        jPnlMaxRow.add(jSpnMaxRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, -1, -1));

        jLblToolTipMaxRow.setForeground(new java.awt.Color(0, 0, 153));
        jLblToolTipMaxRow.setText("(*?)");
        jLblToolTipMaxRow.setToolTipText("Cantidad maxima de filas a visualizar en la lista de libros.\n¡Afecta directamente la velocidad de retorno!");
        jPnlMaxRow.add(jLblToolTipMaxRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 21, -1, -1));

        jPnlGenres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCmbGenres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Terror", "Fantasia", "Autoayuda" }));

        javax.swing.GroupLayout jPnlGenresLayout = new javax.swing.GroupLayout(jPnlGenres);
        jPnlGenres.setLayout(jPnlGenresLayout);
        jPnlGenresLayout.setHorizontalGroup(
            jPnlGenresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlGenresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCmbGenres, 0, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnlGenresLayout.setVerticalGroup(
            jPnlGenresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlGenresLayout.createSequentialGroup()
                .addComponent(jCmbGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPnlBottomLayout = new javax.swing.GroupLayout(jPnlBottom);
        jPnlBottom.setLayout(jPnlBottomLayout);
        jPnlBottomLayout.setHorizontalGroup(
            jPnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPnlMaxRow, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPnlGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPnlBottomLayout.setVerticalGroup(
            jPnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBottomLayout.createSequentialGroup()
                .addGroup(jPnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlMaxRow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPnlSeeAllBkContent.add(jPnlBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 305, 55));

        getContentPane().add(jPnlSeeAllBkContent, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *  This method is used to either extend panels to the MaxiumSize property height 
    *  or contract panels to the first children component height.
    *  @see initTimers()
    *  @param component Sets which JPanel will extend or contract.
    */
    private void OpenPanel(JPanel component){
        if (!timerExp.isRunning() && !timerCon.isRunning()){
            extendPanel = component;
            if (component.getHeight() < component.getMaximumSize().height){
                timerExp.start();
            } else {
                timerCon.start();
            }     
        }
    }
    
    /*
    * This method is used to change color of label. It's called by MouseEntered/Exited action to create interactive effect.
    * The colors used are "fontFrsColor" for MouseEntered and "fontScdColor" for MouseExited.
    * @param component Sets which JLabel has the user's focus.
    * @param focus Set whether the mouse has entered or exited the component.
    */
    private void labelFocus(JLabel component, boolean focus){
        if (focus){
            component.setForeground(fontScdColor);
        } else {
            component.setForeground(fontFrsColor);
        }
    }
    
    /*
    * This method is used to set which panel was selected by the user in the menu 
    * and will change central panel for it.
    * @param jPnlNew Sets which JPanel has been selected.
    */
    private void ChangePnl(JPanel jPnlNew){
        if (this.getContentPane().getComponent(1) != jPnlNew){
            System.out.println("-- Change Panel --");
            this.getContentPane().remove(1);
            this.getContentPane().add(jPnlNew);
            jPnlNew.updateUI();
        }
    }
    
    private void jLblShowBksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksMouseClicked
        OpenPanel((JPanel)evt.getComponent().getParent());
    }//GEN-LAST:event_jLblShowBksMouseClicked
    
    private void jLblShowBksIndMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksIndMouseEntered
        labelFocus((JLabel)evt.getComponent(),true);
    }//GEN-LAST:event_jLblShowBksIndMouseEntered

    private void jLblShowBksIndMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksIndMouseExited
        labelFocus((JLabel)evt.getComponent(),false);
    }//GEN-LAST:event_jLblShowBksIndMouseExited

    private void jLblShowBksAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksAllMouseEntered
        labelFocus((JLabel)evt.getComponent(),true);
    }//GEN-LAST:event_jLblShowBksAllMouseEntered

    private void jLblShowBksAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksAllMouseExited
        labelFocus((JLabel)evt.getComponent(),false);
    }//GEN-LAST:event_jLblShowBksAllMouseExited

    private void jLblAddBkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddBkMouseEntered
        labelFocus((JLabel)evt.getComponent(),true);
    }//GEN-LAST:event_jLblAddBkMouseEntered

    private void jLblAddBkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddBkMouseExited
        labelFocus((JLabel)evt.getComponent(),false);
    }//GEN-LAST:event_jLblAddBkMouseExited

    private void jLblShowMbrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowMbrMouseClicked
        OpenPanel((JPanel)evt.getComponent().getParent());
    }//GEN-LAST:event_jLblShowMbrMouseClicked

    private void jLblAddMbrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddMbrMouseEntered
        labelFocus((JLabel)evt.getComponent(),true);
    }//GEN-LAST:event_jLblAddMbrMouseEntered

    private void jLblAddMbrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddMbrMouseExited
        labelFocus((JLabel)evt.getComponent(),false);
    }//GEN-LAST:event_jLblAddMbrMouseExited

    private void jLblShowMbrAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowMbrAllMouseEntered
        labelFocus((JLabel)evt.getComponent(),true);
    }//GEN-LAST:event_jLblShowMbrAllMouseEntered

    private void jLblShowMbrAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowMbrAllMouseExited
        labelFocus((JLabel)evt.getComponent(),false);
    }//GEN-LAST:event_jLblShowMbrAllMouseExited

    private void jLblShowBksAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksAllMousePressed
        ChangePnl(jPnlSeeAllBkContent);
    }//GEN-LAST:event_jLblShowBksAllMousePressed

    private void jLblShowBksIndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowBksIndMouseClicked
        ChangePnl(jPnlSeeIndBkContent);
    }//GEN-LAST:event_jLblShowBksIndMouseClicked

    private void jLblAddBkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddBkMouseClicked
        ChangePnl(jPnlAddBkContent);
    }//GEN-LAST:event_jLblAddBkMouseClicked

    private void jLblAddMbrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddMbrMouseClicked
        ChangePnl(jPnlAddMbrContent);
    }//GEN-LAST:event_jLblAddMbrMouseClicked

    private void jLblShowMbrAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblShowMbrAllMouseClicked
        ChangePnl(jPnlSeeAllMbrContent);
    }//GEN-LAST:event_jLblShowMbrAllMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpnlConfig;
    private javax.swing.JButton jBtnAddBk;
    private javax.swing.JButton jBtnAddGnr;
    private javax.swing.JButton jBtnAddMbr;
    private javax.swing.JButton jBtnDelGnr;
    private javax.swing.JButton jBtnMbrSrch;
    private javax.swing.JButton jBtnMod;
    private javax.swing.JButton jBtnSrchBk;
    private javax.swing.JComboBox<String> jCmbGenres;
    private javax.swing.JLabel jLblAddBk;
    private javax.swing.JLabel jLblAddMbr;
    private javax.swing.JLabel jLblConfig;
    private javax.swing.JLabel jLblDetail;
    private javax.swing.JLabel jLblMbrAge;
    private javax.swing.JLabel jLblMbrFile;
    private javax.swing.JLabel jLblMbrFlat;
    private javax.swing.JLabel jLblMbrHNum;
    private javax.swing.JLabel jLblMbrID;
    private javax.swing.JLabel jLblMbrName;
    private javax.swing.JLabel jLblMbrSrchDetail;
    private javax.swing.JLabel jLblMbrStreet;
    private javax.swing.JLabel jLblMbrSurname;
    private javax.swing.JLabel jLblMbrTitleDetail;
    private javax.swing.JLabel jLblMbrTlp1;
    private javax.swing.JLabel jLblMbrTlp2;
    private javax.swing.JLabel jLblSeeTitle;
    private javax.swing.JLabel jLblShowBks;
    private javax.swing.JLabel jLblShowBksAll;
    private javax.swing.JLabel jLblShowBksInd;
    private javax.swing.JLabel jLblShowMbr;
    private javax.swing.JLabel jLblShowMbrAll;
    private javax.swing.JLabel jLblSrchBk;
    private javax.swing.JLabel jLblToolTipMaxRow;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jLslSeeGnr;
    private javax.swing.JList<String> jLstGenres;
    private javax.swing.JList<String> jLstMbrSrch;
    private javax.swing.JPanel jPnlAddBkContent;
    private javax.swing.JPanel jPnlAddBkPnlContent;
    private javax.swing.JPanel jPnlAddMbrContent;
    private javax.swing.JPanel jPnlBottom;
    private javax.swing.JPanel jPnlGenres;
    private javax.swing.JPanel jPnlIcon;
    private javax.swing.JPanel jPnlMaxRow;
    private javax.swing.JPanel jPnlNav;
    private javax.swing.JPanel jPnlSecOne;
    private javax.swing.JPanel jPnlSecOneContent;
    private javax.swing.JPanel jPnlSecTwo;
    private javax.swing.JPanel jPnlSecTwoContent;
    private javax.swing.JPanel jPnlSeeAllBkContent;
    private javax.swing.JPanel jPnlSeeAllMbrContent;
    private javax.swing.JPanel jPnlSeeImg;
    private javax.swing.JPanel jPnlSeeIndBkContent;
    private javax.swing.JPanel jPnlSeeIndBkPnlContent;
    private javax.swing.JScrollPane jScrGnr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpnMaxRow;
    private javax.swing.JTextField jTxtAthr;
    private javax.swing.JFormattedTextField jTxtMbrAge;
    private javax.swing.JTextField jTxtMbrFile;
    private javax.swing.JTextField jTxtMbrFlat;
    private javax.swing.JTextField jTxtMbrHNum;
    private javax.swing.JTextField jTxtMbrID;
    private javax.swing.JTextField jTxtMbrName;
    private javax.swing.JTextField jTxtMbrSrch;
    private javax.swing.JTextField jTxtMbrStreet;
    private javax.swing.JTextField jTxtMbrSurname;
    private javax.swing.JTextField jTxtMbrTlp1;
    private javax.swing.JTextField jTxtMbrTlp2;
    private javax.swing.JFormattedTextField jTxtPgs;
    private javax.swing.JTextField jTxtSeeAthr;
    private javax.swing.JTextField jTxtSeePgs;
    private javax.swing.JTextField jTxtSrchBk;
    private javax.swing.JTextField jTxtTtl;
    // End of variables declaration//GEN-END:variables
}
