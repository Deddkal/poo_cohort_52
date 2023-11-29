package ejemplo_encapsulamiento;

// Cuando declaramos propiedades y metodos dentro de una clase
// estamos encapsulando estas mismas dentro de un objeto que
// sera la instancia producida por esta clase
public class Venta {

//    Cuando usamos la palabra reservada static
//    estamos sacando esta propiedad del objeto que instanciemos con esta clase
    private static int cont;

//    Por convencion y buenas practicas todas
//    las propiedades de una clase deben estar con el
//    modificar de acceso private con esto logramos que
//    dichas propiedades no sean accedidas desde fuera del objeto
    private Double monto;

    private String desc;

    public Venta(Double monto, String desc) {
        cont++;
        this.monto = monto;
        this.desc = desc;
    }

//    Al usar la palabra reservada static en un
//    metodo estamos indicando que este metodo no
//    pertenece al objeto que instanciemos, sino a la clase en si
    public static int getCont() {
        return cont;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

//    Al usar la palabra reservada static en un
//    metodo estamos indicando que este metodo no
//    pertenece al objeto que instanciemos, sino a la clase en si
    public static void ventasDelDia(){
        System.out.println("El dia de hoy hubo " + cont + " ventas.");
    }
}
