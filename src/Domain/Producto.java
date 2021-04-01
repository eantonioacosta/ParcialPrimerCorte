/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

public abstract class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;
    private ArrayList<SalidaProducto> historiaSalida;

    public Producto() {
        historiaSalida = new ArrayList<>();
    }

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        historiaSalida = new ArrayList<>();
    }
    public void agregarHistorial(SalidaProducto salida){
        historiaSalida.add(salida);
    }
    public ArrayList<SalidaProducto> consultarHistorialSalida(){
        return historiaSalida;
    }
            

    public abstract String incrementarCantidad(int cant);

    public abstract String disminuirCantidad(int cant);

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

    public int getCantidad() {
        return cantidad;
    }

    public String setCantidad(int cantidad) {
        if (cantidad <= 0) {
            return "la cantidad debe ser mayor a cero";
        } else {
            this.cantidad = cantidad;
            return "Ok";
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CODIGO = " + codigo + " NOMBRE = " + nombre + " PRECIO = " + precio + " CANTIDAD = " + cantidad;
    }

}
