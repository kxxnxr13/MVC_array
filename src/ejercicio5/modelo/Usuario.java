package ejercicio5.modelo;



public class Usuario {
    private String nombre;
    private int id;
    private String rol; // Ejemplo: "Admin", "Usuario"

    // Constructor
    public Usuario(String nombre, int id, String rol) {
        this.nombre = nombre;
        this.id = id;
        this.rol = rol;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    // Método para mostrar información del usuario
    public String toString() {
        return "Usuario: " + nombre + " (ID: " + id + ", Rol: " + rol + ")";
    }
}