package nine;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // unidireccional
    private Profesional profesional; // unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional){
        this.fecha = fecha; this.hora = hora; this.paciente = paciente; this.profesional = profesional;
    }

    @Override
    public String toString(){
        return "Cita[" + fecha + " " + hora + ", " + paciente + ", " + profesional + "]";
    }

    public static void main(String[] args) {
        Paciente p = new Paciente("Carlos", "OSDE");
        Profesional pr = new Profesional("Dra. Diaz", "Cardióloga");
        CitaMedica c = new CitaMedica("2025-09-25", "10:30", p, pr);
        System.out.println(c);
    }
}

class Paciente {
    private String nombre;
    private String obraSocial;
    public Paciente(String nombre, String obraSocial){ this.nombre = nombre; this.obraSocial = obraSocial; }
    @Override
    public String toString(){ return "Paciente[" + nombre + ", " + obraSocial + "]"; }
}

class Profesional {
    private String nombre;
    private String especialidad;
    public Profesional(String nombre, String especialidad){ this.nombre = nombre; this.especialidad = especialidad; }
    @Override
    public String toString(){ return "Profesional[" + nombre + ", " + especialidad + "]"; }
}
