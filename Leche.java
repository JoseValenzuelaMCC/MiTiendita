package com.company.Productos;

import com.company.Productos.Producto;

public class Leche extends Producto {

    public Leche(double cantidad) {
        super(cantidad);
        this.precio = 15.5;
        this.departameto = "Lacteos";
        this.unidadMedida = "Lt";
    }
}
