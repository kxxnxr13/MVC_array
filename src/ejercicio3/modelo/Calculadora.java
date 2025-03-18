package ejercicio3.modelo;


public class Calculadora {

    // Método para sumar
    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    // Método para restar
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    // Método para multiplicar
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    // Método para dividir
    public double dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}
