package Five;

public class Computadora {
    private  String marca;
    private String numeroSerie;
    private final PlacaMadre placa; // composición
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placa){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
    }

    public PlacaMadre getPlaca() { return placa; }
    public Propietario getPropietario() { return propietario; }

    public void setPropietario(Propietario p){
        this.propietario = p;
        if (p != null && p.getComputadora() != this) {
            p.setComputadora(this);
        }
    }

    @Override
    public String toString(){
        return "Computadora[" + marca + " SN:" + numeroSerie + ", " + placa + "]";
    }

    public static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ASUS-Prime", "Z490");
        Computadora pc = new Computadora("Armada", "SN12345", placa);
        Propietario p = new Propietario("María Perez", "12345678");
        pc.setPropietario(p);
        System.out.println(pc);
        System.out.println("Propietario: " + pc.getPropietario());
        System.out.println("PC del propietario: " + p.getComputadora());
    }
}

class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni){
        this.nombre = nombre; this.dni = dni;
    }

    public Computadora getComputadora(){ return computadora; }

    public void setComputadora(Computadora c){
        this.computadora = c;
        if (c != null && c.getPropietario() != this) {
            c.setPropietario(this);
        }
    }

    @Override
    public String toString(){ return "Propietario[" + nombre + ", " + dni + "]"; }
}

class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset){
        this.modelo = modelo; this.chipset = chipset;
    }

    @Override
    public String toString(){ return "PlacaMadre[" + modelo + ", " + chipset + "]"; }
}
