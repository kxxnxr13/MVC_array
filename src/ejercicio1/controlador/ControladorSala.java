package ejercicio1.controlador;

import ejercicio1.modelo.Sala;
import ejercicio1.vista.VistaSala;


public class ControladorSala {
    private Sala sala;
    private VistaSala vista;

    public ControladorSala(Sala sala, VistaSala vista) {
        this.sala = sala;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarBienvenida();
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    reservarAsiento();
                    break;
                case 2:
                    vista.mostrarReservas(sala.getReservas());
                    break;
                case 3:
                    System.out.println("Saliendo del sistema de reservas...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private void reservarAsiento() {
        if (sala.hayAsientosDisponibles()) {
            int idUsuario = vista.solicitarIdUsuario();
            String nombreUsuario = vista.solicitarNombreUsuario();
            int numeroAsiento = vista.solicitarNumeroAsiento();
            if (sala.reservarAsiento(idUsuario, nombreUsuario, numeroAsiento)) {
                vista.mostrarMensaje("Asiento reservado con éxito.");
            } else {
                vista.mostrarMensaje("No se pudo reservar el asiento. Verifique el número de asiento.");
            }
        } else {
            vista.mostrarMensaje("Lo siento, no hay asientos disponibles.");
        }
    }
}