/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Arbol extends Plantas {
    private String altura;

    public Arbol(String altura, boolean tieneFlores, String tipoRaiz, String climaIdeal, String nombre, int edad) {
        super(tieneFlores, tipoRaiz, climaIdeal, nombre, edad);
        this.altura = altura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
}
