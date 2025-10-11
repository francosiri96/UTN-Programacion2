/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesyComportamientoSobrescrito;

/**
 *
 * @author franc
 */
public class Perro extends Animal {
    public Perro() {
        super("Perro"); // Llama al constructor de Animal
    }

    // @Override asegura que estamos sobrescribiendo correctamente el método del padre.
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }
}