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
    public CContarLasPalabrasTest() {
    }
    /**
     * Test of contarCaracteresTotal method, of class CContarLasPalabras.
     */
    @Test
    public void testContarCaracteresTotal() {
        
        int resultado= prueba1.contarCaracteresTotal("hola me llamo juanfran");
        assertEquals(19,resultado);
    }
    @Test
    public void testContarCaracteresTotal_2() {
        //CContarLasPalabras prueba2=new CContarLasPalabras();
        int resultado= prueba1.contarCaracteresTotal("hola me llamo juanfran");
        assertNotEquals(15,resultado);
    }
    /**
     * Test of contarNumeroPalabras method, of class CContarLasPalabras.
     *
    @Test
    public void testContarNumeroPalabras() {
        int resultado=prueba1.contarNumeroPalabras("hola me llamo juanfran");
        assertEquals(4,resultado);  
    }
    @Test
    public void testContarNumeroPalabras_2() {
        int resultado=prueba1.contarNumeroPalabras("hola me llamo juanfran");
        assertNotEquals(7,resultado);  
    }*/
    /**
     * Test of contarTodosCaracteres method, of class CContarLasPalabras.
     */
    @Test
    public void testContarTodosCaracteres() {
        
    }
    
}
