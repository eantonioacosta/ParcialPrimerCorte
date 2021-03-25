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
    public double costoCalculado() {
        double valor=0;
        for (Producto producto : listaProductos) {
            if(producto instanceof ProductoSimple){
                valor +=((ProductoSimple) producto).getCosto();
            }else{
                valor += ((ProductoPreparado) producto).costoCalculado();
            }
        }
        return valor;
        
    }
    

    @Override
    public double utilidad() {
        return costoCalculado()-getPrecio();
    }
    
}
