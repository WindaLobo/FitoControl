package view;

import FitoControl.DataBase.modelo.Articulo;
import FitoControl.DataBase.modelo.ManoSulfato;
import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import controllers.ManoSulfatoArticuloController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ManoSulfatoArticuloView extends javax.swing.JFrame {

    private final ManoSulfatoArticuloController controller;
    private ManoSulfato manoSulfato;

    public ManoSulfatoArticuloView(ManoSulfato manoSulfato) throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(this);

        controller = new ManoSulfatoArticuloController(this, manoSulfato);
        controller.cargar();
          controller.nuevo();

        jComboBoxtipodeMedida.addItem(TipoMedida.Centilitros);
        jComboBoxtipodeMedida.addItem(TipoMedida.Gramos);
        jComboBoxtipodeMedida.addItem(TipoMedida.Kilos);
        jComboBoxtipodeMedida.addItem(TipoMedida.Litros);
        jComboBoxtipodeMedida.addItem(TipoMedida.Mililitros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMAnoSulfatoArticulo = new javax.swing.JPanel();
        jLabelArticulos = new javax.swing.JLabel();
        jLabelNombreManoSulfatoArticulo = new javax.swing.JLabel();
        jTextCantida = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableManoSulfatoArticulo = new javax.swing.JTable();
        jLabelCantidaManoSulfatoArticulo = new javax.swing.JLabel();
        jLabelTipoMedidaManoSulfatoArticulo = new javax.swing.JLabel();
        jComboBoxtipodeMedida = new javax.swing.JComboBox<>();
        jPanelButon = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonañadir = new javax.swing.JButton();
        jComboBoxArticulo = new javax.swing.JComboBox<>();

        setResizable(false);

        jPanelMAnoSulfatoArticulo.setBackground(new java.awt.Color(223, 231, 231));

        jLabelArticulos.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelArticulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelNombreManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreManoSulfatoArticulo.setText("Articulo");

        jTableManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableManoSulfatoArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableManoSulfatoArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableManoSulfatoArticuloMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableManoSulfatoArticulo);

        jLabelCantidaManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelCantidaManoSulfatoArticulo.setText("Cantidad:");
        jLabelCantidaManoSulfatoArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelTipoMedidaManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelTipoMedidaManoSulfatoArticulo.setText("Tipo de medida:");

        jPanelButon.setBackground(new java.awt.Color(223, 231, 231));

        jButtonGuardar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");

        jButtonEliminar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");

        jButtonNuevo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");

        jButtonañadir.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonañadir.setText("Añadir");

        javax.swing.GroupLayout jPanelButonLayout = new javax.swing.GroupLayout(jPanelButon);
        jPanelButon.setLayout(jPanelButonLayout);
        jPanelButonLayout.setHorizontalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonañadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardar)
                .addContainerGap())
        );
        jPanelButonLayout.setVerticalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonañadir))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanelMAnoSulfatoArticuloLayout = new javax.swing.GroupLayout(jPanelMAnoSulfatoArticulo);
        jPanelMAnoSulfatoArticulo.setLayout(jPanelMAnoSulfatoArticuloLayout);
        jPanelMAnoSulfatoArticuloLayout.setHorizontalGroup(
            jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                        .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCantidaManoSulfatoArticulo)
                            .addComponent(jLabelTipoMedidaManoSulfatoArticulo)
                            .addComponent(jLabelNombreManoSulfatoArticulo))
                        .addGap(90, 90, 90)
                        .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCantida, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMAnoSulfatoArticuloLayout.setVerticalGroup(
            jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelArticulos)
                .addGap(18, 18, 18)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreManoSulfatoArticulo)
                    .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoMedidaManoSulfatoArticulo)
                    .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidaManoSulfatoArticulo)
                    .addComponent(jTextCantida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMAnoSulfatoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMAnoSulfatoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableManoSulfatoArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableManoSulfatoArticuloMouseClicked
        int filaSeleccionada = jTableManoSulfatoArticulo.getSelectedRow();
        controller.seleccionar((int) jTableManoSulfatoArticulo.getValueAt(filaSeleccionada, 0));
    }//GEN-LAST:event_jTableManoSulfatoArticuloMouseClicked

    public void cargar(ArrayList<Modelo> manosSulfatosArticulos, ArrayList<Modelo> articulos) {

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn(" Articulo");
        modeloTabla.addColumn(" Tipo de medida");
        modeloTabla.addColumn(" Cantidad ");

        for (Modelo modelo : manosSulfatosArticulos) {
            ManoSulfatoArticulo manoSulfatoArticulo = (ManoSulfatoArticulo) modelo;
            Object[] fila = new Object[3];
            fila[0] = manoSulfatoArticulo.getArticulo();
            fila[1] = manoSulfatoArticulo.getIdMedida();
            fila[2] = manoSulfatoArticulo.getCantidad();

            modeloTabla.addRow(fila);
        }

        jTableManoSulfatoArticulo.setModel(modeloTabla);

        jComboBoxArticulo.removeAllItems();

        for (Modelo modelos : articulos) {
            Articulo articulo = (Articulo) modelos;
            jComboBoxArticulo.addItem(articulo);

        }

    }

    public void actualizarView(ManoSulfatoArticulo manoSulfatoArticulo) {
        jComboBoxArticulo.setSelectedItem(manoSulfatoArticulo.getArticulo());
        jComboBoxtipodeMedida.setSelectedItem(manoSulfatoArticulo.getIdMedida());
        jTextCantida.setText(String.valueOf(manoSulfatoArticulo.getCantidad()));

    }

    public void setViewMode(ManoSulfato manoSulfato) {

        boolean esNuevaManoSulfato = manoSulfato.Id == 0;

        if (esNuevaManoSulfato) {

            jLabelArticulos.setText("NUEVA MANOSULFATO");
            jButtonNuevo.setVisible(true);
            jPanelButon.setVisible(true);
            jTextCantida.setEditable(true);

        } else {

            jLabelArticulos.setText("ManoSulfato " + manoSulfato.Id);
            jPanelButon.setVisible(false);
            jTextCantida.setEditable(false);

        }

    }
    
     private void guardarActualizar() throws Exception {
        Articulo nombreArticulo =(Articulo) jComboBoxArticulo.getSelectedItem();
        TipoMedida tipoMedida = (TipoMedida) jComboBoxtipodeMedida.getSelectedItem();
        Double  cantidad = Double.valueOf(jTextCantida.getText());

        controller.guardarActualizar(cantidad, tipoMedida,nombreArticulo );
        controller.cargar();
    }
   private void nuevo() throws Exception {
        controller.nuevo();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonañadir;
    private javax.swing.JComboBox<Articulo> jComboBoxArticulo;
    private javax.swing.JComboBox<TipoMedida> jComboBoxtipodeMedida;
    private javax.swing.JLabel jLabelArticulos;
    private javax.swing.JLabel jLabelCantidaManoSulfatoArticulo;
    private javax.swing.JLabel jLabelNombreManoSulfatoArticulo;
    private javax.swing.JLabel jLabelTipoMedidaManoSulfatoArticulo;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelMAnoSulfatoArticulo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableManoSulfatoArticulo;
    private javax.swing.JTextField jTextCantida;
    // End of variables declaration//GEN-END:variables

}
