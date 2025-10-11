/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricasyMetodosAbstractos;

/**
 *
 * @author franc
 */
public class Main {
    public static void main(String[] args) {
        // Tarea: Crear un array de figuras y mostrar el área de cada una.

        // 1. Creamos un array de tipo 'Figura' (la superclase abstracta).
        Figura[] figuras = new Figura[2];

        // 2. Guardamos objetos de las subclases concretas (Upcasting).
        figuras[0] = new Circulo(10);       // Radio 10
        figuras[1] = new Rectangulo(5, 8); // Base 5, Altura 8

        System.out.println("--- Calculando áreas de las figuras ---");

        // 3. Recorremos el array y usamos polimorfismo.
        for (Figura fig : figuras) {
            // Java sabe qué versión de calcularArea() llamar según el objeto real.
            System.out.println("Área del " + fig.getNombre() + ": " + fig.calcularArea());
        }
    }
}