package com.company.Productos;

import com.company.Productos.*;

import java.util.ArrayList;
import java.util.List;

public class MiTiendita {

    public MiTiendita(){}

    public void main() {
        Leche leche = new Leche(10.0);
        Crema crema = new Crema(0.5);
        Mantequilla mantequilla = new Mantequilla(0.25);
        Queso queso = new Queso(0.5);
        Platano platano = new Platano(1.0);
        Manzana manzana = new Manzana(2.0);
        Jamon jamon = new Jamon(1.0);

        List<Producto> mandado = new ArrayList<>();
        mandado.add(leche);
        mandado.add(crema);
        mandado.add(jamon);
        mandado.add(mantequilla);
        mandado.add(queso);
        mandado.add(platano);
        mandado.add(manzana);

        //Prueba dia lunes
        System.out.println("Venta dia Lunes\nOfertas: Dia del adulto Mayor, 5% de descuento en todos los productos");
        Venta ventaLunes = new Venta();
        ventaLunes.setComportamientoDescuento(new DescuentoLunes());
        ventaLunes.setProductos(mandado);
        ventaLunes.finalizarVenta();

        //Prueba dia martes
        System.out.println("Venta dia Martes\n Ofertas: No hay descuentos en Martes.");
        Venta ventaMartes = new Venta();
        ventaMartes.setComportamientoDescuento(new DescuentoMartes());
        ventaMartes.setProductos(mandado);
        ventaMartes.finalizarVenta();

        //Prueba Miercoles
        System.out.println("Venta dia Miercoles\nOfertas: 10% de descuento en Lacteos.");
        Venta ventaMiercoles = new Venta();
        ventaMiercoles.setComportamientoDescuento(new DescuentoMiercoles());
        ventaMiercoles.setProductos( mandado );
        ventaMiercoles.finalizarVenta();

        //Prueba Jueves
        System.out.println("Venta dia Jueves\nOfertas: 15% de descuento en Frutas.");
        Venta ventaJueves = new Venta();
        ventaJueves.setComportamientoDescuento(new DescuentoJueves());
        ventaJueves.setProductos( mandado );
        ventaJueves.finalizarVenta();

        //Prueba Viernes
        System.out.println("Venta dia Viernes\nOfertas: 5% de descuento en Embutidos y 15% de descuento  en Lacteos.");
        Venta ventaViernes = new Venta();
        ventaViernes.setComportamientoDescuento(new DescuentoViernes());
        ventaViernes.setProductos(mandado);
        ventaViernes.finalizarVenta();

        //Prueba Sabado
        System.out.println("Venta dia Sabado\nNo hay descuentos este dia.");
        Venta ventaSabado = new Venta();
        ventaSabado.setComportamientoDescuento(new DescuentoSabado());
        ventaSabado.setProductos(mandado);
        ventaSabado.finalizarVenta();

        //Prueba Domingo
        System.out.println("Venta dia Domingo\nOferta: Dia del adulto Mayor, 5% de descuento en todos los productos");
        Venta ventaDomingo = new Venta();
        ventaDomingo.setComportamientoDescuento(new DescuentoDomingo());
        ventaDomingo.setProductos(mandado);
        ventaDomingo.finalizarVenta();
    }
}
