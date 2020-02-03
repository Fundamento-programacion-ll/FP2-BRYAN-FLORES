/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_empleado;

/**
 *
 * @author Bryan
 */
public class Herencia_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EmpleadAsalariado ea=new EmpleadAsalariado(15.5, "Bryan", "Flores", 1724440092);
        
        System.out.println(ea);
        
        Empleado_por_Comisión ec=new Empleado_por_Comisión(100, -1, "Bryan", "Flores", 1724440092);
        
        System.out.println(ec);
        
        Empleado_por_Horas eh = new Empleado_por_Horas(10, 100, "Bryan", "Flores", 1724440092);
        
        System.out.println(eh);
        
        EmpleadoBaseMasComision ebc=new EmpleadoBaseMasComision(10, 10, 10, "Bryan", "Flores", 1724440092);
        
        System.out.println(ebc);
                
    }
    
}
