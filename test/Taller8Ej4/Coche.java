/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej4;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int numeroDePuertas) {
        super(marca);
        this.numeroPuertas = numeroDePuertas;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca());//Acceso correcto con getter
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
