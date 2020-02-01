/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_dimensiones;

import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Deber_Dimensiones{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Triángulo \n2. Cuadrado \n3. Círculo"));
        
        switch (op) {
                
                case 1: 
                    
                    int opT = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Área \n2. Volúmen \n3. Perímetro"));
                    
                    switch (opT){
                    
                        case 1: 
                            
                            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base"));
                            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));

                            Triangulo triA=new Triangulo(0, 0, base, altura);
                            
                            triA.Area();
                            
                            break;
                        case 2:
                            
                            double Abase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Área de la Base"));
                            double alturaVolumen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));

                            Triangulo triVol=new Triangulo(Abase, 0, 0, alturaVolumen);
                            
                            triVol.Volumen();
                            
                            break;
                        case 3:
                            
                            double Lados[]=new double[3];
                                
                            for (int i=0; i<3; i++){
   
                            Lados[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" lado del Triángulo"));

                            }
                            
                            Double Perimetro= Lados[0]+Lados[1]+Lados[2];
                            
                            Triangulo triPer=new Triangulo(0, Perimetro, 0, 0);
                            
                            triPer.Perimetro();
                            
                            break;
                            default: JOptionPane.showMessageDialog(null, "Opción Ingresada Incorecta", "ERROR", 0);
                            break;
                    
                    }
                    
                    break;
                    
                case 2:
                    
                    int opCuadrado = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Área \n2. Volúmen \n3. Perímetro"));
                    
                    switch (opCuadrado){
                    
                        case 1: 
                            
                            double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un lado"));

                            Cuadrado AreaC=new Cuadrado(lado, 0, 0);
                            
                            AreaC.Area();
                            
                            break;
                        case 2:
                            
                            double ladoV = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un lado"));

                            Cuadrado VolC=new Cuadrado(ladoV, 0, 0);
                            
                            VolC.Volumen();
                            
                            break;
                        case 3:
                            
                            double ladoP = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un lado"));

                            Cuadrado PerC=new Cuadrado(ladoP, 0, 0);
                            
                            PerC.Perimetro();
                            
                            break;
                            default: JOptionPane.showMessageDialog(null, "Opción Ingresada Incorecta", "ERROR", 0);
                            break;
                    
                    }
                    break;
                    
                case 3:
                    
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
                    
                    Circulo circunferencia=new Circulo(radio);
                    
                    circunferencia.Circunferencia();
                    
                    break;
                    
                    default: JOptionPane.showMessageDialog(null, "Opción Ingresada Incorecta", "ERROR", 0);
                    break;
        }
    }
    
}
