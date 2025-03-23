package ejercicio6.modelo;



public class Luz {
    private boolean encendida;

    public Luz() {
        this.encendida = false; // Al inicio, la luz está apagada.
    }

    // Método para encender la luz
    public void encender() {
        this.encendida = true;
    }

    // Método para apagar la luz
    public void apagar() {
        this.encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }
}
