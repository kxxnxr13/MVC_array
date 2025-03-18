package ejercicio1;

import ejercicio1.modelo.Sala;
import ejercicio1.vista.VistaSala;
import ejercicio1.controlador.ControladorSala;

public class Main {
    public static void main(String[] args) {
        Sala sala = new Sala(10); // Sala con 10 asientos
        VistaSala vista = new VistaSala();
        ControladorSala controlador = new ControladorSala(sala, vista);

        controlador.iniciar();
    }
}