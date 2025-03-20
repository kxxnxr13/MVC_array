package ejercicio5.vista;


import java.util.Scanner;

public class VistaAlarma {
    private Scanner scanner;

    public VistaAlarma() {
        scanner = new Scanner(System.in);
    }

    // Mostrar mensaje de bienvenida
    public void mostrarBienvenida() {
        System.out.println("Bienvenido al Sistema de Detección de Intrusos!");
    }

    // Solicitar nombre del usuario
    public String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    // Mostrar menú de opciones
    public int mostrarMenu() {
        System.out.println("\n1. Simular lectura de sensores");
        System.out.println("2. Activar/Desactivar alarma manualmente");
        System.out.println("3. Cambiar modo noche/día");
        System.out.println("4. Ver historial de eventos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Mostrar estado de la alarma
    public void mostrarEstadoAlarma(boolean alarmaActivada) {
        System.out.println("\nEstado de la alarma: " + (alarmaActivada ? "Activada" : "Desactivada"));
    }

    // Mostrar estado de los sensores
    public void mostrarEstadoSensores(String estadoSensores) {
        System.out.println("Estado de los sensores: " + estadoSensores);
    }

    // Solicitar confirmación para activar/desactivar la alarma
    public boolean solicitarConfirmacion(String mensaje) {
        System.out.print(mensaje + " (s/n): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    // Mostrar mensaje de despedida
    public void mostrarDespedida(String nombre) {
        System.out.println("\nGracias por usar el sistema, " + nombre + ". ¡Hasta luego!");
    }
}
