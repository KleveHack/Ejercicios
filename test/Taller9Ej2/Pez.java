/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez esta nadando en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez esta respirando a través de sus branquias.");
    }
}
/*
Ejercicio 2: Clase Pez con Interfaces Nadador y Respirador
Define una interfaz Nadador con un método nadar.
Define una interfaz Respirador con un método respirar.
Crea una clase Pez que implemente ambas interfaces y defina sus métodos.
Crea una clase de prueba para instanciar un objeto de Pez y usar ambos métodos.
*/