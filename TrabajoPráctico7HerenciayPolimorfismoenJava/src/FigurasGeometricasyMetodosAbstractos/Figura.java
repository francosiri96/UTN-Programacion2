/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricasyMetodosAbstractos;

/**
 *
 * @author franc
 */
// Con 'abstract', declaramos que esta clase es una plantilla y no se pueden crear objetos de ella.
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Un método abstracto no tiene cuerpo ({}) y termina en punto y coma.
    // Obliga a las subclases a proporcionar una implementación.
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
}