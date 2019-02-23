package com.company.Productos;

import com.company.Productos.Producto;

public class Manzana extends Producto {
    public Manzana(double cantidad) {
        super(cantidad);
        this.precio = 13.0;
        this.departameto = "Frutas";
        this.unidadMedida = "Kg";
    }
}
