
package Opciones;


import Menus.menuAdmin;
import Menus.menuArriendos;
import javax.swing.table.DefaultTableModel;

public class SolicitarArriendo extends javax.swing.JInternalFrame {
DefaultTableModel model= new DefaultTableModel();
DefaultTableModel model1= new DefaultTableModel();
    public SolicitarArriendo() {
        
        initComponents();
        
        model.addColumn("No Serie");
        model.addColumn("Título");
        model.addColumn("Autor");
        model.addColumn("Año de Publicación");
        model.addColumn("ISBN");
        model.addColumn("Editorial");
        model.addColumn("No Edición");
        this.tablaArriendo.setModel(model);
        
        model1.addColumn("Rut");
        model1.addColumn("Nombre");
        model1.addColumn("Apellidos");
        this.tablaCliente.setModel(model1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLibroA = new javax.swing.JTextField();
        btnAgregarL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArriendo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarC = new javax.swing.JTextField();
        btnBuscarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnConfir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Solicitar arriendo");

        jLabel2.setText("Ingrese el número de serie del libro");

        txtLibroA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroAActionPerformed(evt);
            }
        });

        btnAgregarL.setText("Buscar Libro");
        btnAgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablaArriendo);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el rut del Cliente");

        txtBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCActionPerformed(evt);
            }
        });

        btnBuscarC.setText("Buscar cliente");
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tablaCliente);

        btnConfir.setText("Confirmar arriendo");
        btnConfir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirActionPerformed(evt);
            }
        });

        jButton2.setText("¿No está registrado?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtLibroA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConfir)
                .addGap(245, 245, 245)
                .addComponent(jButton1)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addComponent(txtBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarC)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarC)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLibroA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarL))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfir)
                    .addComponent(jButton1))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLActionPerformed
        Object fila [] = new Object[7]; 
        fila[0] = txtLibroA.getText();
            txtLibroA.setText(null);
            
        model.addRow(fila);
    }//GEN-LAST:event_btnAgregarLActionPerformed

    private void txtLibroAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroAActionPerformed

    }//GEN-LAST:event_txtLibroAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuArriendos ma = new menuArriendos();
        menuAdmin.desktop1.add(ma);
        ma.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCActionPerformed
        Object cliente [] = new Object [3];
        cliente [0] = txtBuscarC.getText();
            txtBuscarC.setText(null);
        
        model1.addRow(cliente);
    }//GEN-LAST:event_txtBuscarCActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        
    }//GEN-LAST:event_btnBuscarCActionPerformed

    private void btnConfirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarL;
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnConfir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaArriendo;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtBuscarC;
    private javax.swing.JTextField txtLibroA;
    // End of variables declaration//GEN-END:variables
}
