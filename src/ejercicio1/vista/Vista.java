package ejercicio1.vista;

import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    // Pide al usuario que ingrese una fila
    public int pedirFila() {
        System.out.print("Ingresa el número de fila: ");
        return scanner.nextInt();
    }

    // Pide al usuario que ingrese una columna
    public int pedirColumna() {
        System.out.print("Ingresa el número de columna: ");
        return scanner.nextInt();
    }

    // Muestra un mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}