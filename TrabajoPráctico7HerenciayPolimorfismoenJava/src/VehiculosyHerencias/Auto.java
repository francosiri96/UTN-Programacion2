/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosyHerencias;

/**
 *
 * @author franc
 */
// 'extends' establece la relación de herencia. Un Auto "es un" Vehiculo.
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        // 'super()' llama al constructor de la superclase (Vehiculo)
        // para inicializar los atributos heredados. Debe ser la primera línea.
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    // '@Override' indica que estamos sobrescribiendo un método de la superclase.
    @Override
    public void mostrarInfo() {
        // Reutilizamos el método del padre para no duplicar código.
        super.mostrarInfo();
        System.out.println("Cantidad de Puertas: " + cantidadPuertas);
    }
}