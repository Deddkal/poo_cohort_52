package ejemplo_polimorfismo;

public class Vehiculo {

    private String color;

    private Integer cantidadPasajeros = 2;

    private Integer cantidadRuedas = 2;

    private String tipo;
//  En esta clase tenemos dos tipos de constructores
//    Por defecto estamos dejando las propiedades con
//    valores inicializados para que si queremos crear un vehiculo del
//    tipo motocicleta podamos simplemente asignar color y tipo
//    y ya el objeto va a poseer las caracteristicas de una moto
    public Vehiculo(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }
//  En el caso de que querramos hacer otro tipo de vehiculo
//  podemos usar el constructor con todos los parametros y reasignar
//  la cantidad de pasajeros y ruedas del vehiculo
    public Vehiculo(String color, Integer cantidadPasajeros, Integer cantidadRuedas, String tipo) {
        this.color = color;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadRuedas = cantidadRuedas;
        this.tipo = tipo;
    }
//    Esto se conoce como polimorfismo estatico o sobrecarga de metodos
//    La sobrecarga de metodos es cuando dos o mas metodos con el mismo
//    nombre reciben diferentes parametros

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(Integer cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public Integer getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(Integer cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
