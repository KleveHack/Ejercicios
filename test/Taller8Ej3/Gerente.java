/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8Ej3;

/**
 *
 * @author JAVIER Y KLEVER
 */
class Gerente extends Empleado {
    private String departamento;

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de la clase base
        this.departamento = departamento;
    }
    // Sobrescribe el método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamar al método y así incluyendo departamento gracias al sobreescrito.
        System.out.println("Departamento: " + departamento);
    }
}
