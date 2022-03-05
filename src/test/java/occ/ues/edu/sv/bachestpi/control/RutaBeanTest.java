/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.util.Date;
import junit.framework.TestCase;
import occ.ues.edu.sv.bachestpi.control.RutaBean;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Ruta;

/**
 *
 * @author magdiel
 */
public class RutaBeanTest extends TestCase {
    
    public RutaBeanTest() {
    }

    /**
     * Test of crear method, of class RutaBean.
    */
    
    @org.junit.jupiter.api.Test 
    public void testCrear() {
        System.out.println("crear");
        Ruta nueva= new Ruta();
        nueva.setFechaCreacion(new Date());
        nueva.setNombre("Creado desde TestRuta "+System.currentTimeMillis());
        RutaBean instance = new RutaBean();
        boolean expResult = true;
        boolean result = instance.crear(nueva);
        assertEquals(expResult, result);  
    }
    
    @org.junit.jupiter.api.Test 
    public void testElminar() throws NonexistentEntityException{
        System.out.println("Delete");
        RutaBean instance=new RutaBean();
        boolean expResult=true;
        boolean result=instance.eliminar(0007L);
        assertEquals(expResult, result);
    }
    
    public void testModificar(){
        System.out.println("Modificando");
        Ruta modificar=new Ruta();
        modificar.setIdRuta(0001L);
        modificar.setNombre("Modificando tupla");
        modificar.setFechaCreacion(new Date());
        RutaBean instance=new RutaBean();
        boolean expResult=true;
        boolean result=instance.modificar(modificar);
        assertEquals(expResult, result);
    }
   
}
