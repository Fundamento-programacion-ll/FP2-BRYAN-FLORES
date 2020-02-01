/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_dimensiones;

/**
 *
 * @author Bryan
 */
public class Dimensiones {
    
    private double lados;
    private double base;
    private double altura;

    public Dimensiones(double lados, double base, double altura) {
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }



    public Dimensiones() {
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    
}
