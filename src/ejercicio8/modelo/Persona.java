package ejercicio8.modelo;


public class Persona {
    protected String nombre;
    protected boolean tieneMembresia;
    protected boolean esEmpleado;

    public Persona(String nombre, boolean tieneMembresia, boolean esEmpleado) {
        this.nombre = nombre;
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }
}
