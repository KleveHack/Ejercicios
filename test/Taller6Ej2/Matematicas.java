/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Matematicas {
    public static double sumar(double a, double b){
    return a + b;
    }
    
    public static double resta(double a, double b){
    return a - b;
    }
    
    public static double multiplicación(double a, double b){
    return a * b;
    }
    
    public static double division(double a, double b){
        if (b == 0) {
            System.out.println("Error : no es posible division entre cero");
            return Double.NaN;
        }
            return a / b;
    }
}
/*
Ejercicio 2: Clase Matematicas con Métodos static
Define una clase Matematicas que tenga métodos static para realizar las operaciones básicas (suma, resta, multiplicación, división).
Crea una clase de prueba que llame a estos métodos y muestre los resultados.
*/