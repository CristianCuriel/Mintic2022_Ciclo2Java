package view;

//Imports
import javax.swing.*;

import java.awt.*;

public class Vista extends JFrame {

    //Declaramos los objetos de la vista
    // Creando MenuBar y agregando componentes
    public JMenuBar mb = new JMenuBar();
    public JMenu m1 = new JMenu("Consultas");
    public JMenu m2 = new JMenu("Info");
    public JMenuItem m11 = new JMenuItem("Consulta 1");
    public JMenuItem m12 = new JMenuItem("Consulta 2");
    public JMenuItem m13 = new JMenuItem("Consulta 3");
    public JMenuItem m21 = new JMenuItem("Estudiante: Cristian Curiel - Ciclo 2");
    // Creando el panel en la parte inferior
    public JPanel panel = new JPanel();
    public JButton btn1 = new JButton("Consulta 1");
    public JButton btn2 = new JButton("Consulta 2");
    public JButton btn3 = new JButton("Consulta 3");
    public JFrame frame = new JFrame();
    Color color1 = new Color(176, 0, 32);
    Color color2 = new Color(176, 137, 138);

    //Constructor
    public Vista(){
         // Creando el Marco
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 400);
         mb.add(m1);
         mb.add(m2);
         m1.add(m11);
         m1.add(m12);
         m1.add(m13);
         m2.add(m21);
         panel.add(btn1);
         panel.add(btn2);
         panel.add(btn3);

         btn1.setBackground(color1);
         btn1.setForeground(Color.WHITE);
         btn1.setFocusPainted(false);
         btn2.setBackground(color1);
         btn2.setForeground(Color.WHITE);
         btn3.setBackground(color1);
         btn3.setForeground(Color.WHITE);
         mb.setBackground(color1);
         m1.setForeground(Color.WHITE);
         m2.setForeground(Color.WHITE);
         panel.setBackground(color2);

        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);

    }

    public void MiTabla2( String titles[], String data[][]) {

        //generarDatos();
        JTable tabla = new JTable(data, titles);
        tabla.setShowHorizontalLines(false);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(true);
        tabla.setSelectionForeground(Color.white);
        tabla.setSelectionBackground(Color.gray);
        frame.getContentPane().add(new JScrollPane(tabla), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    //Mensaje
    public void msgConsult(String msg){
        JOptionPane.showMessageDialog(this,msg);
     }
}
