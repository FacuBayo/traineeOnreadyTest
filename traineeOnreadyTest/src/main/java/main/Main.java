package main;

import java.util.ArrayList;
import java.util.List;
import metodos.Metodos;
import padre.Vehiculo;

public class Main {

    public static void main(String[] args) {
        List<Vehiculo> v = new ArrayList<>();

        Metodos.llenarDatos(v);
        Metodos.imprimirVehiculos(v);
        System.out.println("=================================");
        Metodos.vehiculoMasCaro(v);
        Metodos.vehiculoMasBarato(v);
        Metodos.modelosConY(v);
        System.out.println("=================================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        Metodos.ordenarPorMayorPrecio(v);

    }

}
