/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.bachestpi.control;

import java.time.chrono.Era;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import occ.ues.edu.sv.bachestpi.control.exceptions.NonexistentEntityException;
import occ.ues.edu.sv.bachestpi.entity.Estado;
import occ.ues.edu.sv.bachestpi.control.EstadoBean;
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
  
    @org.junit.jupiter.api.Test
    public void testEliminar() throws NonexistentEntityException{
        System.out.println("Eliminar");
        EstadoBean instance=new EstadoBean();
        boolean expResult=true;
        boolean result=instance.eliminar(7);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testModificar() throws NonexistentEntityException{
        System.out.println("Modificar");
        Estado editar=new Estado();
        editar.setIdEstado(5);
        editar.setNombre("Modificando entidad");
        editar.setFechaCreacion(new Date());
        EstadoBean instance=new EstadoBean();
        boolean expResult=true;
        boolean result=instance.modificar(editar);
        assertEquals(expResult, result);
    }
    
    public void testRead(){
        System.out.println("Leer y mostrar");
        Estado a[]=new Estado[7];
        Integer idEstado=new Estado().getIdEstado();
        EstadoBean instance = new  EstadoBean();
        List<Estado> exp= Arrays.asList(a);
        List<Estado> result = instance.findEstadoEntities(true, 12, 0);
        assertEquals(List.of(a),result);    
    }
    */
    public void testBuscar(){
        System.out.println("BUSCAR");
        EstadoBean find=new EstadoBean();
        boolean expResult=false;
        boolean result =find.buscar(2);
        assertEquals(expResult,result);
    }

}    