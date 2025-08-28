/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_3;

/**
 *
 * @author franc
 */
public class Mascota {
    String nombre;
    String especie;
    int edad; 
    
    
    
 public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    void mostrarInfo(){
        System.out.println(nombre +"" + especie+"" + edad +"" );
    } 
    void cumplirAnios(int anios){
        edad ++;
    }
    
    
    
    
    
}
 