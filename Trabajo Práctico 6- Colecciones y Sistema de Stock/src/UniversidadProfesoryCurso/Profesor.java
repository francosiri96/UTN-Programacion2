/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesoryCurso;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Profesor {
    private final String id;
    private String nombre;
    private String especialidad;
    // Lista de cursos que dicta el profesor
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() {
        // Devuelve una copia no modificable para proteger la lista interna
        return Collections.unmodifiableList(cursos);
    }
    
    // --- MÉTODOS PARA SINCRONIZACIÓN (usados por la clase Curso) ---

    /** (Uso interno) Agrega un curso a la lista sin crear un bucle. */
    void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    /** (Uso interno) Elimina un curso de la lista sin crear un bucle. */
    void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    // --- MÉTODOS PÚBLICOS ---

    /** Muestra los datos del profesor y la cantidad de cursos que dicta. */
    public void mostrarInfo() {
        System.out.printf("[Profesor] ID: %s, Nombre: %s, Especialidad: %s, Cursos a cargo: %d%n",
                id, nombre, especialidad, cursos.size());
    }

    /** Muestra los códigos y nombres de los cursos que dicta. */
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.printf("El profesor %s no tiene cursos asignados.%n", nombre);
        } else {
            System.out.printf("Cursos a cargo del profesor %s:%n", nombre);
            for (Curso curso : cursos) {
                System.out.printf("  - [%s] %s%n", curso.getCodigo(), curso.getNombre());
            }
        }
    }
    
    // Métodos equals y hashCode para un manejo correcto en colecciones
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return id.equals(profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}