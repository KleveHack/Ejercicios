/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        
        System.out.println("Suma : " + Matematicas.sumar(num1, num2));
        System.out.println("Resta : " + Matematicas.resta(num1, num2));
        System.out.println("Multiplicacion : " + Matematicas.multiplicación(num1, num2));
        System.out.println("Division : " + Matematicas.division(num1, num2));
        
        System.out.println("Intento de Division entre cero : " + Matematicas.division(num1, 0));
    }
}
