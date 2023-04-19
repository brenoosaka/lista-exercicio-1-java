import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        double M = 0;
        //montante
        double C = 0;
        //capital
        double I = 0;
        //taxa em juros
        double N = 0;
        //prazo de aplicação

        double JT = 0;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Informe o Capital: ");
        C = scanner.nextDouble();

        System.out.println("Informe o prazo de aplicação em meses: ");
        N = scanner.nextDouble();

        System.out.println("Informe a taxa de juros mensal: ");
        I = scanner.nextDouble();

        JT = I/100;

        M = Math.pow(1 + JT, N) * C;

        System.out.printf("O valor do montante e: %.2f", + M);

        scanner.close();
}
}