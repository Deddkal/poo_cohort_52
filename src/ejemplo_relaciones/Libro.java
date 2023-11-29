package ejemplo_relaciones;

public class Libro {

    private String autor;

    private String nombre;
//    La propiedad estado solamente puede
//    tener valores declarados en el enum Estado
    private Estado estado;

    //Un libro solamente puede tener una Biblioteca
    private Biblioteca biblioteca;

    public Libro(String autor, String nombre, Estado estado) {
        this.autor = autor;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
