/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesoryCurso;



import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private final String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) { this.nombre = nombre; }
    
    // Métodos para agregar entidades
    public void agregarProfesor(Profesor p) { profesores.add(p); }
    public void agregarCurso(Curso c) { cursos.add(c); }

    // Métodos de búsqueda
    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream()
                .filter(c -> c.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElse(null);
    }

    /** Asigna un profesor a un curso usando sus identificadores. */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // La magia de la sincronización ocurre aquí
            System.out.printf("Asignación exitosa: Profesor %s al curso %s.%n", profesor.getNombre(), curso.getNombre());
        } else {
            System.out.println("Error: No se encontró el curso o el profesor especificado.");
        }
    }
    
    /** Elimina un curso, rompiendo primero la relación con su profesor. */
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null); // Rompe la relación
            cursos.remove(curso);
            System.out.println("Curso " + codigo + " eliminado.");
        }
    }

    /** Elimina un profesor, desvinculándolo de todos sus cursos. */
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Creamos una copia de la lista de cursos para evitar errores al modificarla
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null); // Desvincula cada curso
            }
            profesores.remove(profesor);
            System.out.println("Profesor " + id + " eliminado.");
        }
    }
    
    // Métodos de listado
    public void listarProfesores() { profesores.forEach(Profesor::mostrarInfo); }
    public void listarCursos() { cursos.forEach(Curso::mostrarInfo); }
}