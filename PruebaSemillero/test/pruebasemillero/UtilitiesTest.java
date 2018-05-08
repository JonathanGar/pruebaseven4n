/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasemillero;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author guest-fq9rce
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("--------Pruebas Utilities --------");
    }

    @Test
    public void testMcm() {
        System.out.println("mcm con enteros");
        int n1 = 3;
        int n2 = 5;
        int expResult = 15;        
        int result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        //
        n1 = -3;
        n2 = 5;
        expResult = 15;        
        result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        //
        n1 = 11;
        n2 = 22;
        expResult = 22;        
        result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        //
        n1 = 8;
        n2 = 12;
        expResult = 24;        
        result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        // 
        n1 = 5;
        n2 = 9;
        expResult = 45;        
        result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        //
        n1 = -3;
        n2 = -4;
        expResult = 12;        
        result = Utilities.mcm(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    @Test(expected = ArithmeticException.class)
    public void testMcmZeroZero() {
        System.out.println("mcm(0,0)");
        Utilities.mcm(0, 0);
    }
    
    
    @Test(expected = ArithmeticException.class)
    public void testMcmN1Zero() {
        System.out.println("mcm(1,0)");
        Utilities.mcm(1, 0);
    }
    
    
    @Test(expected = ArithmeticException.class)
    public void testMcmN2Zero() {
        System.out.println("mcm(0,2)");
        Utilities.mcm(0, 2);
    }
    
}
