/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_Bolsa;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author luisk
 */
public class Mantenimiento_bolsa extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento_bolsa
     */
    public Mantenimiento_bolsa() {
        initComponents();
        this.setTitle("Administrador:");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
       this.setSize(880,380);
        ImageIcon wallpaper=new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono=new ImageIcon(wallpaper.getImage().getScaledInstance(label_principal.getWidth(),
                label_principal.getHeight(),Image.SCALE_DEFAULT));
        label_principal.setIcon(icono);
        this.repaint();
        AjustarBotones();
        
    }
    
    
   private void AjustarBotones(){
       ImageIcon imagen1 = new ImageIcon("src/images_bolsa/bolsa_trabajo.png");
        Icon icono_img1 = new ImageIcon(imagen1.getImage().getScaledInstance(boton_bolsa.getWidth(), boton_bolsa.getHeight(), Image.SCALE_DEFAULT));
        boton_bolsa.setIcon(icono_img1);
      
         ImageIcon imagen2 = new ImageIcon("src/images_bolsa/empleado.png");
        Icon icono_img2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton_empleado.getWidth(), boton_empleado.getHeight(), Image.SCALE_DEFAULT));
        boton_empleado.setIcon(icono_img2);
        
         ImageIcon imagen3 = new ImageIcon("src/images_bolsa/muerto.png");
        Icon icono_img3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton_muerto.getWidth(), boton_muerto.getHeight(), Image.SCALE_DEFAULT));
        boton_muerto.setIcon(icono_img3);
        
         ImageIcon imagen4 = new ImageIcon("src/images_bolsa/documentos.png");
        Icon icono_img4 = new ImageIcon(imagen4.getImage().getScaledInstance(boton_consulta.getWidth(), boton_consulta.getHeight(), Image.SCALE_DEFAULT));
        boton_consulta.setIcon(icono_img4);
        
         ImageIcon imagen5 = new ImageIcon("src/images_bolsa/reporte.png");
        Icon icono_img5 = new ImageIcon(imagen5.getImage().getScaledInstance(boton_reporte.getWidth(), boton_reporte.getHeight(), Image.SCALE_DEFAULT));
        boton_reporte.setIcon(icono_img5);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_bolsa = new javax.swing.JButton();
        boton_empleado = new javax.swing.JButton();
        boton_muerto = new javax.swing.JButton();
        jLabel_intro = new javax.swing.JLabel();
        jLabel_intro1 = new javax.swing.JLabel();
        jLabel_intro2 = new javax.swing.JLabel();
        jLabel_intro3 = new javax.swing.JLabel();
        jLabel_intro4 = new javax.swing.JLabel();
        boton_consulta = new javax.swing.JButton();
        jLabel_intro5 = new javax.swing.JLabel();
        boton_reporte = new javax.swing.JButton();
        jLabel_intro6 = new javax.swing.JLabel();
        label_principal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_bolsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_bolsaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_bolsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 130));

        boton_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 130));

        boton_muerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_muertoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_muerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 130));

        jLabel_intro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_intro.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro.setText("Bolsa");
        getContentPane().add(jLabel_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 30));

        jLabel_intro1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_intro1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro1.setText("Empleado");
        getContentPane().add(jLabel_intro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, 50));

        jLabel_intro2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_intro2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro2.setText("Muerto");
        getContentPane().add(jLabel_intro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 100, 40));

        jLabel_intro3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_intro3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro3.setText("ELIGA OPCION A REALIZAR");
        getContentPane().add(jLabel_intro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 50));

        jLabel_intro4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_intro4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro4.setText("BIENVENIDO: ");
        getContentPane().add(jLabel_intro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        boton_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, 130));

        jLabel_intro5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_intro5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro5.setText("Reporte");
        getContentPane().add(jLabel_intro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, 40));

        boton_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reporteActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 140, 130));

        jLabel_intro6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_intro6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro6.setText("Consultas");
        getContentPane().add(jLabel_intro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 100, 40));
        getContentPane().add(label_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_bolsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_bolsaActionPerformed
        this.dispose();
        new bolsa_trabajo().setVisible(true);
    }//GEN-LAST:event_boton_bolsaActionPerformed

    private void boton_muertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_muertoActionPerformed
       this.dispose();
       new Muerto().setVisible(true);
    }//GEN-LAST:event_boton_muertoActionPerformed

    private void boton_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_empleadoActionPerformed
            this.dispose();
            new empleado().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_boton_empleadoActionPerformed

    private void boton_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultaActionPerformed
               this.dispose();
               new Consultas().setVisible(true);
    }//GEN-LAST:event_boton_consultaActionPerformed

    private void boton_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reporteActionPerformed
       this.dispose();
       new Reportes().setVisible(true);
    }//GEN-LAST:event_boton_reporteActionPerformed

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
            java.util.logging.Logger.getLogger(Mantenimiento_bolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_bolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_bolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_bolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento_bolsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_bolsa;
    private javax.swing.JButton boton_consulta;
    private javax.swing.JButton boton_empleado;
    private javax.swing.JButton boton_muerto;
    private javax.swing.JButton boton_reporte;
    private javax.swing.JLabel jLabel_intro;
    private javax.swing.JLabel jLabel_intro1;
    private javax.swing.JLabel jLabel_intro2;
    private javax.swing.JLabel jLabel_intro3;
    private javax.swing.JLabel jLabel_intro4;
    private javax.swing.JLabel jLabel_intro5;
    private javax.swing.JLabel jLabel_intro6;
    private javax.swing.JLabel label_principal;
    // End of variables declaration//GEN-END:variables
}
