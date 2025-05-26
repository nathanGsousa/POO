package game.classes;

public class LongDistance extends Classes{


    public LongDistance(String nome) {
        super(nome,"longdistance");

        switch (this.getNomeArma().toLowerCase()) {
            case "arco":
                this.classeCombate = "Arqueiro";
                break;
            case "besta":
                this.classeCombate = "Besteiro";
                break;
            case "grimorio":
                this.classeCombate = "Mago";
                break;
            // Adicione outros casos conforme as armas
            default:
                this.classeCombate = "LongDistance";
        }
    }
}

