
package Menus;


import BD.Conexion;
import BD.Libro;
import Opciones.agregarAutor;
import Opciones.agregarCategoria;
import Opciones.agregarEditorial;  
import Opciones.agregarIdioma;  
import javax.swing.JOptionPane;  
import javax.swing.table.DefaultTableModel;  

public class menuLibros extends javax.swing.JInternalFrame {
Conexion c = new Conexion();
Libro l = new Libro();
    public menuLibros() {
        initComponents();

    }
    
    public void mostrarLib(){
        c.mostrar();
        Object [][] de;
        String [] columnas = {"Codigo", "Nombre", "Apellido Paterno", "Apellido Materno"};
        de = l.getDatos();
        DefaultTableModel m = new DefaultTableModel(de, columnas);
        tablaLibros.setModel(m);   
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        selectEditorial = new javax.swing.JComboBox();
        selectCate = new javax.swing.JComboBox();
        selectIdioma = new javax.swing.JComboBox();
        selectAutor = new javax.swing.JComboBox();
        ingresoAnio = new javax.swing.JTextField();
        ingresoPags = new javax.swing.JTextField();
        ingresoNoSerie = new javax.swing.JTextField();
        ingresoISBN = new javax.swing.JTextField();
        ingresoTitulo = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ingresoPrecio = new javax.swing.JTextField();
        btnAgregarL = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ingresoNoEdi = new javax.swing.JTextField();
        btnAnadirAutor = new javax.swing.JButton();
        btnAnadirIdioma = new javax.swing.JButton();
        btnAnadirCategoria = new javax.swing.JButton();
        btnAnadirEditorial = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantenedor de Libros");

        jLabel2.setText("Título");

        jLabel3.setText("ISBN");

        jLabel4.setText("N° de Serie");

        jLabel5.setText("N° de Páginas");

        jLabel6.setText("Año de Publicación");

        jLabel7.setText("Autor(es)");

        jLabel8.setText("Idioma");

        jLabel9.setText("Categoría");

        jLabel10.setText("Editorial");

        selectEditorial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Editorial 1", "Editorial 2", "Editorial 3", "Editorial 4" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectEditorial, org.jdesktop.beansbinding.ELProperty.create("${alignmentX}"), selectEditorial, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        selectEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEditorialActionPerformed(evt);
            }
        });

        selectCate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoría 1", "Categoría 2", "Categoría 3", "Categoría 4" }));
        selectCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCateActionPerformed(evt);
            }
        });

        selectIdioma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Idioma 1", "Idioma 2", "Idioma 3", "Idioma 4" }));
        selectIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectIdiomaActionPerformed(evt);
            }
        });

        selectAutor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Autor 1", "Autor 2", "Autor 3", "Autor 4" }));
        selectAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAutorActionPerformed(evt);
            }
        });

        ingresoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoTituloActionPerformed(evt);
            }
        });

        btnVolver.setText("Cancelar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel11.setText("Precio");

        btnAgregarL.setText("Añadir a la tabla");
        btnAgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLActionPerformed(evt);
            }
        });

        jLabel16.setText("N° Edición");

        ingresoNoEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoNoEdiActionPerformed(evt);
            }
        });

        btnAnadirAutor.setText("¿No está el que buscas?");
        btnAnadirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAutorActionPerformed(evt);
            }
        });

        btnAnadirIdioma.setText("¿No está el que buscas?");
        btnAnadirIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirIdiomaActionPerformed(evt);
            }
        });

        btnAnadirCategoria.setText("¿No está el que buscas?");
        btnAnadirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirCategoriaActionPerformed(evt);
            }
        });

        btnAnadirEditorial.setText("¿No está el que buscas?");
        btnAnadirEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirEditorialActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar de la tabla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMod.setText("Modificar");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(382, 382, 382))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingresoTitulo)
                                    .addComponent(ingresoPags)
                                    .addComponent(ingresoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnadirAutor)
                                    .addComponent(btnAnadirIdioma)))
                            .addComponent(jLabel2))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(ingresoNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ingresoISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingresoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(selectCate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnadirCategoria))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresoNoEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAnadirEditorial)))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnAgregarL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnEliminar)
                .addGap(76, 76, 76)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ingresoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ingresoPags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ingresoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(selectAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(selectCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAnadirAutor)
                                .addComponent(btnAnadirCategoria))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresoISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ingresoNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ingresoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnadirIdioma))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(selectEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAnadirEditorial)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ingresoNoEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMod)
                    .addComponent(btnAgregarL)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver))
                .addGap(53, 53, 53))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar()
    {
        ingresoTitulo.setText(null);
        ingresoISBN.setText(null);
        ingresoNoSerie.setText(null);
        ingresoPags.setText(null);
        ingresoAnio.setText(null);
        ingresoNoEdi.setText(null);
        selectCate.setSelectedItem(null);
        ingresoPrecio.setText(null);
        mostrarLib();
    }
    private void selectEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEditorialActionPerformed
        
    }//GEN-LAST:event_selectEditorialActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void ingresoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoTituloActionPerformed

    private void selectIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectIdiomaActionPerformed

    private void btnAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLActionPerformed
        Object [] fila = new Object[11]; 
        if (ingresoTitulo.getText() != null){
            fila[0] = ingresoTitulo.getText();     
            fila[1] = ingresoISBN.getText();            
            fila[2] = selectEditorial.getSelectedItem().toString();           
            fila[3] = ingresoNoSerie.getText();           
            fila[4] = ingresoPags.getText();         
            fila[5] = ingresoAnio.getText();          
            fila[6] = ingresoNoEdi.getText();        
            fila[7] = selectAutor.getSelectedItem().toString();            
            fila[8] = selectIdioma.getSelectedItem().toString();             
            fila[9] = selectCate.getSelectedItem().toString();              
            fila[10] = ingresoPrecio.getText();  
        }else{
            JOptionPane.showMessageDialog(this, "Debe ingresar datos.");
        }
        
        limpiar();
    }//GEN-LAST:event_btnAgregarLActionPerformed

    private void ingresoNoEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoNoEdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoNoEdiActionPerformed

    private void btnAnadirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAutorActionPerformed
        agregarAutor aa = new agregarAutor();
        menuAdmin.desktop1.add(aa);
        aa.show();
        dispose();
    }//GEN-LAST:event_btnAnadirAutorActionPerformed

    private void btnAnadirEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirEditorialActionPerformed
        agregarEditorial ae = new agregarEditorial();
        menuAdmin.desktop1.add(ae);
        ae.show();
        dispose();
    }//GEN-LAST:event_btnAnadirEditorialActionPerformed

    private void btnAnadirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirCategoriaActionPerformed
        agregarCategoria ac = new agregarCategoria();
        menuAdmin.desktop1.add(ac);
        ac.show();
        dispose();
    }//GEN-LAST:event_btnAnadirCategoriaActionPerformed

    private void btnAnadirIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirIdiomaActionPerformed
        agregarIdioma ai = new agregarIdioma();
        menuAdmin.desktop1.add(ai);
        ai.show();
        dispose();
    }//GEN-LAST:event_btnAnadirIdiomaActionPerformed

    private void selectAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectAutorActionPerformed

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int filaSelec = tablaLibros.getSelectedRow();
        int[] filaS = tablaLibros.getSelectedRows();
        
        if (filaSelec >=0){
            for (int i=0; i < filaS.length; i++){

            }  
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una línea.");
        }
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed

        int filaSelec = tablaLibros.getSelectedRow();
        if (filaSelec >= 0){
            
        } else {
            JOptionPane.showMessageDialog(null, " Para editar un libro, /n"
                                              + " debe ingresar y seleccionar los datos en el formulario, /n"
                                              + " seleccionar el o los libros de la tabla /n"
                                              + " y apretar el botón 'Modificar'." );
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void selectCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCateActionPerformed
        
    }//GEN-LAST:event_selectCateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarL;
    private javax.swing.JButton btnAnadirAutor;
    private javax.swing.JButton btnAnadirCategoria;
    private javax.swing.JButton btnAnadirEditorial;
    private javax.swing.JButton btnAnadirIdioma;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField ingresoAnio;
    private javax.swing.JTextField ingresoISBN;
    private javax.swing.JTextField ingresoNoEdi;
    private javax.swing.JTextField ingresoNoSerie;
    private javax.swing.JTextField ingresoPags;
    private javax.swing.JTextField ingresoPrecio;
    private javax.swing.JTextField ingresoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox selectAutor;
    private javax.swing.JComboBox selectCate;
    private javax.swing.JComboBox selectEditorial;
    private javax.swing.JComboBox selectIdioma;
    private javax.swing.JTable tablaLibros;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
