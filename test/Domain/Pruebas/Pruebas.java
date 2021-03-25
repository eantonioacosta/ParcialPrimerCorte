/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Pruebas;

import Domain.EntradaProducto;
import Domain.Producto;
import Domain.ProductoSimple;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ENOR ACOSTA
 */
public class Pruebas {
    
    public Pruebas() {
    }
    /*La cantidad de la entrada de debe ser mayor a 0
    DADO: Tengo un producto 'CODIGO = 001, NOMBRE: GASEOSA, PRECIO=2000, COSTO=500 y una cantidad igua a cero ';
    CUANDO: Registre una entrada
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La entrada del producto no tiene stock'
    */
    @Test
    public void cantidadEntradaMayoCero() {
        EntradaProducto instance = new EntradaProducto();
        
        Producto productoSimple = new ProductoSimple("001", "GASEOSA", 2000,0, 500);
        
        String expResult = "La entrada del producto no tiene stock";
        
        String result = instance.RegistrarEntrada(productoSimple);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
