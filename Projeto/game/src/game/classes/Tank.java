package game.classes;

public class Tank extends Classes{

    public Tank(String nome){
        super(nome,"tank");
         
        switch (this.getNomeArma().toLowerCase()) {
            case "escudo":
                this.classeCombate = "Shielder";
                this.vida = 65;
                break;
            case "martelo":
                this.classeCombate = "WarHammer";
                this.vida = 60;
                break;
            // Adicione outros casos conforme as armas
            default:
                this.classeCombate = "Tank";
                this.vida = 60;
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
            "|        util. Fique feliz sua força foi reconhecida.               |\n" +
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
