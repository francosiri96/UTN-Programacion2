package eight;

public class Documento {
    private String titulo;
    private String contenido;
    private final FirmaDigital firma; // composición

    public Documento(String titulo, String contenido, FirmaDigital firma){
        this.titulo = titulo; this.contenido = contenido; this.firma = firma;
    }

    @Override
    public String toString(){
        return "Documento[" + titulo + ", firma=" + firma + "]";
    }

    public static void main(String[] args) {
        UsuarioDigital u = new UsuarioDigital("Laura", "laura@mail.com");
        FirmaDigital f = new FirmaDigital("HASH123", "2025-09-23", u);
        Documento d = new Documento("Contrato", "Contenido del contrato...", f);
        System.out.println(d);
    }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioDigital usuario; // agregación
    public FirmaDigital(String codigoHash, String fecha, UsuarioDigital usuario){
        this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario;
    }
    @Override
    public String toString(){ return "FirmaDigital[" + codigoHash + ", fecha=" + fecha + ", " + usuario + "]"; }
}

class UsuarioDigital {
    private String nombre;
    private String email;
    public UsuarioDigital(String nombre, String email){ this.nombre = nombre; this.email = email; }
    @Override
    public String toString(){ return "UsuarioDigital[" + nombre + ", " + email + "]"; }
}
