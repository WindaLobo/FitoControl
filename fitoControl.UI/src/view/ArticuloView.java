package view;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import controllers.ArticuloController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ArticuloView extends javax.swing.JFrame {

    private final ArticuloController controller;

    public ArticuloView() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(this);

        jComboBoxtipodeMedida.addItem(TipoMedida.Centilitros);
        jComboBoxtipodeMedida.addItem(TipoMedida.Gramos);
        jComboBoxtipodeMedida.addItem(TipoMedida.Kilos);
        jComboBoxtipodeMedida.addItem(TipoMedida.Litros);
        jComboBoxtipodeMedida.addItem(TipoMedida.Mililitros);

        controller = new ArticuloController(this);
        controller.cargar();
        controller.nuevo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelArticulo = new javax.swing.JPanel();
        jLabelArticulos = new javax.swing.JLabel();
        jLabelIDArticulo = new javax.swing.JLabel();
        jLabelNombreArticulo = new javax.swing.JLabel();
        jTextIDArticulo = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableArticulo = new javax.swing.JTable();
        jButtonNuevoAr = new javax.swing.JButton();
        jButtonGuardarAr = new javax.swing.JButton();
        jButtonEliminarAr = new javax.swing.JButton();
        jLabelNombreArticulo1 = new javax.swing.JLabel();
        jTextNombreArticulo1 = new javax.swing.JTextField();
        jLabelIDMarcas = new javax.swing.JLabel();
        jTextCantidadArticulo = new javax.swing.JTextField();
        jLabelCantidaArticulo = new javax.swing.JLabel();
        jComboBoxtipodeMedida = new javax.swing.JComboBox<>();
        jComboBoxMarcas = new javax.swing.JComboBox<>();

        setResizable(false);

        jPanelArticulo.setBackground(new java.awt.Color(223, 231, 231));

        jLabelArticulos.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelArticulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelArticulos.setText("Articulos");

        jLabelIDArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDArticulo.setText("ID:");
        jLabelIDArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelNombreArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreArticulo.setText("Nombre:");

        jTextIDArticulo.setEditable(false);

        jTableArticulo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArticuloMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableArticulo);

        jButtonNuevoAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoAr.setText("Nuevo");
        jButtonNuevoAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoArActionPerformed(evt);
            }
        });

        jButtonGuardarAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardarAr.setText("Guardar");
        jButtonGuardarAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarArActionPerformed(evt);
            }
        });

        jButtonEliminarAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarAr.setText("Eliminar");
        jButtonEliminarAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarArActionPerformed(evt);
            }
        });

        jLabelNombreArticulo1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreArticulo1.setText("Tipo medida:");

        jLabelIDMarcas.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDMarcas.setText("Marca:");
        jLabelIDMarcas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextCantidadArticulo.setEditable(false);

        jLabelCantidaArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelCantidaArticulo.setText("Cantidad:");
        jLabelCantidaArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanelArticuloLayout = new javax.swing.GroupLayout(jPanelArticulo);
        jPanelArticulo.setLayout(jPanelArticuloLayout);
        jPanelArticuloLayout.setHorizontalGroup(
            jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelArticuloLayout.createSequentialGroup()
                        .addComponent(jLabelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelArticuloLayout.createSequentialGroup()
                        .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCantidaArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIDArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreArticulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIDMarcas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombreArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIDArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelArticuloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNuevoAr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardarAr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarAr)
                .addContainerGap())
        );

        jPanelArticuloLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextCantidadArticulo, jTextIDArticulo, jTextNombreArticulo1});

        jPanelArticuloLayout.setVerticalGroup(
            jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArticuloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelArticulos)
                .addGap(15, 15, 15)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDArticulo)
                    .addComponent(jTextIDArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombreArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreArticulo1)
                    .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDMarcas)
                    .addComponent(jComboBoxMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidaArticulo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoAr)
                    .addComponent(jButtonGuardarAr)
                    .addComponent(jButtonEliminarAr))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelArticuloLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextCantidadArticulo, jTextIDArticulo, jTextNombreArticulo1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoArActionPerformed
        try {
            nuevo();
        } catch (Exception ex) {
            Logger.getLogger(ArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNuevoArActionPerformed

    private void jTableArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArticuloMouseClicked
        int filaSeleccionada = jTableArticulo.getSelectedRow();
        controller.seleccionar((int) jTableArticulo.getValueAt(filaSeleccionada, 0));
    }//GEN-LAST:event_jTableArticuloMouseClicked

    private void jButtonEliminarArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarArActionPerformed
        try {
            eliminar();
        } catch (Exception ex) {
            Logger.getLogger(ArticuloView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarArActionPerformed

    private void jButtonGuardarArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarArActionPerformed
        try {
            guardarActualizar();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarArActionPerformed

    public void cargar(ArrayList<Modelo> articulos, ArrayList<Modelo> marcas) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn(" ID ");
        modeloTabla.addColumn(" Nombre ");
        modeloTabla.addColumn(" Tipo de medidas ");
        modeloTabla.addColumn(" Marca");
        modeloTabla.addColumn(" Cantidad");

        for (Modelo modelo : articulos) {
            Articulo articulo = (Articulo) modelo;
            Object[] fila = new Object[5];
            fila[0] = articulo.Id;
            fila[1] = articulo.getNombre();
            fila[2] = articulo.getTipoMedida();
            fila[3] = articulo.getMarca().getNombre();
            fila[4] = articulo.getCantidad();
            modeloTabla.addRow(fila);
        }

        jTableArticulo.setModel(modeloTabla);

        jComboBoxMarcas.removeAllItems();
        for (Modelo modelo : marcas) {
           
            Marca marca = (Marca) modelo;
            jComboBoxMarcas.addItem(marca);
          
        }
    }

    public void actualizarView(Articulo articulo) {
        jTextIDArticulo.setText(String.valueOf(articulo.Id));
        jTextNombreArticulo1.setText(articulo.getNombre());
        jComboBoxtipodeMedida.setSelectedItem(articulo.getTipoMedida());
        jComboBoxMarcas.setSelectedItem(articulo.getMarca().getNombre());
        jTextCantidadArticulo.setText(String.valueOf(articulo.getCantidad()));
        

    }

    private void guardarActualizar() throws Exception {
        String nombreArticulo = jTextNombreArticulo1.getText();
        TipoMedida tipoMedida = (TipoMedida) jComboBoxtipodeMedida.getSelectedItem();
        Marca marca = (Marca) jComboBoxMarcas.getSelectedItem();

        controller.guardarActualizar(nombreArticulo, tipoMedida, marca);
        controller.cargar();
    }

    private void nuevo() throws Exception {
        controller.nuevo();
    }

    private void eliminar() throws Exception {
        controller.eliminar();
        controller.cargar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarAr;
    private javax.swing.JButton jButtonGuardarAr;
    private javax.swing.JButton jButtonNuevoAr;
    private javax.swing.JComboBox<Marca> jComboBoxMarcas;
    private javax.swing.JComboBox<TipoMedida> jComboBoxtipodeMedida;
    private javax.swing.JLabel jLabelArticulos;
    private javax.swing.JLabel jLabelCantidaArticulo;
    private javax.swing.JLabel jLabelIDArticulo;
    private javax.swing.JLabel jLabelIDMarcas;
    private javax.swing.JLabel jLabelNombreArticulo;
    private javax.swing.JLabel jLabelNombreArticulo1;
    private javax.swing.JPanel jPanelArticulo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableArticulo;
    private javax.swing.JTextField jTextCantidadArticulo;
    private javax.swing.JTextField jTextIDArticulo;
    private javax.swing.JTextField jTextNombreArticulo1;
    // End of variables declaration//GEN-END:variables

}
