
package Menus;

public class menuAdmin extends javax.swing.JFrame {

    public menuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Bibliotecas Strom");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCompra = new javax.swing.JMenuItem();
        menuDistri = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuVentas = new javax.swing.JMenuItem();
        menuArriendo = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuTrabajadores = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktop1Layout = new javax.swing.GroupLayout(desktop1);
        desktop1.setLayout(desktop1Layout);
        desktop1Layout.setHorizontalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        desktop1Layout.setVerticalGroup(
            desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        jMenu1.setText("Compras");

        menuCompra.setText("Comprar libros");
        menuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompraActionPerformed(evt);
            }
        });
        jMenu1.add(menuCompra);

        menuDistri.setText("Distribuidores");
        menuDistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDistriActionPerformed(evt);
            }
        });
        jMenu1.add(menuDistri);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transacciones");

        menuVentas.setText("Registrar venta");
        menuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentasActionPerformed(evt);
            }
        });
        jMenu2.add(menuVentas);

        menuArriendo.setText("Registrar arriendo");
        menuArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArriendoActionPerformed(evt);
            }
        });
        jMenu2.add(menuArriendo);

        menuClientes.setText("Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        jMenu2.add(menuClientes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Interno");

        menuTrabajadores.setText("Trabajadores");
        menuTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrabajadoresActionPerformed(evt);
            }
        });
        jMenu3.add(menuTrabajadores);

        menuLibros.setText("Libros");
        menuLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLibrosActionPerformed(evt);
            }
        });
        jMenu3.add(menuLibros);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompraActionPerformed
        menuCompras co = new menuCompras();
        desktop1.add(co);
        co.show();
        
    }//GEN-LAST:event_menuCompraActionPerformed

    private void menuDistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDistriActionPerformed
        menuDistribuidores di = new menuDistribuidores();
        desktop1.add(di);
        di.show();
    }//GEN-LAST:event_menuDistriActionPerformed

    private void menuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentasActionPerformed
        menuVentas ve = new menuVentas();
        desktop1.add(ve);
        ve.show();
    }//GEN-LAST:event_menuVentasActionPerformed

    private void menuArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArriendoActionPerformed
        menuArriendos ar = new menuArriendos();
        desktop1.add(ar);
        ar.show();
    }//GEN-LAST:event_menuArriendoActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        menuClientes cl = new menuClientes();
        desktop1.add(cl);
        cl.show();
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrabajadoresActionPerformed
        menuTrabajadores tr = new menuTrabajadores();
        desktop1.add(tr);
        tr.show();
    }//GEN-LAST:event_menuTrabajadoresActionPerformed

    private void menuLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLibrosActionPerformed
        menuLibros ml = new menuLibros();
        desktop1.add(ml);
        ml.show();
    }//GEN-LAST:event_menuLibrosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel desktop1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuArriendo;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuCompra;
    private javax.swing.JMenuItem menuDistri;
    private javax.swing.JMenuItem menuLibros;
    private javax.swing.JMenuItem menuTrabajadores;
    private javax.swing.JMenuItem menuVentas;
    // End of variables declaration//GEN-END:variables
}
