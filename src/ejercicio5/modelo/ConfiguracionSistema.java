package ejercicio5.modelo;



public class ConfiguracionSistema {
    private boolean esNoche;

    // Constructor
    public ConfiguracionSistema() {
        this.esNoche = true; // Por defecto, es de noche
    }

    // Método para cambiar el modo noche/día
    public void setEsNoche(boolean esNoche) {
        this.esNoche = esNoche;
    }

    // Método para verificar si es de noche
    public boolean isEsNoche() {
        return esNoche;
    }
}
