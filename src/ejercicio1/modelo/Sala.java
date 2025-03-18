package ejercicio1.modelo;

import java.util.HashMap;

public class Sala {
    private int capacidad;
    private boolean[] asientos;
    private HashMap<Integer, String[]> reservas; // [ID del usuario, [nombre, asiento]]

    // Constructor
    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new boolean[capacidad]; // false = asiento libre
        this.reservas = new HashMap<>();
    }

    // Reservar un asiento
    public boolean reservarAsiento(int idUsuario, String nombre, int numeroAsiento) {
        if (numeroAsiento >= 0 && numeroAsiento < capacidad && !asientos[numeroAsiento]) {
            asientos[numeroAsiento] = true; // Marcar asiento como ocupado
            reservas.put(idUsuario, new String[]{nombre, String.valueOf(numeroAsiento)});
            return true; // Reserva exitosa
        }
        return false; // Asiento no disponible o inválido
    }

    // Verificar si hay asientos disponibles
    public boolean hayAsientosDisponibles() {
        for (boolean asiento : asientos) {
            if (!asiento) {
                return true; // Hay al menos un asiento libre
            }
        }
        return false; // No hay asientos libres
    }

    // Obtener las reservas
    public HashMap<Integer, String[]> getReservas() {
        return reservas;
    }
}