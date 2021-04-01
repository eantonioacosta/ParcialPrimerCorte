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
    private String tipo;
    private String codigo;
    private String nombre;
    private double precio;
    private double costo;

    public SalidaProducto() {
    }

    public SalidaProducto(String tipo, String codigo, String nombre, double precio, double costo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return tipo+"/"+codigo+"/"+nombre+"/"+precio+"/"+costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
