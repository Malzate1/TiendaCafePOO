package com.example;

public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Parce", "Antioquia", 30000, 2);
        Cafe cafe2 = new Cafe("Cuyabro", "Eje cafetero", 25000, 1);
        Cafe cafe3 = new Cafe("Sama", "Caribe", 60000, 3);

        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        System.out.println("-----------CAFE 1--------");
        cafe1.calcularPrecioTotal();
        cafe1.actualizarCantidad(5);
        System.out.println("Precio total: " + cafe1.calcularPrecioTotal());

        System.out.println("-----------CAFE 2--------");

        cafe2.calcularPrecioTotal();
        cafe2.actualizarCantidad(10);
        System.out.println("Precio total: " + cafe2.calcularPrecioTotal());

        System.out.println("-----------CAFE 3--------");

        cafe3.calcularPrecioTotal();
        cafe3.actualizarCantidad(8);
        System.out.println("Precio total: " + cafe3.calcularPrecioTotal());

    }

}