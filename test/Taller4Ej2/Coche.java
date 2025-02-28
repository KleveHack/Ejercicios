/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
    public Coche(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima >=0 ){//Inicio if
        this.velocidadMaxima = velocidadMaxima;
        }else{
            this.velocidadMaxima = 0;
        }//Fin if
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void acelerar(int incremento){
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("Error : el inremento debe ser positivo");
        }
    }
    
}
/*
Ejercicio 2: Clase Coche
Crea una clase Coche con las propiedades marca, modelo y velocidadMaxima. Define:
Todas las propiedades deben ser privadas.
Proporciona un método acelerar que incremente velocidadMaxima solo si el incremento es positivo.
Crea una clase de prueba que intente acceder a las propiedades directamente y observa los errores de compilación.

*/