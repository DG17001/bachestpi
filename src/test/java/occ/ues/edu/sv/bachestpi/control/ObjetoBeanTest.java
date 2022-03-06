/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.math.BigDecimal;
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
        Objeto nuevo = new Objeto();
        BigDecimal latitud=new BigDecimal(6.1234567890);
        BigDecimal longitud=new BigDecimal(4.6152112981);
        nuevo.setIdObjeto(1L);
        nuevo.setLatitud(latitud);
        nuevo.setLongitud(longitud);
        nuevo.setNombre("Creado desde ObjetoBeanTest");
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = true;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of eliminar method, of class ObjetoBean.
    */
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = true;
        boolean result = instance.eliminar(2L);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of modificar method, of class ObjetoBean.
    */
    public void testModificar() throws Exception {
        System.out.println("modificar");
        Objeto modificar = new Objeto();
        BigDecimal latitud=new BigDecimal(2.1234567890);
        BigDecimal longitud=new BigDecimal(5.6152112981);
        modificar.setIdObjeto(2L);
        modificar.setLatitud(latitud);
        modificar.setLongitud(longitud);
        modificar.setNombre("creando nuevo registro");
        ObjetoBean instance = new ObjetoBean();
        boolean expResult = true;
        boolean result = instance.modificar(modificar);
        assertEquals(expResult, result);    
   }
}