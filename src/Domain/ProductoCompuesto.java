/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author ENOR ACOSTA
 */
public abstract class ProductoCompuesto  extends  Producto{

    public ProductoCompuesto() {
    }
    public ProductoCompuesto(String codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
    }

    
    public abstract double costoCalculado(int cantidad);
    public abstract double utilidad(int cantidad);
}
