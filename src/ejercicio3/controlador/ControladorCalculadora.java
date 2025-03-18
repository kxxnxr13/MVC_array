package ejercicio3.controlador;

import ejercicio3.modelo.Calculadora;
import ejercicio3.vista.VistaCalculadora;

public class ControladorCalculadora {
    private Calculadora calculadora;
    private VistaCalculadora vista;
    private double[] historialResultados;
    private int contadorResultados;

    public ControladorCalculadora(Calculadora calculadora, VistaCalculadora vista) {
        this.calculadora = calculadora;
        this.vista = vista;
        this.historialResultados = new double[10]; // Array para almacenar hasta 10 resultados
        this.contadorResultados = 0;
    }

    // Método para iniciar la calculadora
    public void iniciar() {
        vista.mostrarBienvenida();
        boolean continuar;

        do {
            double numero1 = vista.solicitarNumero("Ingrese el primer número: ");
            double numero2 = vista.solicitarNumero("Ingrese el segundo número: ");
            String operacion = vista.solicitarOperacion();

            try {
                double resultado = realizarOperacion(numero1, numero2, operacion);
                vista.mostrarResultado(resultado);

                // Guardar resultado en el historial
                if (contadorResultados < historialResultados.length) {
                    historialResultados[contadorResultados] = resultado;
                    contadorResultados++;
                } else {
                    System.out.println("El historial está lleno. Se reiniciará.");
                    contadorResultados = 0; // Reiniciar el contador
                    historialResultados[contadorResultados] = resultado;
                    contadorResultados++;
                }
            } catch (ArithmeticException e) {
                vista.mostrarError(e.getMessage());
            }

            continuar = vista.preguntarContinuar();
        } while (continuar);

        // Mostrar historial antes de salir
        vista.mostrarHistorial(historialResultados, contadorResultados);
        vista.mostrarDespedida();
    }

    // Método para realizar la operación seleccionada
    private double realizarOperacion(double numero1, double numero2, String operacion) {
        switch (operacion) {
            case "+":
                return calculadora.sumar(numero1, numero2);
            case "-":
                return calculadora.restar(numero1, numero2);
            case "*":
                return calculadora.multiplicar(numero1, numero2);
            case "/":
                return calculadora.dividir(numero1, numero2);
            default:
                throw new IllegalArgumentException("Operación no válida.");
        }
    }
}