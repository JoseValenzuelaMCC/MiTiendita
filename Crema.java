package com.company.Productos;

public class Crema extends Producto {
    public Crema(double cantidad) {
        super(cantidad);
        this.precio = 10.0;
        this.departameto = "Lacteos";
        this.unidadMedida = "Kg";
    }
}
