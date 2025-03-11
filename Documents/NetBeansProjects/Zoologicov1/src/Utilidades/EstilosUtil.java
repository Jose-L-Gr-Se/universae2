package Utilidades;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EstilosUtil {
    // Colores corporativos
    public static final Color COLOR_PRIMARIO = new Color(0, 153, 51);
    public static final Color COLOR_SECUNDARIO = new Color(204, 255, 204);
    public static final Color COLOR_TEXTO = new Color(51, 51, 51);
    public static final Color COLOR_FONDO = new Color(255, 255, 255);
    
    // Fuentes
    public static final Font FUENTE_TITULO = new Font("Sans Serif Collection", Font.BOLD, 24);
    public static final Font FUENTE_NORMAL = new Font("Sans Serif Collection", Font.PLAIN, 14);
    
    // Bordes
    public static final Border BORDE_CAMPO = BorderFactory.createLineBorder(new Color(204, 204, 204), 2, true);
    
    // Método para aplicar estilo a botones
    public static void aplicarEstiloBoton(JButton boton, String texto) {
        boton.setText(texto);
        boton.setFont(FUENTE_NORMAL);
        boton.setBackground(COLOR_PRIMARIO);
        boton.setForeground(Color.WHITE);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Efecto hover
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(COLOR_PRIMARIO.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(COLOR_PRIMARIO);
            }
        });
    }
    
    // Método para aplicar estilo a campos de texto
    public static void aplicarEstiloCampoTexto(JTextField campo) {
        campo.setFont(FUENTE_NORMAL);
        campo.setBorder(BORDE_CAMPO);
        campo.setBackground(COLOR_FONDO);
        campo.setForeground(COLOR_TEXTO);
    }
    
    // Método para aplicar estilo a tablas
    public static void aplicarEstiloTabla(JTable tabla) {
        tabla.setFont(FUENTE_NORMAL);
        tabla.setRowHeight(30);
        tabla.setIntercellSpacing(new Dimension(10, 10));
        tabla.setGridColor(new Color(230, 230, 230));
        
        // Estilo para el encabezado
        tabla.getTableHeader().setFont(FUENTE_NORMAL);
        tabla.getTableHeader().setBackground(COLOR_PRIMARIO);
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setReorderingAllowed(false);
    }
} 