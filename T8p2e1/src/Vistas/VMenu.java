/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;
import t8p2e1.T8p2e1;

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

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mACliente = new javax.swing.JMenuItem();
        mBCliente = new javax.swing.JMenuItem();
        mMCliente = new javax.swing.JMenuItem();
        mConsultaCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mAAbogado = new javax.swing.JMenuItem();
        mBAbogado = new javax.swing.JMenuItem();
        mMAbogado = new javax.swing.JMenuItem();
        mCAbogado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mACaso = new javax.swing.JMenuItem();
        mBCaso = new javax.swing.JMenuItem();
        mMCaso = new javax.swing.JMenuItem();
        mCCaso = new javax.swing.JMenuItem();
        mAsignar = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GABINETE DE ABOGADOS");

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jMenu1.setText("Clientes");

        mACliente.setText("Alta");
        mACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mACliente);

        mBCliente.setText("Baja");
        mBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mBCliente);

        mMCliente.setText("Modificacion");
        mMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mMCliente);

        mConsultaCliente.setText("Consulta");
        mConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mConsultaCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abogados");

        mAAbogado.setText("Alta");
        mAAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAAbogadoActionPerformed(evt);
            }
        });
        jMenu2.add(mAAbogado);

        mBAbogado.setText("Baja");
        mBAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBAbogadoActionPerformed(evt);
            }
        });
        jMenu2.add(mBAbogado);

        mMAbogado.setText("Modificacion");
        jMenu2.add(mMAbogado);

        mCAbogado.setText("Consulta");
        jMenu2.add(mCAbogado);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Casos");

        mACaso.setText("Alta");
        mACaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mACasoActionPerformed(evt);
            }
        });
        jMenu3.add(mACaso);

        mBCaso.setText("Baja");
        mBCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBCasoActionPerformed(evt);
            }
        });
        jMenu3.add(mBCaso);

        mMCaso.setText("Modificacion");
        jMenu3.add(mMCaso);

        mCCaso.setText("Consulta");
        jMenu3.add(mCCaso);

        mAsignar.setText("Asignar caso");
        mAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAsignarActionPerformed(evt);
            }
        });
        jMenu3.add(mAsignar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        T8p2e1.salir();
    }//GEN-LAST:event_bSalirActionPerformed

    private void mAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAClienteActionPerformed
        T8p2e1.guardarCliente();
    }//GEN-LAST:event_mAClienteActionPerformed

    private void mBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBClienteActionPerformed
        try {
            String b=JOptionPane.showInputDialog("Teclea el nombre del cliente que quieras borrar");
            T8p2e1.borrarCliente(b);
            JOptionPane.showMessageDialog(null, "Cliente borrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No hay ningun cliente con ese dni");
        }
    }//GEN-LAST:event_mBClienteActionPerformed

    private void mMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMClienteActionPerformed
        
    }//GEN-LAST:event_mMClienteActionPerformed

    private void mConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultaClienteActionPerformed
        
    }//GEN-LAST:event_mConsultaClienteActionPerformed

    private void mBAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBAbogadoActionPerformed
        try {
            String b=JOptionPane.showInputDialog("Teclea el dni del abogado que quieras borrar");
            T8p2e1.borrarAbogado(b);
            JOptionPane.showMessageDialog(null, "Abogado borrado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No hay ningun abogado con ese nombre");
        }
    }//GEN-LAST:event_mBAbogadoActionPerformed

    private void mAAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAAbogadoActionPerformed
        T8p2e1.guardarAbogado();
    }//GEN-LAST:event_mAAbogadoActionPerformed

    private void mBCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBCasoActionPerformed
        try{
            String b = JOptionPane.showInputDialog("Teclea el numero de expediente del caso que quieras borrar");
            T8p2e1.borrarCaso(b);
            JOptionPane.showMessageDialog(null,"Caso borrado con exito");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No hay ningun caso con ese numero de expediente");
        }
    }//GEN-LAST:event_mBCasoActionPerformed

    private void mACasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mACasoActionPerformed
        T8p2e1.guardarCaso();
    }//GEN-LAST:event_mACasoActionPerformed

    private void mAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAsignarActionPerformed
        T8p2e1.asignarCaso();
    }//GEN-LAST:event_mAsignarActionPerformed

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
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mAAbogado;
    private javax.swing.JMenuItem mACaso;
    private javax.swing.JMenuItem mACliente;
    private javax.swing.JMenuItem mAsignar;
    private javax.swing.JMenuItem mBAbogado;
    private javax.swing.JMenuItem mBCaso;
    private javax.swing.JMenuItem mBCliente;
    private javax.swing.JMenuItem mCAbogado;
    private javax.swing.JMenuItem mCCaso;
    private javax.swing.JMenuItem mConsultaCliente;
    private javax.swing.JMenuItem mMAbogado;
    private javax.swing.JMenuItem mMCaso;
    private javax.swing.JMenuItem mMCliente;
    // End of variables declaration//GEN-END:variables
}
