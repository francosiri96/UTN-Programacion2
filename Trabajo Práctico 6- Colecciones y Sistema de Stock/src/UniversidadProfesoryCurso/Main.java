/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesoryCurso;


public class Main {
    public static void main(String[] args) {
        System.out.println("### INICIO EJERCICIO 3: UNIVERSIDAD, PROFESOR Y CURSO ###\n");
        
        Universidad miUniversidad = new Universidad("Universidad Nacional de Programación");

        // 1 & 2. Crear y agregar 3 profesores y 5 cursos
        System.out.println("--- 1 & 2. Creando y agregando profesores y cursos ---");
        Profesor p1 = new Profesor("P001", "Ana Torres", "Inteligencia Artificial");
        Profesor p2 = new Profesor("P002", "Carlos Ruiz", "Desarrollo Web");
        Profesor p3 = new Profesor("P003", "Laura Gómez", "Bases de Datos");
        miUniversidad.agregarProfesor(p1);
        miUniversidad.agregarProfesor(p2);
        miUniversidad.agregarProfesor(p3);

        Curso c1 = new Curso("C01", "Introducción a la IA");
        Curso c2 = new Curso("C02", "Frontend con React");
        Curso c3 = new Curso("C03", "Backend con Node.js");
        Curso c4 = new Curso("C04", "SQL Avanzado");
        Curso c5 = new Curso("C05", "Machine Learning");
        miUniversidad.agregarCurso(c1);
        miUniversidad.agregarCurso(c2);
        miUniversidad.agregarCurso(c3);
        miUniversidad.agregarCurso(c4);
        miUniversidad.agregarCurso(c5);
        System.out.println("Entidades creadas.\n");

        // 3. Asignar profesores a cursos
        System.out.println("--- 3. Asignando profesores a cursos ---");
        miUniversidad.asignarProfesorACurso("C01", "P001"); // Ana -> IA
        miUniversidad.asignarProfesorACurso("C05", "P001"); // Ana -> Machine Learning
        miUniversidad.asignarProfesorACurso("C02", "P002"); // Carlos -> React
        miUniversidad.asignarProfesorACurso("C03", "P002"); // Carlos -> Node.js
        miUniversidad.asignarProfesorACurso("C04", "P003"); // Laura -> SQL
        System.out.println();

        // 4. Listar para verificar la asignación inicial
        System.out.println("--- 4. Verificación de asignaciones ---");
        System.out.println(">> Listado de Cursos:");
        miUniversidad.listarCursos();
        System.out.println("\n>> Listado de Profesores y sus cursos:");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();
        System.out.println();

        // 5. Cambiar el profesor de un curso
        System.out.println("--- 5. Cambiando profesor del curso 'SQL Avanzado' a 'Ana Torres' ---");
        miUniversidad.asignarProfesorACurso("C04", "P001");
        System.out.println("\n>> Verificación después del cambio:");
        p1.listarCursos(); // Ahora debería tener 3 cursos
        p3.listarCursos(); // Ahora debería tener 0 cursos
        System.out.println();

        // 6. Remover un curso
        System.out.println("--- 6. Eliminando el curso 'Frontend con React' (C02) ---");
        miUniversidad.eliminarCurso("C02");
        System.out.println("\n>> Verificación después de eliminar curso:");
        p2.listarCursos(); // Carlos ahora solo debe tener 1 curso
        System.out.println();

        // 7. Remover un profesor
        System.out.println("--- 7. Eliminando al profesor 'Ana Torres' (P001) ---");
        miUniversidad.eliminarProfesor("P001");
        System.out.println("\n>> Verificación después de eliminar profesor (cursos deben quedar sin asignar):");
        miUniversidad.listarCursos();
        System.out.println();
        
        // 8. Reporte: cantidad de cursos por profesor
        System.out.println("--- 8. Reporte: Cantidad de cursos por profesor restante ---");
        miUniversidad.listarProfesores(); // Muestra la info, que incluye la cantidad de cursos

        System.out.println("\n### FIN EJERCICIO 3 ###");
    }
}