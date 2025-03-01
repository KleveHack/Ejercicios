/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave esta volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave esta cantando una melodía hermosa.");
    }
}