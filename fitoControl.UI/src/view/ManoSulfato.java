
package view;


public class ManoSulfato extends javax.swing.JFrame {

   
    public ManoSulfato() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabelManoSulfato = new javax.swing.JLabel();
        jLabelIDManoSulfato = new javax.swing.JLabel();
        jLabelFechaManos = new javax.swing.JLabel();
        jTextIDManoSulfato = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableManoSulfato = new javax.swing.JTable();
        jButtonNuevoMano = new javax.swing.JButton();
        jButtonGuardarMano = new javax.swing.JButton();
        jButtonEliminarMano = new javax.swing.JButton();
        jTextFechaManoSulfato = new javax.swing.JTextField();

        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(223, 231, 231));

        jLabelManoSulfato.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabelManoSulfato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelManoSulfato.setText("ManoSulfato");

        jLabelIDManoSulfato.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelIDManoSulfato.setText("ID:");
        jLabelIDManoSulfato.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelFechaManos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelFechaManos.setText("Fecha");

        jTextIDManoSulfato.setEditable(false);

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
        jScrollPane7.setViewportView(jTableManoSulfato);

        jButtonNuevoMano.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonNuevoMano.setText("Nuevo");

        jButtonGuardarMano.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonGuardarMano.setText("Guardar");

        jButtonEliminarMano.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButtonEliminarMano.setText("Eliminar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelManoSulfato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIDManoSulfato, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaManos, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFechaManoSulfato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextIDManoSulfato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButtonNuevoMano, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardarMano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarMano)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelManoSulfato)
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIDManoSulfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDManoSulfato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFechaManoSulfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaManos))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoMano)
                    .addComponent(jButtonGuardarMano)
                    .addComponent(jButtonEliminarMano))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton jButtonEliminarMano;
    private javax.swing.JButton jButtonGuardarMano;
    private javax.swing.JButton jButtonNuevoMano;
    private javax.swing.JLabel jLabelFechaManos;
    private javax.swing.JLabel jLabelIDManoSulfato;
    private javax.swing.JLabel jLabelManoSulfato;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTableManoSulfato;
    private javax.swing.JTextField jTextFechaManoSulfato;
    private javax.swing.JTextField jTextIDManoSulfato;
    // End of variables declaration//GEN-END:variables
}

