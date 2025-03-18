package ejercicio2.modelo;


public class FizzBuzz {
    // Método para determinar si un número es Fizz, Buzz, FizzBuzz o el número mismo
    public String determinarFizzBuzz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz"; // Divisible por 3 y 5
        } else if (numero % 3 == 0) {
            return "Fizz"; // Divisible por 3
        } else if (numero % 5 == 0) {
            return "Buzz"; // Divisible por 5
        } else {
            return String.valueOf(numero); // No es divisible ni por 3 ni por 5
        }
    }
}