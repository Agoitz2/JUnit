package eje3;

public class multiplos {
	
	public static void main(String[] args) {
		
		int n = leerN();
		int m = leerM(n);
		int multiplo = 1;
		while (multiplo < m) {
			multiplo=siguienteMultiplo(n, multiplo);
			System.out.println(multiplo);
			
		}
	}

	private static int siguienteMultiplo(int n, int mayorQue) {
		// TODO Auto-generated method stub
		int aux= mayorQue+1;
		while(aux%n!=0) {
			aux++;
		}
		return aux;
	}

	static int leerM(int n) {
		// TODO Auto-generated method stub
		int m=0;
		while (m <= n) {
			System.out.println("Introduce un numero mayor que: " + n + " para M: ");
			m = Console.readInt();
		}
		return m;
	}

	static int leerN() {
		// TODO Auto-generated method stub
		int n=0;
		while (n <= 0) {
			System.out.println("Introduce un entero positivo para N: ");
			n = Console.readInt();
		}
		return n;
	}
	
}
