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
public class Cuadrado extends Dimensiones{
    
    double total;

    public Cuadrado(double lados, double base, double altura) {
        super(lados, base, altura);
    }
    
    public void Area(){
    
        total = getLados()*getLados();
        
        JOptionPane.showMessageDialog(null, "Área:\n"+total, "Resultado", 1);    
    
    }
    
    public void Volumen(){
    
        total = getLados()*getLados()*getLados();
        
        JOptionPane.showMessageDialog(null, "Volúmen:\n"+total, "Resultado", 1);    
    
    }
    
    public void Perimetro(){
    
    total = getLados()*4;
    
        JOptionPane.showMessageDialog(null, "Perímetro:\n"+total, "Resultado", 1);    
    
    }
    
}
