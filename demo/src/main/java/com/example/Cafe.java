package com.example;

public class Cafe {

    String nombre;
    String region;
    double precioPorKilo;
    double cantidadEnKilos;

    public Cafe( String nombre,String region,double precioPorKilo,int cantidadEnKilos){
        this.nombre=nombre;
        this.region=region;
        this.precioPorKilo=precioPorKilo;
        this.cantidadEnKilos=cantidadEnKilos;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre );
        System.out.println("Region: "+this.region );
        System.out.println("Precio por kilo: " +this.precioPorKilo );
        System.out.println("Cantidad en Kilos: "+this.cantidadEnKilos );

    }

    public double calcularPrecioTotal( ){
        return this.precioPorKilo*this.cantidadEnKilos;

        
    }

    public void actualizarCantidad(int nuevacantidad){
        this.cantidadEnKilos=nuevacantidad;

        System.out.println("Nueva cantidad en Kilos: "+nuevacantidad);
    }

    public double aplicarDescuento(double porcentaje){

        if (porcentaje <0 || porcentaje >100 ){

            System.out.println(" El porcentaje esta fuera de rango.Debe estar entre 0 Y 100. ");
            return this.precioPorKilo;

        }

        double precioInicial= this.precioPorKilo;
        double descuento= this.precioPorKilo*(porcentaje/100);
        this.precioPorKilo=this.precioPorKilo-descuento;

        return this.precioPorKilo;




    }


}
