import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int segundos = 0;
        int h = 0;
        int m = 0;
        int resto = 0;
        int s = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma quantidade de segundos:");
        segundos = scanner.nextInt();

        h = segundos / 3600;
        resto = segundos % 3600;
        m = resto / 60;
        s = segundos;
        System.out.printf("%d Hora : %d minutos : %d segundos\n", h, m, s);

        scanner.close();

    }

}
