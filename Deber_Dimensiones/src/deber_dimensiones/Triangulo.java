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
public class Triangulo extends Dimensiones{
    
    // Area, Volumen , Perimetro
    
    private double AreaBase;

    public double getAreaBase() {
        return AreaBase;
    }

    public void setAreaBase(double AreaBase) {
        this.AreaBase = AreaBase;
    }

    public Triangulo(double AreaBase, double lados , double base, double altura) {
        super(lados, base, altura);
        this.AreaBase = AreaBase;
    }

  

    public Triangulo(double AreaBase) {
        this.AreaBase = AreaBase;
    }

    public Triangulo() {
    }
    
    
    
    public void Area(){

        Double total=(getBase()*getAltura())/2;
    
        JOptionPane.showMessageDialog(null, "Área:\n"+total, "Resultado", 1);    
    
    }
    
    public void Volumen(){
    
        double total = (AreaBase*getAltura())/3;
        
        JOptionPane.showMessageDialog(null, "Volúmen:\n"+total, "Resultado", 1);    
    }
    
    public void Perimetro(){
        JOptionPane.showMessageDialog(null, "Perímetro:\n"+getLados(), "Resultado", 1);    
    }
    
}
