/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("suma : " + Utilidades.sumar(num1, num2));
        System.out.println("Resta : " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicacion : " + Utilidades.multipllicar(num1, num2));
        System.out.println("Division : " + Utilidades.division(num1, num2));
        //Prueba de la validacion
        System.out.println("Division entre 0 : " + Utilidades.division(num1, 0));
    }
}

/*
Ejercicio 3: Clase Utilidades
Define una clase Utilidades con métodos públicos que realicen operaciones matemáticas básicas (suma, resta, multiplicación, división).--
Crea una clase de prueba que acceda a estos métodos y valide su correcto funcionamiento.--

*/