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
        
        Cuenta c=new Cuenta(1000, "Bryan");
        
        int op = 0;
        int cont = 0;
        
        c.relleno();
        
        while(1 == 1){
        
        String user = JOptionPane.showInputDialog(null, "Ingrese su Usuario");
        
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Cuenta"));
        
        c.VerificarCuenta(cuenta, user);
        
        if(c.VerificarCuenta(cuenta, user) == true){
        
            do{
            
        op = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Cuenta # "+cuenta+"\n1. Consultar Saldo \n2.Depositar\n3. Retirar\n4. Agregar Usuario\n5. Salir", user, 1));
        
        switch (op){
        
            case 1: Solicitud_Saldo ss=new Solicitud_Saldo(cuenta, user);
                    ss.ejecutar();
                break;
            case 2:
                
                double deposito = -1;
                
                while (deposito<0){
                
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Monto a Depositar", "Depósito", 1));
                
                if (deposito < 0){JOptionPane.showMessageDialog(null, "Cantidad Ingresada Incorrecta", "ERROR", 0);}
                else{Deposito d=new Deposito(deposito, cuenta, user);
                d.ejecutar();}
                }
                break;
                
            case 3:
                
                double Retiro = -1;
                
                Solicitud_Saldo saldo=new Solicitud_Saldo(cuenta, user);
                
                while (Retiro<0 || Retiro>saldo.getSaldo()){
                
                Retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Monto a Retirar", "Retiro", 1));
                
                if (Retiro < 0 || Retiro > saldo.getSaldo()){JOptionPane.showMessageDialog(null, "Cantidad Ingresada Incorrecta", "ERROR", 0);}
                else{Retiros r=new Retiros(Retiro, cuenta, user);
                r.ejecutar();}
                }
                
                break;
                
            case 4:

                cont++;
                
                    Cuenta cue=new Cuenta(cuenta, user);
                    cue.AgregarUsuario(cont);
                
                break;
                
            case 5: JOptionPane.showMessageDialog(null, "Gracias por su visita", "Saliendo...", 1);
            
            c.listar();
                break;
                
            default: JOptionPane.showMessageDialog(null, "Opción Ingresada Incorrecta", "ERROR", 0);
                break;
        
        }
        
            }while (op != 5);
        }
        
        else {JOptionPane.showMessageDialog(null, "Cuenta Incorrecta", "Error", 0);}
    }
    }
}
