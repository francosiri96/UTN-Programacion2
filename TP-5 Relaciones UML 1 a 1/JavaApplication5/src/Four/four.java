/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Four;

// Asociación bidireccional: TarjetaDeCredito <-> Cliente
// Agregación: TarjetaDeCredito -> Banco

 class Banco {
    private String nombre;
    private String cuit;
    public Banco(String nombre, String cuit){ this.nombre=nombre; this.cuit=cuit; }
    @Override public String toString(){ return "Banco[" + nombre + ", CUIT:" + cuit + "]"; }
}

 class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // bidireccional

    public Cliente(String nombre, String dni){ this.nombre=nombre; this.dni=dni; }

    public void setTarjeta(TarjetaDeCredito t){
        this.tarjeta = t;
        if (t != null && t.getCliente() != this) t.setCliente(this);
    }
    public TarjetaDeCredito getTarjeta(){ return tarjeta; }
    @Override public String toString(){ return "Cliente[" + nombre + ", " + dni + "]"; }
}

 class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco; // agregación
    private Cliente cliente; // asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }

    public void setCliente(Cliente c){
        this.cliente = c;
        if (c != null && c.getTarjeta() != this) c.setTarjeta(this);
    }
    public Cliente getCliente(){ return cliente; }
    @Override public String toString(){ return "Tarjeta[" + numero + ", Vto:" + fechaVencimiento + ", " + banco + "]"; }
}
