package ejemplo_herencia.subclass;

import ejemplo_herencia.Animal;


//Clase hija o subclass
//Hereda todas las propiedades y metodos de la clase padre
//Puede modificar el comportamiento de los metodos heredados
//Puede poseer propiedades y metodos propios
public class Gato extends Animal {

    private String comidaPreferida;

    public Gato(String nombre, Integer edad, String comidaPreferida) {
        super(nombre, edad);
        this.comidaPreferida = comidaPreferida;
    }

    public String getComidaPreferida() {
        return comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }

//    Metodo heredado de la clase padre y sobreescrito en la clase hija
//    La anotacion Override le indica al compilador que este metodo esta sobreescrito
    @Override
    public void hacerRuido(){
        System.out.println("El gato maulla");
    }
}
