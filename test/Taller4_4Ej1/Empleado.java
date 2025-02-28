/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4_4Ej1;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Empleado {
    public String name;
    private int salario;
    
    public Empleado (String name, int salario){
    this.name = name;
    setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }
    
    public void setSalario(int salario){
        if (salario >=0) {
            this.salario = salario;
        } else {
            System.out.println("El valor del salario no puede ser negativo");
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre : " + name + ", salario : $" + salario);
    }
    
}
/*
Ejercicio 1: Clase Empleado
Crea una clase Empleado con las propiedades nombre y salario. Define:
La propiedad nombre debe ser pública.
Proporciona métodos get y set públicos para la propiedad salario, con validaciones en el método set.
Crea una clase de prueba que instancie objetos de Empleado y acceda a las propiedades.
*/