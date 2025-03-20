package ejercicio4.modelo;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> registros;

    // Constructor
    public Historial() {
        this.registros = new ArrayList<>();
    }

    // Método para agregar un registro al historial
    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    // Método para obtener el historial completo
    public List<String> obtenerHistorial() {
        return registros;
    }
}