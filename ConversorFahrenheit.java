/*
INPUT - Valor do usuário em Celsius, por exemplo 0.

Processamento - F = C * 9/5 + 32
No caso do exemplo, F = 0 * 9/5 + 32

OUTPUT (Resultado Esperado) - 32.00 
*/

import java.util.Scanner;

public class ConversorFahrenheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        System.out.println("=== Conversor de Temperatura FAHRENHEIT ===");

        System.out.print("Digite a temperatura (°C) que deseja converter para Fahrenheit: ");

        double celsius = entrada.nextDouble();

        double fahrenheit = calcularFahrenheit(celsius);

        System.out.println(celsius + "°" + " Celsius convertido para Fahrenheit é: " + fahrenheit);

        entrada.close();

    }
    
    public static double calcularFahrenheit(double celsius) {
        double fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }
}