
package view;


public class Articulo extends javax.swing.JFrame {

  
    public Articulo() {
        initComponents();
         this.setLocationRelativeTo(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
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

        jPanel6.setBackground(new java.awt.Color(223, 231, 231));

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
        jTableArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo de Medida", "Marca", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTableArticulo);

        jButtonNuevoAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoAr.setText("Nuevo");

        jButtonGuardarAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardarAr.setText("Guardar");

        jButtonEliminarAr.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarAr.setText("Eliminar");

        jLabelNombreArticulo1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelNombreArticulo1.setText("Tipo medida:");

        jLabelIDMarcas.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDMarcas.setText("Marca:");
        jLabelIDMarcas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextCantidadArticulo.setEditable(false);

        jLabelCantidaArticulo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelCantidaArticulo.setText("Cantidad:");
        jLabelCantidaArticulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jComboBoxtipodeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCantidaArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIDArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreArticulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreArticulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelIDMarcas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombreArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIDArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNuevoAr, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardarAr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarAr)
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextCantidadArticulo, jTextIDArticulo, jTextNombreArticulo1});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelArticulos)
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIDArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombreArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelNombreArticulo1)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jComboBoxtipodeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIDMarcas)
                    .addComponent(jComboBoxMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCantidadArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidaArticulo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoAr)
                    .addComponent(jButtonGuardarAr)
                    .addComponent(jButtonEliminarAr))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextCantidadArticulo, jTextIDArticulo, jTextNombreArticulo1});

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarAr;
    private javax.swing.JButton jButtonGuardarAr;
    private javax.swing.JButton jButtonNuevoAr;
    private javax.swing.JComboBox<String> jComboBoxMarcas;
    private javax.swing.JComboBox<String> jComboBoxtipodeMedida;
    private javax.swing.JLabel jLabelArticulos;
    private javax.swing.JLabel jLabelCantidaArticulo;
    private javax.swing.JLabel jLabelIDArticulo;
    private javax.swing.JLabel jLabelIDMarcas;
    private javax.swing.JLabel jLabelNombreArticulo;
    private javax.swing.JLabel jLabelNombreArticulo1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableArticulo;
    private javax.swing.JTextField jTextCantidadArticulo;
    private javax.swing.JTextField jTextIDArticulo;
    private javax.swing.JTextField jTextNombreArticulo1;
    // End of variables declaration//GEN-END:variables

}
