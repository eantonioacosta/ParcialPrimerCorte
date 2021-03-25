/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Pruebas;

import Domain.EntradaProducto;
import Domain.Producto;
import Domain.ProductoSimple;
import Domain.SalidaProducto;
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
    //https://drive.google.com/drive/folders/1NinNGppAW6jhqNcodrreE6IQJRxnBo-I?usp=sharing
    //LINK MODELO DEL DOMINIO;
    //PRIMERA PRUEBA
    /*La cantidad de la entrada de debe ser mayor a 0
    DADO: Tengo un producto 'CODIGO = 001, NOMBRE: GASEOSA, PRECIO=2000, COSTO=500 y una cantidad igua a cero ';
    CUANDO: Registre una entrada
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La entrada del producto no tiene stock'
    */
    @Test
    public void cantidadEntradaMayorCero() {
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
    
    //SEGUNDA PRUEBA
    /*2. La cantidad de la entrada se le aumentará a la cantidad existente del producto
    DADO: registro 2 productos con los mismo atributos excepto la cantidad
    'CODIGO = 001, NOMBRE= GASEOSA, PRECIO=2000, COSTO=500, CANTIDAD= 5 ';
    'CODIGO = 001, NOMBRE= GASEOSA, PRECIO=2000, COSTO=500, CANTIDAD= 2 ';
    
    CUANDO: Busco y muestro el objeto producto con codigo = 001
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'CODIGO = 001 NOMBRE = GASEOSA PRECIO = 2000.0 CANTIDAD = 7'
    */
    @Test
    public void cantidadExistenteProductoAumente() {
        EntradaProducto instance = new EntradaProducto();
        
        Producto productoSimple1 = new ProductoSimple("001", "GASEOSA", 2000,5, 500);
        Producto productoSimple2 = new ProductoSimple("001", "GASEOSA", 2000,2, 500);
        String expResult = "CODIGO = 001 NOMBRE = GASEOSA PRECIO = 2000.0 CANTIDAD = 7";
        instance.RegistrarEntrada(productoSimple1);
        instance.RegistrarEntrada(productoSimple2);
        String result = instance.buscar("001").toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    
    
    //TERCERA PRUEBA
    /*La cantidad de la salida de debe ser mayor a 0
    DADO: Tengo un producto 'CODIGO = 001, NOMBRE: GASEOSA, PRECIO=2000, COSTO=500 y una cantidad igua a cero ';
    CUANDO: Registre una entrada
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La salida del producto no tiene stock'
    */
    @Test
    public void cantidadSalidaMayorCero() {
        SalidaProducto instance = new SalidaProducto();
        
        Producto productoSimple = new ProductoSimple("001", "GASEOSA", 2000,0, 500);
        
        String expResult = "La salida del producto no tiene stock";
        
        String result = instance.RegistrarSalida(productoSimple);
        
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
