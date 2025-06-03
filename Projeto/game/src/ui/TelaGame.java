package ui;

import java.util.Scanner;

import game.Game;
import game.NPC;
import game.Player;

public class TelaGame {

    public static final Scanner scanner = new Scanner(System.in);

    public static void game() {

        System.out.println("Pressione Enter para Jogar...");
        scanner.nextLine(); // consome sobra do nextInt
        scanner.nextLine(); //Espera o Enter
        
        
        System.out.println("Pressione Enter para Jogar...");
        scanner.nextLine(); // consome sobra do nextInt
        scanner.nextLine(); //Espera o Enter

        System.out.println("============ Cadastro de Jogador ============");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("""
Escolha sua classe:
[1] Combate
[2] Tank
[3] Longa Distancia
""");

        int classe = -1;
        while (classe < 1 || classe > 3) {
            System.out.print("> Classe (1-3): ");
            if (scanner.hasNextInt()) {
                classe = scanner.nextInt();
            }else {
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
        scanner.nextLine(); //Espera o Enter
        jogar(player);
    
    }


    //Espaço em que o jogo ocorre
    public static void jogar(Player player){

        NPC npc = new NPC();
        Game game = new Game(player, npc);
        System.out.println(player.getMensagem());

        while(true){

            System.out.println(game.mostrarCampo());
                
            System.out.println(player.getNome()+ ' ' + player.getClasseCombate());
            player.vida();
            System.out.println("Arma: " + player.getNomeArma() + '\n' + "Dano: " + player.getDano() + '\n' + "Alcance: " + player.getAlcance());
            System.out.print("Vida inimigo: ");
            npc.vida();

            System.out.println("""
Ações:
[1] Mover para Frente
[2] Mover para Trás
[3] Ataque
[4] poção de Vida
                """);
            int acao = 0;
                while (acao < 1 || acao > 4) {
                System.out.print("> Ações (1-4): ");
                if (scanner.hasNextInt()) {
                    acao = scanner.nextInt();
                } else {
                scanner.next(); // limpa entrada inválida
                }
                }

            switch (acao) {
                case 1 -> game.moverPlayerFrente();
                case 2 -> game.moverPlayerTras();
                case 3 -> game.ataquePlayer(); //Testando as ações do jogador
                case 4 -> game.pocao(); //trazer a poção de vida 
                default -> System.out.println("teste");
            };

            if(!game.getTurnoPlayer()){
                npc.jogarTurno(player);
            }

            


            if (!player.estaVivo()){
                TelaFinal.telaDerrota();     
                break;
            }

            if (!npc.estaVivo()){
                TelaFinal.telaVitoria();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Player player = new Player("nathan", "melee");

        TelaGame.jogar(player);
    }
}

