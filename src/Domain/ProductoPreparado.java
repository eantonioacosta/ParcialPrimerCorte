package Domain;


import Domain.ProductoCompuesto;
import Domain.ProductoSimple;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENOR ACOSTA
 */
public class ProductoPreparado extends ProductoCompuesto{
    
    ArrayList<ProductoSimple> ingredientes;
    
    public ProductoPreparado() {
        ingredientes = new ArrayList<>();
    }

    public ProductoPreparado(String codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        this.ingredientes = new ArrayList<>();
    }
    
    public void guardarIngrediente(ProductoSimple producto){
        ingredientes.add(producto);
    }
    @Override
    public double costoCalculado(int cantidad) {
        double valor = 0;
        for (ProductoSimple productosSimple : ingredientes) {
            valor+=productosSimple.getCosto()*cantidad;
        }
        return valor;
    }
    


    @Override
    public double utilidad(int cantidad) {
        return getPrecio()-costoCalculado(cantidad);
    }

    @Override
    public String incrementarCantidad(int cant) {
        return "";
    }

    @Override
    public String disminuirCantidad(int cant) {
        if(cant<=0){
            return "La cantidad de salida debe ser mayor a cero";
        }else{
            agregarHistorial(new SalidaProducto("PRODUCTO PREPARADO",getCodigo(), getNombre(), getPrecio(), costoCalculado(cant)));
            
            return disminuirIngredientes(cant);
        }
    }
    private String disminuirIngredientes(int cantidad){
        String mensaje="";
        for (ProductoSimple ingrediente : ingredientes) {
            mensaje =mensaje+";"+ingrediente.disminuirCantidad(cantidad);
        }
        return mensaje;
    }

}
