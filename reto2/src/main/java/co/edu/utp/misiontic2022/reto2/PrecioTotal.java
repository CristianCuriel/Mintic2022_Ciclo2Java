package co.edu.utp.misiontic2022.reto2;

public class PrecioTotal {
    //Atributos
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;

    //Constructores
    PrecioTotal(Equipaje[] equipaje){
        this.equipaje = equipaje;
    }

    //Metodos
    public void calcularTotales(){
        for(int i = 0; i<= equipaje.length - 1; i++){
            totalPrecios += equipaje[i].calcularPrecio();

            if(equipaje[i].getClass() == Bodega.class){
                totalBodega += equipaje[i].calcularPrecio();
            }else{
                totalCabina += equipaje[i].calcularPrecio();
            }
        }
    }

    public void mostrarTotales(){
        calcularTotales();
        System.out.println("Total Equipaje " + totalPrecios);
        System.out.println("Total Bodega " + totalBodega);
        System.out.println("Total Cabina " + totalCabina);

    }


}// fin de la clase Precio Total
