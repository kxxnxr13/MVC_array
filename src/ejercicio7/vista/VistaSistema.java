package ejercicio7.vista;

public class VistaSistema {
    public void mostrarEstado(double temperatura, double humedad, boolean aireEncendido) {
        System.out.println("\n🌡️ Temperatura: " + temperatura + "°C");
        System.out.println("💧 Humedad: " + humedad + "%");
        System.out.println("❄️ Estado del Aire Acondicionado: " + (aireEncendido ? "Encendido ✅" : "Apagado ❌"));
        System.out.println("-----------------------------------");
    }
}
