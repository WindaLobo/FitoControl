package view;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.CompraArticulo;
import FitoControl.DataBase.modelo.Modelo;
import controllers.CompraArticuloController;
import controllers.CompraController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompraArticuloView extends javax.swing.JFrame {

    private final CompraArticuloController controller;

    public CompraArticuloView(CompraController compraController, Compra compra) throws SQLException, ClassNotFoundException, Exception {
        initComponents();
        this.setLocationRelativeTo(this);

        controller = new CompraArticuloController(compraController, this, compra);
        controller.cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCompraArticulo = new javax.swing.JPanel();
        jLabelArticulos = new javax.swing.JLabel();
        jLabelNombreCompraArticulo = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jTextCantidad = new javax.swing.JTextField();
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
        jLabeltotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        setResizable(false);

        jPanelCompraArticulo.setBackground(new java.awt.Color(223, 231, 231));

        jLabelArticulos.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelArticulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelArticulos.setText("Compra ");

        jLabelNombreCompraArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreCompraArticulo.setText("Articulo:");

        jTextPrecio.setEditable(false);

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
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

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

        jLabeltotal.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabeltotal.setText("Total:");

        javax.swing.GroupLayout jPanelBottonesLayout = new javax.swing.GroupLayout(jPanelBottones);
        jPanelBottones.setLayout(jPanelBottonesLayout);
        jPanelBottonesLayout.setHorizontalGroup(
            jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBottonesLayout.createSequentialGroup()
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelBottonesLayout.setVerticalGroup(
            jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBottonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltotal))
                .addGap(18, 18, 18)
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
                    .addComponent(jLabelNombreCompraArticulo)
                    .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelArticulos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                            .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCantidaCompraArticulo1)
                                .addComponent(jLabelPrecioCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(84, 84, 84)
                            .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelCompraArticuloLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jPanelBottones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
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
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreCompraArticulo)
                    .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidaCompraArticulo1)
                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCompraArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecioCompraArticulo))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBottones, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCompraArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCompraArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        int filaSeleccionada = jTableCompraArticulo.getSelectedRow();
        controller.seleccionar((int) jTableCompraArticulo.getValueAt(filaSeleccionada, 0));
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
            guardar();

        } catch (Exception ex) {
            Logger.getLogger(CompraArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed

        double cantidad = Double.parseDouble(jTextCantidad.getText());
        double precio = Double.parseDouble(jTextPrecio.getText());
        controller.añadir((Articulo) jComboBoxArticulo.getSelectedItem(), cantidad, precio);
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    public void cargar(ArrayList<CompraArticulo> compraArticulos, ArrayList<Modelo> articulos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Detalle");
        modeloTabla.addColumn("Articulo");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");

        for (CompraArticulo compraArticulo : compraArticulos) {
            Object[] fila = new Object[4];
            fila[0] = compraArticulo.Id;
            fila[1] = compraArticulo.getArticulo();
            fila[2] = compraArticulo.getCantidad();
            fila[3] = compraArticulo.getPrecio();

            modeloTabla.addRow(fila);
        }

        jTableCompraArticulo.setModel(modeloTabla);

        jComboBoxArticulo.removeAllItems();

        for (Modelo modelos : articulos) {
            Articulo articulo = (Articulo) modelos;
            jComboBoxArticulo.addItem(articulo);

        }

    }

    public void setViewMode(Compra compra) throws Exception, Exception {

        boolean esNuevaCompra = compra.Id == 0;

        if (esNuevaCompra) {

            jLabelArticulos.setText("NUEVA COMPRA");
            jButtonNuevo.setVisible(true);
            jPanelBottones.setVisible(true);
            jTextCantidad.setEditable(true);
            jTextPrecio.setEditable(true);
            jTextFieldTotal.setEditable(false);

            nuevo();

        } else {

            jLabelArticulos.setText("COMPRA " + compra.Id);
            jPanelBottones.setVisible(false);
            jTextCantidad.setEditable(false);
        }

    }

    private void eliminar() throws Exception {
        controller.eliminar();
        controller.cargar();
    }

    public void actualizarView(CompraArticulo compraArticulo) {
        jTextPrecio.setText(String.valueOf(compraArticulo.getPrecio()));
        jTextCantidad.setText(String.valueOf(compraArticulo.getCantidad()));
        jComboBoxArticulo.setSelectedItem(compraArticulo.getArticulo());

    }

    public void cerrar() {
        this.setVisible(false);
    }

    private void guardar() throws Exception {
        controller.guardar();
    }

    private void nuevo() throws Exception {
        controller.nuevo();
    }

    public void setTotal(double total) {
        jTextFieldTotal.setText(String.valueOf(total));
    }

    public int pedirConfirmacion(String mensaje) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje,
                "Crear compra", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        return respuesta;
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
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanelBottones;
    private javax.swing.JPanel jPanelCompraArticulo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableCompraArticulo;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables

}
