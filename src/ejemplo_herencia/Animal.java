package ejemplo_herencia;

// Clase base o clase superclass
//Es usada para determinar propiedades o metodos que
// todas las clases hijas van a tener en comun
public class Animal {
    protected String nombre;

    protected Integer edad;

    public Animal() {
    }

    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void hacerRuido(){
        System.out.println("El animal hace ruido");
    }
}
