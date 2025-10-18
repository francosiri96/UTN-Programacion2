/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciossobreExcepciones;

/**
 *
 * @author franc
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosExcepciones {

    // --- 1. División Segura (ArithmeticException) ---
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- 1. División Segura ---");
        try {
            System.out.print("Introduce el dividendo: ");
            int num1 = scanner.nextInt();
            System.out.print("Introduce el divisor: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);
            
        } catch (ArithmeticException e) {
            // Maneja la división por cero
            System.err.println("Error: No se puede dividir por cero (ArithmeticException)."); 
        } catch (InputMismatchException e) {
            // Maneja si la entrada no es un entero
            System.err.println("Error: Introduce solo números enteros.");
            // Necesario para limpiar el buffer de entrada después del error
            scanner.next(); 
        }
    }

    // --- 2. Conversión de Cadena a Número (NumberFormatException) ---
    public static void conversionSegura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- 2. Conversión de Cadena a Número ---");
        System.out.print("Introduce un número como texto: ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto); 
            System.out.println("Número convertido exitosamente: " + numero);
        } catch (NumberFormatException e) {
            // Maneja el intento de convertir texto no válido a número
            System.err.println("Error: El texto introducido no es un número entero válido (NumberFormatException).");
        }
    }

    // --- 3. Lectura de Archivo (FileNotFoundException) ---
    public static void lecturaArchivo() {
        System.out.println("\n--- 3. Lectura de Archivo (Usando Scanner) ---");
        String rutaArchivo = "datos_ejemplo.txt"; 
        
        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);
            
            System.out.println("Contenido del archivo '" + rutaArchivo + "':");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
            
        } catch (FileNotFoundException e) {
            // Maneja si el archivo no existe
            System.err.println("Error: El archivo '" + rutaArchivo + "' no fue encontrado.");
        }
    }

    // --- 4. Excepción Personalizada (Uso y Lanzamiento) ---
    
    // El método que lanza la excepción debe declararla con 'throws'
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanza la excepción personalizada
            throw new EdadInvalidaException("La edad (" + edad + ") no es válida. Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void probarEdadInvalida() {
        System.out.println("\n--- 4. Excepción Personalizada ---");
        
        // Se maneja la excepción personalizada con 'try-catch'
        try {
            validarEdad(45);  // Caso Válido
            validarEdad(150); // Caso Inválido
        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación capturado: " + e.getMessage()); 
        }
    }

    // --- 5. Uso de try-with-resources (IOException) ---
    public static void lecturaConRecursos() {
        System.out.println("\n--- 5. Uso de try-with-resources ---");
        String rutaArchivo = "datos_ejemplo.txt"; 
        
        // El recurso (BufferedReader) se declara en el try() y se cierra automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) { 
            String linea;
            System.out.println("Lectura con try-with-resources (si el archivo existe):");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            // Si el archivo no existe
            System.err.println("Error: El archivo '" + rutaArchivo + "' no fue encontrado por try-with-resources.");
        } catch (IOException e) {
            // Maneja cualquier otro error de I/O (lectura/escritura)
            System.err.println("Error de lectura/escritura (IOException): " + e.getMessage());
        } 
    }
}