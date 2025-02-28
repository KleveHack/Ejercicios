/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Producto {
    private double precio;
    
    public Producto(double precio){
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double NuevoPrecio){
        if (precio >=0) {
            this.precio = NuevoPrecio;
        } else {
            System.out.println("Error : El precio no puede ser negativo");
        }
    }
    
}
