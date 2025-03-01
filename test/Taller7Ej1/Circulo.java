/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio){
    this.radio = radio;
    }
    @Override
    public double calcularArea(){
    return Math.PI * radio * radio;
    }
}
