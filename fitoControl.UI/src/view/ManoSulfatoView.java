package view;

import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.Modelo;
import controllers.ManoSulfatoController;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ManoSulfatoView extends javax.swing.JFrame {

    private final ManoSulfatoController controller;

    public ManoSulfatoView() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);
        controller = new ManoSulfatoController(this);
        controller.cargar();
        controller.nuevo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabelManoSulfato = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableManoSulfato = new javax.swing.JTable();
        jButtonNuevoMano = new javax.swing.JButton();
        jButtonEliminarMano = new javax.swing.JButton();

        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(223, 231, 231));

        jLabelManoSulfato.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelManoSulfato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelManoSulfato.setText("ManoSulfato");

        jTableManoSulfato.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableManoSulfato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableManoSulfato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableManoSulfatoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableManoSulfato);

        jButtonNuevoMano.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoMano.setText("Nuevo");
        jButtonNuevoMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoManoActionPerformed(evt);
            }
        });

        jButtonEliminarMano.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarMano.setText("Eliminar");
        jButtonEliminarMano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarManoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNuevoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonEliminarMano)
                .addGap(19, 19, 19))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManoSulfato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelManoSulfato)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoMano)
                    .addComponent(jButtonEliminarMano))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableManoSulfatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableManoSulfatoMouseClicked
        try {
            int filaSeleccionada = jTableManoSulfato.getSelectedRow();
            controller.seleccionar((int) jTableManoSulfato.getValueAt(filaSeleccionada, 0));
            ManoSulfatoArticuloView manoSulfato = new ManoSulfatoArticuloView();
            manoSulfato.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ManoSulfatoView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManoSulfatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableManoSulfatoMouseClicked

    private void jButtonNuevoManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoManoActionPerformed
        try {
            nuevo();
        } catch (Exception ex) {
            Logger.getLogger(ManoSulfatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonNuevoManoActionPerformed

    private void jButtonEliminarManoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarManoActionPerformed
        try {
            eliminar();
        } catch (Exception ex) {
            Logger.getLogger(ManoSulfatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEliminarManoActionPerformed

    public void cargar(ArrayList<Modelo> manosSulfato) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Fecha");

        for (Modelo modelo : manosSulfato) {
            ManoSulfato manoSulfato = (ManoSulfato) modelo;
            Object[] fila = new Object[2];
            fila[0] = manoSulfato.Id;
            
            Date fechaActual = Date.from(Instant.now());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String fechaFormateada = formatoFecha.format(fechaActual);

            fila[1] = fechaFormateada;
            modeloTabla.addRow(fila);
        }

        jTableManoSulfato.setModel(modeloTabla);
    }

    private void nuevo() throws Exception {
        controller.nuevo();
    }

    private void eliminar() throws Exception {
        controller.eliminar();
        controller.cargar();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarMano;
    private javax.swing.JButton jButtonNuevoMano;
    private javax.swing.JLabel jLabelManoSulfato;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableManoSulfato;
    // End of variables declaration//GEN-END:variables
}
