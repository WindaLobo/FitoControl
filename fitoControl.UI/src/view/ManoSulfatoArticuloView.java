
package view;


import FitoControl.DataBase.modelo.ManoSulfatoArticulo;
import FitoControl.DataBase.modelo.Modelo;
import FitoControl.DataBase.modelo.TipoMedida;
import controllers.ManoSulfatoArticuloController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ManoSulfatoArticuloView extends javax.swing.JFrame {
 private final ManoSulfatoArticuloController controller;
   
    public ManoSulfatoArticuloView() throws SQLException, ClassNotFoundException {
        initComponents();
          this.setLocationRelativeTo(this);
         controller = new ManoSulfatoArticuloController(this);
          controller.cargar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMAnoSulfatoArticulo = new javax.swing.JPanel();
        jLabelArticulos = new javax.swing.JLabel();
        jLabelNombreManoSulfatoArticulo = new javax.swing.JLabel();
        jTextCantida = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompraArticulo = new javax.swing.JTable();
        jTextArticulo = new javax.swing.JTextField();
        jLabelCantidaManoSulfatoArticulo = new javax.swing.JLabel();
        jLabelTipoMedidaManoSulfatoArticulo = new javax.swing.JLabel();
        jComboBoxtipodeMedida = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonañadir = new javax.swing.JButton();

        setResizable(false);

        jPanelMAnoSulfatoArticulo.setBackground(new java.awt.Color(223, 231, 231));

        jLabelArticulos.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelArticulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelArticulos.setText("ManoSulfato Articulo");

        jLabelNombreManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreManoSulfatoArticulo.setText("Articulo");

        jTableCompraArticulo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableCompraArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTableCompraArticulo);

        jLabelCantidaManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelCantidaManoSulfatoArticulo.setText("Cantidad:");
        jLabelCantidaManoSulfatoArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelTipoMedidaManoSulfatoArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelTipoMedidaManoSulfatoArticulo.setText("Tipo de medida:");

        jPanel1.setBackground(new java.awt.Color(223, 231, 231));

        jButtonGuardar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");

        jButtonEliminar.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");

        jButtonNuevo.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");

        jButtonañadir.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonañadir.setText("Añadir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap()
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                        .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCantidaManoSulfatoArticulo)
                            .addComponent(jLabelTipoMedidaManoSulfatoArticulo)
                            .addComponent(jLabelNombreManoSulfatoArticulo))
                        .addGap(90, 90, 90)
                        .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCantida, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanelMAnoSulfatoArticuloLayout.setVerticalGroup(
            jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMAnoSulfatoArticuloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelArticulos)
                .addGap(18, 18, 18)
                .addGroup(jPanelMAnoSulfatoArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreManoSulfatoArticulo)
                    .addComponent(jTextArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

  public void cargar(ArrayList<Modelo> manosSulfatos) {
      
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn(" Articulo ");
        modeloTabla.addColumn(" Tipo de medida");
        modeloTabla.addColumn(" Cantidad ");

        for (Modelo modelo : manosSulfatos) {
            ManoSulfatoArticulo manoSulfato = (ManoSulfatoArticulo) modelo;
            Object[] fila = new Object[3];
            fila[0] = manoSulfato.getArticulo();
            fila[1] = manoSulfato.getIdMedida();
            fila[2] = manoSulfato.getCantidad();
        
            modeloTabla.addRow(fila);
        }

        jTableCompraArticulo.setModel(modeloTabla);

    }
    
    
     public void actualizarView(ManoSulfatoArticulo manoSulfatoArticulo) {
        jTextArticulo.setText(String.valueOf(manoSulfatoArticulo.getArticulo()));
        jComboBoxtipodeMedida.setSelectedItem(manoSulfatoArticulo.getIdMedida());
        jTextCantida.setText(String.valueOf(manoSulfatoArticulo.getCantidad()));
       

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonañadir;
    private javax.swing.JComboBox<TipoMedida> jComboBoxtipodeMedida;
    private javax.swing.JLabel jLabelArticulos;
    private javax.swing.JLabel jLabelCantidaManoSulfatoArticulo;
    private javax.swing.JLabel jLabelNombreManoSulfatoArticulo;
    private javax.swing.JLabel jLabelTipoMedidaManoSulfatoArticulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMAnoSulfatoArticulo;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableCompraArticulo;
    private javax.swing.JTextField jTextArticulo;
    private javax.swing.JTextField jTextCantida;
    // End of variables declaration//GEN-END:variables

  

    
}
