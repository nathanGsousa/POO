package game.classes;

public class LongDistance extends Classes{

    public LongDistance(String nome) {
        super(nome,"longdistance");

        switch (this.getNomeArma().toLowerCase()) {
            case "arco":
                this.classeCombate = "Arqueiro";
                this.vida = 40;
                break;
            case "besta":
                this.classeCombate = "Besteiro";
                this.vida = 45;
                break;
            case "grimorio":
                this.classeCombate = "Mago";
                this.vida = 35;
                break;
            // Adicione outros casos conforme as armas
            default:
                this.classeCombate = "LongDistance";
        }
    }

    @Override
    public String mensagem() {
    String linhaNome = String.format("|    Ao %-59s|\n", this.nome);

    return  "                                             _______________________\n" +
            "   _______________________-------------------                       `\\\n" +
            " /:--__                                                              |\n" +
            "||< > |                                   ___________________________/\n" +
            "| \\__/_________________-------------------                        |\n" +
            "|                         CONVOCAÇÃO                               |\n" +
            "|                                                                  |\n" +
            linhaNome +
            "|                                                                  |\n" +
            "|        Em nome de Vossa Graça, você foi escolhido.               |\n" +
            "|        Não por honra, não por glória, mas por conveniência.      |\n" +
            "|        Recusar é desaparecer. Lutar é sua única chance de ser      |\n" +
            "|        util. Fique feliz sua inteligência foi reconhecida.        |\n" +
            "|                                                                   |\n" +
            "|        Que o sangue que derramar seja suficiente para manter      |\n" +
            "|        sua existência.                                           |\n" +
            "|                                                                  |\n" +
            " |                                              ____________________|\n" +
            " |  ___________________-------------------------                      `\\\n" +
            " |/`--_                                                                 |\n" +
            " ||[ ]||                                            ___________________/\n" +
            "  \\===/___________________--------------------------\n";
    }


    @Override
    public void pocao(int valor) {

        if (this.classeCombate == "Mago"){
            this.vida += valor;
        }
        
        else {
        this.vida -= valor;
        System.out.println("Você foi envenenado por um líquidio desconhecido");
        }
    }
}

