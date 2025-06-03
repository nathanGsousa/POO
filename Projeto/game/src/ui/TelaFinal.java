package ui;

import java.util.Scanner;

import uteis.Utilidades;
import game.Player;

public class TelaFinal {

    private static final Scanner scanner = new Scanner(System.in);
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void telaDerrota(){
        int opcao;

        do {
            Utilidades.limparTela();
            System.out.println(ANSI_RED + """
╔════════════════════════════════════════════════════════════════════╗
║                                                                    ║
║                                                                    ║
║               ▒█████   ██▒   █▓▓█████  ██▀███                      ║
║               ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒                   ║
║               ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒                   ║
║               ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄                     ║
║               ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒                   ║
║               ░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░                   ║
║               ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░                     ║
║               ░ ░ ░ ▒       ░░     ░     ░░   ░                    ║
║               ░ ░        ░     ░  ░   ░                            ║
║                           ░                                        ║
║ [1] Reiniciar                                                      ║
║ [2] Voltar                                                         ║
╚════════════════════════════════════════════════════════════════════╝
""" + ANSI_RESET);

            System.out.print("> Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido (1-2): ");
                scanner.next(); // ignora entrada inválida
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> TelaGame.game();
                case 2 -> {
                    System.out.println("Voltando a tela inical jogo...");
                    ui.TelaInicial.exibirInicio();
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    Utilidades.pause();
                }
            }

        } while (opcao != 2);
    }

    public static void telaVitoria(){
        int opcao;

        do {
            Utilidades.limparTela();
            System.out.println(ANSI_GREEN + """
╔════════════════════════════════════════════════════════════════════╗
║                                                                    ║
║                                                                    ║
║                                                                    ║
║ █████   ███   █████   ███                                          ║
║ ░░███   ░███  ░░███  ░░░                                           ║
║  ░███   ░███   ░███  ████   ████████   ████████   ██████  ████████ ║
║  ░███   ░███   ░███ ░░███ ░░███░░███ ░░███░░███  ███░░███░░███░░███║
║  ░░███  █████  ███   ░███  ░███ ░███  ░███ ░███ ░███████  ░███ ░░░ ║
║   ░░░█████░█████░    ░███  ░███ ░███  ░███ ░███ ░███░░░   ░███     ║
║    ░░███ ░░███      █████ ████ █████ ████ █████░░██████  █████     ║
║      ░░░   ░░░      ░░░░░ ░░░░ ░░░░░ ░░░░ ░░░░░  ░░░░░░  ░░░░░     ║
║                                                                    ║
║                                                                    ║
║ [1] Ler carta                                                      ║
║ [2] Voltar                                                         ║
╚════════════════════════════════════════════════════════════════════╝
""" + ANSI_RESET);

            System.out.print("> Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido (1-2): ");
                scanner.next(); // ignora entrada inválida
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Lendo Carta.....");
                case 2 -> {
                    System.out.println("Voltando a tela inical jogo...");
                    ui.TelaInicial.exibirInicio();
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    Utilidades.pause();
                }
            }

        } while (opcao != 2);
    }

    public static void carta(Player player){
        int vida = player.getVida();

        // if (vida){}

    }
    
    public static void main(String[] args) {
        ui.TelaFinal.telaDerrota();
    }
    
}
