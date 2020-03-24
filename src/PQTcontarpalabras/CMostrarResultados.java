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
 
    /**
     * METODO QUE SE ENCARGA DE MOSTRAR POR PANTALLA EL NUMERO DE VECES QUE SE REPITE UN CARACTER.
     * @deprecated 
     * @see public static String textoTodosCaracteres().
     * @param metodo
     */
    public static void mostrarResultados(String metodo) {
		//contarPalabras(cadena1);
		
		for (int i=0; i<numCar;i++) {
		System.out.println(cadena1.charAt(i)+" se repite "+car[i]+" veces");}
	}
    /**
     * METODO ENCARGADO DE MOSTRAR EL NUMERO DE CARACTERES EN TOTAL DE LA CADENA.
     * @param n
     * @return String
     */
    public static String textoCaracteresTotal (int n) {
		 return ("la cadena tiene "+n+" caracteres");	
	}
	
    /**
     * METODO ENCARGADO DE MOSTRAR EL NUMERO DE PALABRAS TOTAL DE LA CADENA.
     * @param n
     * @return String
     */
    public static String textoNumeroPalabras (int n) {
		return ("la cadena tiene "+numPalab+" palabra/s");
	}
	
    /**
     * METODO ENCARGADO DE MOSTRAR EL NUMERO DE REPETICIONES DE CADA CARACTER.
     * @param n
     * @return String
     */
    public static String textoTodosCaracteres (int n[]) {
		String letra="";
		 for (int i=0; i<n.length;i++) {
			 letra+=cadena1.charAt(i)+" se repite "+car[i]+" veces\n";
			 	}return letra;
	}
}
