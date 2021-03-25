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
    public abstract double costoCalculado();
    public abstract double utilidad();
}
