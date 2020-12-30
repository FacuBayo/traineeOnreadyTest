
package hija;

import padre.Vehiculo;

public class Moto extends Vehiculo {
    
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, Float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " // " + " Modelo: " + modelo + " // " + " Cilindrada: " + " // " + cilindrada + "cc" + " // " + "Precio: $" + precio;
    }
    
    
    
}
