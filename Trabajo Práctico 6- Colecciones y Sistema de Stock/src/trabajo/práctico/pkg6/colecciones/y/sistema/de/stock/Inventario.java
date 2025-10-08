
package trabajo.práctico.pkg6.colecciones.y.sistema.de.stock;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Inventario {

    
    private final List<Producto> productos = new ArrayList<>();

    /** Agrega un producto validando null y id único. */
    public void agregarProducto(Producto p) {
        if (p == null) {
            throw new IllegalArgumentException("producto no puede ser null");
        }
        if (buscarProductoPorId(p.getId()) != null) {
            throw new IllegalArgumentException("Ya existe un producto con id=" + p.getId());
        }
        productos.add(p);
    }

    /** Lista todos los productos mostrando su información. */
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    /** Busca un producto por id (retorna null si no existe). */
    public Producto buscarProductoPorId(String id) {
        if (id == null) return null;
        for (Producto p : productos) {
            if (id.equalsIgnoreCase(p.getId())) {
                return p;
            }
        }
        return null;
    }

    /** Elimina un producto por id. Si no existe, muestra un aviso y no hace nada. */
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            System.out.println("No existe producto con id=" + id);
            return;
        }
        productos.remove(p);
    }

    /** Actualiza el stock (cantidad) de un producto existente. */
    public void actualizarStock(String id, int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            throw new IllegalArgumentException("nuevaCantidad no puede ser negativa");
        }
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            System.out.println("No existe producto con id=" + id);
            return;
        }
        p.setCantidad(nuevaCantidad);
    }

    /** Filtra productos por categoría y devuelve una nueva lista. */
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        Objects.requireNonNull(categoria, "categoria no puede ser null");
        return productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    /** Devuelve el total de unidades en stock (suma de cantidades). */
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    /** Retorna el producto con mayor stock, o null si el inventario está vacío. */
    public Producto obtenerProductoConMayorStock() {
        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }

    /** Filtra productos cuyo precio está en el rango [min, max]. */
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        if (min > max) {
            throw new IllegalArgumentException("min no puede ser mayor que max");
        }
        return productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .collect(Collectors.toList());
    }

    /** Muestra las categorías disponibles con sus descripciones. */
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.printf("- %s: %s%n", c.name(), c.getDescripcion());
        }
    }
}