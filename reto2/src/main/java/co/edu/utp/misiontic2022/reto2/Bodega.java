package co.edu.utp.misiontic2022.reto2;

public class Bodega extends Equipaje {
    // Constantes
    private static final double CAPACIDAD = 8.0;

    // Constructores
    Bodega(double peso , double tamanio){
        super(peso, tamanio);
    }

    Bodega(double precioBase){
        super(precioBase);
    }

    Bodega(){

    }

    //Metodos 
    public double calcularPrecio(){
        double PrecioTotal = super.getPrecioBase() + (super.getPeso() * super.getTamanio()*CAPACIDAD);
        return PrecioTotal;
    }


}
