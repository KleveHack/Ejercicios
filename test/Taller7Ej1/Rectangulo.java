/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Rectangulo extends Figura{
    private double alto, ancho;
    
    public Rectangulo(double alto, double ancho){
    this.ancho = ancho;
    this.alto = alto;
    }
    @Override
    public double calcularArea(){
    return ancho * alto;
    }
}
