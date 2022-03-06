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
public class ObjetoBeanTest extends TestCase {
    
    public ObjetoBeanTest(String testName) {
        super(testName);
    }

    /**
     * Test of crear method, of class ObjetoBean.
     */
    public void testCrear() {
        System.out.println("crear");
        Objeto nuevo = null;
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = false;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of eliminar method, of class ObjetoBean.
    */ 
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Integer id = null;
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = false;
        boolean result = instance.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of modificar method, of class ObjetoBean.
    }*/ 
    public void testModificar() throws Exception {
        System.out.println("modificar");
        Objeto mod = null;
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = false;
        boolean result = instance.modificar(mod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
   }
}
