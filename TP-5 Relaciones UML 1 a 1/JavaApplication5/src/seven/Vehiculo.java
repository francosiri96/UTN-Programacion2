package seven;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente = patente; this.modelo = modelo; this.motor = motor;
    }

    public Conductor getConductor(){ return conductor; }

    public void setConductor(Conductor c){
        this.conductor = c;
        if (c != null && c.getVehiculo() != this) {
            c.setVehiculo(this);
        }
    }

    @Override
    public String toString(){ return "Vehiculo[" + patente + ", " + modelo + ", " + motor + "]"; }

    public static void main(String[] args) {
        Motor m = new Motor("Nafta", "SN-M123");
        Vehiculo v = new Vehiculo("AB123CD", "Ford Fiesta", m);
        Conductor c = new Conductor("Pedro Gomez", "LIC987");
        v.setConductor(c);
        System.out.println(v);
        System.out.println("Conductor: " + v.getConductor());
        System.out.println("Vehiculo del conductor: " + c.getVehiculo());
    }
}

class Motor {
    private String tipo;
    private String numeroSerie;
    public Motor(String tipo, String numeroSerie){ this.tipo = tipo; this.numeroSerie = numeroSerie; }
    @Override
    public String toString(){ return "Motor[" + tipo + ", SN:" + numeroSerie + "]"; }
}

class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia){ this.nombre = nombre; this.licencia = licencia; }
    public Vehiculo getVehiculo(){ return vehiculo; }
    public void setVehiculo(Vehiculo v){
        this.vehiculo = v;
        if (v != null && v.getConductor() != this) v.setConductor(this);
    }
    @Override
    public String toString(){ return "Conductor[" + nombre + ", " + licencia + "]"; }
}
