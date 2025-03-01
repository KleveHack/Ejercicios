/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
// Clase abstracta con un método concreto válido
abstract class Animal {
    void hacerSonido() { // Método concreto válido (sin "default")
        System.out.println("Haciendo un sonido...");
    }
}
/*
Si una clase concreta implementa una interfaz, debe definir todos sus métodos.
Si no quiere implementarlos, debe ser una clase abstracta.
Las interfaces pueden tener métodos "default" pero las clases abstractas no.
Las clases abstractas pueden tener métodos concretos, sin necesidad de "default".
*/