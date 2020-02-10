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
public class Comparador_N_Habitates implements Comparator<Object>{
    
    int CompararNumero;
    Provincias provincia1, provincia2;

    @Override
    public int compare(Object pro1, Object pro2) {
        
        provincia1 = (Provincias) provincia1;
        provincia2 = (Provincias) provincia2;
        
        if(provincia1.getNumeroHabitantes() > provincia2.getNumeroHabitantes()){
        
            CompararNumero = 1;
        
        }
        
        else {
        
            CompararNumero = -1;
        
        }
        
        return CompararNumero;
    }
    
}
