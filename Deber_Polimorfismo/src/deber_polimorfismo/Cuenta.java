/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_polimorfismo;

import com.sun.xml.internal.bind.v2.schemagen.Util;

/**
 *
 * @author Bryan
 */
public class Cuenta extends Transaccion{
    
    private int cuenta[]=new int[10];
    private String user[]=new String[10];
 
    public Cuenta(int cuenta, String user) {
        super(cuenta, user);
    }
    
    public void relleno(){
    for (int i=0; i<10; i++){
        
        this.cuenta[i]=000;
        this.user[i]="Bryan";
        
    }
    }
    
    public boolean VerificarCuenta(int cuenta, String user){

        
        boolean aprobacion = false;
        int guia=0;
        
        
        
        for (int i=0; i<10; i++){
        
            if(this.cuenta[i] == cuenta && this.user[i].equalsIgnoreCase(user))
            {guia = 1;
            
            setCuenta(this.cuenta[i]);
            setUser(this.user[i]);
            
            }
        }
        
        if (guia == 1){aprobacion = true;}
        
    return aprobacion;
    }

    @Override
    public String ejecutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
