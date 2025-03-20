package ejercicio5.controlador;


import ejercicio5.modelo.SistemaAlarma;
import ejercicio5.modelo.ConfiguracionSistema;
import ejercicio5.modelo.RegistroEventos;
import ejercicio5.modelo.Usuario;
import ejercicio5.vista.VistaAlarma;

public class ControladorAlarma {
    private SistemaAlarma sistemaAlarma;
    private ConfiguracionSistema configuracion;
    private RegistroEventos registroEventos;
    private VistaAlarma vista;
    private Usuario usuario;

    public ControladorAlarma(SistemaAlarma sistemaAlarma, ConfiguracionSistema configuracion,
                             RegistroEventos registroEventos, VistaAlarma vista) {
        this.sistemaAlarma = sistemaAlarma;
        this.configuracion = configuracion;
        this.registroEventos = registroEventos;
        this.vista = vista;
    }

    // Método para iniciar el sistema
    public void iniciar() {
        String nombre = vista.solicitarNombre();
        usuario = new Usuario(nombre, 1, "Usuario"); // Crear un usuario con ID 1 y rol "Usuario"
        vista.mostrarBienvenida();
        int opcion;

        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    sistemaAlarma.simularLecturaSensores();
                    vista.mostrarEstadoAlarma(sistemaAlarma.isAlarmaActivada());
                    vista.mostrarEstadoSensores(sistemaAlarma.getEstadoSensores());
                    break;
                case 2:
                    boolean activar = vista.solicitarConfirmacion("¿Desea activar la alarma?");
                    sistemaAlarma.setAlarmaActivada(activar);
                    vista.mostrarEstadoAlarma(sistemaAlarma.isAlarmaActivada());
                    break;
                case 3:
                    boolean esNoche = vista.solicitarConfirmacion("¿Es de noche?");
                    configuracion.setEsNoche(esNoche);
                    System.out.println("Modo noche: " + (esNoche ? "Activado" : "Desactivado"));
                    break;
                case 4:
                    registroEventos.mostrarHistorial();
                    break;
                case 5:
                    vista.mostrarDespedida(usuario.getNombre());
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
