package ten;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private final ClaveSeguridad clave; // composición
    private TitularCuenta titular;      // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave){
        this.cbu = cbu; this.saldo = saldo; this.clave = clave;
    }

    public TitularCuenta getTitular(){ return titular; }

    public void setTitular(TitularCuenta t){
        this.titular = t;
        if (t != null && t.getCuenta() != this) {
            t.setCuenta(this);
        }
    }

    @Override
    public String toString(){
        return "Cuenta[" + cbu + ", saldo=" + saldo + ", clave=" + clave + "]";
    }

    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("XYZ987", "2025-09-23");
        CuentaBancaria cta = new CuentaBancaria("1234567890", 10000.0, clave);
        TitularCuenta t = new TitularCuenta("Ana", "44556677");
        cta.setTitular(t);
        System.out.println(cta);
        System.out.println("Titular: " + cta.getTitular());
    }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    public ClaveSeguridad(String codigo, String ultimaModificacion){
        this.codigo = codigo; this.ultimaModificacion = ultimaModificacion;
    }
    @Override
    public String toString(){ return "ClaveSeguridad[" + codigo + ", mod=" + ultimaModificacion + "]"; }
}

class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public TitularCuenta(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public CuentaBancaria getCuenta(){ return cuenta; }
    public void setCuenta(CuentaBancaria c){
        this.cuenta = c;
        if (c != null && c.getTitular() != this) c.setTitular(this);
    }
    @Override
    public String toString(){ return "Titular[" + nombre + ", " + dni + "]"; }
}
