package co.edu.utp.misiontic2022.c2;

public class Exportacion {

    //Atributos
    private int pTiempo = 0;
    private Double pCapital = 0.0;
    private Double pInteres = 0.0;

    //CONSTRUCTOR
        public  Exportacion(int pTiempo, double pCapital, double pInteres){
            this.pCapital = pCapital;
            this.pInteres = pInteres;
            this.pTiempo = pTiempo;
        }// fin del constructor

        public Exportacion(){
            
        }


    //METODOS

    public double calcularInteresCompuesto(){
        double inteCompuesto = pCapital*(Math.pow( (1+pInteres) , pTiempo)  - 1);
        return inteCompuesto;
    }

    public double calcularInteresSimple(){
        double inteSimple = pCapital*pInteres*pTiempo;
        return inteSimple;
    }

    public String compararExportacion(int pTiempo, double pCapital, double pInteres){
        this.pCapital = pCapital;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;

        double respuesta = calcularInteresCompuesto() - calcularInteresSimple();

        if (respuesta>0){
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta;
        }else{
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        
    }

    
}// fin del metodo compararExportacion()
