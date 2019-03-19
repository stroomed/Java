
package Menus;

import Confirmaciones.pagoBoleta;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuVentas extends javax.swing.JInternalFrame {
DefaultTableModel t= new DefaultTableModel();
DefaultTableModel tL= new DefaultTableModel();
DefaultTableModel tV= new DefaultTableModel();
Object fila [] = new Object[4]; 
    public menuVentas() {
        initComponents();
        t.addColumn("Rut");
        t.addColumn("Nombre");
        t.addColumn("Apellido Paterno");
        t.addColumn("Apellido Materno");
        this.tablaC.setModel(t);
        
        tL.addColumn("No de Serie");
        tL.addColumn("Título");
        tL.addColumn("Autor");
        tL.addColumn("Editorial");
        tL.addColumn("No de Edición");
        this.tablaL.setModel(tL);
        
        tV.addColumn("Libro");
        tV.addColumn("Precio Neto");
        tV.addColumn("Valor IVA");
        tV.addColumn("Valor Total");
        this.tablaV.setModel(tV);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tRutC = new javax.swing.JTextField();
        btnBC = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tLibro = new javax.swing.JTextField();
        btnBL = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaL = new javax.swing.JTable();
        btnA = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaV = new javax.swing.JTable();
        btnPagar = new javax.swing.JButton();
        btnCan = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Venta a Clientes");

        jLabel2.setText("Ingrese el Rut:");

        btnBC.setText("Buscar");
        btnBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCActionPerformed(evt);
            }
        });

        btnRC.setText("¿No está registrado?");
        btnRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCActionPerformed(evt);
            }
        });

        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaC);

        jLabel3.setText("Ingrese No de Serie del Libro");

        btnBL.setText("Buscar");
        btnBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLActionPerformed(evt);
            }
        });

        tablaL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaL);

        btnA.setText("Agregar a la venta");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        tablaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaV);

        btnPagar.setText("Pasar al pago");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnCan.setText("Cancelar");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tRutC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBC)
                        .addGap(18, 18, 18)
                        .addComponent(btnRC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnBL))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnPagar)
                        .addGap(127, 127, 127)
                        .addComponent(btnCan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnA)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tRutC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBC)
                    .addComponent(btnRC))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBL))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnA)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(btnCan))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCActionPerformed
        fila [0] = tRutC.getText();
            tRutC.setText(null);
        if (fila[0] != null){
            t.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(this,"Cliente no registrado o rut ingresado de forma incorrecta.\n"
                    + "Recuerde que debe ingresarlo en la forma XXXXXXXX-X");
        }
            
    }//GEN-LAST:event_btnBCActionPerformed

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
        menuClientes mc = new menuClientes();
        menuAdmin.desktop1.add(mc);
        mc.show();
        dispose();
    }//GEN-LAST:event_btnRCActionPerformed

    private void tablaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCMouseClicked

    }//GEN-LAST:event_tablaCMouseClicked

    private void tablaLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaLMouseClicked

    private void btnBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLActionPerformed
        fila [0] = tLibro.getText();
            tLibro.setText(null);
        if (fila[0] != null){
            tL.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(this,"Libro no registrado o No de Serie ingresado de forma incorrecta.\n"
                    + "Recuerde que debe ingresarlo en la forma XXXXX");
        }    
        
    }//GEN-LAST:event_btnBLActionPerformed

    private void tablaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaVMouseClicked

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        fila[0]=tablaL.getSelectedRow();
        if (fila[0] != null){
            tV.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(this,"Debe seleccionar al menos un libro.");
        }
        
    }//GEN-LAST:event_btnAActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        dispose();
    }//GEN-LAST:event_btnCanActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        pagoBoleta pb = new pagoBoleta();
        menuAdmin.desktop1.add(pb);
        if (tablaV != null){
            pb.show();
        } else {
            JOptionPane.showMessageDialog(this,"Debe seleccionar al menos un libro para la venta.");
        }  
    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnBC;
    private javax.swing.JButton btnBL;
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField tLibro;
    private javax.swing.JTextField tRutC;
    private javax.swing.JTable tablaC;
    private javax.swing.JTable tablaL;
    private javax.swing.JTable tablaV;
    // End of variables declaration//GEN-END:variables
}
