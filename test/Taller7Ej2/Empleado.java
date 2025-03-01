/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    // Método abstracto
    public abstract double calcularSalario();
    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario final: $" + calcularSalario());
    }
}
/*
Ejercicio 2: Clase Empleado y Clases Derivadas Gerente y Vendedor
Define una clase abstracta Empleado con un método abstracto calcularSalario.
Crea dos clases derivadas (Gerente y Vendedor) que extiendan Empleado y proporcionen sus propias implementaciones de calcularSalario.
Define un método mostrarDetalles en Empleado y utiliza calcularSalario para mostrar los detalles del empleado.
*/