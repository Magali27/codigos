Algoritmo Ejercicio1
	Definir Num_1,Num_2,Resultado Como Real;
	
		Escribir ("Ingresa un numero");
		Leer Num_1;
		Escribir ("Ingresa otro numero");
		Leer Num_2;
		
		Resultado= Num_1+Num_2;
		Escribir ("La Suma es: "),Resultado;
		Resultado= Num_1-Num_2;
		Escribir ("La Resta es: "),Resultado;
		Resultado= Num_1*Num_2;
		Escribir ("La Multiplicacion es: "),Resultado;
		
		Si Num_2==0 Entonces
			Escribir ("La Division no se puede realizar con 0");
		Sino
			Resultado = Num_1/Num_2;
		Escribir ("La Division es: "),Resultado;
		FinSi
	
FinAlgoritmo
