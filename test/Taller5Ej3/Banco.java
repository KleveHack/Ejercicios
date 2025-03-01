/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Banco {
    //protected int saldo; Lo mejor sera dejarlo en private
    private double saldo;
    
    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Se ha establecido en $0.");
        }
    }
        
    // Método para obtener el saldo de manera segura
    //Gracias a que esta en private
    public double getSaldo() {
        return saldo;
    }

    // Método de deposito con validación
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso: $" + cantidad);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    // Método de retiro con un control
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: $" + cantidad);
            return true;
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad inválida.");
            return false;
        }
    }

    // Método para mostrar saldo sin exponer la variable directamente
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }
}
/*
Ejercicio 3: Uso Incorrecto de protected en Datos Críticos
Crea una clase Banco con la propiedad saldo como protected. Discute por qué esta implementación no es segura y cómo podría mejorar.
Propón una solución para encapsular la propiedad saldo de manera adecuada.
*/