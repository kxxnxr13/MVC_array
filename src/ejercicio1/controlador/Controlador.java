package ejercicio1.controlador;

import ejercicio1.modelo.Sala;
import ejercicio1.vista.Vista;


public class Controlador {
    private Sala sala;
    private Vista vista;

    public Controlador(Sala sala, Vista vista) {
        this.sala = sala;
        this.vista = vista;
    }

    // Inicia el proceso de reserva
    public void iniciarReservas() {
        vista.mostrarMensaje("Bienvenido al sistema de reservas de asientos.");

        while (sala.hayAsientosLibres()) {
            sala.mostrarAsientos(); // Muestra el estado actual de los asientos

            // Pide al usuario que elija un asiento
            int fila = vista.pedirFila();
            int columna = vista.pedirColumna();

            // Intenta reservar el asiento
            sala.reservarAsiento(fila, columna);
        }

        vista.mostrarMensaje("¡Todos los asientos están ocupados! Gracias por usar el sistema.");
    }
}