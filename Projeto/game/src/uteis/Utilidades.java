package uteis;

import java.util.Scanner;
public class Utilidades {

    private static final Scanner scanner = new Scanner(System.in);

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pause(String mensagem) {
        System.out.println("\n" + mensagem);
        scanner.nextLine(); // Espera Enter
    }

    public static void pause() {
        pause("Pressione Enter para continuar...");
    }

    public static boolean confirmarRetornoAoMenu() {
        System.out.println("\nDeseja voltar ao menu inicial? (s/n)");
        String resposta = scanner.nextLine().trim().toLowerCase();

        while (!resposta.equals("s") && !resposta.equals("n")) {
            System.out.print("Digite 's' para sim ou 'n' para não: ");
            resposta = scanner.nextLine().trim().toLowerCase();
        }

        return resposta.equals("s");
    }
}
