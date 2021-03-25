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
public class ProductoSimple extends Producto{
    private double costo;
    
    public ProductoSimple() {
    }

    public ProductoSimple(String codigo, String nombre, double precio, int cantidad, double costo ) {
        super(codigo, nombre, precio, cantidad);
        this.costo = costo;
    }



    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
//
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
}
