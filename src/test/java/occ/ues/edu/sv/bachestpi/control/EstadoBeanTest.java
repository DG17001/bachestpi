/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.util.Date;
import occ.ues.edu.sv.bachestpi.entity.Estado;
import static org.junit.jupiter.api.Assertions.*;
import sun.awt.X11.XConstants;

/**
 *
 * @author magdiel
 */
public class EstadoBeanTest {
    
    public EstadoBeanTest() {
    }

    /**
     * Test of crear method, of class EstadoBean.
     
    @org.junit.jupiter.api.Test
    public void testCrear() {
        System.out.println("Crear");
        Estado nuevo = new Estado();
        nuevo.setFechaCreacion(new Date());
        nuevo.setNombre("Creado desde EstadoBeanTest "+System.currentTimeMillis());
        EstadoBean instance = new EstadoBean();
        boolean expResult = true;
        boolean result = instance.crear(nuevo);
        assertEquals(expResult, result);
    }
    */
    @org.junit.jupiter.api.Test
    public void testEliminar(){
        System.out.println("Eliminar");
        Estado delete= new Estado();
        EstadoBean instance=new EstadoBean();
        boolean expResult=true;
        boolean result=instance.eliminar(12);
        assertEquals(expResult, result);
    }
    
}    