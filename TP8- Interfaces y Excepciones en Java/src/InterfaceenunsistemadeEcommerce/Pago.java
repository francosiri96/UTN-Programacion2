/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceenunsistemadeEcommerce;

/**
 *
 * @author franc
 */
 //Interfaz Pago
public interface Pago {
    /**
     * Procesa un pago por un monto dado.
     * @param monto El monto a pagar.
     * @return true si el pago fue exitoso, false en caso contrario.
     */
    boolean procesarPago(double monto);
}

