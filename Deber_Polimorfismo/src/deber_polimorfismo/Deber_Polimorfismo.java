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
public class Deber_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Retiros r=new Retiros(10, 100000);
        
        System.out.println("Cuenta # "+r.ObtenCuenta());
        
        System.out.println(r.ejecutar());
        
        Deposito d=new Deposito(15, r.ObtenCuenta());
        
        System.out.println(d.ejecutar());
        
        Solicitud_Saldo ss=new Solicitud_Saldo(100, r.ObtenCuenta());
        
        System.out.println(ss.ejecutar());
        
        
    }
    
}
