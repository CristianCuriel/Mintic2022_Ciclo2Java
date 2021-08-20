package co.edu.utp.misiontic2022.c2;

/**
 * <Reto 1>!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "RETO 1: FUNCIONANDO :)" );
        Exportacion fruta = new Exportacion(12,1000,0.10);
        System.out.println(fruta.compararExportacion(12, 1000, 0.10)) ;
    }
}
