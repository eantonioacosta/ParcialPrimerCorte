/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Pruebas;

import Domain.EntradaProducto;
import Domain.Producto;
import Domain.ProductoPreparado;
import Domain.ProductoSimple;
import Domain.SalidaProducto;
import java.util.ArrayList;
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

        ProductoSimple instance = new ProductoSimple("001", "GASEOSA", 2000, 500);

        String expResult = "la cantidad debe ser mayor a cero";

        String result = instance.setCantidad(0);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    //SEGUNDA PRUEBA
    /*2. La cantidad de la entrada se le aumentará a la cantidad existente del producto
    DADO: Un producto simple con los siguientes atributos
    'CODIGO = 001, NOMBRE= GASEOSA, PRECIO=2000, COSTO=500, CANTIDAD= 5 ';
    CUANDO: le envie otra cantidad '2'
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La cantidad es = 7'
     */
    @Test
    public void cantidadExistenteProductoAumente() {
        ProductoSimple instance = new ProductoSimple("001", "GASEOSA", 2000, 500);
        instance.setCantidad(5);

        String expResult = "La cantidad es = 7";

        String result = instance.incrementarCantidad(2);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    //TERCERA PRUEBA
    /*La cantidad de la salida de debe ser mayor a 0
    DADO: Tengo un producto simple 'CODIGO = 001, NOMBRE: GASEOSA, PRECIO=2000, COSTO=500 CANTIDAD=5';
    CUANDO: Cuando realice una salida  de 0
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La cantidad de salida debe ser mayor a cero'
     */
    @Test
    public void cantidadSalidaMayorCero() {

        ProductoSimple instance = new ProductoSimple("001", "GASEOSA", 2000, 500);
        instance.setCantidad(5);

        String expResult = "La cantidad de salida debe ser mayor a cero";

        String result = instance.disminuirCantidad(0);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    //CUARTA PRUEBA
    /*En caso de un producto sencillo la cantidad de la salida se le disminuirá a la cantidad existente del producto.
    DADO: Tengo un producto simple 'CODIGO = 001, NOMBRE: GASEOSA, PRECIO=2000, COSTO=500 CANTIDAD=5';
    CUANDO: Cuando realice una salida  de 2
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'La cantidad de salida debe ser mayor a cero'
     */
    @Test
    public void cantidadExistenteProductoSimpleDisminuira() {

        ProductoSimple instance = new ProductoSimple("001", "GASEOSA", 2000, 500);
        instance.setCantidad(5);

        String expResult = "La cantidad es = 3";

        String result = instance.disminuirCantidad(2);

        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }


//QUITA PRUEBA
    /*En caso de un producto compuesto la cantidad de la salida se le disminuirá a la cantidad existente de cada uno de su ingrediente
    
    DADO: Tengo un producto compuesto/preparado perro sencillo 
    (ingredientes: un pan para perros, una salchicha, una lámina de queso), cantidad (10,12, 15)
    CUANDO: Cuando realice una salida
    ENTONCES: el sistema debe mostrar el ste mensaje 
              ';La cantidad es = 9;La cantidad es = 11;La cantidad es = 14'
     */
    @Test
    public void cantidadProductoCompuestoDisminuiraCantidadIngredientes() {
        ProductoSimple productoPan = new ProductoSimple("001", "PAN PARA PERRO", 2000, 500); productoPan.setCantidad(10);
        ProductoSimple productoSalchicha = new ProductoSimple("002", "SALCHICHA", 3000, 1500); productoSalchicha.setCantidad(12);
        ProductoSimple productoQueso = new ProductoSimple("003", "LAMINA DE QUESO", 1000, 700); productoQueso.setCantidad(15);
        
        ProductoPreparado instance = new ProductoPreparado("XYZ", "PRERRO SENCILLO", 6000);
        instance.guardarIngrediente(productoPan);
        instance.guardarIngrediente(productoSalchicha);
        instance.guardarIngrediente(productoQueso);
       

        String expResult = ";La cantidad es = 9;La cantidad es = 11;La cantidad es = 14";

        String result = instance.disminuirCantidad(1);
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    
    
//
    
    //SEXTA PRUEBA
    /*4. Cada salida debe registrar el costo del producto y el precio de la venta
    
    DADO: Tengo un producto compuesto/preparado perro sencillo 
    (ingredientes: un pan para perros, una salchicha, una lámina de queso), cantidad (10,12, 15)
    CUANDO: realice una salida 'CANTIDAD = 2', mostrar la salida registrada
    ENTONCES: el sistema debe mostrar el ste mensaje 
              'XYZ/PERRO SENCILLO/6000.0/2700.0'
     */
    @Test
    public void registrarCostoYPrecioVentaProducto() {
        ProductoSimple productoPan = new ProductoSimple("001", "PAN PARA PERRO", 2000, 500); productoPan.setCantidad(10);
        ProductoSimple productoSalchicha = new ProductoSimple("002", "SALCHICHA", 3000, 1500); productoSalchicha.setCantidad(12);
        ProductoSimple productoQueso = new ProductoSimple("003", "LAMINA DE QUESO", 1000, 700); productoQueso.setCantidad(15);
        
        ProductoPreparado instance = new ProductoPreparado("XYZ", "PERRO SENCILLO", 6000);
        instance.guardarIngrediente(productoPan);
        instance.guardarIngrediente(productoSalchicha);
        instance.guardarIngrediente(productoQueso);
       
        instance.disminuirCantidad(1);

        String expResult = "PRODUCTO PREPARADO/XYZ/PERRO SENCILLO/6000.0/2700.0";
        ArrayList<SalidaProducto> listaSalida = instance.consultarHistorialSalida();
        
        String result = listaSalida.get(0).toString();
        assertEquals(expResult, result);

        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
//    SEPTIMA PRUEBA
//    El costo de los productos compuestos corresponden al costo de sus ingredientes por la cantidad de estos.
//    DADO: Tengo un producto compuesto/preparado perro sencillo 
//    (ingredientes: un pan para perros, una salchicha, una lámina de queso), cantidad (10,12, 15)
//    CUANDO: realice una salida 'CANTIDAD = 2 ', mostrar la salida registrada
//    ENTONCES: el sistema debe mostrar el ste mensaje 
//              'XYZ/PERRO SENCILLO/6000.0/5400.0'
//     
    @Test
    public void registrarCostoYPrecioVentaProductoPorCantidad() {
        ProductoSimple productoPan = new ProductoSimple("001", "PAN PARA PERRO", 2000, 500); productoPan.setCantidad(10);
        ProductoSimple productoSalchicha = new ProductoSimple("002", "SALCHICHA", 3000, 1500); productoSalchicha.setCantidad(12);
        ProductoSimple productoQueso = new ProductoSimple("003", "LAMINA DE QUESO", 1000, 700); productoQueso.setCantidad(15);
        
        ProductoPreparado instance = new ProductoPreparado("XYZ", "PERRO SENCILLO", 6000);
        instance.guardarIngrediente(productoPan);
        instance.guardarIngrediente(productoSalchicha);
        instance.guardarIngrediente(productoQueso);
       
        instance.disminuirCantidad(2);

        String expResult = "PRODUCTO PREPARADO/XYZ/PERRO SENCILLO/6000.0/5400.0";
        ArrayList<SalidaProducto> listaSalida = instance.consultarHistorialSalida();
        
        String result = listaSalida.get(0).toString();
        assertEquals(expResult, result);

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
