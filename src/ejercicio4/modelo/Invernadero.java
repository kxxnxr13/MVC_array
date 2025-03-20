package ejercicio4.modelo;



public class Invernadero {
    private double temperatura;
    private boolean calefactorActivado;
    private boolean ventiladorActivado;

    // Constructor
    public Invernadero() {
        this.temperatura = 0;
        this.calefactorActivado = false;
        this.ventiladorActivado = false;
    }

    // Método para simular la lectura de la temperatura
    public void simularLecturaTemperatura() {
        this.temperatura = Math.random() * 40; // Temperatura entre 0 y 40°C
    }

    // Método para controlar el sistema según la temperatura
    public void controlarTemperatura() {
        if (temperatura < 10) {
            calefactorActivado = true;
            ventiladorActivado = false;
        } else if (temperatura > 25) {
            calefactorActivado = false;
            ventiladorActivado = true;
        } else {
            calefactorActivado = false;
            ventiladorActivado = false;
        }
    }

    // Getters
    public double getTemperatura() {
        return temperatura;
    }

    public boolean isCalefactorActivado() {
        return calefactorActivado;
    }

    public boolean isVentiladorActivado() {
        return ventiladorActivado;
    }
}