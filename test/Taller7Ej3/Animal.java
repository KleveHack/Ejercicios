/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido(); // Método abstracto
}
/*
Ejercicio 3: Uso Incorrecto de Clases Abstractas
Intenta instanciar una clase abstracta directamente y observa los errores de compilación.
Intenta definir un método concreto en una clase abstracta que sea necesario sobrescribir en las clases derivadas.
*/