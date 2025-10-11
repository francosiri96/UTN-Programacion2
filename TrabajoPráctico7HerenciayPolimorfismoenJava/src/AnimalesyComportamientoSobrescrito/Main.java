/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesyComportamientoSobrescrito;

/**
 *
 * @author franc
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarea: Crear lista de animales y mostrar sus sonidos. 

        List<Animal> granja = new ArrayList<>();

        // Agregamos objetos de diferentes subclases a la misma lista de tipo Animal.
        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Vaca());

        System.out.println("--- Los sonidos de la granja (Polimorfismo) ---");

        // Recorremos la lista y llamamos al mismo método en cada objeto.
        for (Animal animal : granja) {
            System.out.print(animal.getTipo() + " dice: ");
            // Java invoca la versión del método que corresponde al tipo real del objeto.
            animal.hacerSonido();
        }
    }
}
