package ejercicio7;

import ejercicio7.controlador.ControlAire;

public class Main {
    public static void main(String[] args) {
        ControlAire control = new ControlAire();
        control.iniciarSistema();
        control.mostrarHistorial();
    }
}
