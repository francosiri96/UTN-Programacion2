package fourteen;

// Asociación unidireccional: Render -> Proyecto
// Dependencia de creación: EditorVideo.exportar(String, Proyecto) crea un Render en el método

 class Proyecto {
    private String nombre;
    private int duracionMin;
    public Proyecto(String nombre, int duracionMin){ this.nombre=nombre; this.duracionMin=duracionMin; }
    @Override public String toString(){ return "Proyecto[" + nombre + ", dur:" + duracionMin + "min]"; }
}

 class Render {
    private String formato;
    private Proyecto proyecto;
    public Render(String formato, Proyecto proyecto){ this.formato=formato; this.proyecto=proyecto; }
    @Override public String toString(){ return "Render[" + formato + ", proyecto=" + proyecto + "]"; }
}

 class EditorVideo {
    // dependencia de creación: exportar crea un Render y lo devuelve
    public Render exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto " + proyecto + " a formato " + formato + " -> " + render);
        return render; // editor no lo guarda
    }
}
