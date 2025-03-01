/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Empleado {
    protected String nombre;
    protected int salario;
    
    public Empleado(String nombre, int salario){
    this.nombre = nombre;
    this.salario = salario;
    }
    
    public void mostrarInfo(){
        System.out.println("El nombre del empleado es : " + nombre);
        System.out.println("El salario de él es : " + salario);
    }
}
/*
Ejercicio 1: Clase Empleado y Clase Gerente
Crea una clase Empleado con las propiedades nombre y salario como protected.---
Crea una clase Gerente que herede de Empleado y tenga una propiedad adicional departamento.
En la clase Gerente, sobrescribe un método mostrarInformacion para mostrar todos los detalles del empleado y el gerente.
*/