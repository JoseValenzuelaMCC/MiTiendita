package com.company.Productos;

import com.company.Productos.Producto;

public class Platano extends Producto {
    public Platano(double cantidad) {
        super(cantidad);
        this.precio = 14.0;
        this.departameto = "Frutas";
        this.unidadMedida = "Kg";
    }
}
