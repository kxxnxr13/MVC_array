package ejercicio1;

import ejercicio1.modelo.Sala;
import ejercicio1.vista.Vista;
import ejercicio1.controlador.Controlador;

public class Main {
    public static void main(String[] args) {
        // Crear una sala con 5 filas y 5 columnas
        Sala sala = new Sala(5, 5);

        // Crear la vista y el controlador
        Vista vista = new Vista();
        Controlador controlador = new Controlador(sala, vista);

        // Iniciar el sistema de reservas
        controlador.iniciarReservas();
    }
}