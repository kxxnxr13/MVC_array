package ejercicio7.modelo;

import java.util.Scanner;
import java.util.Random;



public class Sensor {
    private double temperatura;
    private double humedad;
    private Random random;
    private Scanner scanner;

    public Sensor() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    // Permite elegir entre datos manuales o automáticos
    public void actualizarEstado(boolean entradaManual) {
        if (entradaManual) {
            System.out.print("Ingrese la temperatura actual (°C): ");
            this.temperatura = scanner.nextDouble();
            System.out.print("Ingrese la humedad actual (%): ");
            this.humedad = scanner.nextDouble();
        } else {
            this.temperatura = 25 + random.nextDouble() * 10; // Simula entre 25°C y 35°C
            this.humedad = 40 + random.nextDouble() * 40; // Simula entre 40% y 80%
        }
    }

    public double getTemperatura() { return temperatura; }
    public double getHumedad() { return humedad; }
}
