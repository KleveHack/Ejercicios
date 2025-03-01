/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class CuentaBancaria {//inicio class
    private String numeroDeCuenta;
    private int saldo;
    public String tipoCuenta;
    
    public CuentaBancaria(String numeroDeCuenta, int saldoInicial, String tipoCuenta){
    this.numeroDeCuenta = numeroDeCuenta;
    this.tipoCuenta = tipoCuenta;
    setsaldo(saldoInicial);
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void setsaldo(int saldo){
        if (saldo >= 0) {//Inicio if
            this.saldo = saldo;
        } else {
            System.out.println("Error : El saldo no puede ser negativo");
        }//Fin else
    }
    
    public void MostrarInfo(){
        System.out.println("El numero de cuenta es: " + numeroDeCuenta);
        System.out.println("El tipo de cuenta es : " + tipoCuenta);
        System.out.println("El saldo es : " + saldo + "$");
    }
    
}//Fin class
/*
Ejercicio 2: Clase CuentaBancaria
Crea una clase CuentaBancaria con las propiedades numeroCuenta (privada), saldo (privada) y tipoCuenta (pública). Define:
Métodos públicos get y set para saldo.-
Un método público para mostrar los detalles de la cuenta.
Crea una clase de prueba que intente acceder directamente a numeroCuenta y observe los errores de compilación.

*/