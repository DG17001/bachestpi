/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.util.Date;
import junit.framework.TestCase;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
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
     
    public void testCrear() {
        System.out.println("crear");
        ObjetoEstado nuevo = new ObjetoEstado();
        nuevo.setActual(true);
        nuevo.setFechaAlcanzado(new Date());
        ObjetoEstadoBean instance = new ObjetoEstadoBean();
        boolean expResult = true;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
    }
    
    public void testEliminar()throws NonexistentEntityException{
        System.out.println("Eliminar");
        ObjetoEstadoBean instance=new ObjetoEstadoBean();
        boolean expResult=true;
        boolean result=instance.eliminar(1L);
        assertEquals(expResult, result);
    }
    */
    public void testModificar() throws NonexistentEntityException{
        System.out.println("Modificar");
        ObjetoEstado mod=new ObjetoEstado();
        mod.setIdObjetoEstado(1L);
        mod.setActual(false);
        mod.setFechaAlcanzado(new Date());
        ObjetoEstadoBean instance=new ObjetoEstadoBean();
        boolean expResult=true;
        boolean result=instance.modificar(mod);
        assertEquals(expResult, result);
    }
    
}
