import java.util.Scanner;


public class Ejercicio3parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creamos un scanner
		Scanner s = new Scanner(System.in);
		//creamos S.O.P y pedimos que ingresen los puntuajes del juego
		System.out.println("A continuacion ingrese sus puntajes del juego");
		System.out.println("Ingrese puntaje 1: ");
		// creamos una variable tipo entero y le asignamos el valor ingresado
		int n1 = s.nextInt();
		System.out.print("Ingrese puntaje 2: ");
		// hacemos lo mismo dos veces mas
		int n2 = s.nextInt();
		System.out.print("Ingrese puntaje 3: ");
		int n3 = s.nextInt();
		//creamos una variable para el promedio
		int Promedio;
		//hacemos la formula para el promedio 
		Promedio= (n1+n2+n3)/3;

		// con un if asignamos loq eu va imprimir en la pantalla el programa
		// segun la puntuacion sacada
		if (Promedio>=1000)
			System.out.print("Excelente ");
		else if (Promedio>=700)
			System.out.print("Bueno ");
		else if (Promedio>=500)
			System.out.print("Suficiente ");
		else 
			System.out.print("Has Perdido ");
		
	}

}
