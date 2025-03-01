/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class claseMain {
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 3000);
        // Crear un objeto de la clase Gerente
        Gerente gerente1 = new Gerente("Laura Gómez", 5000, "Ventas");
        
        // Mostrar detalles de los empleados
        System.out.println("Detalles del empleado:");
        empleado1.mostrarDetalles();
        System.out.println("\nDetalles del gerente:");
        gerente1.mostrarDetalles();
    }
}