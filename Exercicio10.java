

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Valor 3: " + valor3);

        double mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("A média aritmética é: " + mediaAritmetica);

        double mediaHarmonica = 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
        System.out.println("A média harmônica é: " + mediaHarmonica);

        double mediaGeometrica = Math.cbrt((valor1 * valor2 * valor3));
        System.out.println("A média geométrica é: " + mediaGeometrica);

        scanner.close();
    }
}