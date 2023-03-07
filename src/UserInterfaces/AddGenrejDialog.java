package UserInterfaces;

import Controllers.DbController;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * 
 *      +--------------------------+
 *      |                          |
 *      |  @author BenjaminFisico! |
 *      |                          |
 *      +--------------------------+
 * 
 * This class is used to add genres, delete them, and link them with books.
 * 
 */
public class AddGenrejDialog extends javax.swing.JDialog {
    DefaultListModel modelAllGns;
    DefaultListModel modelBkGns;

    /**
     * Creates new form AddGenrejDialog
     * @param parent Sets which parent to new instance.This is necessary to indicate which frame is always behind this.
     * @param modal It indicates if this window allows access to other windows while it is open.
     */
    public AddGenrejDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        modelAllGns = new DefaultListModel();
        modelBkGns = new DefaultListModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAddGen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstGen = new javax.swing.JList<>();
        jBtnAcept = new javax.swing.JButton();
        jBtnDelGen = new javax.swing.JButton();
        jBtnDownGen = new javax.swing.JButton();
        jBtnUpGen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstGnsBk = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnAddGen.setText("Añadir nuevo");
        jBtnAddGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddGenActionPerformed(evt);
            }
        });

        jLstGen.setBorder(javax.swing.BorderFactory.createTitledBorder("Todos los generos"));
        jLstGen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLstGen.setDropMode(javax.swing.DropMode.INSERT);
        jLstGen.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstGenValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLstGen);

        jBtnAcept.setText("Aceptar");
        jBtnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptActionPerformed(evt);
            }
        });

        jBtnDelGen.setText("Eliminar");
        jBtnDelGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDelGenActionPerformed(evt);
            }
        });

        jBtnDownGen.setText("↧");
        jBtnDownGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDownGenActionPerformed(evt);
            }
        });

        jBtnUpGen.setText("↥");
        jBtnUpGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpGenActionPerformed(evt);
            }
        });

        jLstGnsBk.setBorder(javax.swing.BorderFactory.createTitledBorder("Generos del libro"));
        jLstGnsBk.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLstGnsBk.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstGnsBkValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLstGnsBk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBtnAddGen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jBtnDelGen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBtnDownGen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnUpGen))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jBtnAcept, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddGen)
                    .addComponent(jBtnDelGen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDownGen)
                    .addComponent(jBtnUpGen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAcept)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method is used to move one genre in the list of all genres to the list of actual book genres.
     * This process prepares information to link genres with the book.
     * @param evt Autogenered param.
     */
    private void jBtnDownGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDownGenActionPerformed
        if (jLstGen.getSelectedIndex() != -1){
            modelBkGns.addElement(jLstGen.getSelectedValue());
            modelAllGns.removeElement(modelBkGns.lastElement());
            jLstGnsBk.setSelectedIndex(modelBkGns.getSize()-1);
        }
    }//GEN-LAST:event_jBtnDownGenActionPerformed

    /**
     * This method is used to move one genre in the list of actual book genres to the list of all genres.
     * @param evt Autogenered param.
     */
    private void jBtnUpGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpGenActionPerformed
        if (jLstGnsBk.getSelectedIndex() != -1){
            modelAllGns.addElement(jLstGnsBk.getSelectedValue());
            modelBkGns.removeElement(modelAllGns.lastElement());
            jLstGen.setSelectedIndex(modelAllGns.getSize()-1);
        }
    }//GEN-LAST:event_jBtnUpGenActionPerformed
    
    /**
     * This method is used to avoid confusion for the user.
     * It clears the selection in the list that does not have focus.
     * @param evt Autogenered param.
     */
    private void jLstGnsBkValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstGnsBkValueChanged
        jLstGen.clearSelection();
    }//GEN-LAST:event_jLstGnsBkValueChanged
    
    /**
     * This method is used to avoid confusion for the user.
     * It clears the selection in the list that does not have focus.
     * @param evt Autogenered param.
     */
    private void jLstGenValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstGenValueChanged
        jLstGnsBk.clearSelection();
    }//GEN-LAST:event_jLstGenValueChanged
    
    /**
     * This method is used to indicate that the user has finished working in this window.
     * Warning: It doesn't dispose of this instance because its information may still need to be manipulated.
     * The parent will eliminate the instance when the correct moment arrives.
     * @param evt Autogenered param.
     */
    private void jBtnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBtnAceptActionPerformed

    /**
     * This method is used to add new genre. 
     * Before it asks which it is.
     * @param evt Autogenered param.
     */
    private void jBtnAddGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddGenActionPerformed
        String input = JOptionPane.showInputDialog(this, "Ingrese el nombre del genero a añadir", "[-Añadir genero-]", JOptionPane.QUESTION_MESSAGE);
        if(input != null){
            //convert the input to formatted text, where first letter is uppercase letter and the rest lowercase.
            input = input.toUpperCase().charAt(0) + input.substring(1,input.length()).toLowerCase();
            input = input.trim();
            if(modelAllGns.contains(input) || modelBkGns.contains(input)){
              JOptionPane.showMessageDialog(this,"Ese genero ya existe","[- ATENCION! -]",JOptionPane.WARNING_MESSAGE);
            }else{
             if (DbController.SaveGenre(input)){
                 JOptionPane.showMessageDialog(this,"Genero: "+input+" guardado con exito.","[-INFORMACION-]",JOptionPane.INFORMATION_MESSAGE);
                 modelAllGns.addElement(input);
            }
          }
        }
        
    }//GEN-LAST:event_jBtnAddGenActionPerformed

    /**
     * This method is used to delete a selected genre.
     * @param evt Autogenered param.
     */
    private void jBtnDelGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDelGenActionPerformed
        if(jLstGen.getSelectedIndex() != -1){
            String selValue = jLstGen.getSelectedValue();
            int response = JOptionPane.showConfirmDialog(this, "¿Estas seguro que quieres eliminar el genero "+selValue+" para siempre?", "[- CONFIRMACION -]", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                int response2 = JOptionPane.showConfirmDialog(this, "Por seguridad siempre tienes que eliminar todas las vinculaciones entre los libros y este genero. ¿ya desvinculaste los libros asociados al gernero "+selValue+"?","[- ADVERTENCIA -]",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response2 == JOptionPane.YES_OPTION){
                    if(DbController.DeleteStatement("genre", "Name = '"+selValue+"'")){
                        JOptionPane.showMessageDialog(this,"El genero "+selValue+" a sido eliminado para siempre.","[- INFORMACION -]",JOptionPane.INFORMATION_MESSAGE);
                        modelAllGns.removeElement(selValue);
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Selecciona un genero que no este vinculado al libro(lista de arriba)","[- ATENCION! -]",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnDelGenActionPerformed


   public void SetModelLstGen(DefaultListModel model){
       modelAllGns = model;
       jLstGen.setModel(model);
   }

   public void SetModelLstBkGen(DefaultListModel model){
       modelBkGns = model;
       for(int i = 0; i < modelBkGns.getSize(); i++){
           if(modelAllGns.contains(modelBkGns.get(i))){
               modelAllGns.removeElement(modelBkGns.get(i));
           }
       }
       jLstGnsBk.setModel(model);
   }
   
   public DefaultListModel getModelLstBkGen(){
       return modelBkGns;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcept;
    private javax.swing.JButton jBtnAddGen;
    private javax.swing.JButton jBtnDelGen;
    private javax.swing.JButton jBtnDownGen;
    private javax.swing.JButton jBtnUpGen;
    private javax.swing.JList<String> jLstGen;
    private javax.swing.JList<String> jLstGnsBk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
