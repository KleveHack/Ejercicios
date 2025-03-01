/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_8Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", 4);
        coche.mostrarDetalles();
    }
}
/*
No se puede usar super fuera de una clase derivada, No se puede acceder a atributos private
de la clase base con un super. Usar protected o un getter si necesitas acceder a 
atributos privados en la clase base.
*/