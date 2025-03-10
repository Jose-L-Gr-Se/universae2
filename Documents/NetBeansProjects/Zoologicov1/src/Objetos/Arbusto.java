/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Arbusto extends Plantas{
    private boolean tieneEspinas;

    public Arbusto(boolean tieneEspinas, boolean tieneFlores, String tipoRaiz, String climaIdeal, String nombre, int edad) {
        super(tieneFlores, tipoRaiz, climaIdeal, nombre, edad);
        this.tieneEspinas = tieneEspinas;
    }

    public boolean isTieneEspinas() {
        return tieneEspinas;
    }

    public void setTieneEspinas(boolean tieneEspinas) {
        this.tieneEspinas = tieneEspinas;
    }
    
}
