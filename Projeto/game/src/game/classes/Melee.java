package game.classes;

public class Melee extends Classes{

    public Melee(String nome) {
        super(nome,"melee");

        switch (this.getNomeArma().toLowerCase()) {
            case "espada":
                this.classeCombate = "Swordman";
                break;
            case "machado":
                this.classeCombate = "AxeWarrior";
                break;
            case "lança":
                this.classeCombate = "Lanceiro";
                break;
            // Adicione outros casos conforme as armas disponíveis
            default:
                this.classeCombate = "Melee";
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
            "|        util. Fique feliz sua habilidade foi reconhecida.          |\n" +
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
        this.vida -= valor;
        System.out.println("Você foi envenenado por um líquidio desconhecido");
    }
}


