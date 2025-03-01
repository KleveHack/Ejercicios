/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Moto extends Vehiculo{
    String cilindrada;
    
    public Moto(String marca, String cilindrada){
    super("Moto",marca);
    this.cilindrada = cilindrada;
    }
    public void mostrarInfo(){
    super.mostrarInfo();
        System.out.println("cilindrada : " + cilindrada + "cc");
    }
}
/*
Ejercicio 2: Clase Vehículo y Clase Moto
Define una clase Vehículo con las propiedades tipo y marca como protected.--
Crea una subclase Moto que herede de Vehículo y tenga una propiedad adicional cilindrada.--
En una clase de prueba, intenta acceder a los miembros protected desde una clase no relacionada y observa los errores de compilación.
*/