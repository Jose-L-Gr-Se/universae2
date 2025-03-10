/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Aves extends Animal {
    private double tamañoAlas;

    public Aves(double tamañoAlas, String nombre, int edad, String alimentacion, String sexo, double peso, String especie) {
        super(nombre, edad, alimentacion, sexo, peso, especie);
        this.tamañoAlas = tamañoAlas;
    }

    public double getTamañoAlas() {
        return tamañoAlas;
    }

    public void setTamañoAlas(double tamañoAlas) {
        this.tamañoAlas = tamañoAlas;
    }
    
}
