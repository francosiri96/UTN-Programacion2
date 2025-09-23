package six;

public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente; // unidireccional
    private Mesa mesa; // agregación

    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa){
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }

    @Override
    public String toString(){
        return "Reserva[" + fecha + " " + hora + ", " + cliente + ", " + mesa + "]";
    }

    public static void main(String[] args) {
        ClienteReserva c = new ClienteReserva("Juan Lopez", "221-1234567");
        Mesa m = new Mesa(5, 4);
        Reserva r = new Reserva("2025-09-23", "21:00", c, m);
        System.out.println(r);
    }
}

class ClienteReserva {
    private String nombre;
    private String telefono;
    public ClienteReserva(String nombre, String telefono){ this.nombre = nombre; this.telefono = telefono; }
    @Override
    public String toString(){ return "Cliente[" + nombre + ", " + telefono + "]"; }
}

class Mesa {
    private int numero;
    private int capacidad;
    public Mesa(int numero, int capacidad){ this.numero = numero; this.capacidad = capacidad; }
    @Override
    public String toString(){ return "Mesa[" + numero + ", cap:" + capacidad + "]"; }
}
