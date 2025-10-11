/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesyComportamientoSobrescrito;

/**
 *
 * @author franc
 */
public class Gato extends Animal {
    public Gato() {
        super("Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}