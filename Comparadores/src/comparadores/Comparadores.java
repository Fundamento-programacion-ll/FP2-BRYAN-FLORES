/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

/**
 *
 * @author Bryan
 */
public class Comparadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String salida="";
        
        Pais pais=new Pais();
        
        pais.setListaProvincias();
        
        salida += "Lista de Provincias: \n"+pais.toString();
        
        System.out.println(salida);
        
        pais.ordenarPorNombreProvincia();
        salida += "Lista Provincias: \n"+pais.toString();
        System.out.println(salida);
        
    }
    
}
