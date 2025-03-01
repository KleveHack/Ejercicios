/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Persona {
    private static String nombre;
    
    public Persona(String nombre){
    Persona.nombre = nombre;
    }
    
    public static void mostraInfo(){
        System.out.println("El nombre es : " + nombre);
    }
}
/*
Ejercicio 3: Uso Incorrecto de static
Intenta crear un método static en una clase que intente acceder y modificar un atributo no estático.
Observa los errores de compilación y explica por qué suceden.
*/