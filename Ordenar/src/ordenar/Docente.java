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
public class Docente extends Persona{
    
    String Area;
    String Cargo;
    


    public Docente(String Area, String Cargo, int edad, String nombre, int CI, String apellido, String genero) {
        super(edad, nombre, CI, apellido, genero);
        this.Area = Area;
        this.Cargo = Cargo;
    }

    public Docente() {
    }
    
    

    public String getArea() {
        return Area;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public void Docente(){
    
    this.Area = JOptionPane.showInputDialog(null, "Ingrese el Area de Trabajo","Docente", 1);
    this.Cargo = JOptionPane.showInputDialog(null, "Ingrese el Cargo de Trabajo","Docente", 1);
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el Nombre","Docente", 1));
        setApellido(JOptionPane.showInputDialog(null, "Ingrese el Apellido","Docente", 1));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad","Docente", 1)));
        setCI(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el # de CI","Docente", 1)));
        setGenero(JOptionPane.showInputDialog(null, "Ingrese el Genero","Docente", 1));
        
    }
    
    

    @Override
    public String toString() {
        return "Nombre: "+getNombre();
    }
    
    
}
