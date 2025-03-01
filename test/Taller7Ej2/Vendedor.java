/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7Ej2;

/**
 *
 * @author JAVIER Y KLEVER
 */
public class Vendedor extends Empleado {
    private double comision;
    private int ventasRealizadas;

    public Vendedor(String nombre, double salarioBase, double comision, int ventasRealizadas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventasRealizadas);
    }
}
