import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int x = 0, b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva o valor do numero: ");
        x = scanner.nextInt();

        System.out.println("Escreva o valor da base: ");
        b = scanner.nextInt();

        double resultado = Math.log(x) / Math.log(b);
        System.out.println(resultado);

        scanner.close();
    }
}
