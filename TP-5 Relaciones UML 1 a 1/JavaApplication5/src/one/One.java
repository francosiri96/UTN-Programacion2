package one;

// Relación: Composición (Pasaporte -> Foto), Asociación bidireccional (Pasaporte <-> Titular)

 class Foto {
    private byte[] imagen; // placeholder
    private String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    // getters/setters
    public byte[] getImagen() { return imagen; }
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    @Override public String toString() { return "Foto[" + formato + ", " + (imagen!=null?imagen.length+" bytes":"null")+"]"; }
}

 class Titular {
    private String nombre;
    private String dni;
    // Asociación: Titular puede conocer su Pasaporte (bidireccional)
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }
    public void setPasaporte(Pasaporte p) { this.pasaporte = p; }
    public Pasaporte getPasaporte() { return pasaporte; }
    // getters/setters
    @Override public String toString() { return "Titular[" + nombre + ", " + dni + "]"; }
}

 class Pasaporte {
    private String numero;
    private String fechaEmision;
    // Composición: la Foto existe solo dentro del Pasaporte
    private final Foto foto;
    // Asociación bidireccional con Titular
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = foto;
    }
    public Foto getFoto() { return foto; } // composición: no setter público para reemplazar
    public void setTitular(Titular t) {
        this.titular = t;
        if (t != null && t.getPasaporte() != this) t.setPasaporte(this); // mantener bidireccionalidad
    }
    public Titular getTitular() { return titular; }
    // getters/setters
    @Override public String toString() { return "Pasaporte[" + numero + ", " + fechaEmision + ", " + foto + "]"; }
}
