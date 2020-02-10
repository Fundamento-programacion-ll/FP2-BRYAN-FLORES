/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Provincias {
    
    private String nombreProvincia;
    private int numeroHabitantes;

    public Provincias(String nombreProvincia, int numeroHabitantes) {
        this.nombreProvincia = nombreProvincia;
        this.numeroHabitantes = numeroHabitantes;
    }

    public void Provincias() {
        
        String Provincia = JOptionPane.showInputDialog(null, "Ingrese el Nombre de la Provincia y el Número de Habitantes separados por ;", "Ingreso Provincias", 1);
        
        StringTokenizer tokkens = new StringTokenizer(Provincia, ";");
        
        nombreProvincia = tokkens.nextToken();
        numeroHabitantes = Integer.parseInt(tokkens.nextToken());
        
    }

    public Provincias() {
    }
    
    

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombreProvincia()+" Habitantes: "+getNumeroHabitantes();
    }
    
    
    
}
