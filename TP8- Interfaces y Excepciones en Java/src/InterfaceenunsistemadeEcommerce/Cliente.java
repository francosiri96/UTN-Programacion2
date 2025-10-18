/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceenunsistemadeEcommerce;

/**
 *
 * @author franc
 */


/**
 * Clase Cliente: Implementa Notificable para recibir mensajes sobre el estado del pedido.
 */
public class Cliente implements Notificable {
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    // Implementación obligatoria del método de la interfaz Notificable
    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + nombre + " notificado: " + mensaje);
    }
    
}