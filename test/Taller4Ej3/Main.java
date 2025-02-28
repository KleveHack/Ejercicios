/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        Producto p = new Producto(57999.9);
        
        System.out.println("Precio actual del producto : " + p.getPrecio());
        p.setPrecio(48000);
        System.out.println("Nuevo precio de descuento : " + p.getPrecio());
    }
}
