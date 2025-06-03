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
                "|                                                                   |\n" +
                " |                   Como o mais forte soldado desse                |\n" +
                "  |                    reino você está sendo convocado              |_\n" +
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
