/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase2222;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class Servicio {
    protected Scanner entrada; // Scanner compartido con el programa principal
    protected Reporte reporte; // Instancia del reporte para registrar las ventas

    // Constructor que recibe el Scanner y Reporte
    public Servicio(Scanner entrada, Reporte reporte) {
        this.entrada = entrada;
        this.reporte = reporte;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void mostrarMenu();

    // Método para obtener opciones del usuario con validación
    protected int obtenerOpcion() {
        try {
            return entrada.nextInt();
        } catch (InputMismatchException e) {
            entrada.nextLine(); // Limpiar el buffer en caso de error
            System.out.println("Entrada invalida. Intente nuevamente.");
            return -1; // Devuelve -1 para indicar error
        }
    }
}
