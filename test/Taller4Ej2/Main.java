/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Coche miChoche = new Coche("Mercedes", "Ford GT", 180);
        
        System.out.println("Marca : " + miChoche.getMarca());
        System.out.println("Modelo : " + miChoche.getModelo());
        System.out.println("Velocidad maxima : " + miChoche.getVelocidadMaxima() + "Km/h");
        
        miChoche.acelerar(20);
        System.out.println("Despues de acelerar: " + miChoche.getVelocidadMaxima() + "km/h"); 
        
       miChoche.acelerar(-10);
        
    }
}
