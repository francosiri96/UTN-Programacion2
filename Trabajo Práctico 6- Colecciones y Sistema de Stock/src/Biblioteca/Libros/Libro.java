/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.Libros;


import java.util.Objects;

public class Libro {
    private final String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Relación con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || isbn.isBlank()) throw new IllegalArgumentException("El ISBN no puede ser nulo o vacío.");
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("El título no puede ser nulo o vacío.");
        if (autor == null) throw new IllegalArgumentException("El autor no puede ser nulo.");
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters y Setters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) {
        if (autor == null) throw new IllegalArgumentException("El autor no puede ser nulo.");
        this.autor = autor;
    }

    /** Muestra la información completa del libro, incluyendo la del autor. */
    public void mostrarInfo() {
        System.out.printf("[Libro] ISBN=%s, Título='%s', Año=%d, Autor=%s%n",
                isbn, titulo, anioPublicacion, autor.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn.equals(libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}