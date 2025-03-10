/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Levadura extends Hongos {
    private boolean seUsaEnAlimentos;

    public Levadura(boolean seUsaEnAlimentos, boolean esToxico, String tipoEsporas, String modoReproduccion, String nombre, int edad) {
        super(esToxico, tipoEsporas, modoReproduccion, nombre, edad);
        this.seUsaEnAlimentos = seUsaEnAlimentos;
    }

    public boolean isSeUsaEnAlimentos() {
        return seUsaEnAlimentos;
    }

    public void setSeUsaEnAlimentos(boolean seUsaEnAlimentos) {
        this.seUsaEnAlimentos = seUsaEnAlimentos;
    }
    
}
