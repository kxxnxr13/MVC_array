package ejercicio1.vista;


import java.util.HashMap;
import java.util.Scanner;

public class VistaSala {
    private Scanner scanner;

    public VistaSala() {
        scanner = new Scanner(System.in);
    }

    // Mostrar mensaje de bienvenida
    public void mostrarBienvenida() {
        System.out.println("Bienvenido al sistema de reservas de asientos.");
    }

    // Mostrar menú de opciones
    public int mostrarMenu() {
        System.out.println("\n1. Reservar asiento");
        System.out.println("2. Mostrar reservas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Solicitar datos del usuario
    public int solicitarIdUsuario() {
        System.out.print("Ingrese su ID: ");
        return scanner.nextInt();
    }

    public String solicitarNombreUsuario() {
        System.out.print("Ingrese su nombre: ");
        return scanner.next();
    }

    // Solicitar número de asiento
    public int solicitarNumeroAsiento() {
        System.out.print("Ingrese el número de asiento que desea reservar: ");
        return scanner.nextInt();
    }

    // Mostrar mensaje de éxito o error
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Mostrar reservas en formato [ID: [Nombre, Asiento]]
    public void mostrarReservas(HashMap<Integer, String[]> reservas) {
        System.out.println("\nReservas actuales:");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Integer id : reservas.keySet()) {
                String[] datos = reservas.get(id);
                System.out.println("[" + id + ": [" + datos[0] + ", " + datos[1] + "]]");
            }
        }
    }
}