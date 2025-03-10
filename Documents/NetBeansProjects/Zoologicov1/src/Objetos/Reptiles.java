/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Reptiles extends Animal {
    private boolean esVenenoso;

    public Reptiles(boolean esVenenoso, String nombre, int edad, String alimentacion, String sexo, double peso, String especie) {
        super(nombre, edad, alimentacion, sexo, peso, especie);
        this.esVenenoso = esVenenoso;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
        
}
