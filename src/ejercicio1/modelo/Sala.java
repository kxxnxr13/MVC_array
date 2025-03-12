package ejercicio1.modelo;

public class Sala {
    private boolean[][] asientos; // true = ocupado, false = libre

    public Sala(int filas, int columnas) {
        asientos = new boolean[filas][columnas]; // Inicialmente todos los asientos están libres (false)
    }

    // Verifica si un asiento está libre
    public boolean estaLibre(int fila, int columna) {
        if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos[0].length) {
            return !asientos[fila][columna]; // Devuelve true si está libre
        }
        return false; // Si está fuera de rango, no está libre
    }

    // Reserva un asiento
    public void reservarAsiento(int fila, int columna) {
        if (estaLibre(fila, columna)) {
            asientos[fila][columna] = true; // Marca el asiento como ocupado
            System.out.println("¡Asiento reservado con éxito!");
        } else {
            System.out.println("El asiento no está disponible o no existe.");
        }
    }

    // Muestra el estado de los asientos
    public void mostrarAsientos() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] ? "[X] " : "[ ] "); // [X] = ocupado, [ ] = libre
            }
            System.out.println();
        }
    }

    // Verifica si hay asientos libres
    public boolean hayAsientosLibres() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (!asientos[i][j]) {
                    return true; // Hay al menos un asiento libre
                }
            }
        }
        return false; // No hay asientos libres
    }
}