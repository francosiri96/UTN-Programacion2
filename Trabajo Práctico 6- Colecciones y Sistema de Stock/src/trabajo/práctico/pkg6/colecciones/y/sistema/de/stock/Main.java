package trabajo.práctico.pkg6.colecciones.y.sistema.de.stock;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creamos una instancia del inventario
        Inventario inventario = new Inventario();

        System.out.println("--- 1. Agregando 5 productos al inventario ---");
        inventario.agregarProducto(new Producto("A001", "Laptop Pro", 2500.00, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A002", "Teclado Mecánico", 150.50, 25, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("B001", "Camisa de Lino", 80.00, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("C001", "Café Orgánico", 25.00, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("D001", "Juego de Sábanas", 120.00, 30, CategoriaProducto.HOGAR));
        System.out.println("¡Productos agregados!\n");

        System.out.println("--- 2. Listando todos los productos ---");
        inventario.listarProductos();
        System.out.println();

        System.out.println("--- 3. Buscando un producto por ID (A001) ---");
        Producto productoEncontrado = inventario.buscarProductoPorId("A001");
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInfo();
        }
        System.out.println();

        System.out.println("--- 4. Filtrando productos por categoría: ELECTRONICA ---");
        List<Producto> electronicos = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        electronicos.forEach(Producto::mostrarInfo);
        System.out.println();

        System.out.println("--- 5. Eliminando un producto por ID (B001) y listando los restantes ---");
        inventario.eliminarProducto("B001");
        System.out.println("Productos restantes:");
        inventario.listarProductos();
        System.out.println();

        System.out.println("--- 6. Actualizando el stock de un producto (A002) a 35 unidades ---");
        inventario.actualizarStock("A002", 35);
        inventario.buscarProductoPorId("A002").mostrarInfo();
        System.out.println();

        System.out.println("--- 7. Mostrando el total de stock disponible ---");
        System.out.println("Total de stock en el inventario: " + inventario.obtenerTotalStock() + " unidades.\n");

        System.out.println("--- 8. Obteniendo el producto con mayor stock ---");
        Producto conMayorStock = inventario.obtenerProductoConMayorStock();
        if (conMayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            conMayorStock.mostrarInfo();
        }
        System.out.println();

        System.out.println("--- 9. Filtrando productos con precios entre $100.00 y $200.00 ---");
        List<Producto> productosEnRango = inventario.filtrarProductosPorPrecio(100.00, 200.00);
        if (productosEnRango.isEmpty()) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        } else {
            productosEnRango.forEach(Producto::mostrarInfo);
        }
        System.out.println();


        System.out.println("--- 10. Mostrando las categorías disponibles con sus descripciones ---");
        inventario.mostrarCategoriasDisponibles();
        System.out.println();
    }
}