/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadosYPolimorfismo;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarea: Crear lista, invocar calcularSueldo() y usar instanceof.

        List<Empleado> empleados = new ArrayList<>();

        // Agregamos distintos tipos de empleados a la misma lista (Upcasting).
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Carlos", 100, 450));
        empleados.add(new EmpleadoPlanta("Marta", 52000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 400));

        System.out.println("--- Cálculo de sueldos (Polimorfismo) ---");
        for (Empleado emp : empleados) {
            // Se llama al método calcularSueldo() correspondiente a cada objeto.
            System.out.println("Sueldo de " + emp.getNombre() + ": $" + emp.calcularSueldo());
        }

        System.out.println("\n--- Clasificación de empleados (instanceof) ---");
        int contadorPlanta = 0;
        int contadorTemporal = 0;

        for (Empleado emp : empleados) {
            // Verificamos el tipo real de cada objeto en la lista.
            if (emp instanceof EmpleadoPlanta) {
                contadorPlanta++;
            } else if (emp instanceof EmpleadoTemporal) {
                contadorTemporal++;
            }
        }

        System.out.println("Total de empleados de planta: " + contadorPlanta);
        System.out.println("Total de empleados temporales: " + contadorTemporal);
    }
}