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
public class Animal extends SerVivoPadre {
    private String alimentacion;
    private String sexo;
    private double peso;
    private String especie;

    public Animal(String nombre, int edad, String alimentacion, String sexo, double peso, String especie) {
        super(nombre,edad);
        this.alimentacion = alimentacion;
        this.sexo = sexo;
        this.peso = peso;
        this.especie = especie;
    }

    
    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Alimentación: " + alimentacion + ", Doméstico: " + sexo + ", Peso: " + peso);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public static ArrayList<Animal> cargarAnimalesEjemplo() {
    ArrayList<Animal> animales = new ArrayList<>();
    
    // Agregamos un ejemplo de cada tipo
    animales.add(new Mamiferos("León", 8, "Carnívoro", "Macho", 190.5, "Panthera leo", "Melena abundante"));
    animales.add(new Aves(2.5, "Águila Real", 5, "Carnívoro", "Hembra", 4.5, "Aquila chrysaetos"));
    animales.add(new Reptiles(true, "Cobra Real", 4, "Carnívoro", "Macho", 6.0, "Ophiophagus hannah"));
    
    return animales;
}}


