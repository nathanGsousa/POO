package ui;

import java.util.Scanner;

public class TelaSelecao {

    public static void selecionar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============ Cadastro de Jogador ============");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("""
Escolha sua classe:
[1] Combate
[2] Tank
[3] Longa Distancia
""");

        int classe = 0;
        while (classe < 1 || classe > 3) {
            System.out.print("> Classe (1-3): ");
            if (scanner.hasNextInt()) {
                classe = scanner.nextInt();
            } else {
                scanner.next(); // limpa entrada inválida
            }
        }

        String classeNome = switch (classe) {
            case 1 -> "Guerreiro";
            case 2 -> "Mago";
            case 3 -> "Arqueiro";
            default -> "Desconhecida";
        };

        System.out.println("\nBem-vindo, " + nome + " o " + classeNome + "!");
        System.out.println("Pressione Enter para Jogar...");
        scanner.nextLine(); // consome sobra do nextInt
        scanner.nextLine();
    }
}

