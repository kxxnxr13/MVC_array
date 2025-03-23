package ejercicio8.modelo;

import java.util.ArrayList;

    public class RegistroAccesos {
        private ArrayList<String> historial;

        public RegistroAccesos() {
            this.historial = new ArrayList<>();
        }

        public void agregarRegistro(String mensaje) {
            historial.add(mensaje);
        }

        public ArrayList<String> obtenerHistorial() {
            return historial;
        }
    }
