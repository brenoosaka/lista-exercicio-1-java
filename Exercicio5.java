import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double Horas = 0;
        double Mes = 0;
        double ValorH = 0;
        double ValorF = 0;
        double Salario = 0;
        double FilhosN = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique o total de dias que o funcionario trabalhou: ");
        Mes = scanner.nextDouble();

        System.out.println("Indique o valor do recebido por horas: ");
        ValorH = scanner.nextDouble();

        System.out.println("Indique o valor do salario familia:");
        ValorF = scanner.nextDouble();

        System.out.println("Indique quantos filhos abaixo de 14 anos o funcionario tem:");
        FilhosN = scanner.nextDouble();

        Horas = (Mes * 24);

        Salario = (Horas * ValorH) + (FilhosN * ValorF);

        System.out.printf("O Salario bruto e de: " + Salario);

        scanner.close();

    }
}
