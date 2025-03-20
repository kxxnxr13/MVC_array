package ejercicio4.vista;



import java.util.List;
import java.util.Scanner;

public class VistaInvernadero {
    private Scanner scanner;

    public VistaInvernadero() {
        scanner = new Scanner(System.in);
    }

    // Mostrar mensaje de bienvenida
    public void mostrarBienvenida() {
        System.out.println("Bienvenido al Sistema de Control de Temperatura en el Invernadero!");
    }

    // Solicitar nombre del usuario
    public String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    // Mostrar estado del sistema
    public void mostrarEstado(double temperatura, boolean calefactorActivado, boolean ventiladorActivado) {
        System.out.println("\nTemperatura actual: " + temperatura + "°C");
        System.out.println("Calefactor: " + (calefactorActivado ? "Activado" : "Inactivo"));
        System.out.println("Ventilador: " + (ventiladorActivado ? "Activado" : "Inactivo"));
    }

    // Mostrar menú de opciones
    public int mostrarMenu() {
        System.out.println("\n1. Simular lectura de temperatura");
        System.out.println("2. Consultar historial");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Mostrar historial
    public void mostrarHistorial(List<String> historial) {
        System.out.println("\nHistorial de temperaturas y acciones:");
        for (String registro : historial) {
            System.out.println(registro);
        }
    }

    // Mostrar mensaje de despedida
    public void mostrarDespedida(String nombre) {
        System.out.println("\nGracias por usar el sistema, " + nombre + ". ¡Hasta luego!");
    }
}