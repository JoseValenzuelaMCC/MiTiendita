package com.company.Productos;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface ComportamientoDescuento {
    public double descuento(List<Producto> productos);
}

class DescuentoLunes implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        for (Producto producto: productos) {
            descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.05;
        }
        return descuentoTotal;
    }
}

class DescuentoMartes implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        return 0.0;
    }
}

class DescuentoMiercoles implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        for (Producto producto: productos) {
            if(producto.getDepartameto().equals("Lacteos")){
                descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.1;
            }
        }
        return descuentoTotal;
    }
}

class DescuentoJueves implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        for (Producto producto: productos) {
            if(producto.getDepartameto().equals("Frutas")){
                descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.15;
            }
        }
        return descuentoTotal;
    }
}


class DescuentoViernes implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        for (Producto producto: productos) {
            if(producto.getDepartameto().equals("Embutido")){
                descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.05;
            }else if(producto.getDepartameto().equals("Lacteos")){
                descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.15;
            }
        }
        return descuentoTotal;
    }
}

class DescuentoSabado implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        return 0.0;
    }
}

class DescuentoDomingo implements ComportamientoDescuento{
    private double descuentoTotal;

    @Override
    public double descuento(List<Producto> productos) {
        for (Producto producto: productos) {
            descuentoTotal += producto.getPrecioTotalPorCantidad() * 0.05;
        }
        return descuentoTotal;
    }
}






