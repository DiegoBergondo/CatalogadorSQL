/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogador;

import BibliotecaRIGU.JSimpleDialog;

/**
 *
 * @author murphy
 */
public class BotonInicio extends JSimpleDialog {
    
    public BotonInicio() {
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
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(657, 200));
        setPreferredSize(new java.awt.Dimension(657, 200));
        setLayout(new java.awt.GridLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(645, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(645, 188));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new java.awt.Dimension(645, 188));
        jButton2.setMinimumSize(new java.awt.Dimension(645, 188));
        jButton2.setPreferredSize(new java.awt.Dimension(645, 188));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jButton2, gridBagConstraints);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getActionEvent(evt);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getInicio() {
        return jButton2;
    }
}
