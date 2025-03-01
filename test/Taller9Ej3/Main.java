/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Pez pez = new Pez();
        pez.nadar();

        Pajaro pajaro = new Pajaro();
        pajaro.volar();
    }
}
// Definir la interfaz Nadador
interface Nadador {
    void nadar();
}
// Definir la interfaz Volador
interface Volador {
    void volar();
}

/*
Siempre hay q implementar todos los métodos de la interfaz en la clase que usas. 
No implementar interfaces que no tienen sentido para una clase.
Las interfaces deben seguir el comportamiento correcto de los objetos para evitar errores.
*/