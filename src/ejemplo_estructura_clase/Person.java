package ejemplo_estructura_clase;


// Plantilla o molde para fabricar objetos
// que comparten la misma estructura (Metodos y comportamientos)
public class Person {

//    Propiedades | Atributos | Caracteristicas
//    Estas siempre deben tener modificar de acceso private

    private String nombre;

    private String apellido;

//    Constructores
//    Un constructor es el metodo que nos
//    permite generar una instancia de una clase

    public Person(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

//  Metodos accesores nos permiten acceder o modificar propiedades

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

//    Metodos propios de la clase

    public void saludar(){
        System.out.println(nombre + " esta saludando.");
    }
}
