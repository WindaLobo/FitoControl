package view;

import FitoControl.DataBase.modelo.Marca;
import FitoControl.DataBase.modelo.Modelo;
import controllers.MarcaController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MarcaView extends javax.swing.JFrame {

    private final MarcaController controller;

    public MarcaView() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);

        controller = new MarcaController(this);
        controller.cargar();
        controller.nuevo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMarcas = new javax.swing.JLabel();
        jLabelIDMarcas = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMarcas = new javax.swing.JTable();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(223, 231, 231));

        jLabelMarcas.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelMarcas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMarcas.setText("Marcas");

        jLabelIDMarcas.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDMarcas.setText("ID:");
        jLabelIDMarcas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelNombre.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextID.setEditable(false);

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

        jButtonEliminar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jTableMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMarcas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNombre)
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelIDMarcas)
                                    .addComponent(jLabelMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonEliminar, jButtonGuardar, jButtonNuevo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelMarcas)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDMarcas)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        try {
            guardarActualizar();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        try {
            nuevo();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            eliminar();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcasMouseClicked
        int filaSeleccionada = jTableMarcas.getSelectedRow();
        controller.seleccionar((int) jTableMarcas.getValueAt(filaSeleccionada, 0));
    }//GEN-LAST:event_jTableMarcasMouseClicked

    public void cargar(ArrayList<Modelo> marcas) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");

        for (Modelo modelo : marcas) {
            Marca marca = (Marca) modelo;
            Object[] fila = new Object[2];
            fila[0] = marca.Id;
            fila[1] = marca.getNombre();
            modeloTabla.addRow(fila);
        }

        jTableMarcas.setModel(modeloTabla);

    }

    public void actualizarView(Marca marca) {
        jTextID.setText(String.valueOf(marca.Id));
        jTextNombre.setText(marca.getNombre());
    }

    private void guardarActualizar() throws Exception {
        controller.guardarActualizar(jTextNombre.getText());
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
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabelIDMarcas;
    private javax.swing.JLabel jLabelMarcas;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMarcas;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

}
