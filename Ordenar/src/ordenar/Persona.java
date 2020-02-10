/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Persona {
    
    private int edad;
    private String nombre;
    private int CI;
    private String apellido;
    private String genero;
    
    ArrayList<Persona> ListaPersona;

    public Persona(int edad, String nombre, int CI, String apellido, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.CI = CI;
        this.apellido = apellido;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCI() {
        return CI;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", CI=" + CI + ", apellido=" + apellido + ", genero=" + genero + '}';
    }
    
    public double CalcularSueldo(){
    
    return 1000;
    }

    
    public void setListaPersona(int op) {
        int opcion ;
        Persona persona;
        do {            
            persona = new Persona();
            switch (op){
                case 1: Administrativo admin=new Administrativo();
                admin.Administrativo();
                
                    Agregar(persona);
                    break;
                case 2: Docente doc=new Docente();
                doc.Docente();
                
                    Agregar(persona);
                    break;
                case 3: Limpieza limp=new Limpieza();
                limp.Limpieza();
                    Agregar(persona);
                    break;
            }
            
            opcion = JOptionPane.showConfirmDialog(null, "Mas Personas", "Continuar",JOptionPane.YES_NO_OPTION);
            
            if(opcion==JOptionPane.YES_NO_OPTION){
            
            Ordenar ord=new Ordenar();
            ord.Menu();}
            
        } while (opcion==JOptionPane.YES_NO_OPTION); 
        
    }

    public Persona(ArrayList<Persona> ListaPersonas) {
        this.ListaPersona = ListaPersonas;
    }

    public Persona() {
        
        this.ListaPersona = new ArrayList<>();
        
    }

    public void Agregar(Persona persona){
    
        this.ListaPersona.add(persona);
    
    }
    
    public void ordenarPorNombrePersona(){
    
        Collections.sort(ListaPersona, new Comparador());
    
    }
    
    
    
}
