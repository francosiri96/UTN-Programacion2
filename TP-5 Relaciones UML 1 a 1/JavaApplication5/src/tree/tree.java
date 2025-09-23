package tree;

// Asociación unidireccional: Libro -> Autor
// Agregación: Libro -> Editorial

 class Autor {
    private String nombre;
    private String nacionalidad;
    public Autor(String nombre, String nacionalidad){ this.nombre=nombre; this.nacionalidad=nacionalidad; }
    // getters/setters
    @Override public String toString(){ return "Autor[" + nombre + ", " + nacionalidad + "]"; }
}

 class Editorial {
    private String nombre;
    private String direccion;
    public Editorial(String nombre, String direccion){ this.nombre=nombre; this.direccion=direccion; }
    // getters/setters
    @Override public String toString(){ return "Editorial[" + nombre + ", " + direccion + "]"; }
}

 class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // unidireccional
    private Editorial editorial; // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
    // getters/setters
    @Override public String toString(){ return "Libro[" + titulo + ", ISBN:" + isbn + ", " + autor + ", " + editorial + "]"; }
}
