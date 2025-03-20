package ejercicio4;

import ejercicio4.modelo.Invernadero;
import ejercicio4.modelo.Historial;
import ejercicio4.vista.VistaInvernadero;
import ejercicio4.controlador.ControladorInvernadero;

public class Main {
    public static void main(String[] args) {
        Invernadero invernadero = new Invernadero(); // Crear objeto Invernadero
        Historial historial = new Historial(); // Crear objeto Historial
        VistaInvernadero vista = new VistaInvernadero(); // Crear objeto VistaInvernadero
        ControladorInvernadero controlador = new ControladorInvernadero(invernadero, historial, vista); // Crear objeto ControladorInvernadero

        controlador.iniciar(); // Iniciar el sistema
    }
}