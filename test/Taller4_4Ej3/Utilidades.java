/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Utilidades {
    //Suma
    public static double sumar(double a, double b){
        return a + b ;
    }
    
    //Resta
    public static double restar(double a, double b){
    return a - b;
    }
    
    //Multiplicacion
    public static double multipllicar(double a, double b){
    return a * b;
    }
    
    //Division
    public static double division(double a, double b){
        if (b!= 0) {
            return a / b;
        } else {
            System.out.println("Math Error");
            return Double.NaN;
        }
    }
}
    

/*
Ejercicio 3: Clase Utilidades
Define una clase Utilidades con métodos públicos que realicen operaciones matemáticas básicas (suma, resta, multiplicación, división).
Crea una clase de prueba que acceda a estos métodos y valide su correcto funcionamiento.
*/