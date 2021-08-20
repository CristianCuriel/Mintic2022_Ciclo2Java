package co.edu.utp.misiontic2022.reto2;

public class Cabina extends Equipaje {
    //Constantes
    private final static int TIEMPO = 2;

    //Constructores
    Cabina(double peso , double tamanio){
        super(peso, tamanio);
    }

    Cabina(double precioBase){
        super(precioBase);
    }

    Cabina(){

    }

    //Metodos
    public double calcularPrecio(){
        double PrecioTotal = super.getPrecioBase() + (super.getPeso()*super.getTamanio()*TIEMPO);
        return PrecioTotal;
    }


}//FIn de la solucion
