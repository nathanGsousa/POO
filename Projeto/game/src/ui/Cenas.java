package ui;

import java.util.Scanner;

public class Cenas {

    public static final Scanner scanner = new Scanner(System.in);

    public static String mensagemMorte() {
        return  "                                             _______________________\n" +
                "   _______________________-------------------                       `\\\n" +
                " /:--__                                                              |\n" +
                "||< > |                                   ___________________________/\n" +
                "| \\__/_________________-------------------                        |\n" +
                "|                                                                  |\n" +
                "|        Vacilando e sucubindo aos ferimentos..                     |\n"+
                "|        Você não apenas perdeu...                                  |\n" +
                "|        Você foi arrancado da existência.                          |\n" +
                "|        Seu nome, suas memórias, sua alma, tudo apagado,           |\n" +
                "|        como se nunca tivesse existido.                            |\n" +
                "|                                                                   |\n" +
                "|        Um espectro vazio, condenado a vagar eternamente           |\n" +
                "|        no limiar entre o esquecimento e a dor.                    |\n" +
                "|                                                                    |\n" +
                " |                                              _____________________|\n" +
                " |  ___________________-------------------------                      `\\\n" +
                " |/`--_                                                                 |\n" +
                " ||[ ]||                                            ___________________/\n" +
                "  \\===/___________________--------------------------\n";
    }


    public static String mensagemLowVida() {
    return  "                                             _______________________\n" +
            "   _______________________-------------------                       `\\\n" +
            " /:--__                                                              |\n" +
            "||< > |                                   ___________________________/\n" +
            "| \\__/_________________-------------------                        |\n" +
            "|                                                                  |\n" +
            "|        Você escapou... mas por quanto tempo?                      |\n" +
            "|        O frio toque da morte quase o abraçou,                     |\n" +
            "|        e a escuridão sussurra seu nome, faminta.                  |\n" +
            "|        Cada passo é um suspiro prestes a se apagar.               |\n" +
            "|                                                                  |\n" +
            "|        A luta não terminou, ela apenas sussurra para continuar.  |\n" +
            "|                                                                  |\n" +
            " |                                              ____________________|\n" +
            " |  ___________________-------------------------                      `\\\n" +
            " |/`--_                                                                 |\n" +
            " ||[ ]||                                            ___________________/\n" +
            "  \\===/___________________--------------------------\n";
    }

    public static String mensagemMae() {
    return  """
╔════════════════════════════════════════════════════════════════════════╗
║                                                                        ║                                                                        
║ Meu querido, escute a voz que ecoa do além...                          ║
║ Tenha cuidado com a convocação para a luta.                            ║
║ Há segredos ocultos nas sombras do reino.                              ║
║ Nem toda honra leva à glória...                                        ║
║                                                                        ║
║ Lute com sabedoria e desconfie daqueles que sorrirem demais.           ║
║ Meu amor te acompanha... sempre.                                       ║
║                                                                        ║
╚════════════════════════════════════════════════════════════════════════╝
""";
}



    public static void casa(){
        System.out.print(
    "                /|||||||||||  \n" +
    "               / ||||||||o||   /||||o|\\              /|||||\\\n" +
    "            / |||||o|||||| /||||||||||o|\\           /|||||o||\\\n" +
    "          / ||||||||||||| /||o||||||||||||\\       /||||||||||o|\\\n" +
    "          /||\\     | |   /||||||||o|||||||\\___|__|____|  |______ _          /||o\\\n" +
    "         /|o|\\     | |    /_______________________________________\\        /|o|||\\\n" +
    "        /|||o|\\    | |   /_________________________________________\\     /|||||o|\\\n" +
    "       /||o|||||\\  | |   | ||___|___| ||||||||||||||||||||___|__||| |    /||o||||||\\\n" +
    "         | |       | |   | ||___|___| ||||||||||||||||||||___|__||| |         | |\n" +
    "    ooooooooooo | | | | | | |||||||||||||||||||||||||||||||||||||||| | oooooooo| |ooooooo\n" +
    "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n"
    );
        System.out.println();
        System.out.println("Pressione Enter para Continuar...");
        scanner.nextLine(); // consome sobra do nextInt
        scanner.nextLine(); //Espera o Enter
    }
}