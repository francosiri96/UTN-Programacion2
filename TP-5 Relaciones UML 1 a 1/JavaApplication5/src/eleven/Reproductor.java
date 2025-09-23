package eleven;

public class Reproductor {
    // dependencia de uso: recibe la canción como parámetro
    public void reproducir(Cancion cancion){
        System.out.println("▶ Reproduciendo: " + cancion);
    }

    public static void main(String[] args) {
        Artista a = new Artista("Shakira", "Pop");
        Cancion c = new Cancion("Antología", a);
        Reproductor r = new Reproductor();
        r.reproducir(c);
    }
}

class Cancion {
    private String titulo;
    private Artista artista; // unidireccional
    public Cancion(String titulo, Artista artista){ this.titulo = titulo; this.artista = artista; }
    @Override
    public String toString(){ return "Cancion[" + titulo + ", " + artista + "]"; }
}

class Artista {
    private String nombre;
    private String genero;
    public Artista(String nombre, String genero){ this.nombre = nombre; this.genero = genero; }
    @Override
    public String toString(){ return "Artista[" + nombre + ", " + genero + "]"; }
}
