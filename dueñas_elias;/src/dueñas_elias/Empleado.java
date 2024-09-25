/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dueñas_elias;

/**
 *
 * @author user
 */
public class Empleado {
     String codigo, nombre, apellido;
    private double salario;
    double desc, porcentaje;
     
     public double getSalario()
        {
            return salario;
        }
     public void setSalario(double salario){
            this.salario=salario;
        }
     
     public double descIsss()
     {
         if (salario>=0.01 & salario<=685.71)
         desc=salario*0.3;
         else
            desc=20.57;
         return desc;
     }
     
     public double descIsss(double sal)
     {
        if (sal >= 0.01 & sal <= 685.71)
            desc = sal*0.03;
        else
             desc=20.57;  
        
        return desc; 
     }
     
     public double descIsss(double sal,double porc)
     {
          salario=sal;
          porcentaje=porc;
    
        if(porc>0)
            desc=salario*(porcentaje/100);
        else
            desc=salario*porcentaje;        
        return desc; 
     }
     
     public void mostrar()
     {
         System.out.print("\n*******************");
         System.out.print("\nCodigo: "+codigo+"\nNombre: "+nombre+"\nApellido: "+apellido+
                 "\nSalario: "+salario+"\nDescuento que recibe: "+descIsss());
         
         System.out.println("\nDescuento: "+descIsss(685.71)+" si el salario es menor"+salario+
             "\nEn caso del porcentaje es de: "+porcentaje+" el decuento seria: "+descIsss(salario,porcentaje));
     }
     
     public Empleado(){
         System.out.print("***** Calculo de descuento del ISSS *****");
     }
     
     public Empleado(String codigo, String nombre, String apellido, double salario)
     {
         this.codigo=codigo;
         this.nombre=nombre;
         this.apellido=apellido;
         this.salario=salario;}
    
}
