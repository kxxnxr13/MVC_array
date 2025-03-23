package ejercicio8.vista;

import java.util.ArrayList;

public class VistaAcceso {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarHistorial(ArrayList<String> historial) {
        System.out.println("\n Historial de Accesos ");
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}
