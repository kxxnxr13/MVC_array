package ejercicio6.modelo;



import java.util.Random;

public class Sensor {
    private boolean esDeNoche;
    private boolean hayMovimiento;
    private Random random;

    // Constructor
    public Sensor() {
        this.random = new Random();
    }

    // Simula los datos del sensor
    public void actualizarEstado() {
        this.esDeNoche = random.nextBoolean();    // Simula día/noche
        this.hayMovimiento = random.nextBoolean(); // Simula detección de movimiento
    }

    public boolean isEsDeNoche() {
        return esDeNoche;
    }

    public boolean isHayMovimiento() {
        return hayMovimiento;
    }
}
