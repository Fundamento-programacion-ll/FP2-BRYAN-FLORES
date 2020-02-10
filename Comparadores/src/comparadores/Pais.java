/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Pais {
    
    ArrayList<Provincias> ListaProvincias;

    public ArrayList<Provincias> getListaProvincias() {
        return ListaProvincias;
    }

    public void setListaProvincias() {
        int opcion ;
        Provincias provincia;
        do {            
            provincia = new Provincias();
            provincia.Provincias();
            Agregar(provincia);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_OPTION);
        } while (opcion==JOptionPane.YES_NO_OPTION); 
        
    }

    public Pais(ArrayList<Provincias> ListaProvincias) {
        this.ListaProvincias = ListaProvincias;
    }

    public Pais() {
        
        this.ListaProvincias = new ArrayList<>();
        
    }

    public void Agregar(Provincias provincia){
    
        this.ListaProvincias.add(provincia);
    
    }
    
    public void ordenarPorNombreProvincia(){
    
        Collections.sort(ListaProvincias, new comparadores.Comparador());
    
    }
    
    public void ordenarPorNumeroHabitantes(){
    
        Collections.sort(ListaProvincias, new comparadores.Comparador_N_Habitates());
    
    }
    @Override
    public String toString() {
        return "Nombre: "+getListaProvincias();
    }
    
    
}
