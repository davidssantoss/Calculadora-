/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Estudiantes
 */
public class Interfaz extends javax.swing.JFrame {
    Calculadora calculadoraGrafica;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etiquetaNum1 = new javax.swing.JTextField();
        etiquetaNum2 = new javax.swing.JTextField();
        botonsumar = new javax.swing.JButton();
        botonrestar = new javax.swing.JButton();
        botonmultiplicar = new javax.swing.JButton();
        botondividir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        etiquetaFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número 1: ");

        jLabel2.setText("Número 2: ");

        botonsumar.setText("+");
        botonsumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonsumarMouseClicked(evt);
            }
        });
        botonsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsumarActionPerformed(evt);
            }
        });

        botonrestar.setText("-");
        botonrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonrestarMouseClicked(evt);
            }
        });
        botonrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestarActionPerformed(evt);
            }
        });

        botonmultiplicar.setText("*");
        botonmultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonmultiplicarMouseClicked(evt);
            }
        });
        botonmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiplicarActionPerformed(evt);
            }
        });

        botondividir.setText("/");
        botondividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botondividirMouseClicked(evt);
            }
        });
        botondividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondividirActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(etiquetaNum2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(etiquetaNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(botonsumar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonrestar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonmultiplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botondividir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiquetaNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(etiquetaNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonsumar)
                    .addComponent(botonrestar)
                    .addComponent(botonmultiplicar)
                    .addComponent(botondividir))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etiquetaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonsumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsumarMouseClicked
        calculadoraGrafica.numero1=Double.parseDouble(etiquetaNum1.getText());
        calculadoraGrafica.numero2=Double.parseDouble(etiquetaNum2.getText());
        etiquetaFinal.setText(String.valueOf(calculadoraGrafica.sumar()));
    }//GEN-LAST:event_botonsumarMouseClicked

    private void botonrestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonrestarMouseClicked
        calculadoraGrafica.numero1=Double.parseDouble(etiquetaNum1.getText());
        calculadoraGrafica.numero2=Double.parseDouble(etiquetaNum2.getText());
        etiquetaFinal.setText(String.valueOf(calculadoraGrafica.restar()));
    }//GEN-LAST:event_botonrestarMouseClicked

    private void botonmultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmultiplicarMouseClicked
        calculadoraGrafica.numero1=Double.parseDouble(etiquetaNum1.getText());
        calculadoraGrafica.numero2=Double.parseDouble(etiquetaNum2.getText());
        etiquetaFinal.setText(String.valueOf(calculadoraGrafica.multiplicar()));
    }//GEN-LAST:event_botonmultiplicarMouseClicked

    private void botondividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botondividirMouseClicked
        calculadoraGrafica.numero1=Double.parseDouble(etiquetaNum1.getText());
        calculadoraGrafica.numero2=Double.parseDouble(etiquetaNum2.getText());
        etiquetaFinal.setText(String.valueOf(calculadoraGrafica.dividir()));
    }//GEN-LAST:event_botondividirMouseClicked

    private void botonsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonsumarActionPerformed

    private void botonrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonrestarActionPerformed

    private void botonmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonmultiplicarActionPerformed

    private void botondividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botondividirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botondividir;
    private javax.swing.JButton botonmultiplicar;
    private javax.swing.JButton botonrestar;
    private javax.swing.JButton botonsumar;
    private javax.swing.JTextField etiquetaFinal;
    private javax.swing.JTextField etiquetaNum1;
    private javax.swing.JTextField etiquetaNum2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
