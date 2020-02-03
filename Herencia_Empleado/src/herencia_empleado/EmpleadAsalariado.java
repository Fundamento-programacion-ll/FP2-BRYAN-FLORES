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
public class EmpleadAsalariado extends Empleado{
    
    double SalarioSemanal;

    public EmpleadAsalariado(double SalarioSemanal, String nombre, String apellido, int ci) {
        super(nombre, apellido, ci);
        this.SalarioSemanal = SalarioSemanal;
    }

    public EmpleadAsalariado(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }

    public double getSalarioSemanal() {
        return SalarioSemanal;
    }

    public void setSalarioSemanal(double SalarioSemanal) {
        this.SalarioSemanal = SalarioSemanal;
    }




    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" Apellido: "+getApellido()+" CI: "+getCi()+" Salario Semanal: "+Calcular_Ingresos();
    }

    @Override
    public double Calcular_Ingresos() {
        
        if (SalarioSemanal < 0)  {this.SalarioSemanal = 0;}
        
        return (this.SalarioSemanal * 4);
    }
    
    
    
}
