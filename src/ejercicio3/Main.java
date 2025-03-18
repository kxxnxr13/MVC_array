package ejercicio3;

import ejercicio3.modelo.Calculadora;
import ejercicio3.vista.VistaCalculadora;
import ejercicio3.controlador.ControladorCalculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Crear objeto Calculadora
        VistaCalculadora vista = new VistaCalculadora(); // Crear objeto VistaCalculadora
        ControladorCalculadora controlador = new ControladorCalculadora(calculadora, vista); // Crear objeto ControladorCalculadora

        controlador.iniciar(); // Iniciar la calculadora
    }
}