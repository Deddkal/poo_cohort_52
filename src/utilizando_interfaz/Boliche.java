package utilizando_interfaz;

public class Boliche {

//  Declaramos una propiedad del tipo Menu (Interfaz)
    private Menu menu;

    public Boliche(){
//        Le indicamos a la interfaz que implementacion debe usar.
        menu = new MenuDesplegable();
    }

    public void mostrarMenu(){
//        Accedemos al metodo desplegarMenu() declarado en la interfaz.
        menu.desplegarMenu();
    }
}
