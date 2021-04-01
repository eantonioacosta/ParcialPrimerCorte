/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author ENOR ACOSTA
 */
public class ProductoCombo extends ProductoCompuesto{
    ArrayList<Producto> listaProductos;

    public ProductoCombo() {
        listaProductos = new ArrayList<>();
    }
   
    @Override
    public double costoCalculado(int cantidad) {
        double valor=0;
        for (Producto producto : listaProductos) {
            if(producto instanceof ProductoSimple){
                valor +=((ProductoSimple) producto).getCosto()*cantidad;
            }else{
                valor += ((ProductoPreparado) producto).costoCalculado(cantidad);
            }
        }
        return valor;
        
    }
    

    @Override
    public double utilidad(int cantidad) {
        return costoCalculado(cantidad)-getPrecio();
    }

    @Override
    public String incrementarCantidad(int cant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String disminuirCantidad(int cant) {
        if(cant<=0){
            return "La cantidad de salida debe ser mayor a cero";
        }else{
            agregarHistorial(new SalidaProducto("PRODUCTO COMBO",getCodigo(), getNombre(), getPrecio(), costoCalculado(cant)));
            
            disminuirIngredientes(cant);
            return "Salida exitosa";
        }
    }
    private void disminuirIngredientes(int cantidad){
        for (Producto producto : listaProductos) {
            producto.disminuirCantidad(cantidad);
        }
    }


}
