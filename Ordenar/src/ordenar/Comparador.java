/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.Comparator;

/**
 *
 * @author Bryan
 */
public class Comparador implements Comparator<Object>{

    int CompararNombre;
    Persona persona1, persona2;
    
    @Override
    public int compare(Object pers1, Object pers2) {
       
        persona1 = (Persona) pers1;
        persona2 = (Persona) pers2;
        
        CompararNombre = persona1.getNombre().compareToIgnoreCase(this.persona2.getNombre());
        
        return CompararNombre;
    }
    
    
    
}
