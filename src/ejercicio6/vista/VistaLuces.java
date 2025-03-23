package ejercicio6.vista;



public class VistaLuces {
    public void mostrarEstado(boolean esDeNoche, boolean hayMovimiento, boolean luzEncendida) {
        System.out.println("🌙 ¿Es de noche?: " + (esDeNoche ? "Sí" : "No"));
        System.out.println("🚶‍♂️ ¿Hay movimiento?: " + (hayMovimiento ? "Sí" : "No"));
        System.out.println("💡 Estado de la luz: " + (luzEncendida ? "Encendida 🔆" : "Apagada 🌑"));
        System.out.println("-----------------------------------");
    }
}


