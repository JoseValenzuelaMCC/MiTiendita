package com.company.Productos;

import com.company.Productos.Producto;

public class Jamon extends Producto {
    public Jamon(double cantidad) {
        super(cantidad);
        this.precio = 35.0;
        this.departameto = "Embutido";
        this.unidadMedida = "Kg";
    }
}
