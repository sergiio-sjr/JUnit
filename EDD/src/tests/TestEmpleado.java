package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("150");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(150,e.getNumeroEmpleado());
	}
	@Test 
	public void estableceNombreEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("SergioJimenez");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("SergioJimenez",e.getNombreEmpleado());
	}
	@Test 
	public void estableceMesesTrabajoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("32");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(32,e.getMesesTrabajo());
	}
	@Test 
	public void establecerSerDirectivoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(true,e.getDirectivo());
	}
	
	@Test 
	public void calcularPrimaCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("150");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(150,e.getNumeroEmpleado());
        
        try 
        {
            e.estableceNombreEmpleado("SergioJimenez");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("SergioJimenez",e.getNombreEmpleado());
        
        try 
        {
            e. estableceMesesTrabajo("32");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(32,e.getMesesTrabajo());
        
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(true,e.getDirectivo());
	}
	
}


