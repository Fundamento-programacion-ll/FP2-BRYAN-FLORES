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
public class Deber_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta relleno=new Cuenta(0, "");
        relleno.relleno();
        
        int op = 0;
        
        while(1 == 1){
        
        String user = JOptionPane.showInputDialog(null, "Ingrese su Usuario");
        
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Cuenta"));
        
        Cuenta c=new Cuenta(cuenta, user);
        
        if(c.VerificarCuenta(cuenta, user) == true){
        
            do{
            
        op = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Cuenta # "+cuenta+"\n1. Consultar Saldo \n2.Depositar\n3. Retirar\n4. Salir", user, 1));
        
            }while (op != 4);
        }
        
        else {JOptionPane.showMessageDialog(null, "Cuenta Incorrecta", "Error", 0);}
    }
    }
}
