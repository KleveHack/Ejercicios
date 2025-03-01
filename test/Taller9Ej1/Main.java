/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Ave miAve = new Ave(); // Instanciar objeto de Ave
        miAve.volar();  // Llamar al método volar
        miAve.cantar(); // Llamar al método cantar
    }
}
// Definición de la interfaz Volador
interface Volador {
    void volar();
}

// Definición de la interfaz Cantante
interface Cantante {
    void cantar();
}