import view.Vista;
import controller.Controlador;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Vista vista = new Vista();
        //Modelo modelo = new Modelo();

        Controlador controlador = new Controlador(vista);
        controlador.iniciar();
    }
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        