package control;

import java.util.Random;

public class Ejercicios {

	private Random rnd;
	private int numero;
	private int numero2;
	private Random rnd2;


	// --------------- 04/10/2018 ACTIVIDAD: BUSCAR EN LA API
	// ------------------------------- control de versiones
	public void pruebasAPI() {
		/*
		 * 1. imprime por consola el valor de 2^3 - Usa la clase est�tica Math y
		 * su m�todo pow (Cuando es est�tico no hace falta el new)
		 * 
		 * 2. Imprime un valor aleatorio entre 1 y 100 - Usa la clase
		 * java.util.Random y el m�todo rnd 3. En la cadena
		 * "LAS PALMAS DE GRAN CANARIA", imprime "GRAN" -Usa el m�todo substring
		 * de la clase java.lang.String
		 */

		// 1.
		System.out.println("1. " + Math.pow(2, 3));

		// 2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));

		// 3.
		System.out.println("3. "
				+ "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}

	// ACTIVIDAD: Mostrar por consola los n�meros comprendidos entre dos
	// enteros, a y b

	// 1Parte m�todo:. prototipo o cabecera
	public void listaIntervaloEnteros(int primero, int ultimo) {
		// 2Parte m�todo: cuerpo o implementaci�n del m�todo
		/*
		 * int i=primero; while(i < ultimo) System.out.println(++i); i++; i=i+1;
		 */
		for (int j = primero; j <= ultimo; j++)
			System.out.println(j++);

		// true /false
		boolean condicion = true;
		if (condicion) {
			// en caso de verdadero
		} else {
			// la otra opci�n, falso
		}

	}

	// ---------------------- ACTIVIDAD
	// ----------------------------------------------------- 10/10/2018
	/*
	 * Dado una �cadena� (String) devolver el valor en forma de n�mero entero
	 * correspondiente. Ejempo String: �ab95f1�
	 */

	// String cadena ="ab95f1";
	/*
	 * public static int converString(String cadena) { int numeros =
	 * Integer.parseInt(cadena); return numeros; }
	 */

	// ---------------------- ACTIVIDAD : Serie Fibonacci
	// --------------------------------------- 11/10/2018

	public static void serieFibonacci(int cuantos) {
		int num1 = 0;
		int num2 = 1;
		int total = 1;

		System.out.print(num1 + " ," + num2);
		for (int i = 1; i < cuantos; i++) {
			total = num1 + num2;
			System.out.print(" ," + total);
			num1 = num2;
			num2 = total;
		}
	}

	// ---------------------- ACTIVIDAD : Factorial (1.-Deberes
	// Casa)-------------------------------- 11/10/2018

	public static void factorial(int numFact) {
		int num1 = 1;
		if (numFact == 0 | numFact == 1) {
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :  1");
		} else {
			for (int i = 2; i <= numFact; i++) {
				num1 = num1 * i;
			}
			System.out.println("El factorial de " + "'" + numFact + "'"
					+ " es :" + num1);
		}
	}

	// ---------------------- ACTIVIDAD : Devolver el n�mero menor de tres
	// (2.-Deberes Casa)----------- 11/10/2018

	public int calNumMenor(int x, int y, int z) {
		if (x < y)
			if (x < z)
				return x;
			else
				return z;
		else if (y < z)
			return y;
		else
			return z;

	}
	
	
	// ACTIVIDAD : Devolver el n�mero menor de cuatro
	public int calNumMenor(int x, int y, int z, int w) {
		if (x < y)
			if (x < z)
				if (x < w)
					return x;
				else
					return w;
			else
				if (z < w)
					return z;
			else 
				return w;
			else 
				
			if (y < z)
				if (y < w)
					return y;
				else 
					return w;
			else
				return z;
	}


	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();
		//
		int a = 12, b = 1 , c = 8, d = 20;
		//int menor = ejercicios.calNumMenor(a, b, c, d);

		System.out.println("el menor es : " + ejercicios.calNumMenor(a, b, c, d));
		
		float[] movs = {10.0f, -5.0f, 20.5f, -10.5f};
		float saldoI = 100.0f;
		System.out.println("Saldo Final:" + ejercicios.saldoBanco(saldoI, movs));
		
		ejercicios.pruebaCadenas();
		
		//String[] diasSemana = {"LUNES","MARTES"};
		//ejercicios.saldoBanco(10.0f, -5.0f, 20.0f, -10.5f);
		
		//ejercicios.imprimeAleatorio(5);
		//ejercicios.generaListaAleatorios(10, 100, 500);
		//int[] ListAleatorios = ejercicios.generaListaAleatorio(20, 1, 5000);
		// int[] estadisticasDatos = ejercicios.generaEstadisticaAparicion(101, 1, 2);
		//ejercicios.calNumMenor(a, b, c, d);

		// factorial(5);

		// serieFibonacci(8);

		// Act: 10/10/2018
		// System.out.println(converString("8fgf"));

		/*
		 * Ejercicios ejercicios = new Ejercicios(); int x=10; int y= 30;
		 * ejercicios.listaIntervaloEnteros(x, y);
		 */

		// Ejercicios.pruebasAPI();
		// new Ejercicios().pruebasAPI();

		// Persona juan = new Persona();
		// int pasos = juan.caminar(20);

		// Persona juan;
		// juan = new Persona("4545455X", "Juan Luis", 47,null);
		// Persona persona1 = new Persona();

		System.out.println("Fin del programa");
	}
	
	
	//Imprime por consola n n�mero aleatorios
	// entre 1-100
	
	private void saldoBanco(float f, float g, float h, float i) {
		// TODO Auto-generated method stub
		
	}

	public void imprimeAleatorio(int n) //n, cuantos n�meros
	{
		rnd = new Random();
		int numero = 0;
		for (int i = 0; i < n; i++) {
			numero = 1 + rnd.nextInt(100);
			System.out.println(i +1 + ".-" + numero);
			}
		}
		
	
	
	//Devolver un array
	//Con numeros aleatorios
	//entre "inferior" y "superior"
	
		public int[] generaListaAleatorios(int n, int inferior, int superior){
		
				rnd = new Random();
				int numero = 0;
				
		for (int i = 1; i < n; i++) {
			numero = inferior + rnd.nextInt(superior - inferior + 1);
			System.out.println(i +1 + ".-" + numero);
			}
		;
		return null;
	
		}
		
		public int[] generaListaAleatorio(int n, int inferior, int superior) {
			
			int[] resultado; //declaraci�n en la tabla de simbolo
			resultado = new int[n]; //inicializando
			rnd = new Random();
			numero2 = 0;
			for (int i = 1; i < n; i++) {
				//numero = inferior + rnd.nextInt(superior - inferior + 1);
				resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
	}
		
	return resultado;
			
		}
		
		public int[] generaEstadisticaAparicion(int n, int inferior, int superior) {
			
			int[] estadistica;
			estadistica = new int[superior - inferior + 1];
			Random rnd = new Random();
			int numero = 0;
			
			for (int i = 1; i < n; i++) {
				numero = inferior + rnd.nextInt(superior - inferior + 1);
				estadistica [numero - 1] ++ ;
 			}
			
		
		return estadistica;
}	
		
		public float saldoBanco(float saldoInicial, float[] movimientos) {
			
			float saldoFinal = saldoInicial;
			// Recorrer el array de movimientos 
				// sumando dichas cantidades a saldo Final
			
			for (int i = 0; i < movimientos.length; i++)
				saldoFinal += movimientos[i];
			return saldoFinal;	
		}
	
		public void pruebaCadenas() {
			
			String nombre = "LAS PALMAS DE GRAN CANARIA";
			String nombre2 = "LAS PALMAS DE GRAN CANARIA";
			//iterar en la cadena mostrando todos sus caracteres

			//for (int i = 0; i < nombre.length(); i++) {
				//System.out.println(nombre.charAt(i));
			//for (int j = 0; j < nombre2.length(); j++) {
				System.out.println(nombre2.compareTo(nombre));
			}
				
			//prueba
			
			}
			
		

		

