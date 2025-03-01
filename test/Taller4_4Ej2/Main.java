/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("600214537", 800000000, "Ahorros");
        
        cuenta1.MostrarInfo();
        System.out.println("El saldo actualizado es: " + cuenta1.getSaldo() + "$");
        //Al intentar de acceder a numeroCuenta provocará un error de compilación
        //A diferencia de tipo de cuenta que es publica
        System.out.println("El tipo de cuenta es : " + cuenta1.tipoCuenta);
    }
}

/*
Ejercicio 2: Clase CuentaBancaria
Crea una clase CuentaBancaria con las propiedades numeroCuenta (privada), saldo (privada) y tipoCuenta (pública). Define:-
Métodos públicos get y set para saldo.---
Un método público para mostrar los detalles de la cuenta.---
Crea una clase de prueba que intente acceder directamente a numeroCuenta y observe los errores de compilación.--
*/