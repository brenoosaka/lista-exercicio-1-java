import java.util.Scanner;

public class Exercicio3 {

        public static void main(String[] arsgs) {

                System.out.println("Temperatura");

                Scanner scanner = new Scanner(System.in);

                System.out.println("Informe a Temperatura F");

                double temperaturaF = scanner.nextFloat();

                double Cent = ((temperaturaF - 32) / 1.8);

                System.out.println("A Temperatura em Graus Centígrados é: " + Cent);

                scanner.close();

        }
}