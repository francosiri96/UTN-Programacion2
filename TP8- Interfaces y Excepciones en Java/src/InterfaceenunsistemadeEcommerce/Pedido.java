/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Archivo: Pedido.java
 */
package InterfaceenunsistemadeEcommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    
    // --- Atributos de Pagable/Cálculo ---
    private List<Producto> productos;

    // --- Atributos de Notificación (Parte 5 del Ejercicio) ---
    private Notificable cliente; // Necesario para notificar
    private String estado;      // Atributo para controlar el estado

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "CREADO"; // Estado inicial por defecto
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // --- Implementación del método de la interfaz Pagable ---
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // --- Métodos de Notificación (Parte 5 del Ejercicio) ---
    
    public void setCliente(Notificable cliente) {
        this.cliente = cliente;
    }
    
    // Este método cambia el estado y realiza la notificación requerida
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado interno del Pedido ha cambiado a: " + nuevoEstado);
        
        // La clase Pedido notifica al Cliente (que implementa Notificable)
        if (cliente != null) {
            cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
        }
    }
}