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
public class CMostrarResultadosTest {
    CMostrarResultados prueba1=new CMostrarResultados();
    
    public CMostrarResultadosTest() {
    }
    /**
     * Test of mostrarResultados method, of class CMostrarResultados.
     */
    
    
   /* @Test
    public void testMostrarResultados() {
        
    }*/

    /**
     * Test of textoCaracteresTotal method, of class CMostrarResultados.
     */
    @Test
    public void testTextoCaracteresTotal() {
        String total=prueba1.textoCaracteresTotal(6);
        assertEquals("la cadena tiene 6 caracteres",total);
        assertNotEquals("la cadena tiene 4 caracteres",4);
    }
    /**
     * Test of textoNumeroPalabras method, of class CMostrarResultados.
     */
    @Test
    public void testTextoNumeroPalabras() {
        String totalPalab=prueba1.textoNumeroPalabras(4);
        assertEquals("la cadena tiene "+4+" palabra/s",4);
        assertNotEquals("la cadena tiene "+6+" palabra/s",6);
    }
    /**
     * Test of textoTodosCaracteres method, of class CMostrarResultados.
     */
    @Test
    public void testTextoTodosCaracteres() {
        
    }
    
}
