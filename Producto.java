package com.company.Productos;

abstract class Producto {
    protected String departameto;
    protected String unidadMedida;
    protected double precio;
    protected double cantidad;

    public Producto(double cantidad){
        this.cantidad = cantidad;
    }

    public String getDepartameto() {
        return departameto;
    }

    public double getPrecioTotalPorCantidad(){
        return this.cantidad * precio;
    }
}
