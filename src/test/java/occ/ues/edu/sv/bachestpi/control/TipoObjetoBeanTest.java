/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import junit.framework.TestCase;
import occ.ues.edu.sv.bachestpi.entity.Objeto;

/**
 *
 * @author magdiel
 */
public class TipoObjetoBeanTest extends TestCase {
    
    public TipoObjetoBeanTest(String testName) {
        super(testName);
    }

    /**
     * Test of crear method, of class TipoObjetoBean.
     */
    public void testCrear() {
        System.out.println("crear");
        Objeto nuevo = null;
        TipoObjetoBean instance = new TipoObjetoBean();
        boolean expResult = false;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
