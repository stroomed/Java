/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package museo.modelo;

import museo.PrestamoYDevolucion.Devolucion;
import museo.PrestamoYDevolucion.Prestamo;
import museo.obrasdearte.ObrasDeArte;
import museo.personal.Personal;
import museo.restauradores.Restaurador;

/**
 *
 * @author 19564044-0
 */
public class PanelDeControl extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public PanelDeControl() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnIngresoObra = new javax.swing.JButton();
        BtnIngresoPersonal = new javax.swing.JButton();
        BtnIngresoRestauradores = new javax.swing.JButton();
        BtnIngresoPrestamos = new javax.swing.JButton();
        BtnIngresoVisitas = new javax.swing.JButton();
        BtnIngresoDevoluciones = new javax.swing.JButton();
        BtnSalirPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de Control");
        setName("panel de control"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel1.setText("¿A qué sección desea ingresar?");

        BtnIngresoObra.setText("Obras de Arte");
        BtnIngresoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoObraActionPerformed(evt);
            }
        });

        BtnIngresoPersonal.setText("Personal");
        BtnIngresoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoPersonalActionPerformed(evt);
            }
        });

        BtnIngresoRestauradores.setText("Restauradores");
        BtnIngresoRestauradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoRestauradoresActionPerformed(evt);
            }
        });

        BtnIngresoPrestamos.setText("Préstamos");
        BtnIngresoPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoPrestamosActionPerformed(evt);
            }
        });

        BtnIngresoVisitas.setText("Visitas");

        BtnIngresoDevoluciones.setText("Devoluciones");
        BtnIngresoDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoDevolucionesActionPerformed(evt);
            }
        });

        BtnSalirPanel.setText("Volver");
        BtnSalirPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresoRestauradores, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresoObra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresoVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnIngresoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnIngresoDevoluciones)
                            .addComponent(BtnIngresoPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnIngresoObra)
                            .addComponent(BtnIngresoPersonal))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnIngresoRestauradores)
                            .addComponent(BtnIngresoPrestamos))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnIngresoVisitas)
                            .addComponent(BtnIngresoDevoluciones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(BtnSalirPanel)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirPanelActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSalirPanelActionPerformed

    private void BtnIngresoRestauradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoRestauradoresActionPerformed
        Restaurador res = new Restaurador();
        res.setVisible(true);
    }//GEN-LAST:event_BtnIngresoRestauradoresActionPerformed

    private void BtnIngresoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoObraActionPerformed
        ObrasDeArte obra = new ObrasDeArte();
        obra.show(true);
    }//GEN-LAST:event_BtnIngresoObraActionPerformed

    private void BtnIngresoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoPersonalActionPerformed
        Personal per = new Personal();
        per.setVisible(true);
    }//GEN-LAST:event_BtnIngresoPersonalActionPerformed

    private void BtnIngresoPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoPrestamosActionPerformed
        Prestamo pres = new Prestamo();
        pres.show(true);
    }//GEN-LAST:event_BtnIngresoPrestamosActionPerformed

    private void BtnIngresoDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoDevolucionesActionPerformed
        Devolucion dev = new Devolucion();
        dev.show(true);
    }//GEN-LAST:event_BtnIngresoDevolucionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelDeControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDeControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDeControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDeControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDeControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresoDevoluciones;
    private javax.swing.JButton BtnIngresoObra;
    private javax.swing.JButton BtnIngresoPersonal;
    private javax.swing.JButton BtnIngresoPrestamos;
    private javax.swing.JButton BtnIngresoRestauradores;
    private javax.swing.JButton BtnIngresoVisitas;
    private javax.swing.JButton BtnSalirPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
