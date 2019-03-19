
package Menus;

import BD.Conexion;
import BD.Distribuidor;
import Clases.cDistribuidor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuDistribuidores extends javax.swing.JInternalFrame {  
Conexion c = new Conexion();
Distribuidor d = new Distribuidor();
    public menuDistribuidores() {
        
        initComponents();
   
    }

    public void mostrarDistribuidores(){
        c.mostrar();
        Object [][] de;
        String [] columnas = {"Rut", "Nombre", "Direccion", "Telefono", "Año de primera venta"};
        de = d.getDatos();
        DefaultTableModel m = new DefaultTableModel(de, columnas);
        tablaDis.setModel(m);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDis = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tFono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tDire = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tAnio = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantenedor Distribuidores");

        jScrollPane2.setViewportView(tablaDis);

        jLabel2.setText("Ingrese Rut");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese Nombre");

        jLabel4.setText("Ingrese Teléfono");

        jLabel5.setText("Ingrese Dirección");

        jLabel6.setText("Año de Primera Venta");

        agregar.setText("Agregar a la tabla");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        borrar.setText("Eliminar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFono)
                                    .addComponent(tRut)
                                    .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tDire, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(agregar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(181, 181, 181))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(18, 18, 18)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(borrar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(tAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(tDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(borrar)
                    .addComponent(jButton1)
                    .addComponent(guardar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar()
    {
        tNombre.setText(null);
        tRut.setText(null);
        tDire.setText(null);
        tAnio.setText(null);
        tFono.setText(null);
        mostrarDistribuidores();
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        Object fila [] = new Object[5];
        if (tRut.getText() != null){
            fila[0] = tRut.getText();
            fila[1] = tNombre.getText();
            fila[2] = tDire.getText();
            fila[3] = tFono.getText();
            fila[4] = tAnio.getText();
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar datos");
        }
        
        
        limpiar();
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Distribuidor di = new Distribuidor();
        int filaSelec = tablaDis.getSelectedRow();
        if (filaSelec >= 0){
            di.setRut(tRut.getText());
            di.setNombre(tNombre.getText());
            di.setDireccion(tDire.getText());
            di.setTelefono(Integer.valueOf(tFono.getText()));
            di.setAnio(Integer.valueOf(tAnio.getText()));
            di.modificarDistribuidor(di);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, " Para editar un distribuidor, /n"
                                              + " debe ingresar y seleccionar los datos en el formulario, /n"
                                              + " seleccionar el distribuidor de la tabla /n"
                                              + " y apretar el botón 'Modificar'." );
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Distribuidor di = new Distribuidor();
        
        di.setRut(tRut.getText());
        di.setNombre(tNombre.getText());
        di.setDireccion(tDire.getText());
        di.setTelefono(Integer.valueOf(tFono.getText()));
        di.setAnio(Integer.valueOf(tAnio.getText()));
        di.agregarDistribuidor(di);
        limpiar();
    }//GEN-LAST:event_guardarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        Distribuidor di = new Distribuidor();
        
        int s = tablaDis.getSelectedRow();
        if(s >= 0){
            di.setRut(String.valueOf(s));
            di.setNombre(String.valueOf(s));
            di.setDireccion(String.valueOf(s));
            di.setTelefono(Integer.valueOf(String.valueOf(s)));
            di.setAnio(Integer.valueOf(String.valueOf(s)));
            di.eliminarDistribuidor(di);
            limpiar();
        }else {
            JOptionPane.showMessageDialog(null, " Para eliminar un distribuidor, /n"
                                              + " debe ingresar y seleccionar los datos en el formulario, /n"
                                              + " seleccionar el distribuidor de la tabla /n"
                                              + " y apretar el botón 'Eliminar'." );
        }
    }//GEN-LAST:event_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField tAnio;
    private javax.swing.JTextField tDire;
    private javax.swing.JTextField tFono;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tRut;
    private javax.swing.JTable tablaDis;
    // End of variables declaration//GEN-END:variables
}
