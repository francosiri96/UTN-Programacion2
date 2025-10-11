/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesyComportamientoSobrescrito;

/**
 *
 * @author franc
 */
public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    // Método con un comportamiento genérico.
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
}