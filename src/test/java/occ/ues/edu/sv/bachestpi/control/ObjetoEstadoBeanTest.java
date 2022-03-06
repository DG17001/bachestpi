/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.util.Date;
import junit.framework.TestCase;
import occ.ues.edu.sv.bachestpi.entity.ObjetoEstado;

/**
 *
 * @author magdiel
 */
public class ObjetoEstadoBeanTest extends TestCase {
    
    public ObjetoEstadoBeanTest(String testName) {
        super(testName);
    }

    /**
     * Test of crear method, of class ObjetoEstadoBean.
     */
    public void testCrear() {
        System.out.println("crear");
        ObjetoEstado nuevo = new ObjetoEstado();
        nuevo.setIdObjetoEstado(1L);
        nuevo.setActual(true);
        nuevo.setFechaAlcanzado(new Date());
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        boolean expResult = true;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
    }
    
    public void testEliminar(){
        System.out.println("Eliminar");
        ObjetoEstadoBean instance=new ObjetoEstadoBean();
        boolean expResult=true;
        boolean result=instance.eliminar(2L);
        assertEquals(expResult, result);
    }
    
}
