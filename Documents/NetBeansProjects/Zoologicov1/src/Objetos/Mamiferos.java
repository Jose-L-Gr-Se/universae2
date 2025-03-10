/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author joseg
 */
public class Mamiferos extends Animal {
    private String tipoPelo;

    public Mamiferos(String nombre, int edad, String alimentacion, String sexo, double peso,String especie,String tipoPelo) {
        super(nombre, edad, alimentacion, sexo, peso, especie);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de Pelo: " + tipoPelo);
    }
}
