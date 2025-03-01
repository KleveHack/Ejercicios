/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_8Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int numeroDePuertas) {
        super(marca);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + getMarca()); // ✅ Se accede correctamente con el getter
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
