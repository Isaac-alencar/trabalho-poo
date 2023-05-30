/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author isaac
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menu_item_cliente = new javax.swing.JMenuItem();
        menu_item_fornecedor = new javax.swing.JMenuItem();
        menu_item_usuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_item_calculadora = new javax.swing.JMenuItem();
        menu_item_sair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Cadastro");

        menu_item_cliente.setText("Cliente");
        menu_item_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_clienteMouseClicked(evt);
            }
        });
        menu_item_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_clienteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_item_cliente);

        menu_item_fornecedor.setText("Fornecedor");
        menu_item_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_fornecedorMouseClicked(evt);
            }
        });
        menu_item_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_fornecedorActionPerformed(evt);
            }
        });
        jMenu2.add(menu_item_fornecedor);

        menu_item_usuario.setText("Usuario");
        menu_item_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_usuarioMouseClicked(evt);
            }
        });
        menu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_usuarioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_item_usuario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Aplicação");

        menu_item_calculadora.setText("Calculadora");
        menu_item_calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_calculadoraMouseClicked(evt);
            }
        });
        menu_item_calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_calculadoraActionPerformed(evt);
            }
        });
        jMenu3.add(menu_item_calculadora);

        jMenuBar1.add(jMenu3);

        menu_item_sair.setText("Sair");
        menu_item_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_item_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_clienteActionPerformed
        new RegistroCliente().setVisible(true);
    }//GEN-LAST:event_menu_item_clienteActionPerformed

    private void menu_item_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_fornecedorActionPerformed
        new RegistroCliente().setVisible(true);

    }//GEN-LAST:event_menu_item_fornecedorActionPerformed

    private void menu_item_calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_calculadoraActionPerformed
        new Calculadora().setVisible(true);
    }//GEN-LAST:event_menu_item_calculadoraActionPerformed

    private void menu_item_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_clienteMouseClicked
        new RegistroCliente().setVisible(true);
    }//GEN-LAST:event_menu_item_clienteMouseClicked

    private void menu_item_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_fornecedorMouseClicked
        new RegistroCliente().setVisible(true);
    }//GEN-LAST:event_menu_item_fornecedorMouseClicked

    private void menu_item_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_usuarioMouseClicked
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_menu_item_usuarioMouseClicked

    private void menu_item_calculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_calculadoraMouseClicked
        new Calculadora().setVisible(true);
    }//GEN-LAST:event_menu_item_calculadoraMouseClicked

    private void menu_item_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_sairMouseClicked
       this.setVisible(false);

       new Login().setVisible(true);
    }//GEN-LAST:event_menu_item_sairMouseClicked

    private void menu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_usuarioActionPerformed
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_menu_item_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menu_item_calculadora;
    private javax.swing.JMenuItem menu_item_cliente;
    private javax.swing.JMenuItem menu_item_fornecedor;
    private javax.swing.JMenu menu_item_sair;
    private javax.swing.JMenuItem menu_item_usuario;
    // End of variables declaration//GEN-END:variables
}