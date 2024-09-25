import java.util.Scanner;
class Numeros

{
	public int num1,num2;
	
	//(ModAcceso) (Num1) ()(Num2) (){}
    public Numeros(){
		System.out.println("\n========= VARIABLES NUMERICAS =========");
	}
	public void captura(){
		Scanner leer=new Scanner(System.in);
		System.out.print("\nIngrese un numero en num1:");
		num1=leer.nextInt();
		System.out.print("Ingrese un numero en num2:");
	    num2=leer.nextInt();
	}
	public void mostrardivicion()
	{
		double divicion=0.0;
		if (numero>0){
	divicion=num1/num2;
		}
		System.out.println();
	}	
}
