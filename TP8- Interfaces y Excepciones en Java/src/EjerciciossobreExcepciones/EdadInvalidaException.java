/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciossobreExcepciones;

/**
 *
 * @author franc
 */



public class EdadInvalidaException extends Exception {
    
    // Constructor que acepta un mensaje
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}