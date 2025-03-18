package ejercicio2.controlador;

import ejercicio2.modelo.FizzBuzz;
import ejercicio2.vista.VistaFizzBuzz;

public class ControladorFIzzBuzz {
    private FizzBuzz fizzBuzz;
    private VistaFizzBuzz vista;

    public ControladorFIzzBuzz(FizzBuzz fizzBuzz, VistaFizzBuzz vista) {
        this.fizzBuzz = fizzBuzz;
        this.vista = vista;
    }

    // Método para iniciar el juego
    public void iniciar() {
        vista.mostrarBienvenida();
        String nombre = vista.solicitarNombre();

        // Recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            String resultado = fizzBuzz.determinarFizzBuzz(i);
            vista.mostrarResultado(resultado);
        }

        vista.mostrarDespedida(nombre);
    }
}
