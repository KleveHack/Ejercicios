/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class TestPato {
    public static void main(String[] args) {
        Pato pato = new Pato();
        
        pato.volar();
        pato.nadar();
    }
}
// Definición de la interfaz Volador
interface Volador {
    void volar();
}

// Definición de la interfaz Nadador
interface Nadador {
    void nadar();
}

/*
Ejercicio 2: Interfaces Volador y Nadador
Define una interfaz Volador con un método volar.
Define una interfaz Nadador con un método nadar.
Crea una clase Pato que implemente ambas interfaces y defina sus métodos.
Crea una clase de prueba para instanciar un objeto de Pato y usar ambos métodos.
*/