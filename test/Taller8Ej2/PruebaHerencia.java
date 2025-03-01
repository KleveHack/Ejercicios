/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        // Crear un objeto de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Kennai Anderson", 20, "A123456");
        Estudiante estudiante2 = new Estudiante("Keiser Polo", 22, "B654321");
        
        // Mostrar información
        System.out.println("Detalles del estudiante 1:");
        estudiante1.mostrarInformacion();
        System.out.println("\nDetalles del estudiante 2:");
        estudiante2.mostrarInformacion();
    }
}
