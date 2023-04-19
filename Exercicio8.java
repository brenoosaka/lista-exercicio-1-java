
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 8");
        System.out.println("Bem vindo ao estacionamento 8.");
        System.out.println("Por favor, digite o número de automóveis que deseja estacionar aqui: ");

       
        int numeroAutomoveis = scanner.nextInt();

        System.out.println("Por favor, digite o número total de rodas que os " + numeroAutomoveis + " automóveis possuem: ");
        int totalRodas = scanner.nextInt();

        int quantidadeMotos = 0;
        int quantidadeCarros = 0;

        quantidadeMotos = ((4 * numeroAutomoveis) - totalRodas) / 2;
        quantidadeCarros = numeroAutomoveis - quantidadeMotos;

        if (quantidadeMotos > 0) {
            if (quantidadeMotos == 1) {
                System.out.println("Você irá estacionar " + quantidadeMotos + " moto");
            } else {
                System.out.println("Você irá estacionar " + quantidadeMotos + " motos");
            }
        }
        if (quantidadeCarros > 0) {
            if (quantidadeCarros == 1) {
                System.out.println("Você irá estacionar " + quantidadeCarros + " carro");
            } else {
                System.out.println("Você irá estacionar " + quantidadeCarros + " carros");
            }
        }

        System.out.println("Tudo liberado, você já pode estacionar. Volte sempre!");
        scanner.close();
    }
}