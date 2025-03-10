/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Hierba extends Plantas{
    private boolean esMedicinal;

    public Hierba(boolean esMedicinal, boolean tieneFlores, String tipoRaiz, String climaIdeal, String nombre, int edad) {
        super(tieneFlores, tipoRaiz, climaIdeal, nombre, edad);
        this.esMedicinal = esMedicinal;
    }

    public boolean isEsMedicinal() {
        return esMedicinal;
    }

    public void setEsMedicinal(boolean esMedicinal) {
        this.esMedicinal = esMedicinal;
    }

}

