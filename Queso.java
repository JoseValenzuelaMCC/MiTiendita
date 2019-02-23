package com.company.Productos;

import com.company.Productos.Producto;

public class Queso extends Producto {
    public Queso(double cantidad) {
        super(cantidad);
        this.precio = 100.0;
        this.departameto = "Lacteos";
        this.unidadMedida = "Kg";
    }
}
