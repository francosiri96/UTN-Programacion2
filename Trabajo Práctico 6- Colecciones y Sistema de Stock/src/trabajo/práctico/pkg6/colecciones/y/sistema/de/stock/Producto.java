
package trabajo.práctico.pkg6.colecciones.y.sistema.de.stock;

import java.util.Objects;

public class Producto {
    private final String id;      // inmutable
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id no puede ser nulo/vacío");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre no puede ser nulo/vacío");
        if (precio < 0) throw new IllegalArgumentException("precio no puede ser negativo");
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser negativa");
        if (categoria == null) throw new IllegalArgumentException("categoria no puede ser nula");
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre no puede ser nulo/vacío");
        this.nombre = nombre;
    }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("precio no puede ser negativo");
        this.precio = precio;
    }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser negativa");
        this.cantidad = cantidad;
    }
    public CategoriaProducto getCategoria() { return categoria; }
    public void setCategoria(CategoriaProducto categoria) {
        if (categoria == null) throw new IllegalArgumentException("categoria no puede ser nula");
        this.categoria = categoria;
    }

    /** Muestra la información en consola. */
    public void mostrarInfo() {
        System.out.printf("[Producto] id=%s, nombre=%s, precio=$%.2f, cantidad=%d, categoria=%s (%s)%n",
                id, nombre, precio, cantidad, categoria.name(), categoria.getDescripcion());
    }

    @Override
    public String toString() {
        return String.format("Producto{id='%s', nombre='%s', precio=%.2f, cantidad=%d, categoria=%s}",
                id, nombre, precio, cantidad, categoria.name());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return id.equals(producto.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
