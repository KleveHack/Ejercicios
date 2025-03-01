/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej4;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {//Método getter para acceder a la marca
        return marca;
    }
}
/*
Ejercicio 4: Uso Incorrecto de la Herencia
Intenta crear una clase que herede de múltiples clases e identifica el error de compilación.
Intenta acceder a atributos privados de una clase base desde una clase derivada y explica por qué ocurre el error.
*/