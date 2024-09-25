import java.util.Scanner;
class Restaurante{
	public String tipo_pago ;
	public int cantidad,tipo_hamburguesa;
	public double total_pagar, precio, pagar,monto;
   //(ModAcceso)
   public void Restaurante(int tipo_hamburguesa,String tipo_pago, String cantidad ){
		mostrarDatos();
	}
	public void setCaptura(){
		Scanner leer=new Scanner(System.in);
		System.out.print("\nIngrese el tipo de hamburguesa:"+"\n1 = Sencillas"+"\n2 = Dobles"+"\n3 = Triples");
		this.tipo_hamburguesa=leer.nextInt();
		System.out.print("Ingrese el tipo de pago:");
		this.tipo_pago=leer.nextLine();
		System.out.print("Ingrese la cantidad:");
		this.cantidad=leer.nextInt();
		
		switch(tipo_hamburguesa)
		{
			case 1: precio = 10.0;
		break;
			case 2: precio = 15.0;
		break;
			case 3: precio = 20.0;
		break;
		
		
	}
	
	
	private void calcular(){
		
		
		total_pagar= precio*cantidad;
		
		if(tipo_pago.equals("tarjeta"))
		{
			monto=total_pagar*0.05;
			pagar=total_pagar+monto;
		}else{
			monto=0.00;
			pagar=total_pagar;
		}
		
		System.out.println("\nMonto por pago de tarjeta: $"+monto+"\nTotal a pagar: $"+pagar);
		
	}
	
	public void mostrarDatos(){
		System.out.print("\nhamburguesa:"+tipo_hamburguesa+"\nPrecio: $"+precio+"\nCantidad a llevar: "+cantidad+"\Tipo de pago: "+tipo_pago+
		calcular());
	}
	
	
	
	
	
	
	