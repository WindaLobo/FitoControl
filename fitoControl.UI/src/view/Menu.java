package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMarca = new javax.swing.JMenu();
        JArticulo = new javax.swing.JMenu();
        jCompra = new javax.swing.JMenu();
        jManoSulfato = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(728, 455));
        setResizable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/viñas.jpg"))); // NOI18N

        jMenuBar1.setBorder(null);

        JMarca.setText("Marcas");
        JMarca.setToolTipText("");
        JMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMarcaMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMarca);

        JArticulo.setText("Articulos");
        JArticulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JArticuloMouseClicked(evt);
            }
        });
        jMenuBar1.add(JArticulo);

        jCompra.setText("Compras");
        jCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCompraMouseClicked(evt);
            }
        });
        jMenuBar1.add(jCompra);

        jManoSulfato.setText("ManosSulfato");
        jManoSulfato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jManoSulfato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jManoSulfatoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jManoSulfato);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMarcaMouseClicked
        MarcaView marca = null;
        try {
            marca = new MarcaView();
            marca.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMarcaMouseClicked

    private void JArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArticuloMouseClicked
        ArticuloView articulo = null;
        try {
            articulo = new ArticuloView();
            articulo.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JArticuloMouseClicked

    private void jCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCompraMouseClicked
            CompraView compra = null;
        try {
            compra = new CompraView();
            compra.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCompraMouseClicked

    private void jManoSulfatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jManoSulfatoMouseClicked
        ManoSulfatoView manoSulfato =null;
        try {
            manoSulfato = new ManoSulfatoView();
            manoSulfato.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jManoSulfatoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JArticulo;
    private javax.swing.JMenu JMarca;
    private javax.swing.JMenu jCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jManoSulfato;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
