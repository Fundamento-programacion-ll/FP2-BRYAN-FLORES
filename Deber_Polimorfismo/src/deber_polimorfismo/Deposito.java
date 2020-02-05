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
public class Deposito extends Transaccion{
    
    double Deposito;

    public Deposito(double Deposito, int cuenta, String user) {
        super(cuenta, user);
        this.Deposito = Deposito;
    }



    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double Deposito) {
        this.Deposito = Deposito;
    }
    
    @Override
    public void ejecutar() {
    JOptionPane.showMessageDialog(null, "Monto Ingresado", "Depósito", 1);
    }
    
}
