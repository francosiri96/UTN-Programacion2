package two;

 class Celular {
    private String imei;
    private String marca;
    private String modelo;
    // Agregación: batería puede crearse por separado
    private Bateria bateria;
    // Asociación bidireccional con Usuario
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario u){
        this.usuario = u;
        if (u != null && u.getCelular() != this) {
            u.setCelular(this);
        }
    }

    @Override
    public String toString(){
        return "Celular[" + marca + " " + modelo + ", IMEI:" + imei + ", " + bateria + "]";
    }
}

// -------------------------------
// Clase Usuario
// -------------------------------
class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // asociación bidireccional

    public Usuario(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular c){
        this.celular = c;
        if (c != null && c.getUsuario() != this) {
            c.setUsuario(this);
        }
    }

    @Override
    public String toString(){
        return "Usuario[" + nombre + ", " + dni + "]";
    }
}

// -------------------------------
// Clase Bateria
// -------------------------------
class Bateria {
    private String modelo;
    private int capacidad; // mAh

    public Bateria(String modelo, int capacidad){
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return "Bateria[" + modelo + ", " + capacidad + "mAh]";
    }
}
