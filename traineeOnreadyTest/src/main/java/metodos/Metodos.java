package metodos;

import hija.Auto;
import hija.Moto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import padre.Vehiculo;

public class Metodos {

    public static void llenarDatos(List<Vehiculo> v) {

        v.add(new Auto("Peugeot", "206", 4, 200000F));
        v.add(new Moto("Honda", "Titan", 125, 60000F));
        v.add(new Auto("Peugeot", "208", 5, 250000F));
        v.add(new Moto("Yamaha", "YBR", 160, 80500.50F));

    }

    public static void imprimirVehiculos(List<Vehiculo> v) {
        for(Vehiculo elemento : v){
            System.out.println(elemento);
        }
    }

    public static void vehiculoMasCaro(List<Vehiculo> v) {
        Float precio = 0F;
        String nombre = "";
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getPrecio() > precio) {
                precio = v.get(i).getPrecio();
                nombre = v.get(i).getMarca() + " " + v.get(i).getModelo();
            }

        }

        System.out.println("Vehículo más caro: " + nombre);

    }

    public static void vehiculoMasBarato(List<Vehiculo> v) {
        Float precio = v.get(0).getPrecio();
        String nombre = "";
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getPrecio() < precio) {
                precio = v.get(i).getPrecio();
                nombre = v.get(i).getMarca() + " " + v.get(i).getModelo();
            }

        }

        System.out.println("Vehículo más barato: " + nombre);
    }

    public static void modelosConY(List<Vehiculo> v) {

        String palabra = "";

        for (int i = 0; i < v.size(); i++) {
            palabra = v.get(i).getModelo();
            boolean resultado = palabra.contains("Y");
            if (resultado) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "
                        + " " + v.get(i).getMarca()
                        + " " + v.get(i).getModelo()
                        + " $" + v.get(i).getPrecio()
                );
            }
        }

    }

    public static void ordenarPorMayorPrecio(List<Vehiculo> v) {
        Collections.sort(v, Collections.reverseOrder());
        for(Vehiculo elemento : v){
            System.out.println(elemento.getMarca() + " " + elemento.getModelo());
        }

    }
}
