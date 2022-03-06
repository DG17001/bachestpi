/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.util.Date;
import junit.framework.TestCase;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.TipoObjeto;

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
        TipoObjeto nuevo = new TipoObjeto();
        nuevo.setActivo(true);
        nuevo.setFechaCreacion(new Date());
        TipoObjetoBean instance= new TipoObjetoBean();
        boolean expResult = true;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
    }
    
   public void testEliminar() throws NonexistentEntityException{
       System.out.println("Eliminar");
       TipoObjetoBean instance=new TipoObjetoBean();
       boolean expResult=true;
       boolean result=instance.eliminar(2);
       assertEquals(expResult, result);
   }
    
}
