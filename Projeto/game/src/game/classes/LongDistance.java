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
        return  "                                             _______________________\n" +
                "   _______________________-------------------                       `\\\n" +
                " /:--__                                                              |\n" +
                "||< > |                                   ___________________________/\n" +
                "| \\__/_________________-------------------                         |\n" +
                "|                         CONVOCAÇÃO                                |\n" +
                "|                                                                   |\n" +
                "|    Ao " + this.nome + "                                                          |\n" +
                "|                                                                    |\n" +
                " |                   Como o mais inteligente soldado desse           |\n" +
                "  |                    reino você está sendo convocado               |_\n" +
                "  |                     a lutar por Vossa Graça e morrer            |\n" +
                "  |                       com grande honra!                          |\n" +
                "  |                                                                  |\n" +
                "  |    Lute com coragem ou sua história será para sempre esquecida!  |\n" +
                "  |                                              ____________________|\n" +
                "  |  ___________________-------------------------                      `\\\n" +
                "  |/`--_                                                                 |\n" +
                "  ||[ ]||                                            ___________________/\n" +
                "   \\===/___________________--------------------------\n";
            }
}

