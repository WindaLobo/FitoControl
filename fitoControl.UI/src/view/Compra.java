package view;

public class Compra extends javax.swing.JFrame {

    public Compra() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabelCompra = new javax.swing.JLabel();
        jLabelIDCompras = new javax.swing.JLabel();
        jLabelFechaCompra = new javax.swing.JLabel();
        jTextIDCompra = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCompra = new javax.swing.JTable();
        jButtonNuevoCom = new javax.swing.JButton();
        jButtonGuardarCom = new javax.swing.JButton();
        jButtonEliminarCom = new javax.swing.JButton();
        jTextFechaCompra = new javax.swing.JTextField();

        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(223, 231, 231));

        jLabelCompra.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelCompra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCompra.setText("Compras");

        jLabelIDCompras.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDCompras.setText("ID:");
        jLabelIDCompras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelFechaCompra.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelFechaCompra.setText("Fecha");

        jTextIDCompra.setEditable(false);

        jTableCompra.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jTableCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTableCompra);

        jButtonNuevoCom.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoCom.setText("Nuevo");

        jButtonGuardarCom.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardarCom.setText("Guardar");

        jButtonEliminarCom.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarCom.setText("Eliminar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIDCompras, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaCompra, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFechaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIDCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButtonNuevoCom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardarCom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarCom)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelCompra)
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDCompras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaCompra))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoCom)
                    .addComponent(jButtonGuardarCom)
                    .addComponent(jButtonEliminarCom))
                .addContainerGap(22, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminarCom;
    private javax.swing.JButton jButtonGuardarCom;
    private javax.swing.JButton jButtonNuevoCom;
    private javax.swing.JLabel jLabelCompra;
    private javax.swing.JLabel jLabelFechaCompra;
    private javax.swing.JLabel jLabelIDCompras;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableCompra;
    private javax.swing.JTextField jTextFechaCompra;
    private javax.swing.JTextField jTextIDCompra;
    // End of variables declaration//GEN-END:variables
}
