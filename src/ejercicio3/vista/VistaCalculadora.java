package ejercicio3.vista;
import java.util.Scanner;

public class VistaCalculadora {
    private Scanner scanner;

    public VistaCalculadora() {
        scanner = new Scanner(System.in);
    }

    // Mostrar mensaje de bienvenida
    public void mostrarBienvenida() {
        System.out.println("Bienvenido a la Calculadora Simple!");
    }

    // Solicitar número al usuario
    public double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    // Solicitar operación al usuario
    public String solicitarOperacion() {
        System.out.print("Ingrese la operación (+, -, *, /): ");
        return scanner.next();
    }

    // Mostrar resultado
    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    // Preguntar si desea continuar
    public boolean preguntarContinuar() {
        System.out.print("¿Desea realizar otra operación? (s/n): ");
        String respuesta = scanner.next();
        return respuesta.equalsIgnoreCase("s");
    }

    // Mostrar mensaje de despedida
    public void mostrarDespedida() {
        System.out.println("Gracias por usar la Calculadora Simple. ¡Hasta luego!");
    }

    // Mostrar mensaje de error
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    // Mostrar historial de resultados
    public void mostrarHistorial(double[] historial, int contador) {
        System.out.println("\nHistorial de resultados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Operación " + (i + 1) + ": " + historial[i]);
        }
    }
}
