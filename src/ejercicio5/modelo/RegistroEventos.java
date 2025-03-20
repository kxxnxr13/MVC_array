package ejercicio5.modelo;



import java.util.ArrayList;
import java.util.List;

public class RegistroEventos {
    private List<String> eventos;

    // Constructor
    public RegistroEventos() {
        this.eventos = new ArrayList<>();
    }

    // Método para agregar un evento
    public void agregarEvento(String evento) {
        eventos.add(evento);
    }

    // Método para obtener todos los eventos
    public List<String> obtenerEventos() {
        return eventos;
    }

    // Método para mostrar el historial de eventos
    public void mostrarHistorial() {
        System.out.println("\nHistorial de Eventos:");
        for (String evento : eventos) {
            System.out.println(evento);
        }
    }
}