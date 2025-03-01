/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;
    // Constructor
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); // Llamada al constructor de la otra clase
        this.numeroPuertas = numeroDePuertas;
    }
    // Método mostrar la información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamamos el método de la otra clase
        System.out.println("Número de puertas: " + numeroPuertas);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", 180, 4);
        
        miCoche.mostrarInformacion();
    }
}