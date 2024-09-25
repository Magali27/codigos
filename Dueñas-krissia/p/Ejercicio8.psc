Algoritmo Ejercicio8
	Definir Usuario como Caracter;
	Definir Contrasenia como Caracter;
	Definir Ulogin como Caracter;
	Definir UPass como Caracter;
	Usuario = "Admin";
	Contrasenia = "K139N";
	Escribir "Bienvenido *** Login ***";
	Escribir "Ingrese su usario";
	Leer Ulogin;
	Escribir "Ingrse su contraseña";
	Leer UPass;
	Si (Ulogin == Usuario) Entonces
		Si (UPass == Contrasenia) Entonces
			Escribir "==== BIENVEMNIDO AL SISTEMA ====";
		SiNo
			Escribir "Su contraseña es Incorrecta";
		Fin Si
	SiNo
		Escribir "Su Usario es incorrecto";
	Fin Si
	
FinAlgoritmo
