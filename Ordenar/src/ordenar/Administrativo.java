/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Administrativo extends Persona{
    
    String area;

    public Administrativo(String area, int edad, String nombre, int CI, String apellido, String genero) {
        super(edad, nombre, CI, apellido, genero);
        this.area = area;
    }
    
    public void Administrativo() {
        
        this.area = JOptionPane.showInputDialog(null, "Ingrese el Area de Trabajo","Administrativo", 1);
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el Nombre","Administrativo", 1));
        setApellido(JOptionPane.showInputDialog(null, "Ingrese el Apellido","Administrativo", 1));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad","Administrativo", 1)));
        setCI(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el # de CI","Administrativo", 1)));
        setGenero(JOptionPane.showInputDialog(null, "Ingrese el Genero","Administrativo", 1));
        
        
    }

    public Administrativo() {
    }
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    


    @Override
    public String toString() {
        return "Nombre: "+getNombre();
    }
    
    
    
}
