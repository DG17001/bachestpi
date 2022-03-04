/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import occ.ues.edu.sv.bachestpi.entity.Estado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author magdiel
 */
public class EstadoBeanTest {
    
    public EstadoBeanTest() {
    }

    /**
     * Test of crear method, of class EstadoBean.
     */
    @org.junit.jupiter.api.Test
    public void testCrear() {
        System.out.println("crear");
        Estado nuevo = null;
        EstadoBean instance = new EstadoBean();
        boolean expResult = false;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
