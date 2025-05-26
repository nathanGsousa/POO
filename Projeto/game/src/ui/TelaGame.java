package ui;

import java.util.Scanner;

import game.Game;
import game.NPC;
import game.Player;

public class TelaGame {

    public static final Scanner scanner = new Scanner(System.in);

    public static void game() {
        
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
            case 1 -> "melee";
            case 2 -> "tank";
            case 3 -> "longdistance";
            default -> "Desconhecida";
        };

        Player player = new Player(nome, classeNome);

        System.out.println("\nBem-vindo, " + player.getNome() + " o " + player.getClasseCombate() + "!");
        System.out.println("Pressione Enter para Jogar...");
        scanner.nextLine(); // consome sobra do nextInt
        scanner.nextLine();
    
    }



        public static void jogar(Player player){

            NPC npc = new NPC();
            Game game = new Game(player, npc);

            while(true){

                System.out.println(game.mostrarCampo());
                System.out.println(player.getVida());










                if (player.estaVivo() || npc.estaVivo()){
                    break;
                }
            }







        
    }
}

