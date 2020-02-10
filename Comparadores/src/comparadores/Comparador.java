/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.Comparator;

/**
 *
 * @author Bryan
 */
public class Comparador implements Comparator<Object>{

    int CompararNombre;
    Provincias provincia1, provincia2;
    
    @Override
    public int compare(Object provincia1, Object provincia2) {
        
        this.provincia1 = (Provincias) provincia1;
        this.provincia2 = (Provincias) provincia2;
        
        CompararNombre = this.provincia1.getNombreProvincia().compareToIgnoreCase(this.provincia2.getNombreProvincia());
        
        return CompararNombre;
    }

    @Override
    public String toString() {
        return "Comparador{" + "CompararNombre=" + CompararNombre + ", provincia1=" + provincia1 + ", provincia2=" + provincia2 + '}';
    }
    
    
    
    
}
