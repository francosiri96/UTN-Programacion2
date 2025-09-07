/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado emp1 = new Empleado(1, "Ana Gómez", "Desarrolladora", 75000);
        Empleado emp2 = new Empleado("Luis Pérez", "Analista");
        Empleado emp3 = new Empleado("María López", "Tester");

        // Aplicar métodos actualizarSalario
        emp1.actualizarSalario(10); // 10% de aumento
        emp2.actualizarSalario(5000); // aumento fijo

        // Mostrar información
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
