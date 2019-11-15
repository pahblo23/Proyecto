
package negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pahblo
 */
public class ManejoClienteTest {
    
    public ManejoClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verTodosClientes method, of class ManejoCliente.
     */
    @Test
    public void testVerTodosClientes() {
        System.out.println("verTodosClientes");
        ManejoCliente instance = new ManejoCliente();
        instance.verTodosClientes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class ManejoCliente.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        ManejoCliente instance = new ManejoCliente();
        instance.agregarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCliente method, of class ManejoCliente.
     */
    @Test
    public void testModificarCliente() {
        System.out.println("modificarCliente");
        ManejoCliente instance = new ManejoCliente();
        instance.modificarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCliente method, of class ManejoCliente.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        ManejoCliente instance = new ManejoCliente();
        instance.eliminarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClientes method, of class ManejoCliente.
     */
    @Test
    public void testBuscarClientes() {
        System.out.println("buscarClientes");
        int cedula = 0;
        ManejoCliente instance = new ManejoCliente();
        Cliente expResult = null;
        Cliente result = instance.buscarClientes(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrar method, of class ManejoCliente.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        ManejoCliente instance = new ManejoCliente();
        instance.registrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ver method, of class ManejoCliente.
     */
    @Test
    public void testVer() {
        System.out.println("ver");
        ManejoCliente instance = new ManejoCliente();
        instance.ver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
