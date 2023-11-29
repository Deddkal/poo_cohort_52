package ejemplo_herencia.subclass;

import ejemplo_herencia.Animal;

//Clase hija o subclass
//Hereda todas las propiedades y metodos de la clase padre
//Puede modificar el comportamiento de los metodos heredados
//Puede poseer propiedades y metodos propios
public class Perro extends Animal {

    private String jugueteFav;

    public Perro(String nombre, Integer edad, String jugueteFav) {
        super(nombre, edad);
        this.jugueteFav = jugueteFav;
    }

    public String getJugueteFav() {
        return jugueteFav;
    }

    public void setJugueteFav(String jugueteFav) {
        this.jugueteFav = jugueteFav;
    }

//    Metodo heredado de la clase padre y sobreescrito en la clase hija
//    La anotacion Override le indica al compilador que este metodo esta sobreescrito
    @Override
    public void hacerRuido() {
        System.out.println("El perro ladra");
    }
}
