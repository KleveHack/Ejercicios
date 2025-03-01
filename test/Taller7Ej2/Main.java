/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos", 5000, 1500);
        Empleado vendedor = new Vendedor("Ana", 3000, 200, 10);

        gerente.mostrarDetalles();
        System.out.println("------------------------");
        vendedor.mostrarDetalles();
    }
}