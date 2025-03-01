/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej4;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class claseMain {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 4);
        miCoche.mostrarDetalles();
    }
}
/*
Java no permite herencia múltiple con clases, lo que evita ambigüedades y errores.
Los atributos privados no pueden ser accedidos directamente en las subclases.
Se debe usar un getter para acceder a los atributos privados de la clase base.
*/