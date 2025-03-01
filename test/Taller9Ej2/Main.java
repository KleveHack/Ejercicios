/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Pez miPez = new Pez(); // Instanciar objeto de Pez
        miPez.nadar();  // Llamar al método nadar
        miPez.respirar(); // Llamar al método respirar
    }
}
//Definición de la interfaz Nadador
interface Nadador {
    void nadar();
}

// Definición de la interfaz Respirador
interface Respirador {
    void respirar();
}