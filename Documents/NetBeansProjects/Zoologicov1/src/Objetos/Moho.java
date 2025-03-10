/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Moho extends Hongos{
    private String superficiePreferida;

    public Moho(String superficiePreferida, boolean esToxico, String tipoEsporas, String modoReproduccion, String nombre, int edad) {
        super(esToxico, tipoEsporas, modoReproduccion, nombre, edad);
        this.superficiePreferida = superficiePreferida;
    }

    public String getSuperficiePreferida() {
        return superficiePreferida;
    }

    public void setSuperficiePreferida(String superficiePreferida) {
        this.superficiePreferida = superficiePreferida;
    }
    
    
}
