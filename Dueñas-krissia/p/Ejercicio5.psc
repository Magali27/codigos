Algoritmo Ejercicio5
	Definir num_Hombres, num_mujeres, num_persona Como Entero;
	Definir Porc_Hombres, Porc_mujeres Como Real;
	Escribir "*==== BIENVENIDOS AL CURSO DE PYTHON ====*";
	Escribir "Introdusca el numero del Hombres en el Curso";
	Leer num_Hombres;
	Escribir "Introdusca el numero de la mujeres en el curso";
	Leer num_mujeres;
	num_persona = num_Hombres + num_mujeres;
	Porc_Hombres = (num_Hombres*100)/num_persona;
	Porc_mujeres = (num_mujeres*100)/num_persona;
	Escribir "Hombres: ", Porc_Hombres, "%, Mujeres: ", Porc_mujeres, "%";
	
FinAlgoritmo
