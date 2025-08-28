/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp_3;

public class GranjaDigital {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor con parámetros
    public GranjaDigital(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // Constructor vacío
    public GranjaDigital() {
        this.idGallina = 0;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    
    public void ponerHuevo(int cantidad) {
        huevosPuestos += cantidad;
    }

    public void envejecer(int anios) {
        edad += anios;
    }

    public void mostrarEstado() {
        System.out.println("ID Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }

    
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
}
