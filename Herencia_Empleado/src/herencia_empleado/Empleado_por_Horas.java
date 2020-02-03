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
public class Empleado_por_Horas extends Empleado{
    
    double sueldo;
    double horas;

    public Empleado_por_Horas(double sueldo, double horas, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public Empleado_por_Horas(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }


    @Override
    public double Calcular_Ingresos() {
        
        
        if(sueldo < 0){this.sueldo=0;}
        
        if(horas < 0 || horas > 168){this.horas=0;}
        
        return (this.horas * this.sueldo);
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Apellido "+getApellido()+" CI: "+getCi()+" Salario Total: "+Calcular_Ingresos();
    }
    
    
    
    
    
}
