/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQTcontarpalabras;

import static PQTcontarpalabras.CPractica3.*;

/**
 *
 * @author portatil de JuanFran
 */
public class CMostrarResultados {
 
    
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
