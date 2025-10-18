/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceenunsistemadeEcommerce;

/**
 *
 * @author franc
 */
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementación del método de la interfaz Pagable
    @Override
    public double calcularTotal() {
        return this.precio; // El total de un producto es su precio
    }
    
    // Getters necesarios
    public double getPrecio() {
        return precio;
    }
}