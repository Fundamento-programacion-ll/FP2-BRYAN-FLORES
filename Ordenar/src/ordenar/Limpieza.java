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
public class Limpieza extends Persona{
    
    String turno;

    public Limpieza(String turno, int edad, String nombre, int CI, String apellido, String genero) {
        super(edad, nombre, CI, apellido, genero);
        this.turno = turno;
    }

    public Limpieza() {
    }
    
    

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void Limpieza(){
    
    this.turno = JOptionPane.showInputDialog(null, "Ingrese el Turno de Trabajo","Limpieza", 1);
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el Nombre","Limpieza", 1));
        setApellido(JOptionPane.showInputDialog(null, "Ingrese el Apellido","Limpieza", 1));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Edad","Limpieza", 1)));
        setCI(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el # de CI","Limpieza", 1)));
        setGenero(JOptionPane.showInputDialog(null, "Ingrese el Genero","Limpieza", 1));
    
    }
    
 

    @Override
    public String toString() {
        return "Nombre: "+getNombre();
    }
    
    
    
}
