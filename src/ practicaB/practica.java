
package practicaB;


public class practica extends javax.swing.JFrame {


    public practica() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnactivar = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();
        lblmensaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnactivar.setText("ACTIVAR");
        btnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        lblmensaje.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        lblmensaje.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje.setText("MENSAJE1");
        getContentPane().add(lblmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, -1));

        lblmensaje2.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        lblmensaje2.setForeground(new java.awt.Color(255, 0, 0));
        lblmensaje2.setText("MENSAJE2");
        getContentPane().add(lblmensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivarActionPerformed
        // TODO add your handling code here:
        lblmensaje.setText("EL ZHAGUI SE LA MAMA A LOS PROFES XOXOXO");
        lblmensaje2.setText("HOLA ..............");
        
    }//GEN-LAST:event_btnactivarActionPerformed

    
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
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactivar;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JLabel lblmensaje2;
    // End of variables declaration//GEN-END:variables
}
