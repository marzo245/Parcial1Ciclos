package Monitoreo.MonitoreoStock.producto;

import Monitoreo.MonitoreoStock.categoria.Categoria;

public class Producto {
    String nombre;
    float precio;
    int cantidad;
    Categoria categoria;

    public void Producto(String nombreProducto, float precioProducto, Categoria categoria){
        nombre =nombreProducto;
        float precio = precioProducto;
        int cantidad = 10;
        this.categoria = categoria;
    }
    public int getCantidad(){
        return cantidad;
    }
    public String getNombre(){
        return nombre;
    }
}
