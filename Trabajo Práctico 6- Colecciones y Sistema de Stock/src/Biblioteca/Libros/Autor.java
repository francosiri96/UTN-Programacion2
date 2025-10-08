package Biblioteca.Libros;

import java.util.Objects;

public class Autor {
    private final String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("El ID no puede ser nulo o vacío.");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        this.nombre = nombre;
    }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    /** Muestra la información del autor en consola. */
    public void mostrarInfo() {
        System.out.printf("[Autor] ID=%s, Nombre=%s, Nacionalidad=%s%n", id, nombre, nacionalidad);
    }

    @Override
    public String toString() {
        return String.format("Autor{id='%s', nombre='%s'}", id, nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return id.equals(autor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}