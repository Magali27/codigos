/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dueñas_elias;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Dueñas_elias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         double salario, porc, sal;
        String codigo, nombre, apellido;
       
        Empleado e1=new Empleado();
        Empleado e2=new Empleado("Em01","Maria","Portillo",154.23);
        
        System.out.println("\nIngrese su codigo");
        codigo=leer.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese su apellido");
        apellido=leer.nextLine();
        System.out.println("Ingrese su salario");
        salario=leer.nextDouble();
        
      //  e1.Empleado(codigo, nombre, apellido, salario);
        
        System.out.println("Ingrese el porcentaje personalizado %");
        porc=leer.nextDouble();
        
        e1.descIsss(salario);
        e1.descIsss(salario,porc);
        
       //em.Empleado();
        e1.mostrar();
        e1.descIsss();
        e1.descIsss(salario,porc);
        e2.mostrar();
        e2.descIsss();
        e2.descIsss(salario,porc);
        // TODO code application logic here
    }
    
}
