/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQTcontarpalabras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author portatil de JuanFran
 */
public class CContarLasPalabrasTest {
    CContarLasPalabras prueba1=new CContarLasPalabras();

    /**
     *
     */
    public CContarLasPalabrasTest() {
    }
    /**
     * Test de contarCaracteresTotal
     * introducimos una cadena e indicamos el numero de caracteres que debe 
     * devolver para que el resultado sea correcto.
     */
    @Test
    public void testContarCaracteresTotal() {
        
        int resultado= prueba1.contarCaracteresTotal("hola me llamo juanfran");
        assertEquals(19,resultado);
    }

    /**
     *
     * Test de contarCaracteresTotal
     * introducimos una cadena e indicamos el numero de caracteres que NO debe 
     * devolver para que el resultado sea incorrecto.
     */
    @Test
    public void testContarCaracteresTotal_2() {
        //CContarLasPalabras prueba2=new CContarLasPalabras();
        int resultado= prueba1.contarCaracteresTotal("hola me llamo juanfran");
        assertNotEquals(15,resultado);
    }
    /**
     * Test de contarNumeroPalabras
     * introducimos una cadena e indicamos el numero real de palabras que la 
     * forma para que el resultado sea correcto.
     * 
     */
    @Test
    public void testContarNumeroPalabras() {
        int resultado=prueba1.contarNumeroPalabras("hola me llamo juanfran");
        assertEquals(4,resultado);  
    }

    /**
     * Test de contarNumeroPalabras
     * introducimos una cadena e indicamos un numero incorrecto de palabras que la 
     * forma para que el resultado sea invalido.
     */
    @Test
    public void testContarNumeroPalabras_2() {
        int resultado=prueba1.contarNumeroPalabras("hola me llamo juanfran");
        assertNotEquals(7,resultado);  
    }
    /**
     * Test de contarTodosCaracteres 
     * Introducimos una pequeña cadena e indicamos caracter por caracter las 
     * veces que se repite cada uno de manera correcta para que el resultado
     * sea valido.
     */
    @Test
    public void testContarTodosCaracteres() {
        
        int resultado[]=prueba1.contarTodosCaracteres("hola");
        assertEquals(1,resultado[0]);
        assertEquals(1,resultado[1]);
        assertEquals(1,resultado[2]);
        assertEquals(1,resultado[3]);
    }

    /**
     * Test de contarTodosCaracteres 
     * Introducimos una pequeña cadena e indicamos caracter por caracter las 
     * veces que se repite cada uno de manera INCORRECTA para que el resultado
     * sea INVALIDO.
     */
    @Test
    public void testContarTodosCaracteres_2() {
        int resultado[]=prueba1.contarTodosCaracteres("juanfran");
        assertEquals(1,resultado[0]);
        assertNotEquals(2,resultado[1]);
        assertEquals(2,resultado[2]);
        assertNotEquals(1,resultado[3]);
        assertEquals(1,resultado[4]);
        assertNotEquals(6,resultado[5]);
        assertEquals(2,resultado[6]);
        assertNotEquals(3,resultado[7]);
    }
    
}
