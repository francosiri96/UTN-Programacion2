/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadosYPolimorfismo;

/**
 *
 * @author franc
 */
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Implementación específica para empleados temporales.
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}