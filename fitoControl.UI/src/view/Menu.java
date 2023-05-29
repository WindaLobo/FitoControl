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

        jMenuBar1 = new javax.swing.JMenuBar();
        JMarca = new javax.swing.JMenu();
        JArticulo = new javax.swing.JMenu();
        jCompra = new javax.swing.JMenu();
        jManoSulfato = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenuBar1.setBorder(null);

        JMarca.setText("Marcas");
        JMarca.setToolTipText("");
        JMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMarcaMousePressed(evt);
            }
        });
        jMenuBar1.add(JMarca);

        JArticulo.setText("Articulos");
        JArticulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JArticuloMousePressed(evt);
            }
        });
        jMenuBar1.add(JArticulo);

        jCompra.setText("Compras");
        jCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCompraMousePressed(evt);
            }
        });
        jMenuBar1.add(jCompra);

        jManoSulfato.setText("ManosSulfato");
        jManoSulfato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jManoSulfato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jManoSulfatoMousePressed(evt);
            }
        });
        jMenuBar1.add(jManoSulfato);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCompraMousePressed
             
        try {
          CompraView  compra = new CompraView();
            compra.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCompraMousePressed

    private void JArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArticuloMousePressed
         try {
          ArticuloView  articulo = new ArticuloView();
            articulo.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JArticuloMousePressed

    private void jManoSulfatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jManoSulfatoMousePressed
         ManoSulfatoView manoSulfato =null;
        try {
            manoSulfato = new ManoSulfatoView();
            manoSulfato.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jManoSulfatoMousePressed

    private void JMarcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMarcaMousePressed
        try {
            MarcaView marca = new MarcaView();
            marca.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JMarcaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JArticulo;
    private javax.swing.JMenu JMarca;
    private javax.swing.JMenu jCompra;
    private javax.swing.JMenu jManoSulfato;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
