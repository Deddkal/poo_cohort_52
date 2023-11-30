package utilizando_interfaz;


// Indicamos que la clase esta va a implementar
// los metodos declarados en Menu
public class MenuDesplegable implements Menu{

//    Sobreescribimos el metodo que se
//    encuentra declarado en la interfaz
//    No podemos cambiar su retorno, su nombre ni los parametros que recibe
    @Override
    public void desplegarMenu() {
        System.out.println(
                        "1. Opcion 1 \n" +
                        "2. Opcion 2 \n" +
                        "3. Opcion 3");
    }
}
