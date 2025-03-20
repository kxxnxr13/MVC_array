package ejercicio4.controlador;


import ejercicio4.modelo.Invernadero;
import ejercicio4.modelo.Historial;
import ejercicio4.vista.VistaInvernadero;

public class ControladorInvernadero {
    private Invernadero invernadero;
    private Historial historial;
    private VistaInvernadero vista;
    private String nombreUsuario;

    public ControladorInvernadero(Invernadero invernadero, Historial historial, VistaInvernadero vista) {
        this.invernadero = invernadero;
        this.historial = historial;
        this.vista = vista;
    }

    // Método para iniciar el sistema
    public void iniciar() {
        nombreUsuario = vista.solicitarNombre();
        vista.mostrarBienvenida();
        int opcion;

        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    simularLecturaTemperatura();
                    break;
                case 2:
                    vista.mostrarHistorial(historial.obtenerHistorial());
                    break;
                case 3:
                    vista.mostrarDespedida(nombreUsuario);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    // Método para simular la lectura de temperatura
    private void simularLecturaTemperatura() {
        invernadero.simularLecturaTemperatura();
        invernadero.controlarTemperatura();

        // Mostrar estado actual
        vista.mostrarEstado(invernadero.getTemperatura(),
                invernadero.isCalefactorActivado(),
                invernadero.isVentiladorActivado());

        // Agregar registro al historial
        String registro = "Temperatura: " + invernadero.getTemperatura() + "°C, " +
                "Calefactor: " + (invernadero.isCalefactorActivado() ? "Activado" : "Inactivo") + ", " +
                "Ventilador: " + (invernadero.isVentiladorActivado() ? "Activado" : "Inactivo");
        historial.agregarRegistro(registro);

        // Simular espera de 5 segundos
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error en la simulación.");
        }
    }
}