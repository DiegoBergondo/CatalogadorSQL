/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

/**
 * Clase de la segunda extensión de pantalla del selector de tipo con las estadísticas.
 * @author DiegoBergondo
 */
public class pantallaSeleccionB extends pantallaSeleccion {
    
    /**
     * Creates new form pantallaSeleccion
     */
    public pantallaSeleccionB() {
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
        jPanel3 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(670, 640));
        setMinimumSize(new java.awt.Dimension(670, 640));
        setPreferredSize(new java.awt.Dimension(670, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 300));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chooseone.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 21, 6, 19);
        jPanel1.add(jLabel1, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 685, 206));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(700, 200));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 200));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 200));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuadros", "Libros", "Música", "Videojuegos" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 220, 87, 0);
        jPanel3.add(jComboBox2, gridBagConstraints);

        jCheckBox1.setText("Estadisticas");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 6, 0, 206);
        jPanel3.add(jCheckBox1, gridBagConstraints);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 212, 688, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(700, 250));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 250));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 250));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Total titulos"));
        jPanel4.setMinimumSize(new java.awt.Dimension(150, 60));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 12);
        jPanel4.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 130, 0);
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total recibido"));
        jPanel5.setMinimumSize(new java.awt.Dimension(150, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 12);
        jPanel5.add(jTextField2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 130, 0);
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Total gastado"));
        jPanel8.setMinimumSize(new java.awt.Dimension(150, 60));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel8.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 12);
        jPanel8.add(jTextField3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 130, 0);
        jPanel2.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Total en venta"));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 60));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 60));
        jPanel9.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 12);
        jPanel9.add(jTextField4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 130, 0);
        jPanel2.add(jPanel9, gridBagConstraints);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 418, 688, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        getChangeEvent(evt);
    }//GEN-LAST:event_jCheckBox1StateChanged

//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables


    @Override
    public javax.swing.JComboBox getSeleccion(){
        return jComboBox2;
    }
    
    /**
     * Devuelve jCheckBox1 que determina la posibilidad de estadísticas.
     * @return
     */
    public javax.swing.JCheckBox getIsEstadisticas() {
        return jCheckBox1;
    }
    
    /**
     * Indica si está marcada la opción de estadísticas.
     */
    public void setIsEstadisticas() {
        jCheckBox1.setSelected(true);
    }
    
    /**
     * Marca como falso el jCheckBox1.
     */
    public void setNotEstadisticas() {
        jCheckBox1.setSelected(false);
    }

    /**
     * Simula una pulsación en el jCheckBox1
     */
    public void setEstadisticas() {
        this.jCheckBox1.doClick();
    }
        
    /**
     * Indica si el jCheckBox1, que determina las estadísticas, está marcado.
     * @return
     */
    public boolean getEstadisticas(){
        return jCheckBox1.isSelected(); 
    }
    
    /**
     * Introduce en el jTextField1 el valor llegado por parámetro.
     * @param total
     */
    public void setTotal(int total){
        jTextField1.setText(Integer.toString(total));
    }
    
    /**
     * Introduce en el jTextField4 el valor llegado por parámetro.
     * @param totalVentas
     */
    public void setTotalVentas(int totalVentas){
        jTextField4.setText(Integer.toString(totalVentas));
    }
        
    /**
     * Introduce en el jTextField3 el valor llegado por parámetro.
     * @param totalGastado
     */
    public void setTotalGastado(int totalGastado){
        jTextField3.setText(Integer.toString(totalGastado));
    }
            
    /**
     * Introduce en el jTextField2 el valor llegado por parámetro.
     * @param totalRecibido
     */
    public void setTotalRecibido(int totalRecibido){
        jTextField2.setText(Integer.toString(totalRecibido));
    }
    
    /**
     * Asigna al jComboBox2 el tipo introducido por parámetro.
     * @param tipo
     */
    public void setTipo(int tipo) {
        jComboBox2.setSelectedIndex(tipo);
    }
}
