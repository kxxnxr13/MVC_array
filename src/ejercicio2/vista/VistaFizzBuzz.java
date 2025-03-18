package ejercicio2.vista;

import java.util.Scanner;

public class VistaFizzBuzz {
    private Scanner scanner;

    public VistaFizzBuzz() {
        scanner = new Scanner(System.in);
    }

    // Mostrar mensaje de bienvenida
    public void mostrarBienvenida() {
        System.out.println("Bienvenido al juego FizzBuzz!");
    }

    // Solicitar nombre del usuario
    public String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    // Mostrar resultado de FizzBuzz
    public void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }

    // Mostrar mensaje de despedida
    public void mostrarDespedida(String nombre) {
        System.out.println("\nGracias por jugar, " + nombre + "! ¡Hasta luego!");
    }
}