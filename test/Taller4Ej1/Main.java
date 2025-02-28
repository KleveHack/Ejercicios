/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Klever", 19, 4.0);
                
        System.out.println("Name : " + estudiante1.getname());
        System.out.println("Age : " + estudiante1.getage());
        System.out.println("Average Grades : " + estudiante1.getAverageGrade());
        
        //Agregar valores invalidos...
        estudiante1.setname("");
        estudiante1.setage(-5);
        estudiante1.setAverageGrade(12);
                
        System.out.println("\n After incorrect assignment attempts");
        System.out.println("Name : " + estudiante1.getname());
        System.out.println("Age : " + estudiante1.getage());
        System.out.println("Average Grades : " + estudiante1.getAverageGrade());
    }
}
