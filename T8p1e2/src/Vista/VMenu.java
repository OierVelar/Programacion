/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import t8p1e2.T8p1e2;
import static t8p1e2.T8p1e2.guardarEvento;
import static t8p1e2.T8p1e2.guardarPersona;
import static t8p1e2.T8p1e2.salir;

/**
 *
 * @author 1GDAW08
 */
public class VMenu extends javax.swing.JFrame {

    /**
     * Creates new form VMenu
     */
    public VMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jToolBar1 = new javax.swing.JToolBar();
        bGE = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        bME = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mGE = new javax.swing.JMenuItem();
        mCE = new javax.swing.JMenuItem();
        mME = new javax.swing.JMenuItem();
        mInscripcion = new javax.swing.JMenu();
        miInscribir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bGE.setText("Guardar Evento");
        bGE.setFocusable(false);
        bGE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bGE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGEActionPerformed(evt);
            }
        });
        jToolBar1.add(bGE);

        bCE.setText("Cancelar Evento");
        bCE.setFocusable(false);
        bCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });
        jToolBar1.add(bCE);

        bME.setText("Modificar Evento");
        bME.setFocusable(false);
        bME.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bME.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMEActionPerformed(evt);
            }
        });
        jToolBar1.add(bME);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/evento-concierto-874x492.jpg"))); // NOI18N
        jButton4.setText("jButton4");

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jMenu1.setText("Evento");

        mGE.setText("Guardar Evento");
        mGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGEActionPerformed(evt);
            }
        });
        jMenu1.add(mGE);

        mCE.setText("Cancelar Evento");
        mCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCEActionPerformed(evt);
            }
        });
        jMenu1.add(mCE);

        mME.setText("Modificar Evento");
        mME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMEActionPerformed(evt);
            }
        });
        jMenu1.add(mME);

        jMenuBar1.add(jMenu1);

        mInscripcion.setText("Inscripcion");
        mInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInscripcionActionPerformed(evt);
            }
        });

        miInscribir.setText("Inscribir persona");
        miInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInscribirActionPerformed(evt);
            }
        });
        mInscripcion.add(miInscribir);

        jMenuBar1.add(mInscripcion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        salir();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGEActionPerformed
        guardarEvento();
    }//GEN-LAST:event_bGEActionPerformed

    private void mGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGEActionPerformed
        guardarEvento();
    }//GEN-LAST:event_mGEActionPerformed

    private void mCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCEActionPerformed
        try {
            String b=JOptionPane.showInputDialog("Teclea el nombre del evento que quieras borrar");
            T8p1e2.borrarEvento(b);
            JOptionPane.showMessageDialog(null, "Evento cancelado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No hay ningun evento con ese nombre");
        }
    }//GEN-LAST:event_mCEActionPerformed

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        try {
            String b=JOptionPane.showInputDialog("Teclea el nombre del evento que quieras borrar");
            T8p1e2.borrarEvento(b);
            JOptionPane.showMessageDialog(null, "Evento cancelado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No hay ningun evento con ese nombre");
        }
    }//GEN-LAST:event_bCEActionPerformed

    private void mMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMEActionPerformed
        try {
           String n=JOptionPane.showInputDialog("Teclea el nombre del evento que quieras modificar");
           T8p1e2.consultarEvento(n);
           JOptionPane.showMessageDialog(null, "Evento modificado con exito");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Problemas");
        }
    }//GEN-LAST:event_mMEActionPerformed

    private void bMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMEActionPerformed
        try {
           String n=JOptionPane.showInputDialog("Teclea el nombre del evento que quieras modificar");
           T8p1e2.consultarEvento(n);
           JOptionPane.showMessageDialog(null, "Evento modificado con exito");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Problemas");
        }
    }//GEN-LAST:event_bMEActionPerformed

    private void mInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInscripcionActionPerformed
        
    }//GEN-LAST:event_mInscripcionActionPerformed

    private void miInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInscribirActionPerformed
        guardarPersona();
    }//GEN-LAST:event_miInscribirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCE;
    private javax.swing.JButton bGE;
    private javax.swing.JButton bME;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mCE;
    private javax.swing.JMenuItem mGE;
    private javax.swing.JMenu mInscripcion;
    private javax.swing.JMenuItem mME;
    private javax.swing.JMenuItem miInscribir;
    // End of variables declaration//GEN-END:variables

}
