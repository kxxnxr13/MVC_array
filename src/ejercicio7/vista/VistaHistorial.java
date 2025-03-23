package ejercicio7.vista;


import java.util.ArrayList;

public class VistaHistorial {
    public void mostrarHistorial(ArrayList<String> historial) {
        System.out.println("\n📊 Historial de estados del aire acondicionado:");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println("🔹 Ciclo " + (i + 1) + ": " + historial.get(i));
        }
    }
}
