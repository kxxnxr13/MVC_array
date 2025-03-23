package ejercicio6;


import ejercicio6.controlador.ControlLuces;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Control de Luces Automático ---");
        ControlLuces control = new ControlLuces();
        control.iniciarSistema();
    }
}
