
import two.Bateria;


public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Li-Ion", 4000);
        Celular celular = new Celular("123456789", "Samsung", "Galaxy S21", bateria);
        Usuario usuario = new Usuario("Juan Pérez", "98765432");

        celular.setUsuario(usuario);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Celular: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
        System.out.println("Batería: " + usuario.getCelular().getBateria().getModelo() + " - " + usuario.getCelular().getBateria().getCapacidad() + "mAh");
    }
}
