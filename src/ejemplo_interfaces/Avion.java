package ejemplo_interfaces;

//Una misma interfaz puede ser
// implementada por varias clases
//Y cada una debe respetar el contrato
// A su vez una clase puede implementar varias interfacez
public class Avion implements Volador, Abordar{
    //Propiedades

    private Integer cantidadPasajeros;

    //Constructores


    public Avion(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //    Dependiendo de que clase este implementando
//    la interfaz sera el comportamiento del metodo
    @Override
    public void volando() {
        System.out.println("El avion esta volando");
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //  Debido a que en la interfaz el metodo esta
//  declarado que devuelve un Integer, no podemos
//  cambiar esto debemos SI o SI respetar ese contrato
    @Override
    public Integer abordarPasajeros(Integer pasajeros) {
        return this.cantidadPasajeros += pasajeros;
    }

}
