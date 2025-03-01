/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Estudiante extends Persona {
    private String matricula;
    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llamos el constructor
        this.matricula = matricula;
    }
    // Sobrescribir el método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamamos a el método
        System.out.println("Matrícula: " + matricula);
    }
    
    public static void main(String[] args) {
        // objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("Klever Polo", 20, "A123456");

        // información del estudiante
        estudiante.mostrarInformacion();
    }
}