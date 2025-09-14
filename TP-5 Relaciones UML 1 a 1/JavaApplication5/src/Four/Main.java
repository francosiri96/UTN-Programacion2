package Four;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/27", banco);
        Cliente cliente = new Cliente("María López", "11223344");

        tarjeta.setCliente(cliente);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco: " + cliente.getTarjeta().getBanco().getNombre());
    }
}
