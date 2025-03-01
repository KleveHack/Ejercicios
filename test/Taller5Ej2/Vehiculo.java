/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Vehiculo {
    protected String tipo;
    protected String marca;
    
    public Vehiculo(String tipo, String marca){
        this.marca = marca;
        this.tipo = tipo;
    }
    
    public void mostrarInfo(){
        System.out.println("El tip es : " + tipo);
        System.out.println("La marca es : " + marca);
    }
}
/*
Ejercicio 2: Clase Vehículo y Clase Moto
Define una clase Vehículo con las propiedades tipo y marca como protected.
Crea una subclase Moto que herede de Vehículo y tenga una propiedad adicional cilindrada.
En una clase de prueba, intenta acceder a los miembros protected desde una clase no relacionada y observa los errores de compilación.
*/