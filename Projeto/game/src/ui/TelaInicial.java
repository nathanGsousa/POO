package ui;

import java.util.Scanner;

import uteis.Utilidades;

public class TelaInicial {

    private static final Scanner scanner = new Scanner(System.in);

      public static void exibirMenu() {
        int opcao;

        do {
            Utilidades.limparTela();
            System.out.println("""

            
 ██████╗  █████╗ ███╗   ███╗███████╗
██╔════╝ ██╔══██╗████╗ ████║██╔════╝
██║  ███╗███████║██╔████╔██║█████╗  
██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  
╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝

 [1] Iniciar
 [2] Informações
 [3] Sair
""");

            System.out.print("> Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido (1-3): ");
                scanner.next(); // ignora entrada inválida
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> TelaSelecao.selecionar();
                case 2 -> mostrarInformacoes();
                case 3 -> System.out.println("Saindo do jogo...");
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    Utilidades.pause();
                }
            }

        } while (opcao != 3);
    }

    private static void iniciar() {
        System.out.println(">> Iniciando o jogo...");
        // Chame aqui a função que inicia o jogo de fato
        Utilidades.pause();
    }

    private static void mostrarInformacoes() {
        System.out.println("""
>> Informações do Jogo:
   Criado por Nathan e Rayff para a discplina de POO.
   
   Jogo feito em Java, terminal puro.
   Use o teclado numérico para jogar.
""");
        Utilidades.pause();
    }


}