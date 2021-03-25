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
public class SalidaProducto {
   ArrayList<Producto> lista;

    public SalidaProducto() {
        lista = new ArrayList<>();
    }
    public String RegistrarSalida(Producto producto){
        if(producto.getCantidad()<=0){
            return "La salida del producto no tiene stock";
        }else{
            //guardarProducto(producto);
            return "La Salida se registro correctamente";
        }
    }
}
