/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package launcheruniversae;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import launcheruniversae.Utilidades;
import static launcheruniversae.Utilidades.PanelInPanel;

/**
 *
 * @author joseg
 */
public class PanelHome extends javax.swing.JPanel {

    /**
     * Creates new form PanelHome
     */
    public PanelHome() {
        initComponents();
        ImageIcon imagen = (ImageIcon) Card1.getIcon();
//        Utilidades.SetImageLabel(Card1, "src/imagenes/Grado0.png", true);
//        Utilidades.SetImageLabelDimension(Card2, "src/imagenes/Grado1.png",new Dimension (200,200), true);
//        Utilidades.SetImageLabelDimension(Card3, "src/imagenes/Grado2.png",new Dimension (200,200), true);
//        Utilidades.SetImageLabelDimension(Card4, "src/imagenes/Grado3.png",new Dimension (200,200), true);
//        Utilidades.SetImageLabelDimension(Card5, "src/imagenes/Grado4.png",new Dimension (200,200), true);
//        Utilidades.SetImageLabelDimension(Card6, "src/imagenes/Grado5.png",new Dimension (200,200), true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Card1 = new javax.swing.JLabel();
        Card2 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        Card6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1550, 880));
        setMinimumSize(new java.awt.Dimension(1550, 880));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 880));
        setLayout(new java.awt.GridLayout(2, 3));

        Card1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado0.png"))); // NOI18N
        Card1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card1.setMinimumSize(new java.awt.Dimension(80, 60));
        Card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Card1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Card1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Card1MouseExited(evt);
            }
        });
        add(Card1);

        Card2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado1.png"))); // NOI18N
        Card2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card2.setMinimumSize(new java.awt.Dimension(80, 60));
        add(Card2);

        Card3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado2.png"))); // NOI18N
        Card3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card3.setMinimumSize(new java.awt.Dimension(80, 60));
        add(Card3);

        Card4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado3.png"))); // NOI18N
        Card4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card4.setMinimumSize(new java.awt.Dimension(80, 60));
        add(Card4);

        Card5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card5.setMaximumSize(null);
        Card5.setMinimumSize(new java.awt.Dimension(80, 60));
        Card5.setPreferredSize(null);
        add(Card5);

        Card6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Card6.setMaximumSize(null);
        Card6.setMinimumSize(new java.awt.Dimension(80, 60));
        Card6.setPreferredSize(null);
        add(Card6);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void Card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card1MouseClicked
        java.awt.Window window = javax.swing.SwingUtilities.getWindowAncestor(this);

        if (window instanceof Launcher) {
            Launcher launcher = (Launcher) window;

            PanelCarrusel carruselHelicoptero = new PanelCarrusel();
            Utilidades.PanelInPanel(launcher.getContentPanel(), carruselHelicoptero);
    }//GEN-LAST:event_Card1MouseClicked
    }
    private void Card1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card1MouseEntered
        Utilidades.SetImageLabelDimension(Card1, "src/imagenes/Grado0.png", new Dimension(Card1.getWidth(), Card1.getHeight()), true);

    }//GEN-LAST:event_Card1MouseEntered

    private void Card1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Card1MouseExited
        Utilidades.setLabelImage(Card1, "src/imagenes/Grado0.png");
    }//GEN-LAST:event_Card1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Card1;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card3;
    private javax.swing.JLabel Card4;
    private javax.swing.JLabel Card5;
    private javax.swing.JLabel Card6;
    // End of variables declaration//GEN-END:variables
}
