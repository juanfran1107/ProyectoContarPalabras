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
public class CContarLasPalabras {
    
    
    
    public static int contarCaracteresTotal(String cadena){
		numCar= 0;
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
}
