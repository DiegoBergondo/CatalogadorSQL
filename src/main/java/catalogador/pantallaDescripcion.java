/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

import BibliotecaRIGU.JSimpleDialog;
import java.awt.Image;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 * Clase de la pantalla principal de datos del artículo.
 * @author DiegoBergondo
 */
public class pantallaDescripcion extends JSimpleDialog {
    
    /**
     * Creates new form pantallaDescripcion
     */
    public pantallaDescripcion() {
        super();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField3 = new javax.swing.JTextField();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no-image-icon2.png"))); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jCheckBox1.setText("Lo tengo");

        jCheckBox2.setText("Lo quiero");

        jCheckBox3.setText("En venta");
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox4.setText("Guardar");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(440, 134));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jTextField1.setText("Título del cuadro");
        jTextField1.setPreferredSize(new java.awt.Dimension(125, 26));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 450;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 9);
        jPanel3.add(jTextField1, gridBagConstraints);

        jTextField2.setText("Nombre del autor");
        jTextField2.setPreferredSize(new java.awt.Dimension(125, 26));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 450;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 9);
        jPanel3.add(jTextField2, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de creación"));
        jPanel5.setMinimumSize(new java.awt.Dimension(300, 70));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 53));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 17, 0);
        jPanel5.add(jComboBox1, gridBagConstraints);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 17, 0);
        jPanel5.add(jComboBox2, gridBagConstraints);

        jSpinner1.setMinimumSize(new java.awt.Dimension(60, 26));
        jSpinner1.setPreferredSize(new java.awt.Dimension(60, 26));
        jSpinner1.setValue(2000);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 6, 0, 9);
        jPanel5.add(jSpinner1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 6, 0);
        jPanel3.add(jPanel5, gridBagConstraints);

        jTextField3.setText("Formato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 9);
        jPanel3.add(jTextField3, gridBagConstraints);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
        getChangeEvent(evt);
    }//GEN-LAST:event_jCheckBox3StateChanged

//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    /**
     * Devuelve el jTextField1.
     * @return
     */
    public javax.swing.JTextField getTitulo() {
        return jTextField1;
    }
    
    /**
     * Devuelve el jTextField2.
     * @return
     */
    public javax.swing.JTextField getAutor() {
        return jTextField2;
    }
    
    /**
     * Devuelve el jTextField3.
     * @return
     */
    public javax.swing.JTextField getFormato() {
        return jTextField3;
    }
    
    /**
     * Devuelve el jTextArea1 que hubica la descripción del artículo.
     * @return
     */
    public javax.swing.JTextArea getDescripcion() {
        return jTextArea1;
    }
    
    /**
     * Indica si el jCheckBox4 está marcado.
     * @return
     */
    public boolean getSave(){
        return jCheckBox4.isSelected();      
    }
    
    /**
     * Indica si el jCheckBox1 está marcado.
     * @return
     */
    public boolean getTengo(){
        return jCheckBox1.isSelected();      
    }
      
    /**
     * Indica si el jCheckBox2 está marcado.
     * @return
     */
    public boolean getQuiero(){
        return jCheckBox2.isSelected(); 
    }
    
    /**
     * Devuelve el jCheckBox3.
     * @return
     */
    public javax.swing.JCheckBox getIsVenta() {
        return jCheckBox3;
    }
        
    /**
     * Indica si el jCheckBox3 está marcado.
     * @return
     */
    public boolean getVenta(){
        return jCheckBox3.isSelected(); 
    }
   
    /**
     * Devuelve el jComboBox1.
     * @return
     */
    public javax.swing.JComboBox getFechaDia(){
        return jComboBox1; 
    }
        
    /**
     * Devuelve el jComboBox2.
     * @return
     */
    public javax.swing.JComboBox getFechaMes(){
        return jComboBox2; 
    }
            
    /**
     * Devuelve el jSpinner1.
     * @return
     */
    public javax.swing.JSpinner getFechaAno(){
        return jSpinner1; 
    }
    
    /**
     * Selecciona una opción del jComboBox1 dependiendo del valor que llega como parámetro.
     * @param dia
     */
    public void setFechaDia(int dia){
        jComboBox1.setSelectedIndex(dia-1);
    }
    
    /**
     * Selecciona una opción del jComboBox2 dependiendo del valor que llega como parámetro.
     * @param mes
     */
    public void setFechaMes(int mes){
        jComboBox2.setSelectedIndex(mes);
    }
    
    /**
     * Asigna al jSpinner1 el valor que le llega como parámetro.
     * @param ano
     */
    public void setFechaAno(int ano){
        this.jSpinner1.setValue(ano); 
    }
    
    /**
     * Asigna al jTextField1 el valor que le llega como parámetro.
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.jTextField1.setText(titulo);
    }
    
    /**
     * Asigna al jTextField2 el valor que le llega como parámetro.
     * @param autor
     */
    public void setAutor(String autor) {
        this.jTextField2.setText(autor);
    }
    
    /**
     * Asigna al jTextField3 el valor que le llega como parámetro.
     * @param formato
     */
    public void setFormato(String formato) {
        this.jTextField3.setText(formato);
    }
    
    /**
     * Simula una pulsación en el jCheckBox2 dependiendo del valor que le llega como parámetro.
     * @param quiero
     */
    public void setQuiero(boolean quiero){
        if((quiero && !this.jCheckBox2.isSelected()) || !quiero && this.jCheckBox2.isSelected())
            this.jCheckBox2.doClick();
    }
    
    /**
     * Simula una pulsación en el jCheckBox1 dependiendo del valor que le llega como parámetro.
     * @param tengo
     */
    public void setTengo(boolean tengo){
        if((tengo && !this.jCheckBox1.isSelected()) || !tengo && this.jCheckBox1.isSelected())
            this.jCheckBox1.doClick();
    }
    
    /**
     * Simula una pulsación en el jCheckBox3 dependiendo del valor que le llega como parámetro.
     * @param venta
     */
    public void setVenta(boolean venta){
        if((venta && !this.jCheckBox3.isSelected()) || !venta && this.jCheckBox3.isSelected())
            this.jCheckBox3.doClick();
    }
    
    /**
     * Simula una pulsación en el jCheckBox4 dependiendo del valor que le llega como parámetro.
     * @param venta
     */
    public void setGuardar(boolean venta){
        if((venta && !this.jCheckBox4.isSelected()) || !venta && this.jCheckBox4.isSelected())
            this.jCheckBox4.doClick();
    }
    
    /**
     * Asigna a jTextArea1 el String que le llega como parámetro.
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.jTextArea1.setText(descripcion);
    }

    /**
     * Asigna al jLabel1 la imagen que llega como parámetro.
     * @param imagen
     */
    public void setImagen(Image imagen) {
        Image captura = imagen.getScaledInstance(135, 100, Image.SCALE_DEFAULT);
        this.jLabel1.setIcon(new javax.swing.ImageIcon(captura));
    }
    
     /**
     * Devuelve la imagen por defecto a la pantalla
     */
    public void setImagenDefault() {
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no-image-icon2.png")));
    }
    
    /**
     * Asigna un texto al jTextBox4 dependiendo del valor que llega como parámetro.
     * @param mod
     */
    public void setModificar(boolean mod){
        if(mod)
            this.jCheckBox4.setText("Modificar");
        else
            this.jCheckBox4.setText("Guardar");
    }
    
    /**
     * Devuelve si el texto del jCheckBox4 coincide con lo indicado o no.
     * @return
     */
    public boolean isModificar(){
        return this.jCheckBox4.getText().equals("Modificar");
    }
}