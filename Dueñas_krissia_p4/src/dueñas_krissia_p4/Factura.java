/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dueñas_krissia_p4;

/**
 *
 * @author user
 */
public class Factura {
    
    public String nombre,apellido;
    private double totalcompra;
    
    
    public double getTotalCompra()
            
    {
    return totalcompra;
    }
    public void setSalario(double totalCompa){
        this.totalcompra=totalcompra;
        }
    {
     public void pago(double totalCompra){
     double iva=0.13;
     if (totalcompra>500)
         totalcompra=totalcompra+(totalcompra*iva);
     else
         if (totalCompra>100) & totalCompra<=500)
     totalCompra=totalCompra+((totalCompra*iva)/2);
                 else 
                     if (totalCompra<100)
                         totalCompra=totalCompra;
                     else
                         return totalCompra;
     }
		
				
	}   
    
    
    

