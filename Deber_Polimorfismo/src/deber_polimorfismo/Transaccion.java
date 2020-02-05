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
public abstract class Transaccion {
    
    private int cuenta;
    private String user;

    public Transaccion(int cuenta, String user) {
        this.cuenta = cuenta;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }



    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public int ObtenCuenta(){
    return cuenta;
    }
    
    public abstract void ejecutar();
    
    
    
}
