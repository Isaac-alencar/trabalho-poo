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
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calc_painel = new javax.swing.JTextArea();
        botao_calc_7 = new javax.swing.JButton();
        botao_calc_4 = new javax.swing.JButton();
        botao_calc_1 = new javax.swing.JButton();
        botao_calc_8 = new javax.swing.JButton();
        botao_calc_5 = new javax.swing.JButton();
        botao_calc_2 = new javax.swing.JButton();
        botao_calc_9 = new javax.swing.JButton();
        botao_calc_6 = new javax.swing.JButton();
        botao_calc_3 = new javax.swing.JButton();
        botao_calc_div = new javax.swing.JButton();
        botao_calc_multi = new javax.swing.JButton();
        botao_calc_sub = new javax.swing.JButton();
        botao_calc_soma = new javax.swing.JButton();
        botao_calc_0 = new javax.swing.JButton();
        botao_calc_limpar = new javax.swing.JButton();
        botao_calc_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calc_painel.setBackground(java.awt.SystemColor.control);
        calc_painel.setColumns(20);
        calc_painel.setFont(calc_painel.getFont().deriveFont(calc_painel.getFont().getSize() + 3f));
        calc_painel.setRows(5);
        jScrollPane1.setViewportView(calc_painel);

        botao_calc_7.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_7.setText("7");
        botao_calc_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_7MouseClicked(evt);
            }
        });

        botao_calc_4.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_4.setText("4");
        botao_calc_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_4MouseClicked(evt);
            }
        });

        botao_calc_1.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_1.setText("1");
        botao_calc_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_1MouseClicked(evt);
            }
        });

        botao_calc_8.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_8.setText("8");
        botao_calc_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_8MouseClicked(evt);
            }
        });

        botao_calc_5.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_5.setText("5");
        botao_calc_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_5MouseClicked(evt);
            }
        });

        botao_calc_2.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_2.setText("2");
        botao_calc_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_2MouseClicked(evt);
            }
        });

        botao_calc_9.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_9.setText("9");
        botao_calc_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_9MouseClicked(evt);
            }
        });

        botao_calc_6.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_6.setText("6");
        botao_calc_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_6MouseClicked(evt);
            }
        });

        botao_calc_3.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_3.setText("3");
        botao_calc_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_3MouseClicked(evt);
            }
        });

        botao_calc_div.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_div.setText("/");
        botao_calc_div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_divMouseClicked(evt);
            }
        });

        botao_calc_multi.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_multi.setText("X");
        botao_calc_multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_multiMouseClicked(evt);
            }
        });

        botao_calc_sub.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_sub.setText("-");
        botao_calc_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_subMouseClicked(evt);
            }
        });

        botao_calc_soma.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_soma.setText("+");
        botao_calc_soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_somaMouseClicked(evt);
            }
        });

        botao_calc_0.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_0.setText("0");
        botao_calc_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_0MouseClicked(evt);
            }
        });

        botao_calc_limpar.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_limpar.setText("CE");
        botao_calc_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_limparMouseClicked(evt);
            }
        });

        botao_calc_igual.setFont(new java.awt.Font("Roboto Condensed,", 1, 18)); // NOI18N
        botao_calc_igual.setText("=");
        botao_calc_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calc_igualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(botao_calc_7,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_0,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(botao_calc_5,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_8,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_2,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_limpar,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(botao_calc_6,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_9,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_3,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_igual,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(botao_calc_div,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_multi,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_sub,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botao_calc_soma,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botao_calc_9, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_div, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_8, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_7, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botao_calc_6, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_5, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_4, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botao_calc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botao_calc_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botao_calc_0, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String op;
    public String primeiroNumero;
    public String segundoNumero;

    public ServicoCalculadora calculadora = new ServicoCalculadora();

    public void setTextoPainel(String novoTexto) {
        String texto_atual = calc_painel.getText();
        calc_painel.setText(texto_atual += novoTexto);
    }

    private void botao_calc_7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_7MouseClicked
        setTextoPainel(botao_calc_7.getText());
    }// GEN-LAST:event_botao_calc_7MouseClicked

    private void botao_calc_8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_8MouseClicked
        setTextoPainel(botao_calc_8.getText());
    }// GEN-LAST:event_botao_calc_8MouseClicked

    private void botao_calc_9MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_9MouseClicked
        setTextoPainel(botao_calc_9.getText());
    }// GEN-LAST:event_botao_calc_9MouseClicked

    private void botao_calc_4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_4MouseClicked
        setTextoPainel(botao_calc_4.getText());
    }// GEN-LAST:event_botao_calc_4MouseClicked

    private void botao_calc_1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_1MouseClicked
        setTextoPainel(botao_calc_1.getText());
    }// GEN-LAST:event_botao_calc_1MouseClicked

    private void botao_calc_5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_5MouseClicked
        setTextoPainel(botao_calc_5.getText());
    }// GEN-LAST:event_botao_calc_5MouseClicked

    private void botao_calc_2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_2MouseClicked
        setTextoPainel(botao_calc_2.getText());
    }// GEN-LAST:event_botao_calc_2MouseClicked

    private void botao_calc_6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_6MouseClicked
        setTextoPainel(botao_calc_6.getText());
    }// GEN-LAST:event_botao_calc_6MouseClicked

    private void botao_calc_3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_3MouseClicked
        setTextoPainel(botao_calc_3.getText());
    }// GEN-LAST:event_botao_calc_3MouseClicked

    private void botao_calc_0MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_0MouseClicked
        setTextoPainel(botao_calc_0.getText());
    }// GEN-LAST:event_botao_calc_0MouseClicked

    private void botao_calc_limparMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_limparMouseClicked
        calc_painel.setText("");
    }// GEN-LAST:event_botao_calc_limparMouseClicked

    private void botao_calc_igualMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_igualMouseClicked
        segundoNumero = calc_painel.getText();

        calculadora.calcularResultado(
                op,
                Integer.parseInt(primeiroNumero),
                Integer.parseInt(segundoNumero));

        calc_painel.setText(calculadora.getResultado());
    }// GEN-LAST:event_botao_calc_igualMouseClicked

    private void botao_calc_divMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_divMouseClicked
        primeiroNumero = calc_painel.getText();
        calc_painel.setText("");

        op = botao_calc_div.getText();
    }// GEN-LAST:event_botao_calc_divMouseClicked

    private void botao_calc_multiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_multiMouseClicked
        primeiroNumero = calc_painel.getText();
        calc_painel.setText("");

        op = botao_calc_multi.getText();
    }// GEN-LAST:event_botao_calc_multiMouseClicked

    private void botao_calc_subMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_subMouseClicked
        primeiroNumero = calc_painel.getText();
        calc_painel.setText("");

        op = botao_calc_sub.getText();
    }// GEN-LAST:event_botao_calc_subMouseClicked

    private void botao_calc_somaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_botao_calc_somaMouseClicked
        primeiroNumero = calc_painel.getText();
        calc_painel.setText("");

        op = botao_calc_soma.getText();
    }// GEN-LAST:event_botao_calc_somaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_calc_0;
    private javax.swing.JButton botao_calc_1;
    private javax.swing.JButton botao_calc_2;
    private javax.swing.JButton botao_calc_3;
    private javax.swing.JButton botao_calc_4;
    private javax.swing.JButton botao_calc_5;
    private javax.swing.JButton botao_calc_6;
    private javax.swing.JButton botao_calc_7;
    private javax.swing.JButton botao_calc_8;
    private javax.swing.JButton botao_calc_9;
    private javax.swing.JButton botao_calc_div;
    private javax.swing.JButton botao_calc_igual;
    private javax.swing.JButton botao_calc_limpar;
    private javax.swing.JButton botao_calc_multi;
    private javax.swing.JButton botao_calc_soma;
    private javax.swing.JButton botao_calc_sub;
    private javax.swing.JTextArea calc_painel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
