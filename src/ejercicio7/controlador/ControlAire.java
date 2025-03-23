package ejercicio7.controlador;


import ejercicio7.modelo.AireAcondicionado;
import ejercicio7.modelo.RegistroHistorial;
import ejercicio7.modelo.Configuracion;
import ejercicio7.modelo.Sensor;
import ejercicio7.vista.VistaHistorial;
import ejercicio7.vista.VistaSistema;

import java.util.Scanner;

public class ControlAire {
    private Sensor sensor;
    private AireAcondicionado aire;
    private Configuracion config;
    private RegistroHistorial historial;
    private VistaSistema vista;
    private Scanner scanner;

    public ControlAire() {
        this.sensor = new Sensor();
        this.aire = new AireAcondicionado();
        this.config = new Configuracion();
        this.historial = new RegistroHistorial();
        this.vista = new VistaSistema();
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n📌 MENÚ PRINCIPAL 📌");
            System.out.println("1️⃣ Iniciar Sistema de Aire Acondicionado");
            System.out.println("2️⃣ Modificar Configuración de Sensores");
            System.out.println("3️⃣ Ver Historial de Estados");
            System.out.println("4️⃣ Salir");
            System.out.print("👉 Elige una opción: ");

            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }

    // Procesa la opción elegida por el usuario
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                iniciarSistema();
                break;
            case 2:
                modificarConfiguracion();
                break;
            case 3:
                mostrarHistorial();
                break;
            case 4:
                System.out.println("👋 Saliendo del programa...");
                break;
            default:
                System.out.println("⚠️ Opción no válida. Inténtalo de nuevo.");
        }
    }

    // Método para iniciar el sistema y simular la lectura de sensores
    public void iniciarSistema() {
        System.out.print("¿Desea ingresar datos manuales? (s/n): ");
        boolean manual = scanner.next().equalsIgnoreCase("s");

        for (int i = 0; i < 5; i++) {
            sensor.actualizarEstado(manual);

            if ((sensor.getTemperatura() > config.getTemperaturaLimite() && sensor.getHumedad() > config.getHumedadLimite()) ||
                    sensor.getTemperatura() > 30) {
                aire.encender();
            } else {
                aire.apagar();
            }

            String estado = aire.isEncendido() ? "Encendido ✅" : "Apagado ❌";
            historial.agregarRegistro(estado);

            vista.mostrarEstado(sensor.getTemperatura(), sensor.getHumedad(), aire.isEncendido());

            try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); } // 3 seg para prueba
        }
    }

    // Método para modificar los valores de configuración
    public void modificarConfiguracion() {
        config.modificarConfiguracion();
        System.out.println("✅ Configuración actualizada con éxito.");
    }

    // Método para mostrar el historial de estados
    public void mostrarHistorial() {
        VistaHistorial vistaHistorial = new VistaHistorial();
        vistaHistorial.mostrarHistorial(historial.obtenerHistorial());
    }
}
