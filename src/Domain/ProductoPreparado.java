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
    public void guardarIngrediente(){
        
    }
    @Override
    public double costoCalculado() {
        double valor = 0;
        for (ProductoSimple productosSimple : ingredientes) {
            valor+=productosSimple.getCosto();
        }
        return valor;
    }
    


    @Override
    public double utilidad() {
        return getPrecio()-costoCalculado();
    }
    
    
}
