/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceenunsistemadeEcommerce;

/**
 *
 * @author franc
 */
// Interfaz PagoConDescuento: herencia de interfaces
public interface PagoConDescuento extends Pago {
    /**
     * Aplica un descuento al monto original.
     * @param monto El monto original.
     * @return El monto con el descuento aplicado.
     */
    double aplicarDescuento(double monto);
}