package thirteen;

public class GeneradorQR {
    // Dependencia de creación: genera un nuevo Código QR al vuelo
    public CodigoQR generar(String valor, UsuarioQR usuario){
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Generado: " + codigo);
        return codigo;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        UsuarioQR u = new UsuarioQR("Franco", "franco@mail.com");
        GeneradorQR generador = new GeneradorQR();
        CodigoQR qr = generador.generar("ABC123XYZ", u);

        System.out.println("QR generado: " + qr);
    }
}

// -------------------------------
// Clase CodigoQR
// -------------------------------
class CodigoQR {
    private String valor;
    private UsuarioQR usuario; // Asociación unidireccional con Usuario

    public CodigoQR(String valor, UsuarioQR usuario){
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString(){
        return "CodigoQR[" + valor + ", usuario=" + usuario + "]";
    }
}

// -------------------------------
// Clase UsuarioQR
// -------------------------------
class UsuarioQR {
    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString(){
        return "UsuarioQR[" + nombre + ", " + email + "]";
    }
}
