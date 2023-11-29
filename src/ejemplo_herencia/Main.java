package ejemplo_herencia;

import ejemplo_herencia.subclass.Gato;
import ejemplo_herencia.subclass.Perro;

public class Main {
    public static void main(String[] args) {

//        Generamos una instancia de la clase Animal
        Animal tigre = new Animal("Rayitas", 8);
//        Usamos el metodo hacerRuido de la clase base
        tigre.hacerRuido();
//        Generamos una instancia de la clase Gato
        Gato batman = new Gato("Batman", 7, "Gati");
//        Usamos el metodo sobreescrito hacerRuido
        batman.hacerRuido();
//        Generamos una instancia de la clase Perro
        Perro lucy = new Perro("Lucy", 16, "Hueso");
//        Usamos el metodo sobreescrito de hacerRuido
        lucy.hacerRuido();

    }
}