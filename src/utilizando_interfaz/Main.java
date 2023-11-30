package utilizando_interfaz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
//      Utilizamos el metodo mostrarMenu() del objeto Calculadora
//        Dentro del metodo se llama al metodo
//        desplegarMenu() de la interfaz Menu
//        La calculadora sabe que existe el metodo
//        desplegarMenu() pero no sabe exactamente como funciona
        calculadora.mostrarMenu();

        Boliche boliche = new Boliche();
//        Utilizamos el metodo mostrarMenu() del objeto Boliche
//        Dentro del metodo se llama al metodo
//        desplegarMenu() de la interfaz Menu
//        El boliche sabe que existe el metodo
//        desplegarMenu() pero no sabe exactamente como funciona
        boliche.mostrarMenu();

    }
}
