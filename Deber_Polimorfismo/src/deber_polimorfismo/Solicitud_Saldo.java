/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_polimorfismo;

/**
 *
 * @author Bryan
 */
public class Solicitud_Saldo extends Transaccion{
    
    double saldo = 1000;

    public Solicitud_Saldo(int cuenta, String user) {
        super(cuenta, user);
    }    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public String ejecutar() {
        
        return "Saldo: "+saldo;
    }
    
}
