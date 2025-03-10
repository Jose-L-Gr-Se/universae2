/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Seta extends Hongos {
    private String color;

    public Seta(String color, boolean esToxico, String tipoEsporas, String modoReproduccion, String nombre, int edad) {
        super(esToxico, tipoEsporas, modoReproduccion, nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
       
    }
