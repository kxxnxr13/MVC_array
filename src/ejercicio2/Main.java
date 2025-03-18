package ejercicio2;
import ejercicio2.modelo.FizzBuzz;
import ejercicio2.vista.VistaFizzBuzz;
import ejercicio2.controlador.ControladorFIzzBuzz;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(); // Crear objeto FizzBuzz
        VistaFizzBuzz vista = new VistaFizzBuzz(); // Crear objeto VistaFizzBuzz
        ControladorFIzzBuzz controlador = new ControladorFIzzBuzz(fizzBuzz, vista); // Crear objeto ControladorFizzBuzz

        controlador.iniciar(); // Iniciar el juego
    }
}