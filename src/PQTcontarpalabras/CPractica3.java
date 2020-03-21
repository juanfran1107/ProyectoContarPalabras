package PQTcontarpalabras;

import java.util.Scanner;
public class CPractica3 {
	 static int Nrep=0;
	 static String cadena1;
	 static int numPalab=0;
	 static int numCar=0;
	 static int car[];
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("cual es la cadena?");
		cadena1=sc.nextLine();
		car=new int[cadena1.length()];
		contarCaracteresTotal(cadena1);
		contarNumeroPalabras(cadena1);
		contarTodosCaracteres(cadena1);
		System.out.println(textoCaracteresTotal(numCar));
		System.out.println(textoNumeroPalabras (numPalab));
		System.out.print(textoTodosCaracteres(car));
		 
		
		//contarPalabras(cadena1);
		//mostrarResultados(cadena1);

	}
	
	/*public static void contarPalabras( String cadena) {
		//numPalab=0;
		//numCar=0;
		for (int i=0; i<cadena.length();i++) {
			if(numPalab==0&&numCar!=0) {
				numPalab=1;}
			
			
		}
		for (int i=0; i<cadena.length();i++) {
			car[i]=0;
			for (int j=0; j<cadena.length();j++) {
				if(cadena.charAt(i)==(cadena.charAt(j))) {
					car[i]++;	
				}		
			}
		}
	}*/
	public static int contarCaracteresTotal(String cadena){
		numCar=0;
		for (int i=0; i<cadena.length();i++) {
			/*if(numPalab==0&&numCar!=0) {
				numPalab=1;}*/
			if(cadena.charAt(i)!=32) 
			numCar++;
			
	} return numCar; }
	
	public static int contarNumeroPalabras(String cadena) {
		numPalab=0;
		for (int i=0; i<cadena.length();i++) {
			if(numPalab==0&&numCar!=0) {
				numPalab=1;}
				if(numCar!=0&&cadena.charAt(i)==32) {
					numPalab++;
				}
		}
		return numPalab;
	}
	public static int[] contarTodosCaracteres(String cadena) {
		
		for (int i=0; i<cadena.length();i++) {
			car[i]=0;
			for (int j=0; j<cadena.length();j++) {
				if(cadena.charAt(i)==(cadena.charAt(j))) {
					car[i]++;	
				}		
			}
		}return car;
	}
	
	public static void mostrarResultados(String metodo) {
		//contarPalabras(cadena1);
		
		for (int i=0; i<numCar;i++) {
		System.out.println(cadena1.charAt(i)+" se repite "+car[i]+" veces");}
	}
	
	public static String textoCaracteresTotal (int n) {
		 return ("la cadena tiene "+n+" caracteres");	
	}
	
	public static String textoNumeroPalabras (int n) {
		return ("la cadena tiene "+numPalab+" palabra/s");
	}
	
	public static String textoTodosCaracteres (int n[]) {
		String letra="";
		 for (int i=0; i<n.length;i++) {
			 letra+=cadena1.charAt(i)+" se repite "+car[i]+" veces\n";
			 	}return letra;
	}

}
