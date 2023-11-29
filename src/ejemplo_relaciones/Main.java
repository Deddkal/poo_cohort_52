package ejemplo_relaciones;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Main {

    public static void main(String[] args) {

//      Ya que los arrays en java son estaticos
//        Lo que usamos para declarar arreglos
//        dinamicos son las collections

//        List es una lista(Collection) ordenada
//        List es una Interfaz
//        Una interfaz no se puede instanciar
//        Por eso debemos crear una instancia
//        de ArrayList usando el constructor

        List<String> lista = new ArrayList<>();

//       El metodo add pertenece a las colleciones
//       y nos permite agregar elementos
        lista.add("Martin");
        lista.add("Nico");
        lista.add("Guille");
        lista.add("Jose");

//        Utilizando List.of podemos instanciar una lista de forma rapida.
//        Esta lista es inmutable, por lo que no se pueden agregar elementos
        List<String> listaMentores = List.of("Martin", "Nico", "Guille", "Jose");

//        Al igual que el List el Set es una interfaz
//        Set = No tiene orden || No permite duplicados
//        Usaremos HashSet para inicializar el Set
        Set<String> nombreMentores = new HashSet<>();

//        Al ser una collecion comparte el metodo add
        nombreMentores.add("Martin");
        nombreMentores.add("Nico");
        nombreMentores.add("Guille");
        nombreMentores.add("Jose");
        nombreMentores.add("Martin");

//      Una colleccion nos permite imprimirla
//      por consola sin la necesidad de un bucle for
        System.out.println(nombreMentores);


//      Para utilizar metodos de orden superior
//      en una Collection debemos primero transformar
//      el tipo de dato a un Stream
        List<Integer> numeros = List.of(1,2,3,4,5);
        // Para esto usamos el metodo .stream() que
        // nos devuelve un tipo de dato Stream<>
        Stream<Integer> streamNumeros = numeros.stream();
//        Una vez que tenemos un tipo de dato Stream<>
//        Podemos usar metodos de orden superior (.map(), .filter())
        Stream<Double> streamDouble = streamNumeros.map( num -> Double.valueOf(num));
//        Luego usamos el metodo .collect() para volver
//        a trasformar el tipo de dato a un Set o un List
        Set<Double> setDoubles = streamDouble.collect(Collectors.toSet());
        System.out.println(setDoubles);

//------------------------------------------------------------------------------------------------//


//      Generamos una instancia de Biblioteca
        Biblioteca mindhub = new Biblioteca("Mindhub", 4);

//        Generamos varias instancias de Libro
        Libro libro1 = new Libro("fantasia1", "fantastico1", Estado.DISPONIBLE);
        Libro libro2 = new Libro("fantasia2", "fantastico2", Estado.DISPONIBLE);
        Libro libro3 = new Libro("fantasia3", "fantastico3", Estado.RESERVADO);
        Libro libro4 = new Libro("fantasia4", "fantastico4", Estado.VENDIDO);

//      A la biblioteca le agregamos los libros
        mindhub.addLibro(libro1);
        mindhub.addLibro(libro2);
        mindhub.addLibro(libro3);
        mindhub.addLibro(libro4);

//        Imprimimos la informacion de la biblioteca
        System.out.println(mindhub);

//        Desde libro accedemos al objeto Biblioteca
//        y desde este a la propiedad nombre.
        System.out.println(libro1.getBiblioteca().getNombre());

//       Con un metodo setter modificamos el valor de la propiedad estado
//       por otro valor declarado dentro del Enum
        libro1.setEstado(Estado.VENDIDO);


    }

}
