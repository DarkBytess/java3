import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = scanner.nextInt();

        int f = 1;
        for (int i = 1; i <= numero; i++) {
            f *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + f);
    }
}
