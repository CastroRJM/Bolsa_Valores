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
public class empleado extends javax.swing.JFrame {

    /**
     * Creates new form empleado
     */
    public empleado() {
        initComponents();
        this.setTitle("Seccion_Empleado");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(580,450);
        
        ImageIcon wallpaper=new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono=new ImageIcon(wallpaper.getImage().getScaledInstance(label_principal.getWidth(),
                label_principal.getHeight(),Image.SCALE_DEFAULT));
        label_principal.setIcon(icono);
        
        this.AjustarBotones();
        this.repaint();
        
    }
    
    public void AjustarBotones(){
        ImageIcon imagen = new ImageIcon("src/images_bolsa/empleado.png");
        Icon icono_img = new ImageIcon(imagen.getImage().getScaledInstance(btn_empleado.getWidth(), btn_empleado.getHeight(), Image.SCALE_DEFAULT));
        btn_empleado.setIcon(icono_img);
        
        
         ImageIcon imagen2 = new ImageIcon("src/images_bolsa/depto.png");
        Icon icono_img2 = new ImageIcon(imagen2.getImage().getScaledInstance(btn_depto.getWidth(), btn_depto.getHeight(), Image.SCALE_DEFAULT));
        btn_depto.setIcon(icono_img2);
        
         ImageIcon imagen3 = new ImageIcon("src/images_bolsa/horario.png");
        Icon icono_img3 = new ImageIcon(imagen3.getImage().getScaledInstance(btn_horario.getWidth(), btn_horario.getHeight(), Image.SCALE_DEFAULT));
        btn_horario.setIcon(icono_img3);
        
        ImageIcon imagen4 = new ImageIcon("src/images_bolsa/curso.png");
        Icon icono_img4 = new ImageIcon(imagen4.getImage().getScaledInstance(btn_curso.getWidth(), btn_curso.getHeight(), Image.SCALE_DEFAULT));
        btn_curso.setIcon(icono_img4);
        
         ImageIcon imagen5 = new ImageIcon("src/images_bolsa/puesto.png");
        Icon icono_img5 = new ImageIcon(imagen5.getImage().getScaledInstance(btn_puesto.getWidth(), btn_puesto.getHeight(), Image.SCALE_DEFAULT));
        btn_puesto.setIcon(icono_img5);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_empleado = new javax.swing.JButton();
        btn_depto = new javax.swing.JButton();
        btn_horario = new javax.swing.JButton();
        btn_curso = new javax.swing.JButton();
        btn_puesto = new javax.swing.JButton();
        jLabel_intro5 = new javax.swing.JLabel();
        jLabel_intro10 = new javax.swing.JLabel();
        jLabel_intro11 = new javax.swing.JLabel();
        jLabel_intro12 = new javax.swing.JLabel();
        jLabel_intro13 = new javax.swing.JLabel();
        jLabel_intro15 = new javax.swing.JLabel();
        label_principal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_empleado.setText("jButton1");
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 100));

        btn_depto.setText("jButton2");
        btn_depto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deptoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 130, 100));

        btn_horario.setText("jButton3");
        btn_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 120, 100));

        btn_curso.setText("jButton4");
        btn_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cursoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 90));

        btn_puesto.setText("jButton5");
        btn_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puestoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 130, 90));

        jLabel_intro5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_intro5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro5.setText("Eliga Opcion:");
        getContentPane().add(jLabel_intro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 250, 50));

        jLabel_intro10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_intro10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro10.setText("Agregar_depto");
        getContentPane().add(jLabel_intro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 30));

        jLabel_intro11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_intro11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro11.setText("Agregar_horario");
        getContentPane().add(jLabel_intro11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, 30));

        jLabel_intro12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_intro12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro12.setText("Agregar_curso");
        getContentPane().add(jLabel_intro12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 30));

        jLabel_intro13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_intro13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro13.setText("Agregar_puesto");
        getContentPane().add(jLabel_intro13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 120, 30));

        jLabel_intro15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_intro15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_intro15.setText("Agregar_Empleado");
        getContentPane().add(jLabel_intro15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 30));
        getContentPane().add(label_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deptoActionPerformed
        new Agregar_depto().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deptoActionPerformed

    private void btn_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cursoActionPerformed
       new curso().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btn_cursoActionPerformed

    private void btn_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puestoActionPerformed
        new Puesto().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_puestoActionPerformed

    private void btn_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horarioActionPerformed
        new horario().setVisible(true);
    }//GEN-LAST:event_btn_horarioActionPerformed

    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed
        new Agregar_Empleado().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empleadoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     new Mantenimiento_bolsa().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_curso;
    private javax.swing.JButton btn_depto;
    private javax.swing.JButton btn_empleado;
    private javax.swing.JButton btn_horario;
    private javax.swing.JButton btn_puesto;
    private javax.swing.JLabel jLabel_intro10;
    private javax.swing.JLabel jLabel_intro11;
    private javax.swing.JLabel jLabel_intro12;
    private javax.swing.JLabel jLabel_intro13;
    private javax.swing.JLabel jLabel_intro15;
    private javax.swing.JLabel jLabel_intro5;
    private javax.swing.JLabel label_principal;
    // End of variables declaration//GEN-END:variables
}