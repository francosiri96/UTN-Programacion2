/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadosYPolimorfismo;

/**
 *
 * @author franc
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBasico;

    public EmpleadoPlanta(String nombre, double sueldoBasico) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
    }

    // Implementación específica para empleados de planta.
    @Override
    public double calcularSueldo() {
        // Para este ejemplo, su sueldo es simplemente el sueldo básico.
        return sueldoBasico;
    }
}