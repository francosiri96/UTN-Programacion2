package twelve;

public class Calculadora {
    // dependencia de uso: procesa el impuesto
    public double calcular(Impuesto impuesto){
        double resultado = impuesto.getMonto() * 1.21; // aplica IVA ejemplo
        System.out.println("Calculando: " + impuesto + " -> total=" + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Empresa SA", "30-12345678-9");
        Impuesto i = new Impuesto(1000, c);
        Calculadora calc = new Calculadora();
        calc.calcular(i);
    }
}

class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    public Impuesto(double monto, Contribuyente contribuyente){
        this.monto = monto; this.contribuyente = contribuyente;
    }
    public double getMonto(){ return monto; }
    @Override
    public String toString(){ return "Impuesto[" + monto + ", " + contribuyente + "]"; }
}

class Contribuyente {
    private String nombre;
    private String cuil;
    public Contribuyente(String nombre, String cuil){ this.nombre = nombre; this.cuil = cuil; }
    @Override
    public String toString(){ return "Contribuyente[" + nombre + ", " + cuil + "]"; }
}
