package ejemplo_relaciones;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private String nombre;

    private Integer cantidadEmpleados;

    //Una biblioteca puede tener muchos libros
    private Set<Libro> libros = new HashSet<>();

    public Biblioteca(String nombre, Integer cantidadEmpleados) {
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(Integer cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

//    El metodo add sirve para formar la relacion
//    Recibe el Libro como parametro (que representa el muchos)
//    Y a ese objeto Libro le setea el objeto Biblioteca (que representa el uno)
//    Ademas a la propiedad libros (collecion) le agrega el objeto Libro.
    public void addLibro(Libro libro){
        libro.setBiblioteca(this);
        this.libros.add(libro);
    }
//    this hace referencia al objeto que esta llamando al metodo

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", cantidadEmpleados=" + cantidadEmpleados +
                ", libros=" + libros +
                '}';
    }

}
