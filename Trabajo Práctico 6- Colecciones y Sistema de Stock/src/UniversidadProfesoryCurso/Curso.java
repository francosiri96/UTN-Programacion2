/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesoryCurso;



public class Curso {
    private final String codigo;
    private String nombre;
    // Referencia al único profesor del curso
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso se puede crear sin profesor asignado
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    /**
     * Asigna un profesor al curso, manejando la sincronización bidireccional.
     * Este es el único método que debe usarse para cambiar la relación.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // Si el nuevo profesor es el mismo que ya teníamos, no hacemos nada.
        if (this.profesor == nuevoProfesor) {
            return;
        }

        // 1. Nos desvinculamos del profesor anterior (si existe)
        Profesor profesorAnterior = this.profesor;
        if (profesorAnterior != null) {
            profesorAnterior.eliminarCursoInterno(this);
        }

        // 2. Asignamos el nuevo profesor a este curso
        this.profesor = nuevoProfesor;

        // 3. Nos vinculamos con el nuevo profesor (si no es nulo)
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    /** Muestra la información del curso, incluyendo el nombre del profesor. */
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.printf("[Curso] Código: %s, Nombre: %s, Profesor: %s%n",
                codigo, nombre, nombreProfesor);
    }
}