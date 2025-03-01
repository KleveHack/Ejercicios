/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8_8Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() { // Getter para acceder a marca
        return marca;
    }
}
/*
Ejercicio 3: Uso Incorrecto de super
Intenta utilizar super en un contexto que no sea una clase derivada y observa los errores de compilación.
Intenta invocar un atributo privado de la clase base utilizando super y discute por qué ocurre un error.
*/