package utilizando_interfaz;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    //  Declaramos una propiedad del tipo Menu (Interfaz)
    private Menu menu;

//
    public Calculadora(){
//        Le indicamos a la interfaz que implementacion debe usar.
        this.menu = new MenuDesplegable();
    }

    public void mostrarMenu(){
//        Accedemos al metodo desplegarMenu() declarado en la interfaz.
        menu.desplegarMenu();
    }

}
