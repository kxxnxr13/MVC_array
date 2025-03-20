package ejercicio5;

import ejercicio5.modelo.SistemaAlarma;
import ejercicio5.modelo.ConfiguracionSistema;
import ejercicio5.modelo.RegistroEventos;
import ejercicio5.vista.VistaAlarma;
import ejercicio5.controlador.ControladorAlarma;

public class Main {
    public static void main(String[] args) {
        ConfiguracionSistema configuracion = new ConfiguracionSistema();
        RegistroEventos registroEventos = new RegistroEventos();
        SistemaAlarma sistemaAlarma = new SistemaAlarma(configuracion, registroEventos);
        VistaAlarma vista = new VistaAlarma();
        ControladorAlarma controlador = new ControladorAlarma(sistemaAlarma, configuracion, registroEventos, vista);

        controlador.iniciar(); // Iniciar el sistema
    }
}