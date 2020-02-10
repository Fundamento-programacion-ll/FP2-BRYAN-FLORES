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
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu();
        
        Persona persona = new Persona();
        
        String salida="";
        
        salida += "Lista de Personas: \n"+ persona.toString();
        
        System.out.println(salida);
        
        persona.ordenarPorNombrePersona();
        salida += "Lista Persona: \n"+persona.toString();
        System.out.println(salida);
        
    }
    
    public static void Menu(){
    
    Persona p=new Persona();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Area: \n1. Administrativa\n2. Docente\n3. Limpieza", "Menu", 1));
        
        switch (op){
        
            case 1: 
                p.setListaPersona(1);
            
                break;
            case 2:
                
                p.setListaPersona(2);
                break;
            case 3:p.setListaPersona(3);
                break;
            default: JOptionPane.showMessageDialog(null, "Opción Ingresada Incorrecta", "ERROR", 0);
                break;
        
        }
    
    }
    
}
