/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class TestFiguras {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(4, 6);

        System.out.println("Area del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del Triangulo: " + triangulo.calcularArea());
    }
}