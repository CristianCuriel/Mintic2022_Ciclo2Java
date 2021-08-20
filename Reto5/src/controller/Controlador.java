package controller;

//Modelos (acceso y objetos contenedores)
import model.dao.ProyectoCiudadDao;
import model.vo.ProyectoCiudad;
import model.vo.SumaProveedor;
import model.dao.LiderCiudadDao;
import model.vo.LiderCiudad;
import model.dao.SumaProveedorDao;
import view.Vista;
import java.awt.event.*;

//Librerías para bases de datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador implements ActionListener {

    private  ProyectoCiudadDao proyectoCiudadDao;
    private  LiderCiudadDao liderCiudadDao;
    private  SumaProveedorDao sumaProveedorDao;
    private  Vista vista;
    public   String data[][];
    public   String titles[];

    public Controlador(Vista vista){
        this.proyectoCiudadDao = new ProyectoCiudadDao();
        this.liderCiudadDao = new LiderCiudadDao();
        this.sumaProveedorDao = new SumaProveedorDao();
        this.vista = vista;
    }

    public void iniciar(){
        vista.frame.setTitle("RETO 5");
        vista.setLocationRelativeTo(null);
        vista.btn1.addActionListener(this);
        vista.btn2.addActionListener(this);
        vista.btn3.addActionListener(this);
        vista.m11.addActionListener(this);
        vista.m12.addActionListener(this);
        vista.m13.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt){
        try{
            if (evt.getSource() == vista.btn1 || evt.getSource() == vista.m11 ){
               // vista.msgConsult("Consulta 1");
                requerimiento1();
                vista.MiTabla2(titles, data);
            }
            if (evt.getSource() == vista.btn2 || evt.getSource() == vista.m12){
                //vista.msgConsult("Consulta 2");
                requerimiento2();
                vista.MiTabla2(titles, data);
            }
            if (evt.getSource() == vista.btn3 || evt.getSource() == vista.m13){
                //vista.msgConsult("Consulta 3");
                requerimiento3();
                vista.MiTabla2(titles, data);
            }
        }catch(Exception e){
            System.out.println(e);
            vista.msgConsult("Error.");
        }
    }

    public void requerimiento1() throws SQLException {

             ArrayList<ProyectoCiudad> rankingProyectoCiudad = proyectoCiudadDao.rankingProyectosCiudad();
             titles = new String[]{"Constructora", "Fecha Inicio", "Clasificacion"};

            // Cada VO cargado, mostrarlo en la vista
            data = new String[ rankingProyectoCiudad.size()][3];
            for (int i=0;i<rankingProyectoCiudad.size();i++) {
                    data[i][0] = rankingProyectoCiudad.get(i).getConstructora();
                    data[i][1] = rankingProyectoCiudad.get(i).getFechaInicio();
                    data[i][2] = rankingProyectoCiudad.get(i).getClasificacion();
              }


    }

    public void requerimiento2() throws SQLException {

        ArrayList<LiderCiudad> rankingLiderCiudad = liderCiudadDao.rankingLiderCiudad();
        titles = new String[]{"Nombre y Apellidos"};

       // Cada VO cargado, mostrarlo en la vista
       data = new String[rankingLiderCiudad.size()][1];
       for (int i=0;i<rankingLiderCiudad.size();i++) {
        data[i][0] = rankingLiderCiudad.get(i).getNombreLider();
       }

    }

    public void requerimiento3() throws SQLException {

        ArrayList<SumaProveedor>rankingSumaProveedor = sumaProveedorDao.rankingSumaProveedor();
        titles = new String[]{"Suma Proveedor"};

       // Cada VO cargado, mostrarlo en la vista
       data = new String[rankingSumaProveedor.size()][1];
        data[0][0] = rankingSumaProveedor.get(0).getCantidad();
       

    }
    
    
}
