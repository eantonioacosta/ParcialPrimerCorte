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
public class ProductoSimple extends Producto {

    ArrayList<EntradaProducto> historialEntrada;

    private double costo;

    public ProductoSimple() {
        historialEntrada = new ArrayList<>();
    }

    public ProductoSimple(String codigo, String nombre, double precio, double costo) {
        super(codigo, nombre, precio);
        this.costo = costo;
        historialEntrada = new ArrayList<>();
    }

//
//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String incrementarCantidad(int cantidad) {
        if (cantidad <= 0) {
            return "la cantidad debe ser mayor a cero";
        } else {

            int cantidadAnterior = getCantidad();

            setCantidad(getCantidad()+cantidad);

            historialEntrada.add(new EntradaProducto(getCodigo(), getNombre(), cantidadAnterior, getCantidad()));
            return "La cantidad es = " + getCantidad();

        }
    }

    @Override
    public String disminuirCantidad(int cant) {
        if(cant<=0){
            return "La cantidad de salida debe ser mayor a cero";
        }else{
            if(getCantidad()<cant){
                return "Sobrepasa la cantidad existente";
            }else{
                
                setCantidad(getCantidad()-cant);
                
                agregarHistorial(new SalidaProducto("PRODUCTO SIMPLE",getCodigo(), getNombre(), getPrecio(), costo));
                return "La cantidad es = " + getCantidad();
                
            }
        }
    }

}
