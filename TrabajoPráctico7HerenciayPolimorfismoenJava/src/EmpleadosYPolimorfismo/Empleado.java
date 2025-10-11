/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadosYPolimorfismo;

/**
 *
 * @author franc
 */
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Contrato: toda clase que herede de Empleado DEBE implementar este método.
    public abstract double calcularSueldo();
}