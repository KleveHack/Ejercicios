/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Klever", 10000);
        emp1.mostrarInformacion();
        
        emp1.setSalario(12000);
        System.out.println("Sueldo actualizado : " + emp1.getSalario());
    }
}
