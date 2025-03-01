/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(2, 3);
        
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
/*
Ejercicio 1: Clase Figura y Clases Derivadas Circulo y Rectangulo
Define una clase abstracta Figura con un método abstracto calcularArea.
Crea dos clases derivadas (Circulo y Rectangulo) que extiendan Figura y proporcionen sus propias implementaciones de calcularArea.
Define un método mostrarArea en Figura y utiliza calcularArea para mostrar el área.
*/