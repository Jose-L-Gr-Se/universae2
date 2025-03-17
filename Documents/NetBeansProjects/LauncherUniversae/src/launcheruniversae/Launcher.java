/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package launcheruniversae;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static launcheruniversae.Utilidades.PanelInPanel;

/**
 *
 * @author joseg
 */
public class Launcher extends javax.swing.JFrame {

    /**
     * Creates new form Launcher
     */
    public Launcher() {
        initComponents();
        BarraEscudos();
        
            }
    

    private void BarraEscudos(){
    
        Utilidades.SetImageLabel(jLabel2, "src/imagenes/LauncherButton0.png", true);
        Utilidades.SetImageLabel(jLabel3, "src/imagenes/LauncherButton1.png", true);
        Utilidades.SetImageLabel(jLabel4, "src/imagenes/LauncherButton2.png", true);
        Utilidades.SetImageLabel(jLabel5, "src/imagenes/LauncherButton3.png", true);
        Utilidades.SetImageLabel(jLabel6, "src/imagenes/LauncherButton4.png", true);
        Utilidades.SetImageLabel(jLabel7, "src/imagenes/LauncherButton5.png", true);
        Utilidades.SetImageLabel(jLabel8, "src/imagenes/LauncherButton6.png", true);
        Utilidades.SetImageLabel(jLabel9, "src/imagenes/LauncherButton7.png", true);
        Utilidades.SetImageLabel(jLabel10, "src/imagenes/LauncherButton8.png", true);
        Utilidades.SetImageLabel(jLabel11, "src/imagenes/LauncherButton9.png", true);
        Utilidades.SetImageLabel(jLabel12, "src/imagenes/LauncherButton10.png", true);
        Utilidades.SetImageLabel(jLabel13, "src/imagenes/LauncherButton11.png", true);
        Utilidades.SetImageLabel(jLabel14, "src/imagenes/LauncherButton12.png", true);
        Utilidades.SetImageLabel(jLabel15, "src/imagenes/LauncherButton13.png", true);

}     
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setAlwaysOnTop(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        jLabel2.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton1.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel3);

        jLabel4.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel4);

        jLabel5.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel5);

        jLabel6.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel6);

        jLabel7.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel7);

        jLabel8.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel8);

        jLabel9.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel9);

        jLabel10.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel10);

        jLabel11.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel11);

        jLabel12.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel12);

        jLabel13.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel13);

        jLabel14.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel14);

        jLabel15.setPreferredSize(new java.awt.Dimension(80, 100));
        jPanel1.add(jLabel15);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 1520, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo base.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        getContentPane().add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
