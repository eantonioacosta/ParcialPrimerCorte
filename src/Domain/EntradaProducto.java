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
    String codigo;
    String nombre;
    int cantidadAnterior;
    int cantidadActual;

    public EntradaProducto() {
    }

    public EntradaProducto(String codigo, String nombre, int cantidadAnterior, int cantidadActual) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadAnterior = cantidadAnterior;
        this.cantidadActual = cantidadActual;
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

    public int getCantidadAnterior() {
        return cantidadAnterior;
    }

    public void setCantidadAnterior(int cantidadAnterior) {
        this.cantidadAnterior = cantidadAnterior;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


            
}
