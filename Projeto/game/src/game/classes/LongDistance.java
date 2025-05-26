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
}

