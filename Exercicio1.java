import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        System.out.println("MediaAritmetica");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo número");
        int numeroDois = scanner.nextInt();

        int media = (numeroUm + numeroDois) / 2;

        System.out.println("Resultado da média aritmética dos dois números informados é: " + media);

        scanner.close();
    }
}