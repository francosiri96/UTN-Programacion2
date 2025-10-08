/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.Libros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Tareas a Realizar ---

        System.out.println("--- 1. Creamos una biblioteca ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("¡Biblioteca '" + miBiblioteca.getNombre() + "' creada!\n");

        System.out.println("--- 2. Crear al menos tres autores ---");
        Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A02", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A03", "Jorge Luis Borges", "Argentino");
        System.out.println("Autores creados.\n");

        System.out.println("--- 3. Agregar 5 libros a la biblioteca ---");
        miBiblioteca.agregarLibro(new Libro("978-0307350446", "Cien años de soledad", 1967, autor1));
        miBiblioteca.agregarLibro(new Libro("978-0061120084", "La casa de los espíritus", 1982, autor2));
        miBiblioteca.agregarLibro(new Libro("978-8420633116", "Ficciones", 1944, autor3));
        miBiblioteca.agregarLibro(new Libro("978-0307474728", "El amor en los tiempos del cólera", 1985, autor1));
        miBiblioteca.agregarLibro(new Libro("978-8497592231", "El Aleph", 1949, autor3));
        System.out.println("¡5 libros agregados a la biblioteca!\n");

        System.out.println("--- 4. Listar todos los libros ---");
        miBiblioteca.listarLibros();
        System.out.println();

        System.out.println("--- 5. Buscar un libro por su ISBN (978-0061120084) ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0061120084");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }
        System.out.println();
        
        System.out.println("--- 6. Filtrar y mostrar los libros publicados en 1944 ---");
        List<Libro> librosDe1944 = miBiblioteca.filtrarLibrosPorAnio(1944);
        librosDe1944.forEach(Libro::mostrarInfo);
        System.out.println();

        System.out.println("--- 7. Eliminar un libro por su ISBN (978-8420633116) y listar los restantes ---");
        miBiblioteca.eliminarLibro("978-8420633116");
        System.out.println("Libros restantes:");
        miBiblioteca.listarLibros();
        System.out.println();

        System.out.println("--- 8. Mostrar la cantidad total de libros en la biblioteca ---");
        System.out.println("Total de libros: " + miBiblioteca.obtenerCantidadLibros() + "\n");
        
        System.out.println("--- 9. Listar todos los autores disponibles en la biblioteca ---");
        miBiblioteca.mostrarAutoresDisponibles();
        System.out.println();
    }
}