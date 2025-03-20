package ejercicio5.modelo;

import java.util.Random;

public class SistemaAlarma {
    private boolean sensor1;
    private boolean sensor2;
    private boolean sensor3;
    private ConfiguracionSistema configuracion;
    private RegistroEventos registroEventos;
    private boolean alarmaActivada;

    // Constructor
    public SistemaAlarma(ConfiguracionSistema configuracion, RegistroEventos registroEventos) {
        this.sensor1 = false;
        this.sensor2 = false;
        this.sensor3 = false;
        this.configuracion = configuracion;
        this.registroEventos = registroEventos;
        this.alarmaActivada = false;
    }

    // Método para simular la lectura de los sensores
    public void simularLecturaSensores() {
        Random random = new Random();
        this.sensor1 = random.nextBoolean();
        this.sensor2 = random.nextBoolean();
        this.sensor3 = random.nextBoolean();

        // Verificar si la alarma debe activarse
        verificarAlarma();
    }

    // Método para verificar si la alarma debe activarse
    private void verificarAlarma() {
        int sensoresActivados = 0;
        if (sensor1) sensoresActivados++;
        if (sensor2) sensoresActivados++;
        if (sensor3) sensoresActivados++;

        if (sensoresActivados >= 2 && configuracion.isEsNoche()) {
            alarmaActivada = true;
            registroEventos.agregarEvento("Alarma activada: Movimiento detectado.");
        } else {
            alarmaActivada = false;
        }
    }

    // Método para activar/desactivar la alarma manualmente
    public void setAlarmaActivada(boolean activada) {
        this.alarmaActivada = activada;
        if (activada) {
            registroEventos.agregarEvento("Alarma activada manualmente.");
        } else {
            registroEventos.agregarEvento("Alarma desactivada manualmente.");
        }
    }

    // Getters
    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    // Método para obtener el estado de los sensores
    public String getEstadoSensores() {
        return "Sensor 1: " + sensor1 + ", Sensor 2: " + sensor2 + ", Sensor 3: " + sensor3;
    }
}