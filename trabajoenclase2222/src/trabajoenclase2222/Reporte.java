/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase2222;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Reporte {
    private double totalRecaudado;
    private ArrayList<String> servicios;
    private ArrayList<Integer> cantidades;
    private ArrayList<Double> ingresos;

    public Reporte() {
        totalRecaudado = 0.0;
        servicios = new ArrayList<>();
        cantidades = new ArrayList<>();
        ingresos = new ArrayList<>();
    }

    // Método para registrar una venta
    public void registrarVenta(String servicio, int cantidad, double total) {
        totalRecaudado += total;

        // Verificar si el servicio ya existe en la lista
        int index = servicios.indexOf(servicio);
        if (index != -1) {
            // Actualizar cantidad y ingresos existentes
            cantidades.set(index, cantidades.get(index) + cantidad);
            ingresos.set(index, ingresos.get(index) + total);
        } else {
            // Agregar nuevo servicio
            servicios.add(servicio);
            cantidades.add(cantidad);
            ingresos.add(total);
        }
    }

    // Método para generar el reporte final
    public void generarReporte() {
        System.out.println("\n----- REPORTE FINAL -----");
        System.out.println("Total recaudado: $" + totalRecaudado);

        System.out.println("\nServicios realizados:");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println("- " + servicios.get(i) + ": " + cantidades.get(i) + " servicios realizados.");
        }

        System.out.println("\nIngresos por servicio:");
        for (int i = 0; i < servicios.size(); i++) {
            System.out.println("- " + servicios.get(i) + ": $" + ingresos.get(i));
        }

        System.out.println("\nGracias por utilizar el sistema. Hasta pronto.");
    }
}