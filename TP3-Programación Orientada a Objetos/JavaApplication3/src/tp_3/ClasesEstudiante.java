
package tp_3;

/**
 *
 * @author franco siri
 */
public class ClasesEstudiante {

    String Nombre;
    String Apellido;
    int Curso;
    double Calificacion;       
    
    
    void mostrarInfo(){
        System.out.println(Nombre+"" + Apellido+"" + Curso +"" + Calificacion +"");
    } 
    
    void subirCalificacion(int puntos){
        if (Calificacion >0){
            Calificacion+= puntos ;
        }
    }
      
    
    void bajarCalificacion(int puntos){
    if (Calificacion >0){
            Calificacion -= puntos ;
        }
}
}
