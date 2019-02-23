package com.company.Productos;

import com.company.Productos.Producto;

public class Mantequilla extends Producto {
    public Mantequilla(double cantidad) {
        super(cantidad);
        this.precio = 4.5;
        this.departameto = "Lacteos";
        this.unidadMedida = "Kg";
    }
}
