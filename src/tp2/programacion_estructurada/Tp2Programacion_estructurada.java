/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion_estructurada;

import java.util.Scanner;

/**
 *
 * @author franco siri
 */
public class Tp2Programacion_estructurada {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int fecha = scan.nextInt(); 

        if ((fecha % 4 == 0 && fecha % 100 != 0) || (fecha % 400 == 0)) {
            System.out.println("El año " + fecha + " es bisiesto");
        } else {
            System.out.println("El año " + fecha + " no es bisiesto");
        }
    }
}




 class SegundoEjercicio {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < 3; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("Este es el número mayor: " + mayor);
    }
}

class TercerEjercicio {
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.print("Ingrese su edad: ");
int edad = scan.nextInt();
if(edad <13){
    System.out.println("Usted es un niño");
} else if(edad >=13 && edad <=17){
    System.out.println("Usted es un adolescente");
} else if(edad >=18 && edad <=59){
    System.out.println("Usted es un adulto");
} else if(edad >=60){
    System.out.println("Es un anciano");
}



}
}

class CuartoEjercicio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
System.out.print("Ingrese el precio del producto ");
int producto = scan.nextInt();

  System.out.print("Ingrese la categoria del producto ");
   
String categoria = scan.next().toUpperCase();
double precioFinal = producto;

if (categoria.equals("A")) {
    precioFinal = producto - (producto * 0.10);
} else if (categoria.equals("B")) {
    precioFinal = producto - (producto * 0.15);
} else if (categoria.equals("C")) {
    precioFinal = producto - (producto * 0.20);
} else {
    System.out.println("Categoría inválida.");
}

  
System.out.println("El precio final con descuento es: " + precioFinal);
            
}}



class QuintoEjercicio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                suma += numero;
            }

        } while (numero != 0);

        System.out.println("Suma total de números pares: " + suma);
    }
}


class SectoEjercicio {
    public static void main (String []args){
        System.out.print("Ingrese un número 10 NUMEROS");
        Scanner scan = new Scanner(System.in);
        int NumeroPositivo = 0;
        int NumeroNegativo =0;
        int Cero = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scan.nextInt();

       if (numero >0){
           NumeroPositivo = NumeroPositivo + 1;
       } else if (numero <0){
           NumeroNegativo = NumeroNegativo +1;
       } else if (numero ==0){
           Cero = Cero + 1;
       }
        System.out.println("La cantidad de numeros positivos es: " + NumeroPositivo);
        System.out.println("La cantidad de numeros negativos es: " + NumeroNegativo);
        System.out.println("La cantidad de ceros es: "+ Cero);
    }
}
}


 class SeptimoEjercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                suma += nota;
            } else {
                System.out.println("La nota es errónea. Intente nuevamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("la nota es valida" + suma);
    }
}


class OctavoEjercicio {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
    double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    return precioFinal;
}
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Ingrese el precio base del producto: ");
double precioBase = scan.nextDouble();

System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
double impuesto = scan.nextDouble();

System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
double descuento = scan.nextDouble();


double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
System.out.println("El precio final del producto es: " + precioFinal);

}}


class NovenoEjercicio {
   public static double calcularCostoEnvio(double peso, String zona) {
    double costo = 0;   
    
    if (zona.equalsIgnoreCase("Nacional")) {
        costo = peso* 5;
    } else if (zona.equalsIgnoreCase("Internacional")) {
        costo = peso* 10;
    }
    
    return costo; 
}
  public static double calcularTotalCompra(double precioProducto, double costo) {
    return precioProducto + costo;
}
    
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese el peso  del producto: ");
double peso = scan.nextDouble();

scan.nextLine(); 
System.out.print("informe si la zona es internacional o nacional?");

String zona = scan.nextLine();

double costo = calcularCostoEnvio(peso,zona);

System.out.print("Cual es el precio del producto? ");
double precioProducto = scan.nextDouble();
double total = calcularTotalCompra(precioProducto, costo);

        System.out.println("El costo total es " + total);




}
}
class DecimoEjercicio {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
    int nuevoStock = 0;
     nuevoStock = stockActual - cantidadVendida + cantidadRecibida;

    return nuevoStock;
}
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el stock actual del producto: ");
    int stockActual = scan.nextInt();

    System.out.print("Ingrese la cantidad vendida: ");
    int cantidadVendida = scan.nextInt();

    System.out.print("Ingrese la cantidad recibida: ");
    int cantidadRecibida = scan.nextInt();

    int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

    System.out.println("El nuevo stock del producto es: " + nuevoStock);
}
}

class DecimoPrimerEjercicio {
    static double DESCUENTO = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO; 
        double precioFinal = precio - descuentoAplicado;       

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}

class decimoSegundoEjercicio {
    public static void main(String[] args) {
    int[] preciosOriginales = {10, 5, 4, 3, 8};
        for (int i = 0; i < preciosOriginales.length; i++) {
    System.out.println("Estos son los precios originales " + preciosOriginales[i]);
}
        System.out.println("/////////");
         preciosOriginales[2]= 30;
           for (int i = 0; i < preciosOriginales.length; i++) {
    System.out.println("Estos son los precios modificados " + preciosOriginales[i]);
}
}}


class DecimoTercerEjercicio {
    
    static double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

    
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return; 
        }

        System.out.println("Precio: $" + precios[indice]); 

        mostrarPrecios(precios, indice + 1); 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0); 

        
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0); 
    }
}