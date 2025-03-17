/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launcheruniversae;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author joseg
 */
public class Utilidades {

//    Inserta un panel dentro de otro panel contenedor
//    contentPanel es el panel contenedor y instancePanel el que será insertado
    
    
    public static void PanelInPanel(JPanel contentPanelName, JPanel instancePanelName){
        instancePanelName.setSize(contentPanelName.getSize());
        instancePanelName.setLocation(0, 0);
        contentPanelName.removeAll();
        contentPanelName.add(instancePanelName,BorderLayout.CENTER);
        contentPanelName.revalidate();
        contentPanelName.repaint();
    }
//    Función 2 escala una imagen para ajustarse al JLabel.
    public static void SetImageLabel (JLabel labelName , String root, boolean keepProportions){ /*label a la que queremos colocarle la imagen*//*ruta de la imagen*/
        /*Declaramos un objeto de tipo Image Icon y de parametro le pasamos la ruta de nuestra imagen*/
        ImageIcon image = new ImageIcon (root);
        // Calcular proporciones manteniendo la relación de aspecto
        if (keepProportions){
        double imageWidth = image.getIconWidth();
        double imageHeight = image.getIconHeight();
        double labelWidth = labelName.getWidth();
        double labelHeight = labelName.getHeight();

        double scale = Math.min(labelWidth / imageWidth, labelHeight / imageHeight);
        int newWidth = (int) (imageWidth * scale);
        int newHeight = (int) (imageHeight * scale);

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    } else {
        // Escalar directamente al tamaño del JLabel, sin mantener proporciones
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    }
}    
public static void SetImageLabelDimension (JLabel labelName , String root, Dimension dimension, boolean keepProportions){ /*label a la que queremos colocarle la imagen*//*ruta de la imagen*/
        /*Declaramos un objeto de tipo Image Icon y de parametro le pasamos la ruta de nuestra imagen*/
        ImageIcon image = new ImageIcon (root);
        if (keepProportions){
        double imageWidth = image.getIconWidth();
        double imageHeight = image.getIconHeight();
        double targetWidth = dimension.getWidth();
        double targetHeight = dimension.getHeight();

        double scale = Math.min(targetWidth / imageWidth, targetHeight / imageHeight);
        int newWidth = (int) (imageWidth * scale);
        int newHeight = (int) (imageHeight * scale);

        Icon icon = new ImageIcon(image.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    } else {
        // Escalar directamente al tamaño del JLabel, sin mantener proporciones
        Icon icon = new ImageIcon(image.getImage().getScaledInstance((int)dimension.getWidth(), (int)dimension.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
    }
}

    public static ArrayList<String> CreateStringList(String root, String name, String filetype, int size) {
        ArrayList<String> fileList = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            fileList.add(root + "/" + name + i + "." + filetype);
        }
        return fileList;
    }
    
    public static String ReadTextFile(String root) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(root))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    
    public static void Async(long waitTime, Runnable asyncFunction) {
        new Thread(() -> {
            try {
                Thread.sleep(waitTime);
                asyncFunction.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
}





