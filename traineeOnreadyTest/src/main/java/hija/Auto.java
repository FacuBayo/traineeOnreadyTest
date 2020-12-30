package hija;

import padre.Vehiculo;

public class Auto extends Vehiculo {
    
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas, Float precio) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    } 

    @Override
    public String toString() {
        return "Marca: " + marca + " // " + " Modelo: " + modelo + " // " + " Puertas: " + " // " + cantidadPuertas + " // " + "Precio: $" + precio;
    }
    
    
}
