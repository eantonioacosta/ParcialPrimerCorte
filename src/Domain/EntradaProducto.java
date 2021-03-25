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
public class EntradaProducto {
    ArrayList<Producto> lista;

    public EntradaProducto() {
        lista = new ArrayList<>();
    }
    public String RegistrarEntrada(Producto producto){
        if(producto.getCantidad()==0){
            return "La entrada del producto no tiene stock";
        }else{
            guardarProducto(producto);
            return "La entrada se registro correctamente";
        }
    }

    private void guardarProducto(Producto producto) {
        for (int i = 0; i < lista.size(); i++) {
            if (producto.getCodigo().equals(producto.getCodigo())) {
                lista.get(i).sumarCantidad(producto.getCantidad());
                break;
            }
        }

    }
    
    
}
