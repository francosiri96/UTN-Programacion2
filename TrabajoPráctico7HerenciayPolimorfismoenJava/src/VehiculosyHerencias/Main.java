/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosyHerencias;

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {
        // Tarea: Instanciar un auto y mostrar su información completa.
        System.out.println("--- Creando instancia de Auto ---");
        Auto miAuto = new Auto("Ford", "Focus", 5);
        miAuto.mostrarInfo();
    }
}