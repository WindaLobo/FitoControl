package view;

import FitoControl.DataBase.modelo.Compra;
import FitoControl.DataBase.modelo.Modelo;
import controllers.CompraController;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CompraView extends javax.swing.JFrame {

    private final CompraController controller;

    public CompraView() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);
        controller = new CompraController(this);
        controller.cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabelCompra = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jButtonNuevoCom = new javax.swing.JButton();
        jButtonEliminarCom = new javax.swing.JButton();

        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(223, 231, 231));

        jLabelCompra.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCompra.setText("Compras");

        jTableCompra.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompraMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableCompra);

        jButtonNuevoCom.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoCom.setText("Nuevo");
        jButtonNuevoCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoComActionPerformed(evt);
            }
        });

        jButtonEliminarCom.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarCom.setText("Eliminar");
        jButtonEliminarCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNuevoCom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarCom)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelCompra)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminarCom)
                    .addComponent(jButtonNuevoCom))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompraMouseClicked

        int filaSeleccionada = jTableCompra.getSelectedRow();

        try {
            controller.seleccionar((int) jTableCompra.getValueAt(filaSeleccionada, 0));
        } catch (SQLException ex) {
            Logger.getLogger(CompraView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CompraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableCompraMouseClicked

    private void jButtonEliminarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarComActionPerformed
        try {
            eliminar();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarComActionPerformed

    private void jButtonNuevoComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoComActionPerformed
        try {
            nuevo();
        } catch (Exception ex) {
            Logger.getLogger(MarcaView.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButtonNuevoComActionPerformed

    public void cargar(ArrayList<Modelo> compras) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Fecha");

        for (Modelo modelo : compras) {
            Compra compra = (Compra) modelo;
            Object[] fila = new Object[2];
            fila[0] = compra.Id;
            Date fechaActual = Date.from(Instant.now());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fechaFormateada = formatoFecha.format(fechaActual);
            fila[1] = fechaFormateada;
            modeloTabla.addRow(fila);
        }

        jTableCompra.setModel(modeloTabla);
    }

    private void nuevo() throws Exception {
        controller.nuevo();
    }

    private void eliminar() throws Exception {
        controller.eliminar();
        controller.cargar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarCom;
    private javax.swing.JButton jButtonNuevoCom;
    private javax.swing.JLabel jLabelCompra;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableCompra;
    // End of variables declaration//GEN-END:variables

}
