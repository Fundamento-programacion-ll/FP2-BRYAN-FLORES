/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_figura;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Polimorfismo_Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punto punto=new Punto(25, 20);
        Circulo circulo = new Circulo(25, 20);
        
        String opcion = JOptionPane.showInputDialog(null, "Escriba en Mayúsculas una Opción:\n- PUNTO\n- CIRCULO", "MENU", 1);
        
        if(opcion.equalsIgnoreCase("Punto")){punto.Punto();}
        else if(opcion.equalsIgnoreCase("Circulo")){circulo.Circulo();}
        else {JOptionPane.showMessageDialog(null, "Opcion Ingresada Incorrecta", "ERROR", 0);}
        
        JFrame ventana=new JFrame();
        
        ventana.add(punto);
        
        ventana.setSize(700, 400);
        
        ventana.setVisible(true);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
