package ejercicio7.modelo;

import java.util.ArrayList;

public class RegistroHistorial {
    private ArrayList<String> historial;

    public RegistroHistorial() {
        this.historial = new ArrayList<>();
    }

    public void agregarRegistro(String estado) {
        historial.add(estado);
    }

    public ArrayList<String> obtenerHistorial() {
        return historial;
    }
}
