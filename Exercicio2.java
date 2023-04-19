import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        System.out.println("Produto");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o Preço do Produto");
        double numeroUm = scanner.nextDouble();

        double soma = (numeroUm * 1.10);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Resultado do Produto acrescido é: " + df.format(soma));

        scanner.close();

    }

}