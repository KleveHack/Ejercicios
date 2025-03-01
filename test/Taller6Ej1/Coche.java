/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;
    
    public Coche(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    contadorCoches++;
    }
    
    public static void mostrarTotalCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
    public void mostrarDetalles(){
        System.out.println("Maca : " + marca + "Modelo : " + modelo);
    }
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Cilindrada");
        Coche coche3 = new Coche("Ford", "Focus");
        
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();
        
        Coche.mostrarTotalCoches();
    }
}
/*
Ejercicio 1: Clase Coche con Contador de Instancias
Crea una clase Coche con los atributos marca, modelo y un atributo static llamado contadorCoches.
Define un constructor que incremente contadorCoches cada vez que se cree un objeto de la clase.
Crea un método static para mostrar cuántos coches se han creado.
*/