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
                "|                                                                   |\n" +
                " |                   Como o mais habilidoso soldado desse           |\n" +
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

    @Override
    public void pocao(int valor) {
        this.vida -= valor;
        System.out.println("Você foi envenenado por um líquidio desconhecido");
    }
}


