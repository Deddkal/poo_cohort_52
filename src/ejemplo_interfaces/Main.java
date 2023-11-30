package ejemplo_interfaces;

public class Main {
    public static void main(String[] args) {


        Avion avion = new Avion(0);
//        Utilizamos el metodo declarado en la interfaz
        avion.abordarPasajeros(15);

        System.out.println(avion.getCantidadPasajeros());
//        Utilizamos el metodo declarado en la interfaz
        avion.volando();

        Pajaro pajaro = new Pajaro();
//        Utilizamos el metodo declarado en la interfaz
        pajaro.volando();

//        El comportamiento de cada metodo dependera
//        de la clase que lo implemente

    }


}
