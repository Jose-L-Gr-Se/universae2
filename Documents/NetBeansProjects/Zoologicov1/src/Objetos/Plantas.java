/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author joseg
 */
public class Plantas extends SerVivoPadre {
    private boolean tieneFlores;
    private String tipoRaiz;
    private String climaIdeal;

    public Plantas(boolean tieneFlores, String tipoRaiz, String climaIdeal, String nombre, int edad) {
        super(nombre, edad);
        this.tieneFlores = tieneFlores;
        this.tipoRaiz = tipoRaiz;
        this.climaIdeal = climaIdeal;
    }

        public boolean isTieneFlores() {
        return tieneFlores;
    }

    public void setTieneFlores(boolean tieneFlores) {
        this.tieneFlores = tieneFlores;
    }

    public String getTipoRaiz() {
        return tipoRaiz;
    }

    public void setTipoRaiz(String tipoRaiz) {
        this.tipoRaiz = tipoRaiz;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    public static ArrayList<Plantas> cargarPlantasEjemplo() {
    ArrayList<Plantas> plantas = new ArrayList<>();
    
    // Agregamos un ejemplo de cada tipo
    plantas.add(new Arbol("15 metros", true, "Pivotante", "Templado", "Roble", 50));
    plantas.add(new Arbusto(true, true, "Fasciculada", "Mediterráneo", "Romero", 3));
    plantas.add(new Hierba(true, true, "Fibrosa", "Templado", "Manzanilla", 1));
    
    return plantas;
}
    @Override
    public String toString() {
        return "¿Tiene flores?: " + tieneFlores + 
               "Tipo raiz: " + tipoRaiz + 
               "Clima ideal: " + climaIdeal; }
}

