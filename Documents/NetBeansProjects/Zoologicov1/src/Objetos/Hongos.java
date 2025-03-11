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
public class Hongos extends SerVivoPadre {
    private String tipoEsporas;
    private String modoReproduccion;

    public Hongos(boolean esToxico, String tipoEsporas, String modoReproduccion, String nombre, int edad) {
        super(nombre, edad);
        this.tipoEsporas = tipoEsporas;
        this.modoReproduccion = modoReproduccion;
    }
   
    public String getTipoEsporas() {
        return tipoEsporas;
    }

    public void setTipoEsporas(String tipoEsporas) {
        this.tipoEsporas = tipoEsporas;
    }

    public String getModoReproduccion() {
        return modoReproduccion;
    }

    public void setModoReproduccion(String modoReproduccion) {
        this.modoReproduccion = modoReproduccion;
    }
    public static ArrayList<Hongos> cargarHongosEjemplo() {
    ArrayList<Hongos> hongos = new ArrayList<>();
    
    // Agregamos un ejemplo de cada tipo
    hongos.add(new Seta("Rojo con manchas blancas", true, "Basidiospora", "Sexual", "Amanita muscaria", 1));
    hongos.add(new Moho("Alimentos", false, "Conidiospora", "Asexual", "Penicillium", 1));
    hongos.add(new Levadura(true, false, "Blastospora", "Gemación", "Saccharomyces cerevisiae", 1));
    
    return hongos;
}

    public Object getTamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
