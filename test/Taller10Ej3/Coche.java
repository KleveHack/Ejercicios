/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10Ej3;
/**
 *
 * @author JAVIER Y KLEVER
 */
// Implementación correcta en una clase concreta
class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}
// Definición de la interfaz
interface Vehiculo {
    void acelerar(); // Método abstracto
}
/*
Ejercicio 3: Uso Incorrecto de Clases Abstractas e Interfaces
Intenta crear una clase concreta que implemente una interfaz sin proporcionar implementaciones de 
sus métodos y observa los errores de compilación.
Intenta definir métodos predeterminados en una clase abstracta y discute por qué esto no es posible.
*/