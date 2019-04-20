/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import Logica.Cliente;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author NATA
 */
public class Inicio extends javax.swing.JFrame {
    
    Cliente cliente;
    String mensaje;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/caja.jpg")).getImage());
        cliente = new Cliente();
    }
    
    public void graficar(){
        this.JPGrafico.removeAll();
        Rectangle tamaño = this.jInternalFrame1.getBounds();
        this.jInternalFrame1 = null;
        this.jInternalFrame1 = new JInternalFrame("Clientes",true);
        this.JPGrafico.add(this.jInternalFrame1,JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame1.setVisible(true);
        this.jInternalFrame1.setBounds(tamaño);
        this.jInternalFrame1.setEnabled(false);
        this.jInternalFrame1.add(cliente.graficar(),BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPGrafico = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        JBAtenderC1 = new javax.swing.JButton();
        JBAtenderC2 = new javax.swing.JButton();
        JBAtenderC3 = new javax.swing.JButton();
        JLICaja2 = new javax.swing.JLabel();
        JLICaja3 = new javax.swing.JLabel();
        JLICaja1 = new javax.swing.JLabel();
        JBAgregar = new javax.swing.JButton();
        JTFNombreCliente = new javax.swing.JTextField();
        JTFNumeroProductos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colas");
        setBounds(new java.awt.Rectangle(250, 50, 700, 600));
        setResizable(false);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPGraficoLayout = new javax.swing.GroupLayout(JPGrafico);
        JPGrafico.setLayout(JPGraficoLayout);
        JPGraficoLayout.setHorizontalGroup(
            JPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(JPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrame1))
        );
        JPGraficoLayout.setVerticalGroup(
            JPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
            .addGroup(JPGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrame1))
        );

        JBAtenderC1.setText("Atender");
        JBAtenderC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtenderC1ActionPerformed(evt);
            }
        });

        JBAtenderC2.setText("Atender");
        JBAtenderC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtenderC2ActionPerformed(evt);
            }
        });

        JBAtenderC3.setText("Atender");
        JBAtenderC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtenderC3ActionPerformed(evt);
            }
        });

        JLICaja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.jpg"))); // NOI18N

        JLICaja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.jpg"))); // NOI18N

        JLICaja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.jpg"))); // NOI18N

        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        JTFNombreCliente.setText("Nombre");

        JTFNumeroProductos.setText("0");
        JTFNumeroProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNumeroProductosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBAtenderC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLICaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLICaja2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(JLICaja3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBAtenderC2)
                                .addGap(109, 109, 109)
                                .addComponent(JBAtenderC3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFNombreCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNumeroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(JPGrafico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLICaja2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLICaja3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLICaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAtenderC1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtenderC2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtenderC3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFNumeroProductos)
                    .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        // TODO add your handling code here:
        cliente.ingresarCliente(JTFNombreCliente.getText(), Integer.parseInt(JTFNumeroProductos.getText()));
        graficar();
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JTFNumeroProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNumeroProductosKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"solo numeros","solo numeros",1);
        }
    }//GEN-LAST:event_JTFNumeroProductosKeyTyped

    private void JBAtenderC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtenderC1ActionPerformed
        // TODO add your handling code here:
        mensaje = cliente.atenderCaja(0);
        graficar();
        if (mensaje!=null){
            JOptionPane.showMessageDialog(null,mensaje,"...",1);
        }
    }//GEN-LAST:event_JBAtenderC1ActionPerformed

    private void JBAtenderC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtenderC2ActionPerformed
        // TODO add your handling code here:
        mensaje = cliente.atenderCaja(1);
        graficar();
        if (mensaje!=null){
            JOptionPane.showMessageDialog(null,mensaje,"...",1);
        }
    }//GEN-LAST:event_JBAtenderC2ActionPerformed

    private void JBAtenderC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtenderC3ActionPerformed
        // TODO add your handling code here:
        mensaje = cliente.atenderCaja(2);
        graficar();
        if (mensaje!=null){
            JOptionPane.showMessageDialog(null,mensaje,"...",1);
        }
    }//GEN-LAST:event_JBAtenderC3ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBAtenderC1;
    private javax.swing.JButton JBAtenderC2;
    private javax.swing.JButton JBAtenderC3;
    private javax.swing.JLabel JLICaja1;
    private javax.swing.JLabel JLICaja2;
    private javax.swing.JLabel JLICaja3;
    private javax.swing.JPanel JPGrafico;
    private javax.swing.JTextField JTFNombreCliente;
    private javax.swing.JTextField JTFNumeroProductos;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
}
