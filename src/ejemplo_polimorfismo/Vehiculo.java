package ejemplo_polimorfismo;

public class Vehiculo {

    private String color;

    private Integer cantidadMaxPasajeros = 2;

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
    public Vehiculo(String color, Integer cantidadMaxPasajeros, Integer cantidadRuedas, String tipo) {
        this.color = color;
        this.cantidadMaxPasajeros = cantidadMaxPasajeros;
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

    public Integer getCantidadMaxPasajeros() {
        return cantidadMaxPasajeros;
    }

    public void setCantidadMaxPasajeros(Integer cantidadMaxPasajeros) {
        this.cantidadMaxPasajeros = cantidadMaxPasajeros;
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


//  El metodo toString() es heredado por todas las clases,
//  ya que esta declarado dentro de la clase Object que es la
//  clase raiz de java. Al sobreescribirlo estamos haciendo
//  poliformismo dinamico o en tiempo de ejecucion.
    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", cantidadMaxPasajeros=" + cantidadMaxPasajeros +
                ", cantidadRuedas=" + cantidadRuedas +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
