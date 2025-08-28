/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp_3;

public class ClaseLibro {
    private String titulo;
    private String autor;
    private int añoPublicacion;


    public ClaseLibro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    
    public void setAñoPublicacion(int anio) {
        if (anio >= 1900 && anio <= 2025) {
            this.añoPublicacion = anio;
        } else {
            System.out.println("Año inválido. Debe estar entre 1900 y 2025.");
        }
    }

   
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
}
