/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricasyMetodosAbstractos;

/**
 *
 * @author franc
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        // Llamamos al constructor del padre para establecer el nombre.
        super("Círculo");
        this.radio = radio;
    }

    // Es obligatorio implementar todos los métodos abstractos de la superclase.
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}