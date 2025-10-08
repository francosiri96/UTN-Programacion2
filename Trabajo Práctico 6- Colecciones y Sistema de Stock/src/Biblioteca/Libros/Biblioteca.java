/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.Libros;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Biblioteca {
    private final String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre de la biblioteca no puede ser nulo o vacío.");
        this.nombre = nombre;
    }
    
    public String getNombre() { return nombre; }

    /** Agrega un libro a la biblioteca. No permite ISBN duplicados. */
    public void agregarLibro(Libro libro) {
        Objects.requireNonNull(libro, "El libro no puede ser null.");
        if (buscarLibroPorIsbn(libro.getIsbn()) != null) {
            System.out.println("Error: Ya existe un libro con el ISBN " + libro.getIsbn());
            return;
        }
        libros.add(libro);
    }

    /** Muestra todos los libros de la biblioteca. */
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    /** Busca un libro por su ISBN. */
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    /** Elimina un libro por su ISBN. */
    public void eliminarLibro(String isbn) {
        Libro aEliminar = buscarLibroPorIsbn(isbn);
        if (aEliminar != null) {
            libros.remove(aEliminar);
            System.out.println("Libro con ISBN " + isbn + " eliminado.");
        } else {
            System.out.println("No se encontró un libro con el ISBN " + isbn);
        }
    }

    /** Devuelve la cantidad total de libros. */
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    /** Filtra y devuelve una lista de libros publicados en un año específico. */
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        return libros.stream()
                .filter(libro -> libro.getAnioPublicacion() == anio)
                .collect(Collectors.toList());
    }

    /** Muestra los autores únicos de los libros en la biblioteca. */
    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores porque no hay libros en la biblioteca.");
            return;
        }
        System.out.println("Autores disponibles en la biblioteca:");
        libros.stream()
                .map(Libro::getAutor) // Extrae el autor de cada libro
                .distinct()           // Elimina autores duplicados
                .forEach(Autor::mostrarInfo); // Muestra la info de cada autor único
    }
}