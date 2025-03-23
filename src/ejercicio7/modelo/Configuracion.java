package ejercicio7.modelo;


import java.util.Scanner;

public class Configuracion {
    private double temperaturaLimite;
    private double humedadLimite;
    private Scanner scanner;

    public Configuracion() {
        this.temperaturaLimite = 28.0;
        this.humedadLimite = 60.0;
        this.scanner = new Scanner(System.in);
    }

    public void modificarConfiguracion() {
        System.out.print("Ingrese la nueva temperatura límite para activar el aire (°C): ");
        this.temperaturaLimite = scanner.nextDouble();
        System.out.print("Ingrese la nueva humedad límite (%): ");
        this.humedadLimite = scanner.nextDouble();
    }

    public double getTemperaturaLimite() { return temperaturaLimite; }
    public double getHumedadLimite() { return humedadLimite; }
}
