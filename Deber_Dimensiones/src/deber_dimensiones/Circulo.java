/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_dimensiones;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Circulo {
    
    private double radio;
    
    double total;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void Circunferencia(){
    
        total = 2*Math.PI*getRadio();
        
        JOptionPane.showMessageDialog(null, "Circunferencia:\n"+total, "Resultado", 1);    
    }
    
}
