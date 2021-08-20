package co.edu.utp.misiontic2022.reto2;

public class Equipaje {
    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;

    // Atributos
    private double  peso;
    private double tamanio;
    private double precioBase;

    // Constructores
    Equipaje(double peso , double tamanio){
        this.tamanio = tamanio;
        this.peso = peso;
        this.precioBase = PRECIO_BASE;
    }

    Equipaje(double precioBase){
        this.precioBase = precioBase;
        this.tamanio = TAMANIO;
        this.peso = PESO;
    }

    Equipaje(){
        this.precioBase = PRECIO_BASE;
        this.tamanio = TAMANIO;
        this.peso = PESO;
    }

    // Metodos
    public double calcularPrecio(){   
        return 0.0;
    }

    // Metodos getter
    public double getPeso(){
        return peso;
    }

    public double getTamanio(){
        return tamanio;
    }

    public double getPrecioBase(){
        return precioBase;
    }

}
