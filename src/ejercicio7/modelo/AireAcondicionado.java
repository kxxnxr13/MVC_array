package ejercicio7.modelo;



public class AireAcondicionado {
    private boolean encendido;

    public AireAcondicionado() {
        this.encendido = false;
    }

    public void encender() { this.encendido = true; }
    public void apagar() { this.encendido = false; }
    public boolean isEncendido() { return encendido; }
}
