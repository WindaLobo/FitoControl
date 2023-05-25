package view;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.CompraArticulo;
import FitoControl.DataBase.modelo.Modelo;
import controllers.CompraArticuloController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompraArticuloView extends javax.swing.JFrame {

    private final CompraArticuloController controller;
    private Compra compra;

    public CompraArticuloView(Compra compra) throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);

        controller = new CompraArticuloController(this, compra);
        controller.cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCompraArticulo = new javax.swing.JPanel();
        jLabelArticulos = new javax.swing.JLabel();
        jLabelNombreCompraArticulo = new javax.swing.JLabel();
        jTextPrecioCompraArticulo = new javax.swing.JTextField();
        jTextCantida = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompraArticulo = new javax.swing.JTable();
        jLabelPrecioCompraArticulo = new javax.swing.JLabel();
        jComboBoxArticulo = new javax.swing.JComboBox<>();
        jLabelCantidaCompraArticulo1 = new javax.swing.JLabel();
        jPanelBottones = new javax.swing.JPanel();
        jButtonEliminar = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();

        setResizable(false);

        jPanelCompraArticulo.setBackground(new java.awt.Color(223, 231, 231));

        jLabelArticulos.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelArticulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelArticulos.setText("Compra ");

        jLabelNombreCompraArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreCompraArticulo.setText("Articulo:");

        jTextPrecioCompraArticulo.setEditable(false);

        jTableCompraArticulo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableCompraArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompraArticuloMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableCompraArticulo);

        jLabelPrecioCompraArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelPrecioCompraArticulo.setText("Precio:");
        jLabelPrecioCompraArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelCantidaCompraArticulo1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelCantidaCompraArticulo1.setText("Cantidad:");
        jLabelCantidaCompraArticulo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPanelBottones.setBackground(new java.awt.Color(223, 231, 231));

        jButtonEliminar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonAñadir.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonAñadir.setText("Añadir");

        jButtonNuevo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottonesLayout = new javax.swing.GroupLayout(jPanelBottones);
        jPanelBottones.setLayout(jPanelBottonesLayout);
        jPanelBottonesLayout.setHorizontalGroup(
            jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardar)
                .addContainerGap())
        );
        jPanelBottonesLayout.setVerticalGroup(
            jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonGuardar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanelCompraArticuloLayout = new javax.swing.GroupLayout(jPanelCompraArticulo);
        jPanelCompraArticulo.setLayout(jPanelCompraArticuloLayout);
        jPanelCompraArticuloLayout.setHorizontalGroup(
            jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                        .addComponent(jLabelNombreCompraArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                        .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelArticulos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCantidaCompraArticulo1)
                                    .addComponent(jLabelPrecioCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCantida, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPrecioCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jPanelBottones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCompraArticuloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanelCompraArticuloLayout.setVerticalGroup(
            jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelArticulos)
                .addGap(18, 18, 18)
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreCompraArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidaCompraArticulo1)
                    .addComponent(jTextCantida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecioCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioCompraArticulo))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanelBottones, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCompraArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        try {
            nuevo();
        } catch (Exception ex) {
            Logger.getLogger(CompraArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jTableCompraArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompraArticuloMouseClicked
        int filaSeleccionada = jTableCompraArticulo.rowAtPoint(evt.getPoint());
        Object valorCelda = jTableCompraArticulo.getValueAt(filaSeleccionada, 0);
        if (valorCelda instanceof Integer) {
            int valorEntero = (int) valorCelda;
            controller.seleccionar(valorEntero);
        } else {
            JOptionPane.showMessageDialog(null, "El valor seleccionado no es un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jTableCompraArticuloMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            eliminar();
        } catch (Exception ex) {
            Logger.getLogger(CompraArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            guardarActualizar();
        } catch (Exception ex) {
            Logger.getLogger(CompraArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    public void cargar(ArrayList<Modelo> compraArticulos, ArrayList<Modelo> articulos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Articulo");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");

        for (Modelo modelo : compraArticulos) {
            CompraArticulo compraArticulo = (CompraArticulo) modelo;
            Object[] fila = new Object[3];
            fila[0] = compraArticulo.getArticulo();
            fila[1] = compraArticulo.getCantidad();
            fila[2] = compraArticulo.getPrecio();

            modeloTabla.addRow(fila);

        }

        jTableCompraArticulo.setModel(modeloTabla);

        jComboBoxArticulo.removeAllItems();

        for (Modelo modelos : articulos) {
            Articulo articulo = (Articulo) modelos;
            jComboBoxArticulo.addItem(articulo);

        }
    }

    public void setViewMode(Compra compra) {

        boolean esNuevaCompra = compra.Id == 0;

        if (esNuevaCompra) {

            jLabelArticulos.setText("NUEVA COMPRA");
            jButtonNuevo.setVisible(true);
            jPanelBottones.setVisible(true);
            jTextCantida.setEditable(true);
            jTextPrecioCompraArticulo.setEditable(true);

        } else {

            jLabelArticulos.setText("COMPRA " + compra.Id);
            jPanelBottones.setVisible(false);
            jTextCantida.setEditable(false);

        }

    }

    private void eliminar() throws Exception {
        controller.eliminar();
        controller.cargar();
    }

    public void actualizarView(CompraArticulo compraArticulo) {
        jTextPrecioCompraArticulo.setText(String.valueOf(compraArticulo.getPrecio()));
        jTextCantida.setText(String.valueOf(compraArticulo.getCantidad()));
        jComboBoxArticulo.setSelectedItem(compraArticulo.getArticulo());

    }

    private void guardarActualizar() throws Exception {
        Double precio = Double.valueOf(jTextPrecioCompraArticulo.getText());
        Double cantidad = Double.valueOf(jTextCantida.getText());
              
       Articulo articulo = (Articulo) jComboBoxArticulo.getSelectedItem();

        controller.guardarActualizar(articulo, cantidad, precio);
        controller.cargar();
    }

    private void nuevo() throws Exception {
        controller.nuevo();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox<Articulo> jComboBoxArticulo;
    private javax.swing.JLabel jLabelArticulos;
    private javax.swing.JLabel jLabelCantidaCompraArticulo1;
    private javax.swing.JLabel jLabelNombreCompraArticulo;
    private javax.swing.JLabel jLabelPrecioCompraArticulo;
    private javax.swing.JPanel jPanelBottones;
    private javax.swing.JPanel jPanelCompraArticulo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableCompraArticulo;
    private javax.swing.JTextField jTextCantida;
    private javax.swing.JTextField jTextPrecioCompraArticulo;
    // End of variables declaration//GEN-END:variables

}
