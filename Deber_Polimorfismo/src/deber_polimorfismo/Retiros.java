/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Retiros extends Transaccion{
    
    double retiro;

    public Retiros(double retiro, int cuenta, String user) {
        super(cuenta, user);
        this.retiro = retiro;
    }
    

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    
    @Override
    public void ejecutar() {
        
        JOptionPane.showMessageDialog(null, "Retiro Correcto", "Retiro", 1);
        
    }
    
}
