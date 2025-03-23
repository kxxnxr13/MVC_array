package ejercicio6.controlador;


import ejercicio6.modelo.Sensor;
import ejercicio6.vista.VistaLuces;
import ejercicio6.modelo.Luz;


import java.util.ArrayList;

public class ControlLuces {
    private Sensor sensor;
    private Luz luz;
    private VistaLuces vista;
    private ArrayList<Boolean> historialEstados; // Almacenamiento dinámico

    public ControlLuces() {
        this.sensor = new Sensor();
        this.luz = new Luz();
        this.vista = new VistaLuces();
        this.historialEstados = new ArrayList<>(); // Uso de ArrayList (dinámico)
    }

    public void iniciarSistema() {
        for (int i = 0; i < 5; i++) { // Simula 5 ciclos (cada uno representa 10 segundos)
            sensor.actualizarEstado(); // Simula cambios en los sensores

            if (sensor.isEsDeNoche() && sensor.isHayMovimiento()) {
                luz.encender();
            } else {
                luz.apagar();
            }

            // Almacenar el estado de la luz en la lista
            historialEstados.add(luz.isEncendida());

            // Mostrar el estado actual
            vista.mostrarEstado(sensor.isEsDeNoche(), sensor.isHayMovimiento(), luz.isEncendida());

            try {
                Thread.sleep(10000); // Simula espera de 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Mostrar el historial de estados de la luz
        mostrarHistorial();
    }

    private void mostrarHistorial() {
        System.out.println("\n📊 Historial de estados de la luz:");
        for (int i = 0; i < historialEstados.size(); i++) {
            System.out.println("🔹 Ciclo " + (i + 1) + ": " + (historialEstados.get(i) ? "Encendida 🔆" : "Apagada 🌑"));
        }
    }
}
