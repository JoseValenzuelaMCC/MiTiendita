package com.company.Productos;

import com.company.Productos.ComportamientoDescuento;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private ComportamientoDescuento comportamientoDescuento;
    private List<Producto> productos = new ArrayList<>();

    public void setComportamientoDescuento(ComportamientoDescuento comportamientoDescuento) {
        this.comportamientoDescuento = comportamientoDescuento;
    }

    public void finalizarVenta(){
        double total = totalSinDescuento();
        double iva = total * 0.16;
        double des = descuento();
        double montoFinal = ((total + iva) - des);
        System.out.println("Total: " + total);
        System.out.println("Total(incluyendo IVA): " + (total + iva));
        System.out.println("Descuento: " + des);
        System.out.println("Total a pagar: " + montoFinal);
        System.out.println();
    }

    public void setProductos(List<Producto> productos ) {
        this.productos = productos;
    }

    private double descuento(){
        return this.comportamientoDescuento.descuento((this.productos));
    }

    private double totalSinDescuento(){
        double total = 0.0;
        for (Producto pr:productos) {
            total += pr.getPrecioTotalPorCantidad();
        }
        return total;
    }
}
