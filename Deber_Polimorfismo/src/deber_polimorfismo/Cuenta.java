/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_polimorfismo;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Cuenta extends Transaccion{
    
     ArrayList listaCuenta=new ArrayList();
     ArrayList listaUser=new ArrayList();
    
    
    
 
    public Cuenta(int cuenta, String user) {
        super(cuenta, user);
    }
    
    public void relleno(){
    
    listaCuenta.add(1000);
    listaUser.add("Bryan");
        
    }
    
    public boolean VerificarCuenta(int cuenta, String user){
       
        boolean aprobacion = false;
        int guia=0;
        
        System.out.println(listaCuenta.get(guia));
        System.out.println(listaUser.get(guia));
        
        
        
        for (int i=0; i<listaCuenta.size(); i++){
            
            int acc = Integer.parseInt(listaCuenta.get(i).toString())*1;
            String us = listaUser.get(i) + "";
            
            if( acc == cuenta && us.equals(user)){
            guia = 1;
            
                setCuenta(cuenta);
                setUser(user);
            
            }
        }
        
        if (guia == 1){aprobacion = true;}
        
    return aprobacion;
    }

    @Override
    public void ejecutar() {
        
    }
    
    public void AgregarUsuario(){
        
        String usuario = JOptionPane.showInputDialog(null, "Ingrese el nuevo usuario", "Ingreso de Usuario", 1);
        int Cuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cuenta del Usuario: "+usuario, "Ingreso de Cuenta", 1));
    
        listaUser.add(usuario);
        listaCuenta.add(Cuenta);
        
        JOptionPane.showMessageDialog(null, "Usuario Agregado", "Agregar Usuario", 1);
        }
        
    public void listar(){
    
    for (int i=0; i<listaCuenta.size(); i++){
            
            System.out.println(listaCuenta.get(i));
        System.out.println(listaUser.get(i));
            
            }
    }
    
    }

    

