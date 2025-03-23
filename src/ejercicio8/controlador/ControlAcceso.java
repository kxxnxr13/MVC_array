package ejercicio8.controlador;



import ejercicio8.modelo.Persona;
import ejercicio8.modelo.RegistroAccesos;
import ejercicio8.vista.VistaAcceso;


import java.util.ArrayList;
import java.util.Scanner;

public class ControlAcceso {
    private ArrayList<Persona> personas;
    private RegistroAccesos registro;
    private VistaAcceso vista;
    private boolean horarioAbierto;
    private Scanner scanner;

    public ControlAcceso() {
        this.personas = new ArrayList<>();
        this.registro = new RegistroAccesos();
        this.vista = new VistaAcceso();
        this.horarioAbierto = true; // Por defecto, la tienda está abierta
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n📌 MENÚ PRINCIPAL 📌");
            System.out.println("1️. Registrar Persona");
            System.out.println("2️. Simular Acceso");
            System.out.println("3️. Cambiar Horario de Atención");
            System.out.println("4. Ver Historial de Accesos");
            System.out.println("5️. Salir");
            System.out.print(" Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            procesarOpcion(opcion);
        } while (opcion != 5);
    }

    // Procesar opciones del menú
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarPersona();
                break;
            case 2:
                verificarAcceso();
                break;
            case 3:
                cambiarHorario();
                break;
            case 4:
                vista.mostrarHistorial(registro.obtenerHistorial());
                break;
            case 5:
                System.out.println(" Saliendo del sistema...");
                break;
            default:
                System.out.println("️ Opción no válida. Inténtalo de nuevo.");
        }
    }

    // Registrar cliente o empleado
    public void registrarPersona() {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("¿Tiene membresía? (s/n): ");
        boolean tieneMembresia = scanner.next().equalsIgnoreCase("s");

        System.out.print("¿Es empleado? (s/n): ");
        boolean esEmpleado = scanner.next().equalsIgnoreCase("s");

        Persona nuevaPersona = new Persona(nombre, tieneMembresia, esEmpleado);
        personas.add(nuevaPersona);

        System.out.println(" Persona registrada con éxito.");
    }

    // Verificar si una persona puede acceder
    public void verificarAcceso() {
        System.out.print("Ingrese su nombre para verificar acceso: ");
        String nombre = scanner.nextLine();

        for (Persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                boolean accesoPermitido = (p.tieneMembresia() && horarioAbierto) || p.esEmpleado();
                String mensaje = "🔹 " + nombre + (accesoPermitido ? " tiene acceso " : " NO tiene acceso ");

                vista.mostrarMensaje(mensaje);
                registro.agregarRegistro(mensaje);
                return;
            }
        }
        System.out.println(" Persona no registrada.");
    }

    // Cambiar el horario de la tienda
    public void cambiarHorario() {
        System.out.print("¿La tienda está abierta? (s/n): ");
        horarioAbierto = scanner.next().equalsIgnoreCase("s");
        System.out.println(" Horario actualizado.");
    }
}
