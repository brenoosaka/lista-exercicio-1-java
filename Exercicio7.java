import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double Salario = 0;
        double Percentual = 0;
        double Vendas = 0;
        double SalarioT = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salario do vendedor: ");
        Salario = scanner.nextDouble();

        System.out.println("Insira o total de vendas do vendedor: ");
        Vendas = scanner.nextDouble();

        System.out.println("Insira quanto o usuario ganha por venda: ");
        Percentual = scanner.nextDouble();

        SalarioT = (Vendas * Percentual) + Salario;

        System.out.printf("o salario total do usuario e de: " + SalarioT);

        scanner.close();

    }
}