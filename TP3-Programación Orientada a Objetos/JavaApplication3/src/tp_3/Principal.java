

package tp_3;

public class Principal {
    public static void main(String[] args) {
        
        ClaseLibro HP = new ClaseLibro("Harry Potter", "J. K. Rowling", 1998);

        
        HP.mostrarInfo();

        
        HP.setAñoPublicacion(1800); // Debería mostrar mensaje de error

        
        HP.setAñoPublicacion(2000);

     
        HP.mostrarInfo();
        
        
        
        
        GranjaDigital galli2 = new GranjaDigital();
        galli2.setIdGallina(2001);
        galli2.setEdad(5);
        galli2.setHuevosPuestos(2);

        galli2.ponerHuevo(3);
        galli2.envejecer(2);
        galli2.mostrarEstado();

       
       
        NaveEspacial nave1 = new NaveEspacial("Andrómeda", 50);

        nave1.mostrarEstado();
        nave1.avanzar(10); // No debería alcanzar
        nave1.recargarCombustible(30);
        nave1.avanzar(10); // Ahora sí
        nave1.despegar();
        nave1.mostrarEstado();

    }
    
}
