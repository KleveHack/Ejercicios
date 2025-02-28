/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3_3Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class SerVivo {
    public void HacerRuido(){
        System.out.println("El Animal ruge");
    }
}

    class Animal extends SerVivo{
    @Override
    public void HacerRuido(){
        System.out.println("El animal rugio");
    }
}

